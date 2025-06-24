package com.jd.open.api.sdk.domain.ware.JosDraftWriteService.response.commitDraft;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosDraftResult implements Serializable {
   private boolean success;
   private String errorMessage;
   private String errorCode;
   private JosDraftBaseInfo draftBaseInfo;
   private String errorDomain;
   private String domainErrorCode;

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

   @JsonProperty("draftBaseInfo")
   public void setDraftBaseInfo(JosDraftBaseInfo draftBaseInfo) {
      this.draftBaseInfo = draftBaseInfo;
   }

   @JsonProperty("draftBaseInfo")
   public JosDraftBaseInfo getDraftBaseInfo() {
      return this.draftBaseInfo;
   }

   @JsonProperty("errorDomain")
   public void setErrorDomain(String errorDomain) {
      this.errorDomain = errorDomain;
   }

   @JsonProperty("errorDomain")
   public String getErrorDomain() {
      return this.errorDomain;
   }

   @JsonProperty("domainErrorCode")
   public void setDomainErrorCode(String domainErrorCode) {
      this.domainErrorCode = domainErrorCode;
   }

   @JsonProperty("domainErrorCode")
   public String getDomainErrorCode() {
      return this.domainErrorCode;
   }
}
