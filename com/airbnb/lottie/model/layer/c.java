package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.model.content.Mask.MaskMode;
import com.airbnb.lottie.model.layer.Layer.LayerType;

/* compiled from: BaseLayer */
final /* synthetic */ class c {
    static final /* synthetic */ int[] a = new int[LayerType.values().length];
    static final /* synthetic */ int[] b = new int[MaskMode.values().length];

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r0 = com.airbnb.lottie.model.content.Mask.MaskMode.values();
        r0 = r0.length;
        r0 = new int[r0];
        b = r0;
        r0 = 1;
        r1 = b;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r2 = com.airbnb.lottie.model.content.Mask.MaskMode.MaskModeSubtract;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
        r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
    L_0x0014:
        r1 = 2;
        r2 = b;	 Catch:{ NoSuchFieldError -> 0x001f }
        r3 = com.airbnb.lottie.model.content.Mask.MaskMode.MaskModeIntersect;	 Catch:{ NoSuchFieldError -> 0x001f }
        r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
        r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
    L_0x001f:
        r2 = 3;
        r3 = b;	 Catch:{ NoSuchFieldError -> 0x002a }
        r4 = com.airbnb.lottie.model.content.Mask.MaskMode.MaskModeUnknown;	 Catch:{ NoSuchFieldError -> 0x002a }
        r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
        r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
    L_0x002a:
        r3 = 4;
        r4 = b;	 Catch:{ NoSuchFieldError -> 0x0035 }
        r5 = com.airbnb.lottie.model.content.Mask.MaskMode.MaskModeAdd;	 Catch:{ NoSuchFieldError -> 0x0035 }
        r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
        r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
    L_0x0035:
        r4 = com.airbnb.lottie.model.layer.Layer.LayerType.values();
        r4 = r4.length;
        r4 = new int[r4];
        a = r4;
        r4 = a;	 Catch:{ NoSuchFieldError -> 0x0048 }
        r5 = com.airbnb.lottie.model.layer.Layer.LayerType.Shape;	 Catch:{ NoSuchFieldError -> 0x0048 }
        r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0048 }
        r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0048 }
    L_0x0048:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x0052 }
        r4 = com.airbnb.lottie.model.layer.Layer.LayerType.PreComp;	 Catch:{ NoSuchFieldError -> 0x0052 }
        r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0052 }
        r0[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x0052 }
    L_0x0052:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x005c }
        r1 = com.airbnb.lottie.model.layer.Layer.LayerType.Solid;	 Catch:{ NoSuchFieldError -> 0x005c }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x005c }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x005c }
    L_0x005c:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x0066 }
        r1 = com.airbnb.lottie.model.layer.Layer.LayerType.Image;	 Catch:{ NoSuchFieldError -> 0x0066 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0066 }
        r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x0066 }
    L_0x0066:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x0071 }
        r1 = com.airbnb.lottie.model.layer.Layer.LayerType.Null;	 Catch:{ NoSuchFieldError -> 0x0071 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0071 }
        r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0071 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0071 }
    L_0x0071:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x007c }
        r1 = com.airbnb.lottie.model.layer.Layer.LayerType.Text;	 Catch:{ NoSuchFieldError -> 0x007c }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007c }
        r2 = 6;	 Catch:{ NoSuchFieldError -> 0x007c }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007c }
    L_0x007c:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x0087 }
        r1 = com.airbnb.lottie.model.layer.Layer.LayerType.Unknown;	 Catch:{ NoSuchFieldError -> 0x0087 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0087 }
        r2 = 7;	 Catch:{ NoSuchFieldError -> 0x0087 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0087 }
    L_0x0087:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.c.<clinit>():void");
    }
}
