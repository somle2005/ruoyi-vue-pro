package com.jd.open.api.sdk.domain.fapiao.InvoiceApplyBillReadProvider.response.getInvoiceApplyBillByVenderIdAndApplyId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultMO implements Serializable {
   private String message;
   private long totalElements;
   private String resultCode;
   private boolean success;
   private InvoiceApplyBillMO value;

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("totalElements")
   public void setTotalElements(long totalElements) {
      this.totalElements = totalElements;
   }

   @JsonProperty("totalElements")
   public long getTotalElements() {
      return this.totalElements;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("value")
   public void setValue(InvoiceApplyBillMO value) {
      this.value = value;
   }

   @JsonProperty("value")
   public InvoiceApplyBillMO getValue() {
      return this.value;
   }
}
