package com.jd.open.api.sdk.domain.supplier.ReturnExecuteOrderHandlerJosApi.response.callWaybillByVc;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosDataResponseDto implements Serializable {
   private String code;
   private String message;
   private Boolean isSuccess;
   private CallLogisticsResultInfoDto body;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("isSuccess")
   public void setIsSuccess(Boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("isSuccess")
   public Boolean getIsSuccess() {
      return this.isSuccess;
   }

   @JsonProperty("body")
   public void setBody(CallLogisticsResultInfoDto body) {
      this.body = body;
   }

   @JsonProperty("body")
   public CallLogisticsResultInfoDto getBody() {
      return this.body;
   }
}
