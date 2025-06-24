package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.receiveOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private String resultCode;
   private String message;
   private String content;

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

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }
}
