package com.jd.open.api.sdk.domain.xny.TwoWheelCallbackService.response.callback;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class TwoWheelLvChongChongEndChargeNotifyResponse implements Serializable {
   private String code;
   private Boolean success;
   private String error;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
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

   @JsonProperty("error")
   public void setError(String error) {
      this.error = error;
   }

   @JsonProperty("error")
   public String getError() {
      return this.error;
   }
}
