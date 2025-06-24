package com.jd.open.api.sdk.domain.fapiao.InvoiceDetailReadProvider.response.getInvoiceDetailListByDailyIdOrApplyId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultMO implements Serializable {
   private String message;
   private List<InvoiceDetailMO> values;
   private long totalElements;
   private String resultCode;
   private boolean success;

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("values")
   public void setValues(List<InvoiceDetailMO> values) {
      this.values = values;
   }

   @JsonProperty("values")
   public List<InvoiceDetailMO> getValues() {
      return this.values;
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
}
