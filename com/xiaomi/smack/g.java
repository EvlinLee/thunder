package com.xiaomi.smack;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;

public final class g {
    private static int a = 5000;
    private static int b = 330000;
    private static int c = 300000;
    private static int d = 330000;
    private static Vector<String> e = new Vector();

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new java.util.Vector;
        r0.<init>();
        e = r0;
        r0 = d();	 Catch:{ Exception -> 0x00b4 }
        r1 = r0.length;	 Catch:{ Exception -> 0x00b4 }
        r2 = 0;	 Catch:{ Exception -> 0x00b4 }
    L_0x000d:
        if (r2 >= r1) goto L_0x00b3;	 Catch:{ Exception -> 0x00b4 }
    L_0x000f:
        r3 = r0[r2];	 Catch:{ Exception -> 0x00b4 }
        r4 = "META-INF/smack-config.xml";	 Catch:{ Exception -> 0x00b4 }
        r3 = r3.getResources(r4);	 Catch:{ Exception -> 0x00b4 }
    L_0x0017:
        r4 = r3.hasMoreElements();	 Catch:{ Exception -> 0x00b4 }
        if (r4 == 0) goto L_0x00af;	 Catch:{ Exception -> 0x00b4 }
    L_0x001d:
        r4 = r3.nextElement();	 Catch:{ Exception -> 0x00b4 }
        r4 = (java.net.URL) r4;	 Catch:{ Exception -> 0x00b4 }
        r5 = 0;
        r4 = r4.openStream();	 Catch:{ Exception -> 0x00a3, all -> 0x00a0 }
        r5 = org.xmlpull.v1.XmlPullParserFactory.newInstance();	 Catch:{ Exception -> 0x009e }
        r5 = r5.newPullParser();	 Catch:{ Exception -> 0x009e }
        r6 = "http://xmlpull.org/v1/doc/features.html#process-namespaces";	 Catch:{ Exception -> 0x009e }
        r7 = 1;	 Catch:{ Exception -> 0x009e }
        r5.setFeature(r6, r7);	 Catch:{ Exception -> 0x009e }
        r6 = "UTF-8";	 Catch:{ Exception -> 0x009e }
        r5.setInput(r4, r6);	 Catch:{ Exception -> 0x009e }
        r6 = r5.getEventType();	 Catch:{ Exception -> 0x009e }
    L_0x003f:
        r8 = 2;	 Catch:{ Exception -> 0x009e }
        if (r6 != r8) goto L_0x0091;	 Catch:{ Exception -> 0x009e }
    L_0x0042:
        r6 = r5.getName();	 Catch:{ Exception -> 0x009e }
        r8 = "className";	 Catch:{ Exception -> 0x009e }
        r6 = r6.equals(r8);	 Catch:{ Exception -> 0x009e }
        if (r6 == 0) goto L_0x0052;	 Catch:{ Exception -> 0x009e }
    L_0x004e:
        a(r5);	 Catch:{ Exception -> 0x009e }
        goto L_0x0091;	 Catch:{ Exception -> 0x009e }
    L_0x0052:
        r6 = r5.getName();	 Catch:{ Exception -> 0x009e }
        r8 = "packetReplyTimeout";	 Catch:{ Exception -> 0x009e }
        r6 = r6.equals(r8);	 Catch:{ Exception -> 0x009e }
        if (r6 == 0) goto L_0x0067;	 Catch:{ Exception -> 0x009e }
    L_0x005e:
        r6 = a;	 Catch:{ Exception -> 0x009e }
        r6 = a(r5, r6);	 Catch:{ Exception -> 0x009e }
        a = r6;	 Catch:{ Exception -> 0x009e }
        goto L_0x0091;	 Catch:{ Exception -> 0x009e }
    L_0x0067:
        r6 = r5.getName();	 Catch:{ Exception -> 0x009e }
        r8 = "keepAliveInterval";	 Catch:{ Exception -> 0x009e }
        r6 = r6.equals(r8);	 Catch:{ Exception -> 0x009e }
        if (r6 == 0) goto L_0x007c;	 Catch:{ Exception -> 0x009e }
    L_0x0073:
        r6 = b;	 Catch:{ Exception -> 0x009e }
        r6 = a(r5, r6);	 Catch:{ Exception -> 0x009e }
        b = r6;	 Catch:{ Exception -> 0x009e }
        goto L_0x0091;	 Catch:{ Exception -> 0x009e }
    L_0x007c:
        r6 = r5.getName();	 Catch:{ Exception -> 0x009e }
        r8 = "mechName";	 Catch:{ Exception -> 0x009e }
        r6 = r6.equals(r8);	 Catch:{ Exception -> 0x009e }
        if (r6 == 0) goto L_0x0091;	 Catch:{ Exception -> 0x009e }
    L_0x0088:
        r6 = e;	 Catch:{ Exception -> 0x009e }
        r8 = r5.nextText();	 Catch:{ Exception -> 0x009e }
        r6.add(r8);	 Catch:{ Exception -> 0x009e }
    L_0x0091:
        r6 = r5.next();	 Catch:{ Exception -> 0x009e }
        if (r6 != r7) goto L_0x003f;
    L_0x0097:
        r4.close();	 Catch:{ Exception -> 0x0017 }
        goto L_0x0017;
    L_0x009c:
        r0 = move-exception;
        goto L_0x00ab;
    L_0x009e:
        r5 = move-exception;
        goto L_0x00a7;
    L_0x00a0:
        r0 = move-exception;
        r4 = r5;
        goto L_0x00ab;
    L_0x00a3:
        r4 = move-exception;
        r9 = r5;
        r5 = r4;
        r4 = r9;
    L_0x00a7:
        r5.printStackTrace();	 Catch:{ all -> 0x009c }
        goto L_0x0097;
    L_0x00ab:
        r4.close();	 Catch:{ Exception -> 0x00ae }
    L_0x00ae:
        throw r0;	 Catch:{ Exception -> 0x00b4 }
    L_0x00af:
        r2 = r2 + 1;
        goto L_0x000d;
    L_0x00b3:
        return;
    L_0x00b4:
        r0 = move-exception;
        r0.printStackTrace();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.smack.g.<clinit>():void");
    }

    private g() {
    }

    private static int a(XmlPullParser xmlPullParser, int i) {
        try {
            return Integer.parseInt(xmlPullParser.nextText());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return i;
        }
    }

    public static String a() {
        return "3.1.0";
    }

    private static void a(org.xmlpull.v1.XmlPullParser r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = r3.nextText();
        java.lang.Class.forName(r3);	 Catch:{ ClassNotFoundException -> 0x0008 }
        return;
    L_0x0008:
        r0 = java.lang.System.err;
        r1 = new java.lang.StringBuilder;
        r2 = "Error! A startup class specified in smack-config.xml could not be loaded: ";
        r1.<init>(r2);
        r1.append(r3);
        r3 = r1.toString();
        r0.println(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.smack.g.a(org.xmlpull.v1.XmlPullParser):void");
    }

    public static int b() {
        return b;
    }

    public static int c() {
        return c;
    }

    private static ClassLoader[] d() {
        r1 = new ClassLoader[2];
        int i = 0;
        r1[0] = g.class.getClassLoader();
        r1[1] = Thread.currentThread().getContextClassLoader();
        List arrayList = new ArrayList();
        while (i < 2) {
            Object obj = r1[i];
            if (obj != null) {
                arrayList.add(obj);
            }
            i++;
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }
}
