package com.jd.open.api.sdk.domain.platform.JosDraftReadService.response.getDraftInfoByVersion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosDraftResult implements Serializable {
   private boolean success;
   private String errorMessage;
   private String errorCode;
   private JosDraftInfo josDraftInfo;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
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

   @JsonProperty("josDraftInfo")
   public void setJosDraftInfo(JosDraftInfo josDraftInfo) {
      this.josDraftInfo = josDraftInfo;
   }

   @JsonProperty("josDraftInfo")
   public JosDraftInfo getJosDraftInfo() {
      return this.josDraftInfo;
   }
}
