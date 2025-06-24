package com.jd.open.api.sdk.domain.ware.JOSTextMaterialService.response.batchadd;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RelativeMaterialResult implements Serializable {
   private boolean success;
   private String message;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }
}
