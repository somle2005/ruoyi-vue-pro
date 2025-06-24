package com.jd.open.api.sdk.domain.jialilue.OmnicBizStockJosService.response.syncGoodsNum;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class NormalResult implements Serializable {
   private String msg;
   private boolean success;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }
}
