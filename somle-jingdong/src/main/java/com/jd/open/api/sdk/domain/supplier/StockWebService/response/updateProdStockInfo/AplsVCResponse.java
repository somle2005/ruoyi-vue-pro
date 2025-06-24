package com.jd.open.api.sdk.domain.supplier.StockWebService.response.updateProdStockInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AplsVCResponse implements Serializable {
   private Integer status;
   private String message;
   private String errorType;
   private String errorCode;
   private Boolean success;

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("errorType")
   public void setErrorType(String errorType) {
      this.errorType = errorType;
   }

   @JsonProperty("errorType")
   public String getErrorType() {
      return this.errorType;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }
}
