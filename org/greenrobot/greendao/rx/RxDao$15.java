package org.greenrobot.greendao.rx;

import java.util.concurrent.Callable;

class RxDao$15 implements Callable<Object[]> {
    final /* synthetic */ RxDao this$0;
    final /* synthetic */ Object[] val$entities;

    RxDao$15(RxDao rxDao, Object[] objArr) {
        this.this$0 = rxDao;
        this.val$entities = objArr;
    }

    public Object[] call() throws Exception {
        RxDao.access$000(this.this$0).updateInTx(this.val$entities);
        return this.val$entities;
    }
}
