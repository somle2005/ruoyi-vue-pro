package com.jd.open.api.sdk.domain.Omni_channel.PerformancePlatformService.response.callCancelOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class NormalResult implements Serializable {
   private String msg;
   private int code;
   private boolean success;

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
}
