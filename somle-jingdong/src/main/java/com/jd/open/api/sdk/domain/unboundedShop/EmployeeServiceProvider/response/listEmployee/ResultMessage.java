package com.jd.open.api.sdk.domain.unboundedShop.EmployeeServiceProvider.response.listEmployee;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultMessage implements Serializable {
   private Paginate value;
   private String resultCode;
   private boolean success;
   private String reason;

   @JsonProperty("value")
   public void setValue(Paginate value) {
      this.value = value;
   }

   @JsonProperty("value")
   public Paginate getValue() {
      return this.value;
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

   @JsonProperty("reason")
   public void setReason(String reason) {
      this.reason = reason;
   }

   @JsonProperty("reason")
   public String getReason() {
      return this.reason;
   }
}
