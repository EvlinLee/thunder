package com.xunlei.downloadprovider.personal.message.chat.chatkit.messages;

import android.view.View;
import android.view.View.OnClickListener;
import com.xunlei.downloadprovider.personal.message.chat.chatengine.model.IChatMessage;
import com.xunlei.downloadprovider.personal.message.chat.chatkit.messages.a.c;

/* compiled from: MessageHolders */
final class e implements OnClickListener {
    final /* synthetic */ IChatMessage a;
    final /* synthetic */ c b;

    e(c cVar, IChatMessage iChatMessage) {
        this.b = cVar;
        this.a = iChatMessage;
    }

    public final void onClick(View view) {
        if (this.a != null && this.b.b != null) {
            this.b.b.onClick(3, this.a);
        }
    }
}
