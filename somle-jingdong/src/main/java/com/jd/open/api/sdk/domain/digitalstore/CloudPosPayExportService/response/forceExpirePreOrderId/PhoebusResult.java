package com.jd.open.api.sdk.domain.digitalstore.CloudPosPayExportService.response.forceExpirePreOrderId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PhoebusResult implements Serializable {
   private String message;
   private String code;
   private boolean success;
   private Boolean data;

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
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

   @JsonProperty("data")
   public void setData(Boolean data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Boolean getData() {
      return this.data;
   }
}
