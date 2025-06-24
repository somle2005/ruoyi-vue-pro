package com.jd.open.api.sdk.domain.B2B.BrandInfoService.response.queryBrandInfoByBid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CetusRemoteResult implements Serializable {
   private String errorCode;
   private String message;
   private boolean isSuccess;
   private BrandVO data;

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

   @JsonProperty("isSuccess")
   public void setIsSuccess(boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("isSuccess")
   public boolean getIsSuccess() {
      return this.isSuccess;
   }

   @JsonProperty("data")
   public void setData(BrandVO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public BrandVO getData() {
      return this.data;
   }
}
