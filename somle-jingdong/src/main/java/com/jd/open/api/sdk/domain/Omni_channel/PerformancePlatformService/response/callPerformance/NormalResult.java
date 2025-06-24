package com.jd.open.api.sdk.domain.Omni_channel.PerformancePlatformService.response.callPerformance;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class NormalResult implements Serializable {
   private String msg;
   private int code;
   private boolean success;
   private Boolean attribute3;

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

   @JsonProperty("attribute3")
   public void setAttribute3(Boolean attribute3) {
      this.attribute3 = attribute3;
   }

   @JsonProperty("attribute3")
   public Boolean getAttribute3() {
      return this.attribute3;
   }
}
