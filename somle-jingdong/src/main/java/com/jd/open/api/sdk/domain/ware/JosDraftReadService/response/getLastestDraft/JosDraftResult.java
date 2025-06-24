package com.jd.open.api.sdk.domain.ware.JosDraftReadService.response.getLastestDraft;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosDraftResult implements Serializable {
   private JosDraftBaseInfo obj;
   private Boolean success;
   private String errorMessage;
   private String errorCode;

   @JsonProperty("obj")
   public void setObj(JosDraftBaseInfo obj) {
      this.obj = obj;
   }

   @JsonProperty("obj")
   public JosDraftBaseInfo getObj() {
      return this.obj;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorMessage")
   public void setErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
   }

   @JsonProperty("errorMessage")
   public String getErrorMessage() {
      return this.errorMessage;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }
}
