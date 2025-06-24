package com.jd.open.api.sdk.domain.spbq.BdsSymbolBindRpc.response.isExistWhiteList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BdsRpcResponse implements Serializable {
   private String msg;
   private int code;
   private Boolean data;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("data")
   public void setData(Boolean data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Boolean getData() {
      return this.data;
   }
}
