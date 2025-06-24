package com.jd.open.api.sdk.domain.supplier.ISupplierStockSoaService.response.batchAddOrUpdateSupplierStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RemoteResultBean implements Serializable {
   private boolean success;
   private String resultCode;
   private String resultMessage;
   private ValidationInfo validationInfo;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
   }

   @JsonProperty("validationInfo")
   public void setValidationInfo(ValidationInfo validationInfo) {
      this.validationInfo = validationInfo;
   }

   @JsonProperty("validationInfo")
   public ValidationInfo getValidationInfo() {
      return this.validationInfo;
   }
}
