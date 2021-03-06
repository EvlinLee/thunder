package com.xunlei.common.new_ptl.pay.param;

import android.text.TextUtils;

public class XLAliPayContractParam implements XLPayParam {
    public String mAidfrom = "";
    public String mBizNo = "";
    public String mCash = "";
    public String mContractResultScheme = "";
    public int mNum = 0;
    public String mParamExt = "";
    public String mReferFrom = "";
    public String mSessionId = "";
    public String mSource = "";
    public String mUniqueOrderFlag = "";
    public long mUserId = 0;

    public long getUserId() {
        return this.mUserId;
    }

    public String getSessionId() {
        if (TextUtils.isEmpty(this.mSessionId)) {
            return "";
        }
        return this.mSessionId;
    }

    public String getBizNo() {
        if (TextUtils.isEmpty(this.mBizNo)) {
            return "";
        }
        return this.mBizNo;
    }

    public int getNum() {
        return this.mNum;
    }

    public String getCash() {
        return this.mCash;
    }

    public String getSource() {
        if (TextUtils.isEmpty(this.mSource)) {
            return "";
        }
        return this.mSource;
    }

    public String getReferFrom() {
        if (TextUtils.isEmpty(this.mReferFrom)) {
            return "";
        }
        return this.mReferFrom;
    }

    public String getAidFrom() {
        if (TextUtils.isEmpty(this.mAidfrom)) {
            return "";
        }
        return this.mAidfrom;
    }

    public String getUniqueOrderFlag() {
        if (TextUtils.isEmpty(this.mUniqueOrderFlag)) {
            return "";
        }
        return this.mUniqueOrderFlag;
    }

    public String getParamExt() {
        if (TextUtils.isEmpty(this.mParamExt)) {
            return "";
        }
        return this.mParamExt;
    }

    public String getContractResultScheme() {
        if (TextUtils.isEmpty(this.mContractResultScheme)) {
            return "";
        }
        return this.mContractResultScheme;
    }
}
