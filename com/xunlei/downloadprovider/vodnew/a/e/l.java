package com.xunlei.downloadprovider.vodnew.a.e;

import com.xunlei.downloadprovider.download.downloadvod.i;

/* compiled from: PlayerStatePrepared */
final class l extends a {
    private static final String c;

    public final int a() {
        return 5;
    }

    public final String b() {
        return "PLAYER_STATE_PREPARED";
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(l.class.getSimpleName());
        stringBuilder.append(" ");
        c = stringBuilder.toString();
    }

    public l(o oVar) {
        super(oVar);
    }

    public final void a(i iVar) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append("setDataSource : ");
        stringBuilder.append(iVar);
    }

    public final void c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append("prepareAsync");
    }

    public final void d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append("start");
        this.b.a.e();
        this.b.c(2);
    }

    public final void e() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append("pause");
    }

    public final void a(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append("seekTo, msec : ");
        stringBuilder.append(i);
        this.b.a.a(i);
    }

    public final void f() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append("stop");
        this.b.D();
    }

    public final void g() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append("reset");
        this.b.E();
    }

    public final void h() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append("release");
        this.b.F();
    }
}
