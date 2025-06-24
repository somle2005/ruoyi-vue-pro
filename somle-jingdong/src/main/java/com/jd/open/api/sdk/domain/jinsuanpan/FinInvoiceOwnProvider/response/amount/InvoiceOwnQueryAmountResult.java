package com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceOwnProvider.response.amount;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class InvoiceOwnQueryAmountResult implements Serializable {
   private boolean success;
   private String message;
   private OrderShouldInvoiceAmount data;

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

   @JsonProperty("data")
   public void setData(OrderShouldInvoiceAmount data) {
      this.data = data;
   }

   @JsonProperty("data")
   public OrderShouldInvoiceAmount getData() {
      return this.data;
   }
}
