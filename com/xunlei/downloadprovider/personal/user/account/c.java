package com.xunlei.downloadprovider.personal.user.account;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.xunlei.downloadprovider.personal.user.account.a.b;

/* compiled from: ActionSheetHelper */
public final class c implements OnClickListener {
    final /* synthetic */ Dialog a;
    final /* synthetic */ b b;

    public c(Dialog dialog, b bVar) {
        this.a = dialog;
        this.b = bVar;
    }

    public final void onClick(View view) {
        this.a.dismiss();
        if (this.b != null) {
            this.b.a(0);
        }
    }
}
