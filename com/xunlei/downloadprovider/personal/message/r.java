package com.xunlei.downloadprovider.personal.message;

import com.xunlei.downloadprovider.homepage.follow.b;
import com.xunlei.downloadprovider.member.login.b.c;

/* compiled from: MessageItemFragment */
final class r extends c {
    final /* synthetic */ long a;
    final /* synthetic */ MessageItemFragment b;

    r(MessageItemFragment messageItemFragment, long j) {
        this.b = messageItemFragment;
        this.a = j;
    }

    public final void onLoginCompleted(boolean z, int i, Object obj) {
        if (i == 0) {
            if (b.a().b(this.a)) {
                this.b.c((long) this.a);
            } else if (this.b.f) {
                this.b.f.notifyDataSetChanged();
            }
        }
    }
}
