package com.xunlei.downloadprovider.player.xmp.ui;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PlayerCompletionViewDetail */
final class i implements OnClickListener {
    final /* synthetic */ PlayerCompletionViewDetail a;

    i(PlayerCompletionViewDetail playerCompletionViewDetail) {
        this.a = playerCompletionViewDetail;
    }

    public final void onClick(View view) {
        if (this.a.e != null) {
            this.a.e.f();
        }
    }
}
