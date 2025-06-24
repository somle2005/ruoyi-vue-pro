package com.jd.open.api.sdk.domain.B2B.PurchaseOrderErpService.response.findPurchaseOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ErpResult implements Serializable {
   private String msg;
   private int code;
   private Boolean success;
   private PurchaseOrder data;

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

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("data")
   public void setData(PurchaseOrder data) {
      this.data = data;
   }

   @JsonProperty("data")
   public PurchaseOrder getData() {
      return this.data;
   }
}
