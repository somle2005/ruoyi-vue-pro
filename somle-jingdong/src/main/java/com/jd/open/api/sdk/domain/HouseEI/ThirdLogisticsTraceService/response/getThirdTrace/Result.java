package com.jd.open.api.sdk.domain.HouseEI.ThirdLogisticsTraceService.response.getThirdTrace;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {
   private Boolean success;
   private String errorCode;
   private String message;
   private List<WayBillDto> result;

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
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

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("result")
   public void setResult(List<WayBillDto> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<WayBillDto> getResult() {
      return this.result;
   }
}
