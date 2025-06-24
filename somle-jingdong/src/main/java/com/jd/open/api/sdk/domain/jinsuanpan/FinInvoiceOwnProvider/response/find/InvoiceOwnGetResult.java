package com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceOwnProvider.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class InvoiceOwnGetResult implements Serializable {
   private boolean success;
   private String message;
   private FinInvoiceOwnIvcDetail detail;

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

   @JsonProperty("detail")
   public void setDetail(FinInvoiceOwnIvcDetail detail) {
      this.detail = detail;
   }

   @JsonProperty("detail")
   public FinInvoiceOwnIvcDetail getDetail() {
      return this.detail;
   }
}
