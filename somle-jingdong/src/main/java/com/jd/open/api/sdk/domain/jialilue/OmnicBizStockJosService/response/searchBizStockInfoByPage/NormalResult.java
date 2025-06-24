package com.jd.open.api.sdk.domain.jialilue.OmnicBizStockJosService.response.searchBizStockInfoByPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class NormalResult implements Serializable {
   private String msg;
   private int code;
   private boolean success;
   private BizStockInfoResp attribute2;

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
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("attribute2")
   public void setAttribute2(BizStockInfoResp attribute2) {
      this.attribute2 = attribute2;
   }

   @JsonProperty("attribute2")
   public BizStockInfoResp getAttribute2() {
      return this.attribute2;
   }
}
