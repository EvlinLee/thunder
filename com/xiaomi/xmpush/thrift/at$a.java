package com.xiaomi.xmpush.thrift;

import com.taobao.accs.common.Constants;
import com.tencent.open.SocialConstants;
import com.xunlei.download.DownloadManager;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

public enum at$a {
    DEBUG((short) 1, "debug"),
    TARGET((short) 2, "target"),
    ID((short) 3, AgooConstants.MESSAGE_ID),
    APP_ID((short) 4, "appId"),
    REQUEST((short) 5, SocialConstants.TYPE_REQUEST),
    ERROR_CODE((short) 6, "errorCode"),
    REASON((short) 7, DownloadManager.COLUMN_REASON),
    TOPIC((short) 8, "topic"),
    PACKAGE_NAME((short) 9, Constants.KEY_PACKAGE_NAME),
    CATEGORY((short) 10, "category");
    
    private static final Map<String, at$a> k = null;
    private final short l;
    private final String m;

    static {
        k = new HashMap();
        Iterator it = EnumSet.allOf(at$a.class).iterator();
        while (it.hasNext()) {
            at$a com_xiaomi_xmpush_thrift_at_a = (at$a) it.next();
            k.put(com_xiaomi_xmpush_thrift_at_a.a(), com_xiaomi_xmpush_thrift_at_a);
        }
    }

    private at$a(short s, String str) {
        this.l = s;
        this.m = str;
    }

    public final String a() {
        return this.m;
    }
}
