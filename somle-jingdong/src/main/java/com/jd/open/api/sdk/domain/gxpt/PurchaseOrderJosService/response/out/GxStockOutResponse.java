package com.jd.open.api.sdk.domain.gxpt.PurchaseOrderJosService.response.out;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GxStockOutResponse implements Serializable {
   private int code;
   private String msg;
   private String data;

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("data")
   public void setData(String data) {
      this.data = data;
   }

   @JsonProperty("data")
   public String getData() {
      return this.data;
   }
}
