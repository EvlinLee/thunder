package com.alibaba.mtl.appmonitor.c;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ReuseJSONObject */
public class e extends JSONObject implements b {
    public final void a(Object... objArr) {
    }

    public final void d() {
        Iterator keys = keys();
        if (keys != null) {
            while (keys.hasNext()) {
                try {
                    Object obj = get((String) keys.next());
                    if (obj != null && (obj instanceof b)) {
                        a.a().a((b) obj);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
