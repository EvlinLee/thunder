package com.alibaba.baichuan.android.trade.utils;

import com.alibaba.baichuan.android.trade.callback.AlibcFailureCallback;
import com.alibaba.baichuan.android.trade.utils.a.a;

final class g implements Runnable {
    final /* synthetic */ AlibcFailureCallback a;
    final /* synthetic */ a b;

    g(AlibcFailureCallback alibcFailureCallback, a aVar) {
        this.a = alibcFailureCallback;
        this.b = aVar;
    }

    public final void run() {
        this.a.onFailure(this.b.a, this.b.c);
    }
}
