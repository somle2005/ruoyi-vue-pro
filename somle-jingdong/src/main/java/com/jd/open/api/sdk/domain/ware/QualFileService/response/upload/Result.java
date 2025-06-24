package com.jd.open.api.sdk.domain.ware.QualFileService.response.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private String systemMessage;
   private String resultCode;
   private String message;
   private SimpleFileFacetDTO resultInfo;

   @JsonProperty("systemMessage")
   public void setSystemMessage(String systemMessage) {
      this.systemMessage = systemMessage;
   }

   @JsonProperty("systemMessage")
   public String getSystemMessage() {
      return this.systemMessage;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("resultInfo")
   public void setResultInfo(SimpleFileFacetDTO resultInfo) {
      this.resultInfo = resultInfo;
   }

   @JsonProperty("resultInfo")
   public SimpleFileFacetDTO getResultInfo() {
      return this.resultInfo;
   }
}
