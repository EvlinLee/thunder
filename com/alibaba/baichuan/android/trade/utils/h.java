package com.alibaba.baichuan.android.trade.utils;

import com.alibaba.baichuan.android.trade.callback.AlibcFailureCallback;

final class h implements Runnable {
    final /* synthetic */ AlibcFailureCallback a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;

    h(AlibcFailureCallback alibcFailureCallback, int i, String str) {
        this.a = alibcFailureCallback;
        this.b = i;
        this.c = str;
    }

    public final void run() {
        this.a.onFailure(this.b, this.c);
    }
}
