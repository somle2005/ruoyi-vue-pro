package com.doudian.open.core.msg;

import com.doudian.open.gson.annotations.SerializedName;

public class DoudianOpMsgParamRecord<T> {
    @SerializedName("tag")
    private String tag;

    @SerializedName("msg_id")
    private String msgId;

    @SerializedName("data")
    private T data;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
