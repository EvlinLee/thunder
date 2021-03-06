package com.ali.auth.third.core.rpc.protocol;

public class RpcException extends RuntimeException {
    private static final long serialVersionUID = -2875437994101380406L;
    private int mCode;
    private String mMsg;
    private String mOperationType;

    public RpcException(Integer num, String str) {
        super(a(num, str));
        this.mCode = num.intValue();
        this.mMsg = str;
    }

    public RpcException(Integer num, Throwable th) {
        super(th);
        this.mCode = num.intValue();
    }

    public RpcException(String str) {
        super(str);
        this.mCode = 0;
        this.mMsg = str;
    }

    protected static String a(Integer num, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RPCException: ");
        if (num != null) {
            stringBuilder.append("[");
            stringBuilder.append(num);
            stringBuilder.append("]");
        }
        stringBuilder.append(" : ");
        if (str != null) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    public int getCode() {
        return this.mCode;
    }

    public String getMsg() {
        return this.mMsg;
    }

    public String getOperationType() {
        return this.mOperationType;
    }

    public void setOperationType(String str) {
        this.mOperationType = str;
    }
}
