package com.jd.open.api.sdk.domain.fapiao.FinanceInvoiceApplyProvider.response.submitApply;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultMO implements Serializable {
   private boolean success;
   private List<Long> values;
   private String resultCode;
   private String message;
   private Long value;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("values")
   public void setValues(List<Long> values) {
      this.values = values;
   }

   @JsonProperty("values")
   public List<Long> getValues() {
      return this.values;
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

   @JsonProperty("value")
   public void setValue(Long value) {
      this.value = value;
   }

   @JsonProperty("value")
   public Long getValue() {
      return this.value;
   }
}
