package com.jd.open.api.sdk.domain.promotion.OrderPromotionWriteService.response.deleteSkus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class Result implements Serializable {
   private boolean success;
   private String errorCode;
   private String errorMessage;
   private Map<String, String> resultMap;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("errorMessage")
   public void setErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
   }

   @JsonProperty("errorMessage")
   public String getErrorMessage() {
      return this.errorMessage;
   }

   @JsonProperty("result_map")
   public void setResultMap(Map<String, String> resultMap) {
      this.resultMap = resultMap;
   }

   @JsonProperty("result_map")
   public Map<String, String> getResultMap() {
      return this.resultMap;
   }
}
