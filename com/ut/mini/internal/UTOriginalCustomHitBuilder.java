package com.ut.mini.internal;

import android.text.TextUtils;
import com.ut.mini.UTHitBuilders.UTHitBuilder;
import java.util.Map;

public class UTOriginalCustomHitBuilder extends UTHitBuilder {
    public UTOriginalCustomHitBuilder(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            super.setProperty(UTHitBuilder.FIELD_PAGE, str);
        }
        super.setProperty(UTHitBuilder.FIELD_EVENT_ID, String.valueOf(i));
        if (TextUtils.isEmpty(str2) == null) {
            super.setProperty(UTHitBuilder.FIELD_ARG1, str2);
        }
        if (TextUtils.isEmpty(str3) == null) {
            super.setProperty(UTHitBuilder.FIELD_ARG2, str3);
        }
        if (TextUtils.isEmpty(str4) == null) {
            super.setProperty(UTHitBuilder.FIELD_ARG3, str4);
        }
        super.setProperties(map);
    }
}
