package org.greenrobot.greendao.rx;

import java.util.concurrent.Callable;

class RxDao$5 implements Callable<Iterable<T>> {
    final /* synthetic */ RxDao this$0;
    final /* synthetic */ Iterable val$entities;

    RxDao$5(RxDao rxDao, Iterable iterable) {
        this.this$0 = rxDao;
        this.val$entities = iterable;
    }

    public Iterable<T> call() throws Exception {
        RxDao.access$000(this.this$0).insertInTx(this.val$entities);
        return this.val$entities;
    }
}
