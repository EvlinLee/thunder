package com.xiaomi.push.protobuf;

public final class b {

    public static final class a extends com.google.protobuf.micro.e {
        private boolean a;
        private int b = 0;
        private boolean c;
        private long d = 0;
        private boolean e;
        private String f = "";
        private boolean g;
        private String h = "";
        private boolean i;
        private String j = "";
        private boolean k;
        private String l = "";
        private boolean m;
        private String n = "";
        private boolean o;
        private int p = 1;
        private boolean q;
        private int r = 0;
        private boolean s;
        private int t = 0;
        private boolean u;
        private String v = "";
        private int w = -1;

        public final int a() {
            if (this.w < 0) {
                b();
            }
            return this.w;
        }

        public final /* synthetic */ com.google.protobuf.micro.e a(com.google.protobuf.micro.b bVar) {
            return b(bVar);
        }

        public final a a(int i) {
            this.a = true;
            this.b = i;
            return this;
        }

        public final a a(long j) {
            this.c = true;
            this.d = j;
            return this;
        }

        public final a a(String str) {
            this.e = true;
            this.f = str;
            return this;
        }

        public final void a(com.google.protobuf.micro.c cVar) {
            if (e()) {
                cVar.a(1, d());
            }
            if (g()) {
                cVar.b(2, f());
            }
            if (i()) {
                cVar.a(3, h());
            }
            if (k()) {
                cVar.a(4, j());
            }
            if (m()) {
                cVar.a(5, l());
            }
            if (o()) {
                cVar.a(6, n());
            }
            if (r()) {
                cVar.a(7, q());
            }
            if (s()) {
                cVar.a(8, t());
            }
            if (v()) {
                cVar.a(9, u());
            }
            if (x()) {
                cVar.a(10, w());
            }
            if (z()) {
                cVar.a(11, y());
            }
        }

        public final int b() {
            int i = 0;
            if (e()) {
                i = 0 + com.google.protobuf.micro.c.c(1, d());
            }
            if (g()) {
                i += com.google.protobuf.micro.c.d(2, f());
            }
            if (i()) {
                i += com.google.protobuf.micro.c.b(3, h());
            }
            if (k()) {
                i += com.google.protobuf.micro.c.b(4, j());
            }
            if (m()) {
                i += com.google.protobuf.micro.c.b(5, l());
            }
            if (o()) {
                i += com.google.protobuf.micro.c.b(6, n());
            }
            if (r()) {
                i += com.google.protobuf.micro.c.b(7, q());
            }
            if (s()) {
                i += com.google.protobuf.micro.c.c(8, t());
            }
            if (v()) {
                i += com.google.protobuf.micro.c.c(9, u());
            }
            if (x()) {
                i += com.google.protobuf.micro.c.c(10, w());
            }
            if (z()) {
                i += com.google.protobuf.micro.c.b(11, y());
            }
            this.w = i;
            return i;
        }

        public final a b(int i) {
            this.o = true;
            this.p = i;
            return this;
        }

        public final a b(com.google.protobuf.micro.b bVar) {
            while (true) {
                int a = bVar.a();
                switch (a) {
                    case 0:
                        return this;
                    case 8:
                        a(bVar.e());
                        break;
                    case 16:
                        a(bVar.d());
                        break;
                    case 26:
                        a(bVar.g());
                        break;
                    case 34:
                        b(bVar.g());
                        break;
                    case 42:
                        c(bVar.g());
                        break;
                    case 50:
                        d(bVar.g());
                        break;
                    case 58:
                        e(bVar.g());
                        break;
                    case 64:
                        b(bVar.e());
                        break;
                    case 72:
                        c(bVar.e());
                        break;
                    case 80:
                        d(bVar.e());
                        break;
                    case 90:
                        f(bVar.g());
                        break;
                    default:
                        if (a(bVar, a)) {
                            break;
                        }
                        return this;
                }
            }
        }

        public final a b(String str) {
            this.g = true;
            this.h = str;
            return this;
        }

        public final a c(int i) {
            this.q = true;
            this.r = i;
            return this;
        }

        public final a c(String str) {
            this.i = true;
            this.j = str;
            return this;
        }

        public final int d() {
            return this.b;
        }

        public final a d(int i) {
            this.s = true;
            this.t = i;
            return this;
        }

        public final a d(String str) {
            this.k = true;
            this.l = str;
            return this;
        }

        public final a e(String str) {
            this.m = true;
            this.n = str;
            return this;
        }

        public final boolean e() {
            return this.a;
        }

        public final long f() {
            return this.d;
        }

        public final a f(String str) {
            this.u = true;
            this.v = str;
            return this;
        }

        public final boolean g() {
            return this.c;
        }

        public final String h() {
            return this.f;
        }

        public final boolean i() {
            return this.e;
        }

        public final String j() {
            return this.h;
        }

        public final boolean k() {
            return this.g;
        }

        public final String l() {
            return this.j;
        }

        public final boolean m() {
            return this.i;
        }

        public final String n() {
            return this.l;
        }

        public final boolean o() {
            return this.k;
        }

        public final a p() {
            this.k = false;
            this.l = "";
            return this;
        }

        public final String q() {
            return this.n;
        }

        public final boolean r() {
            return this.m;
        }

        public final boolean s() {
            return this.o;
        }

        public final int t() {
            return this.p;
        }

        public final int u() {
            return this.r;
        }

        public final boolean v() {
            return this.q;
        }

        public final int w() {
            return this.t;
        }

        public final boolean x() {
            return this.s;
        }

        public final String y() {
            return this.v;
        }

        public final boolean z() {
            return this.u;
        }
    }

    public static final class b extends com.google.protobuf.micro.e {
        private boolean a;
        private boolean b = false;
        private boolean c;
        private int d = 0;
        private boolean e;
        private int f = 0;
        private boolean g;
        private int h = 0;
        private int i = -1;

        public static b b(byte[] bArr) {
            return (b) new b().a(bArr);
        }

        public final int a() {
            if (this.i < 0) {
                b();
            }
            return this.i;
        }

        public final /* synthetic */ com.google.protobuf.micro.e a(com.google.protobuf.micro.b bVar) {
            return b(bVar);
        }

        public final b a(int i) {
            this.c = true;
            this.d = i;
            return this;
        }

        public final b a(boolean z) {
            this.a = true;
            this.b = z;
            return this;
        }

        public final void a(com.google.protobuf.micro.c cVar) {
            if (e()) {
                cVar.a(1, d());
            }
            if (g()) {
                cVar.a(3, f());
            }
            if (i()) {
                cVar.a(4, h());
            }
            if (k()) {
                cVar.a(5, j());
            }
        }

        public final int b() {
            int i = 0;
            if (e()) {
                i = 0 + com.google.protobuf.micro.c.b(1, d());
            }
            if (g()) {
                i += com.google.protobuf.micro.c.c(3, f());
            }
            if (i()) {
                i += com.google.protobuf.micro.c.c(4, h());
            }
            if (k()) {
                i += com.google.protobuf.micro.c.c(5, j());
            }
            this.i = i;
            return i;
        }

        public final b b(int i) {
            this.e = true;
            this.f = i;
            return this;
        }

        public final b b(com.google.protobuf.micro.b bVar) {
            while (true) {
                int a = bVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    a(bVar.f());
                } else if (a == 24) {
                    a(bVar.e());
                } else if (a == 32) {
                    b(bVar.e());
                } else if (a == 40) {
                    c(bVar.e());
                } else if (!a(bVar, a)) {
                    return this;
                }
            }
        }

        public final b c(int i) {
            this.g = true;
            this.h = i;
            return this;
        }

        public final boolean d() {
            return this.b;
        }

        public final boolean e() {
            return this.a;
        }

        public final int f() {
            return this.d;
        }

        public final boolean g() {
            return this.c;
        }

        public final int h() {
            return this.f;
        }

        public final boolean i() {
            return this.e;
        }

        public final int j() {
            return this.h;
        }

        public final boolean k() {
            return this.g;
        }
    }

    public static final class c extends com.google.protobuf.micro.e {
        private boolean a;
        private String b = "";
        private boolean c;
        private String d = "";
        private boolean e;
        private String f = "";
        private boolean g;
        private String h = "";
        private boolean i;
        private String j = "";
        private boolean k;
        private String l = "";
        private int m = -1;

        public final int a() {
            if (this.m < 0) {
                b();
            }
            return this.m;
        }

        public final /* synthetic */ com.google.protobuf.micro.e a(com.google.protobuf.micro.b bVar) {
            return b(bVar);
        }

        public final c a(String str) {
            this.a = true;
            this.b = str;
            return this;
        }

        public final void a(com.google.protobuf.micro.c cVar) {
            if (e()) {
                cVar.a(1, d());
            }
            if (g()) {
                cVar.a(2, f());
            }
            if (i()) {
                cVar.a(3, h());
            }
            if (k()) {
                cVar.a(4, j());
            }
            if (m()) {
                cVar.a(5, l());
            }
            if (o()) {
                cVar.a(6, n());
            }
        }

        public final int b() {
            int i = 0;
            if (e()) {
                i = 0 + com.google.protobuf.micro.c.b(1, d());
            }
            if (g()) {
                i += com.google.protobuf.micro.c.b(2, f());
            }
            if (i()) {
                i += com.google.protobuf.micro.c.b(3, h());
            }
            if (k()) {
                i += com.google.protobuf.micro.c.b(4, j());
            }
            if (m()) {
                i += com.google.protobuf.micro.c.b(5, l());
            }
            if (o()) {
                i += com.google.protobuf.micro.c.b(6, n());
            }
            this.m = i;
            return i;
        }

        public final c b(com.google.protobuf.micro.b bVar) {
            while (true) {
                int a = bVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    a(bVar.g());
                } else if (a == 18) {
                    b(bVar.g());
                } else if (a == 26) {
                    c(bVar.g());
                } else if (a == 34) {
                    d(bVar.g());
                } else if (a == 42) {
                    e(bVar.g());
                } else if (a == 50) {
                    f(bVar.g());
                } else if (!a(bVar, a)) {
                    return this;
                }
            }
        }

        public final c b(String str) {
            this.c = true;
            this.d = str;
            return this;
        }

        public final c c(String str) {
            this.e = true;
            this.f = str;
            return this;
        }

        public final c d(String str) {
            this.g = true;
            this.h = str;
            return this;
        }

        public final String d() {
            return this.b;
        }

        public final c e(String str) {
            this.i = true;
            this.j = str;
            return this;
        }

        public final boolean e() {
            return this.a;
        }

        public final c f(String str) {
            this.k = true;
            this.l = str;
            return this;
        }

        public final String f() {
            return this.d;
        }

        public final boolean g() {
            return this.c;
        }

        public final String h() {
            return this.f;
        }

        public final boolean i() {
            return this.e;
        }

        public final String j() {
            return this.h;
        }

        public final boolean k() {
            return this.g;
        }

        public final String l() {
            return this.j;
        }

        public final boolean m() {
            return this.i;
        }

        public final String n() {
            return this.l;
        }

        public final boolean o() {
            return this.k;
        }
    }

    public static final class d extends com.google.protobuf.micro.e {
        private boolean a;
        private boolean b = false;
        private boolean c;
        private String d = "";
        private boolean e;
        private String f = "";
        private boolean g;
        private String h = "";
        private int i = -1;

        public static d b(byte[] bArr) {
            return (d) new d().a(bArr);
        }

        public final int a() {
            if (this.i < 0) {
                b();
            }
            return this.i;
        }

        public final /* synthetic */ com.google.protobuf.micro.e a(com.google.protobuf.micro.b bVar) {
            return b(bVar);
        }

        public final d a(String str) {
            this.c = true;
            this.d = str;
            return this;
        }

        public final d a(boolean z) {
            this.a = true;
            this.b = z;
            return this;
        }

        public final void a(com.google.protobuf.micro.c cVar) {
            if (e()) {
                cVar.a(1, d());
            }
            if (g()) {
                cVar.a(2, f());
            }
            if (i()) {
                cVar.a(3, h());
            }
            if (k()) {
                cVar.a(4, j());
            }
        }

        public final int b() {
            int i = 0;
            if (e()) {
                i = 0 + com.google.protobuf.micro.c.b(1, d());
            }
            if (g()) {
                i += com.google.protobuf.micro.c.b(2, f());
            }
            if (i()) {
                i += com.google.protobuf.micro.c.b(3, h());
            }
            if (k()) {
                i += com.google.protobuf.micro.c.b(4, j());
            }
            this.i = i;
            return i;
        }

        public final d b(com.google.protobuf.micro.b bVar) {
            while (true) {
                int a = bVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    a(bVar.f());
                } else if (a == 18) {
                    a(bVar.g());
                } else if (a == 26) {
                    b(bVar.g());
                } else if (a == 34) {
                    c(bVar.g());
                } else if (!a(bVar, a)) {
                    return this;
                }
            }
        }

        public final d b(String str) {
            this.e = true;
            this.f = str;
            return this;
        }

        public final d c(String str) {
            this.g = true;
            this.h = str;
            return this;
        }

        public final boolean d() {
            return this.b;
        }

        public final boolean e() {
            return this.a;
        }

        public final String f() {
            return this.d;
        }

        public final boolean g() {
            return this.c;
        }

        public final String h() {
            return this.f;
        }

        public final boolean i() {
            return this.e;
        }

        public final String j() {
            return this.h;
        }

        public final boolean k() {
            return this.g;
        }
    }

    public static final class e extends com.google.protobuf.micro.e {
        private boolean a;
        private int b = 0;
        private boolean c;
        private String d = "";
        private boolean e;
        private String f = "";
        private boolean g;
        private String h = "";
        private boolean i;
        private int j = 0;
        private boolean k;
        private String l = "";
        private boolean m;
        private String n = "";
        private boolean o;
        private String p = "";
        private boolean q;
        private b r = null;
        private boolean s;
        private int t = 0;
        private int u = -1;

        public final int a() {
            if (this.u < 0) {
                b();
            }
            return this.u;
        }

        public final /* synthetic */ com.google.protobuf.micro.e a(com.google.protobuf.micro.b bVar) {
            return b(bVar);
        }

        public final e a(int i) {
            this.a = true;
            this.b = i;
            return this;
        }

        public final e a(b bVar) {
            if (bVar == null) {
                throw new NullPointerException();
            }
            this.q = true;
            this.r = bVar;
            return this;
        }

        public final e a(String str) {
            this.c = true;
            this.d = str;
            return this;
        }

        public final void a(com.google.protobuf.micro.c cVar) {
            if (e()) {
                cVar.b(1, d());
            }
            if (g()) {
                cVar.a(2, f());
            }
            if (i()) {
                cVar.a(3, h());
            }
            if (k()) {
                cVar.a(4, j());
            }
            if (m()) {
                cVar.a(5, l());
            }
            if (o()) {
                cVar.a(6, n());
            }
            if (q()) {
                cVar.a(7, p());
            }
            if (s()) {
                cVar.a(8, r());
            }
            if (t()) {
                cVar.a(9, u());
            }
            if (w()) {
                cVar.a(10, v());
            }
        }

        public final int b() {
            int i = 0;
            if (e()) {
                i = 0 + com.google.protobuf.micro.c.d(1, d());
            }
            if (g()) {
                i += com.google.protobuf.micro.c.b(2, f());
            }
            if (i()) {
                i += com.google.protobuf.micro.c.b(3, h());
            }
            if (k()) {
                i += com.google.protobuf.micro.c.b(4, j());
            }
            if (m()) {
                i += com.google.protobuf.micro.c.c(5, l());
            }
            if (o()) {
                i += com.google.protobuf.micro.c.b(6, n());
            }
            if (q()) {
                i += com.google.protobuf.micro.c.b(7, p());
            }
            if (s()) {
                i += com.google.protobuf.micro.c.b(8, r());
            }
            if (t()) {
                i += com.google.protobuf.micro.c.b(9, u());
            }
            if (w()) {
                i += com.google.protobuf.micro.c.c(10, v());
            }
            this.u = i;
            return i;
        }

        public final e b(int i) {
            this.i = true;
            this.j = i;
            return this;
        }

        public final e b(com.google.protobuf.micro.b bVar) {
            while (true) {
                int a = bVar.a();
                switch (a) {
                    case 0:
                        return this;
                    case 8:
                        a(bVar.i());
                        break;
                    case 18:
                        a(bVar.g());
                        break;
                    case 26:
                        b(bVar.g());
                        break;
                    case 34:
                        c(bVar.g());
                        break;
                    case 40:
                        b(bVar.e());
                        break;
                    case 50:
                        d(bVar.g());
                        break;
                    case 58:
                        e(bVar.g());
                        break;
                    case 66:
                        f(bVar.g());
                        break;
                    case 74:
                        b bVar2 = new b();
                        bVar.a(bVar2);
                        a(bVar2);
                        break;
                    case 80:
                        c(bVar.e());
                        break;
                    default:
                        if (a(bVar, a)) {
                            break;
                        }
                        return this;
                }
            }
        }

        public final e b(String str) {
            this.e = true;
            this.f = str;
            return this;
        }

        public final e c(int i) {
            this.s = true;
            this.t = i;
            return this;
        }

        public final e c(String str) {
            this.g = true;
            this.h = str;
            return this;
        }

        public final int d() {
            return this.b;
        }

        public final e d(String str) {
            this.k = true;
            this.l = str;
            return this;
        }

        public final e e(String str) {
            this.m = true;
            this.n = str;
            return this;
        }

        public final boolean e() {
            return this.a;
        }

        public final e f(String str) {
            this.o = true;
            this.p = str;
            return this;
        }

        public final String f() {
            return this.d;
        }

        public final boolean g() {
            return this.c;
        }

        public final String h() {
            return this.f;
        }

        public final boolean i() {
            return this.e;
        }

        public final String j() {
            return this.h;
        }

        public final boolean k() {
            return this.g;
        }

        public final int l() {
            return this.j;
        }

        public final boolean m() {
            return this.i;
        }

        public final String n() {
            return this.l;
        }

        public final boolean o() {
            return this.k;
        }

        public final String p() {
            return this.n;
        }

        public final boolean q() {
            return this.m;
        }

        public final String r() {
            return this.p;
        }

        public final boolean s() {
            return this.o;
        }

        public final boolean t() {
            return this.q;
        }

        public final b u() {
            return this.r;
        }

        public final int v() {
            return this.t;
        }

        public final boolean w() {
            return this.s;
        }
    }

    public static final class f extends com.google.protobuf.micro.e {
        private boolean a;
        private String b = "";
        private boolean c;
        private String d = "";
        private boolean e;
        private b f = null;
        private int g = -1;

        public static f b(byte[] bArr) {
            return (f) new f().a(bArr);
        }

        public final int a() {
            if (this.g < 0) {
                b();
            }
            return this.g;
        }

        public final /* synthetic */ com.google.protobuf.micro.e a(com.google.protobuf.micro.b bVar) {
            return b(bVar);
        }

        public final f a(b bVar) {
            if (bVar == null) {
                throw new NullPointerException();
            }
            this.e = true;
            this.f = bVar;
            return this;
        }

        public final f a(String str) {
            this.a = true;
            this.b = str;
            return this;
        }

        public final void a(com.google.protobuf.micro.c cVar) {
            if (e()) {
                cVar.a(1, d());
            }
            if (g()) {
                cVar.a(2, f());
            }
            if (h()) {
                cVar.a(3, i());
            }
        }

        public final int b() {
            int i = 0;
            if (e()) {
                i = 0 + com.google.protobuf.micro.c.b(1, d());
            }
            if (g()) {
                i += com.google.protobuf.micro.c.b(2, f());
            }
            if (h()) {
                i += com.google.protobuf.micro.c.b(3, i());
            }
            this.g = i;
            return i;
        }

        public final f b(com.google.protobuf.micro.b bVar) {
            while (true) {
                int a = bVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    a(bVar.g());
                } else if (a == 18) {
                    b(bVar.g());
                } else if (a == 26) {
                    b bVar2 = new b();
                    bVar.a(bVar2);
                    a(bVar2);
                } else if (!a(bVar, a)) {
                    return this;
                }
            }
        }

        public final f b(String str) {
            this.c = true;
            this.d = str;
            return this;
        }

        public final String d() {
            return this.b;
        }

        public final boolean e() {
            return this.a;
        }

        public final String f() {
            return this.d;
        }

        public final boolean g() {
            return this.c;
        }

        public final boolean h() {
            return this.e;
        }

        public final b i() {
            return this.f;
        }
    }

    public static final class g extends com.google.protobuf.micro.e {
        private boolean a;
        private String b = "";
        private boolean c;
        private String d = "";
        private boolean e;
        private String f = "";
        private int g = -1;

        public static g b(byte[] bArr) {
            return (g) new g().a(bArr);
        }

        public final int a() {
            if (this.g < 0) {
                b();
            }
            return this.g;
        }

        public final /* synthetic */ com.google.protobuf.micro.e a(com.google.protobuf.micro.b bVar) {
            return b(bVar);
        }

        public final g a(String str) {
            this.a = true;
            this.b = str;
            return this;
        }

        public final void a(com.google.protobuf.micro.c cVar) {
            if (e()) {
                cVar.a(1, d());
            }
            if (g()) {
                cVar.a(2, f());
            }
            if (i()) {
                cVar.a(3, h());
            }
        }

        public final int b() {
            int i = 0;
            if (e()) {
                i = 0 + com.google.protobuf.micro.c.b(1, d());
            }
            if (g()) {
                i += com.google.protobuf.micro.c.b(2, f());
            }
            if (i()) {
                i += com.google.protobuf.micro.c.b(3, h());
            }
            this.g = i;
            return i;
        }

        public final g b(com.google.protobuf.micro.b bVar) {
            while (true) {
                int a = bVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    a(bVar.g());
                } else if (a == 18) {
                    b(bVar.g());
                } else if (a == 26) {
                    c(bVar.g());
                } else if (!a(bVar, a)) {
                    return this;
                }
            }
        }

        public final g b(String str) {
            this.c = true;
            this.d = str;
            return this;
        }

        public final g c(String str) {
            this.e = true;
            this.f = str;
            return this;
        }

        public final String d() {
            return this.b;
        }

        public final boolean e() {
            return this.a;
        }

        public final String f() {
            return this.d;
        }

        public final boolean g() {
            return this.c;
        }

        public final String h() {
            return this.f;
        }

        public final boolean i() {
            return this.e;
        }
    }

    public static final class h extends com.google.protobuf.micro.e {
        private boolean a;
        private int b = 0;
        private boolean c;
        private String d = "";
        private int e = -1;

        public static h b(byte[] bArr) {
            return (h) new h().a(bArr);
        }

        public final int a() {
            if (this.e < 0) {
                b();
            }
            return this.e;
        }

        public final /* synthetic */ com.google.protobuf.micro.e a(com.google.protobuf.micro.b bVar) {
            return b(bVar);
        }

        public final h a(int i) {
            this.a = true;
            this.b = i;
            return this;
        }

        public final h a(String str) {
            this.c = true;
            this.d = str;
            return this;
        }

        public final void a(com.google.protobuf.micro.c cVar) {
            if (e()) {
                cVar.a(1, d());
            }
            if (g()) {
                cVar.a(2, f());
            }
        }

        public final int b() {
            int i = 0;
            if (e()) {
                i = 0 + com.google.protobuf.micro.c.c(1, d());
            }
            if (g()) {
                i += com.google.protobuf.micro.c.b(2, f());
            }
            this.e = i;
            return i;
        }

        public final h b(com.google.protobuf.micro.b bVar) {
            while (true) {
                int a = bVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    a(bVar.e());
                } else if (a == 18) {
                    a(bVar.g());
                } else if (!a(bVar, a)) {
                    return this;
                }
            }
        }

        public final int d() {
            return this.b;
        }

        public final boolean e() {
            return this.a;
        }

        public final String f() {
            return this.d;
        }

        public final boolean g() {
            return this.c;
        }
    }

    public static final class i extends com.google.protobuf.micro.e {
        private boolean a;
        private com.google.protobuf.micro.a b = com.google.protobuf.micro.a.a;
        private int c = -1;

        public static i b(byte[] bArr) {
            return (i) new i().a(bArr);
        }

        public final int a() {
            if (this.c < 0) {
                b();
            }
            return this.c;
        }

        public final /* synthetic */ com.google.protobuf.micro.e a(com.google.protobuf.micro.b bVar) {
            return b(bVar);
        }

        public final i a(com.google.protobuf.micro.a aVar) {
            this.a = true;
            this.b = aVar;
            return this;
        }

        public final void a(com.google.protobuf.micro.c cVar) {
            if (e()) {
                cVar.a(1, d());
            }
        }

        public final int b() {
            int i = 0;
            if (e()) {
                i = 0 + com.google.protobuf.micro.c.b(1, d());
            }
            this.c = i;
            return i;
        }

        public final i b(com.google.protobuf.micro.b bVar) {
            while (true) {
                int a = bVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    a(bVar.h());
                } else if (!a(bVar, a)) {
                    return this;
                }
            }
        }

        public final com.google.protobuf.micro.a d() {
            return this.b;
        }

        public final boolean e() {
            return this.a;
        }
    }

    public static final class j extends com.google.protobuf.micro.e {
        private boolean a;
        private com.google.protobuf.micro.a b = com.google.protobuf.micro.a.a;
        private boolean c;
        private b d = null;
        private int e = -1;

        public static j b(byte[] bArr) {
            return (j) new j().a(bArr);
        }

        public final int a() {
            if (this.e < 0) {
                b();
            }
            return this.e;
        }

        public final /* synthetic */ com.google.protobuf.micro.e a(com.google.protobuf.micro.b bVar) {
            return b(bVar);
        }

        public final j a(com.google.protobuf.micro.a aVar) {
            this.a = true;
            this.b = aVar;
            return this;
        }

        public final j a(b bVar) {
            if (bVar == null) {
                throw new NullPointerException();
            }
            this.c = true;
            this.d = bVar;
            return this;
        }

        public final void a(com.google.protobuf.micro.c cVar) {
            if (e()) {
                cVar.a(1, d());
            }
            if (f()) {
                cVar.a(2, g());
            }
        }

        public final int b() {
            int i = 0;
            if (e()) {
                i = 0 + com.google.protobuf.micro.c.b(1, d());
            }
            if (f()) {
                i += com.google.protobuf.micro.c.b(2, g());
            }
            this.e = i;
            return i;
        }

        public final j b(com.google.protobuf.micro.b bVar) {
            while (true) {
                int a = bVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    a(bVar.h());
                } else if (a == 18) {
                    b bVar2 = new b();
                    bVar.a(bVar2);
                    a(bVar2);
                } else if (!a(bVar, a)) {
                    return this;
                }
            }
        }

        public final com.google.protobuf.micro.a d() {
            return this.b;
        }

        public final boolean e() {
            return this.a;
        }

        public final boolean f() {
            return this.c;
        }

        public final b g() {
            return this.d;
        }
    }

    public static final class k extends com.google.protobuf.micro.e {
        private boolean a;
        private String b = "";
        private boolean c;
        private String d = "";
        private boolean e;
        private long f = 0;
        private boolean g;
        private long h = 0;
        private boolean i;
        private boolean j = false;
        private boolean k;
        private int l = 0;
        private int m = -1;

        public static k b(byte[] bArr) {
            return (k) new k().a(bArr);
        }

        public final int a() {
            if (this.m < 0) {
                b();
            }
            return this.m;
        }

        public final /* synthetic */ com.google.protobuf.micro.e a(com.google.protobuf.micro.b bVar) {
            return b(bVar);
        }

        public final k a(int i) {
            this.k = true;
            this.l = i;
            return this;
        }

        public final k a(long j) {
            this.e = true;
            this.f = j;
            return this;
        }

        public final k a(String str) {
            this.a = true;
            this.b = str;
            return this;
        }

        public final k a(boolean z) {
            this.i = true;
            this.j = z;
            return this;
        }

        public final void a(com.google.protobuf.micro.c cVar) {
            if (e()) {
                cVar.a(1, d());
            }
            if (g()) {
                cVar.a(2, f());
            }
            if (i()) {
                cVar.a(3, h());
            }
            if (k()) {
                cVar.a(4, j());
            }
            if (m()) {
                cVar.a(5, l());
            }
            if (o()) {
                cVar.a(6, n());
            }
        }

        public final int b() {
            int i = 0;
            if (e()) {
                i = 0 + com.google.protobuf.micro.c.b(1, d());
            }
            if (g()) {
                i += com.google.protobuf.micro.c.b(2, f());
            }
            if (i()) {
                i += com.google.protobuf.micro.c.c(3, h());
            }
            if (k()) {
                i += com.google.protobuf.micro.c.c(4, j());
            }
            if (m()) {
                i += com.google.protobuf.micro.c.b(5, l());
            }
            if (o()) {
                i += com.google.protobuf.micro.c.c(6, n());
            }
            this.m = i;
            return i;
        }

        public final k b(long j) {
            this.g = true;
            this.h = j;
            return this;
        }

        public final k b(com.google.protobuf.micro.b bVar) {
            while (true) {
                int a = bVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    a(bVar.g());
                } else if (a == 18) {
                    b(bVar.g());
                } else if (a == 24) {
                    a(bVar.c());
                } else if (a == 32) {
                    b(bVar.c());
                } else if (a == 40) {
                    a(bVar.f());
                } else if (a == 48) {
                    a(bVar.e());
                } else if (!a(bVar, a)) {
                    return this;
                }
            }
        }

        public final k b(String str) {
            this.c = true;
            this.d = str;
            return this;
        }

        public final String d() {
            return this.b;
        }

        public final boolean e() {
            return this.a;
        }

        public final String f() {
            return this.d;
        }

        public final boolean g() {
            return this.c;
        }

        public final long h() {
            return this.f;
        }

        public final boolean i() {
            return this.e;
        }

        public final long j() {
            return this.h;
        }

        public final boolean k() {
            return this.g;
        }

        public final boolean l() {
            return this.j;
        }

        public final boolean m() {
            return this.i;
        }

        public final int n() {
            return this.l;
        }

        public final boolean o() {
            return this.k;
        }
    }
}
