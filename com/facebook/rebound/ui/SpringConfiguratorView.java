package com.facebook.rebound.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import com.facebook.rebound.OrigamiValueConverter;
import com.facebook.rebound.Spring;
import com.facebook.rebound.SpringConfig;
import com.facebook.rebound.SpringConfigRegistry;
import com.facebook.rebound.SpringListener;
import com.facebook.rebound.SpringSystem;
import com.tencent.tinker.android.dx.instruction.Opcodes;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SpringConfiguratorView extends FrameLayout {
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.#");
    private static final float MAX_FRICTION = 50.0f;
    private static final int MAX_SEEKBAR_VAL = 100000;
    private static final float MAX_TENSION = 200.0f;
    private static final float MIN_FRICTION = 0.0f;
    private static final float MIN_TENSION = 0.0f;
    private TextView mFrictionLabel;
    private SeekBar mFrictionSeekBar;
    private final float mRevealPx;
    private final Spring mRevealerSpring;
    private SpringConfig mSelectedSpringConfig;
    private final List<SpringConfig> mSpringConfigs;
    private Spinner mSpringSelectorSpinner;
    private final float mStashPx;
    private TextView mTensionLabel;
    private SeekBar mTensionSeekBar;
    private final int mTextColor;
    private final SpinnerAdapter spinnerAdapter;
    private final SpringConfigRegistry springConfigRegistry;

    private class OnNubTouchListener implements OnTouchListener {
        private OnNubTouchListener() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == null) {
                SpringConfiguratorView.this.togglePosition();
            }
            return true;
        }
    }

    private class SeekbarListener implements OnSeekBarChangeListener {
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }

        private SeekbarListener() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (seekBar == SpringConfiguratorView.this.mTensionSeekBar) {
                z = ((((float) i) * true) / true) + false;
                double d = (double) z;
                SpringConfiguratorView.this.mSelectedSpringConfig.tension = OrigamiValueConverter.tensionFromOrigamiValue(d);
                z = SpringConfiguratorView.DECIMAL_FORMAT.format(d);
                TextView access$900 = SpringConfiguratorView.this.mTensionLabel;
                StringBuilder stringBuilder = new StringBuilder("T:");
                stringBuilder.append(z);
                access$900.setText(stringBuilder.toString());
            }
            if (seekBar == SpringConfiguratorView.this.mFrictionSeekBar) {
                seekBar = ((((float) i) * 1112014848) / 1203982336) + null;
                double d2 = (double) seekBar;
                SpringConfiguratorView.this.mSelectedSpringConfig.friction = OrigamiValueConverter.frictionFromOrigamiValue(d2);
                seekBar = SpringConfiguratorView.DECIMAL_FORMAT.format(d2);
                i = SpringConfiguratorView.this.mFrictionLabel;
                z = new StringBuilder("F:");
                z.append(seekBar);
                i.setText(z.toString());
            }
        }
    }

    private class SpinnerAdapter extends BaseAdapter {
        private final Context mContext;
        private final List<String> mStrings = new ArrayList();

        public long getItemId(int i) {
            return (long) i;
        }

        public SpinnerAdapter(Context context) {
            this.mContext = context;
        }

        public int getCount() {
            return this.mStrings.size();
        }

        public Object getItem(int i) {
            return this.mStrings.get(i);
        }

        public void add(String str) {
            this.mStrings.add(str);
            notifyDataSetChanged();
        }

        public void clear() {
            this.mStrings.clear();
            notifyDataSetChanged();
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = new TextView(this.mContext);
                view.setLayoutParams(new LayoutParams(-1, -1));
                viewGroup = Util.dpToPx(12.0f, SpringConfiguratorView.this.getResources());
                view.setPadding(viewGroup, viewGroup, viewGroup, viewGroup);
                view.setTextColor(SpringConfiguratorView.this.mTextColor);
            } else {
                view = (TextView) view;
            }
            view.setText((CharSequence) this.mStrings.get(i));
            return view;
        }
    }

    private class SpringSelectedListener implements OnItemSelectedListener {
        public void onNothingSelected(AdapterView<?> adapterView) {
        }

        private SpringSelectedListener() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SpringConfiguratorView.this.mSelectedSpringConfig = (SpringConfig) SpringConfiguratorView.this.mSpringConfigs.get(i);
            SpringConfiguratorView.this.updateSeekBarsForSpringConfig(SpringConfiguratorView.this.mSelectedSpringConfig);
        }
    }

    private class RevealerSpringListener implements SpringListener {
        public void onSpringActivate(Spring spring) {
        }

        public void onSpringAtRest(Spring spring) {
        }

        public void onSpringEndStateChange(Spring spring) {
        }

        private RevealerSpringListener() {
        }

        public void onSpringUpdate(Spring spring) {
            spring = (float) spring.getCurrentValue();
            float access$1300 = SpringConfiguratorView.this.mRevealPx;
            SpringConfiguratorView.this.setTranslationY((spring * (SpringConfiguratorView.this.mStashPx - access$1300)) + access$1300);
        }
    }

    public SpringConfiguratorView(Context context) {
        this(context, null);
    }

    public SpringConfiguratorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @TargetApi(11)
    public SpringConfiguratorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSpringConfigs = new ArrayList();
        this.mTextColor = Color.argb(255, 225, 225, 225);
        attributeSet = SpringSystem.create();
        this.springConfigRegistry = SpringConfigRegistry.getInstance();
        this.spinnerAdapter = new SpinnerAdapter(context);
        i = getResources();
        this.mRevealPx = (float) Util.dpToPx(40.0f, i);
        this.mStashPx = (float) Util.dpToPx(280.0f, i);
        this.mRevealerSpring = attributeSet.createSpring();
        this.mRevealerSpring.setCurrentValue(1.0d).setEndValue(1.0d).addListener(new RevealerSpringListener());
        addView(generateHierarchy(context));
        context = new SeekbarListener();
        this.mTensionSeekBar.setMax(100000);
        this.mTensionSeekBar.setOnSeekBarChangeListener(context);
        this.mFrictionSeekBar.setMax(100000);
        this.mFrictionSeekBar.setOnSeekBarChangeListener(context);
        this.mSpringSelectorSpinner.setAdapter(this.spinnerAdapter);
        this.mSpringSelectorSpinner.setOnItemSelectedListener(new SpringSelectedListener());
        refreshSpringConfigurations();
        setTranslationY(this.mStashPx);
    }

    private View generateHierarchy(Context context) {
        Resources resources = getResources();
        int dpToPx = Util.dpToPx(5.0f, resources);
        int dpToPx2 = Util.dpToPx(10.0f, resources);
        int dpToPx3 = Util.dpToPx(20.0f, resources);
        ViewGroup.LayoutParams layoutParams = new TableLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(0, 0, dpToPx, 0);
        View frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(Util.createLayoutParams(-1, Util.dpToPx(300.0f, resources)));
        View frameLayout2 = new FrameLayout(context);
        ViewGroup.LayoutParams createMatchParams = Util.createMatchParams();
        createMatchParams.setMargins(0, dpToPx3, 0, 0);
        frameLayout2.setLayoutParams(createMatchParams);
        frameLayout2.setBackgroundColor(Color.argb(100, 0, 0, 0));
        frameLayout.addView(frameLayout2);
        this.mSpringSelectorSpinner = new Spinner(context, 0);
        createMatchParams = Util.createMatchWrapParams();
        createMatchParams.gravity = 48;
        createMatchParams.setMargins(dpToPx2, dpToPx2, dpToPx2, 0);
        this.mSpringSelectorSpinner.setLayoutParams(createMatchParams);
        frameLayout2.addView(this.mSpringSelectorSpinner);
        View linearLayout = new LinearLayout(context);
        ViewGroup.LayoutParams createMatchWrapParams = Util.createMatchWrapParams();
        createMatchWrapParams.setMargins(0, 0, 0, Util.dpToPx(80.0f, resources));
        createMatchWrapParams.gravity = 80;
        linearLayout.setLayoutParams(createMatchWrapParams);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout);
        frameLayout2 = new LinearLayout(context);
        ViewGroup.LayoutParams createMatchWrapParams2 = Util.createMatchWrapParams();
        createMatchWrapParams2.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx3);
        frameLayout2.setPadding(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
        frameLayout2.setLayoutParams(createMatchWrapParams2);
        frameLayout2.setOrientation(0);
        linearLayout.addView(frameLayout2);
        this.mTensionSeekBar = new SeekBar(context);
        this.mTensionSeekBar.setLayoutParams(layoutParams);
        frameLayout2.addView(this.mTensionSeekBar);
        this.mTensionLabel = new TextView(getContext());
        this.mTensionLabel.setTextColor(this.mTextColor);
        ViewGroup.LayoutParams createLayoutParams = Util.createLayoutParams(Util.dpToPx(MAX_FRICTION, resources), -1);
        this.mTensionLabel.setGravity(19);
        this.mTensionLabel.setLayoutParams(createLayoutParams);
        this.mTensionLabel.setMaxLines(1);
        frameLayout2.addView(this.mTensionLabel);
        frameLayout2 = new LinearLayout(context);
        createLayoutParams = Util.createMatchWrapParams();
        createLayoutParams.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx3);
        frameLayout2.setPadding(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
        frameLayout2.setLayoutParams(createLayoutParams);
        frameLayout2.setOrientation(0);
        linearLayout.addView(frameLayout2);
        this.mFrictionSeekBar = new SeekBar(context);
        this.mFrictionSeekBar.setLayoutParams(layoutParams);
        frameLayout2.addView(this.mFrictionSeekBar);
        this.mFrictionLabel = new TextView(getContext());
        this.mFrictionLabel.setTextColor(this.mTextColor);
        ViewGroup.LayoutParams createLayoutParams2 = Util.createLayoutParams(Util.dpToPx(MAX_FRICTION, resources), -1);
        this.mFrictionLabel.setGravity(19);
        this.mFrictionLabel.setLayoutParams(createLayoutParams2);
        this.mFrictionLabel.setMaxLines(1);
        frameLayout2.addView(this.mFrictionLabel);
        View view = new View(context);
        context = Util.createLayoutParams(Util.dpToPx(60.0f, resources), Util.dpToPx(40.0f, resources));
        context.gravity = 49;
        view.setLayoutParams(context);
        view.setOnTouchListener(new OnNubTouchListener());
        view.setBackgroundColor(Color.argb(255, 0, Opcodes.SHR_LONG, 209));
        frameLayout.addView(view);
        return frameLayout;
    }

    public void destroy() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        this.mRevealerSpring.destroy();
    }

    public void refreshSpringConfigurations() {
        Map allSpringConfig = this.springConfigRegistry.getAllSpringConfig();
        this.spinnerAdapter.clear();
        this.mSpringConfigs.clear();
        for (Entry entry : allSpringConfig.entrySet()) {
            if (entry.getKey() != SpringConfig.defaultConfig) {
                this.mSpringConfigs.add(entry.getKey());
                this.spinnerAdapter.add((String) entry.getValue());
            }
        }
        this.mSpringConfigs.add(SpringConfig.defaultConfig);
        this.spinnerAdapter.add((String) allSpringConfig.get(SpringConfig.defaultConfig));
        this.spinnerAdapter.notifyDataSetChanged();
        if (this.mSpringConfigs.size() > 0) {
            this.mSpringSelectorSpinner.setSelection(0);
        }
    }

    private void updateSeekBarsForSpringConfig(SpringConfig springConfig) {
        int round = Math.round(((((float) OrigamiValueConverter.origamiValueFromTension(springConfig.tension)) - 0.0f) * 100000.0f) / MAX_TENSION);
        springConfig = Math.round(((((float) OrigamiValueConverter.origamiValueFromFriction(springConfig.friction)) - null) * 1203982336) / MAX_FRICTION);
        this.mTensionSeekBar.setProgress(round);
        this.mFrictionSeekBar.setProgress(springConfig);
    }

    private void togglePosition() {
        double endValue = this.mRevealerSpring.getEndValue();
        Spring spring = this.mRevealerSpring;
        double d = 1.0d;
        if (endValue == 1.0d) {
            d = 0.0d;
        }
        spring.setEndValue(d);
    }
}
