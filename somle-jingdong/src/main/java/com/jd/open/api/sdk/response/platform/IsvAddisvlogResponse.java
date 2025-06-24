package com.jd.open.api.sdk.response.platform;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class IsvAddisvlogResponse extends AbstractResponse {
   private String success;

   @JsonProperty("success")
   public void setSuccess(String success) {
      this.success = success;
   }

   @JsonProperty("success")
   public String getSuccess() {
      return this.success;
   }
}
