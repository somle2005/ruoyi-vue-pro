package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.acceptReturnOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ReceiptReturnResult implements Serializable {
   private String resultCode;
   private String message;
   private Boolean content;

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
   public void setContent(Boolean content) {
      this.content = content;
   }

   @JsonProperty("content")
   public Boolean getContent() {
      return this.content;
   }
}
