package com.jd.open.api.sdk.domain.c2mdzkfpt.ThirdPartyIdentityService.response.getCustomInstanceId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DataResponse implements Serializable {
   private String code;
   private Boolean success;
   private String message;
   private CustomInstanceIdInfoDto data;

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

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("data")
   public void setData(CustomInstanceIdInfoDto data) {
      this.data = data;
   }

   @JsonProperty("data")
   public CustomInstanceIdInfoDto getData() {
      return this.data;
   }
}
