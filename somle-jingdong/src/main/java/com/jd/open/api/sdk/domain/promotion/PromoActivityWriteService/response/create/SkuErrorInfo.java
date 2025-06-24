package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.response.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuErrorInfo implements Serializable {
   private Long skuId;
   private String errorCode;
   private String message;
   private boolean retry;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
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

   @JsonProperty("retry")
   public void setRetry(boolean retry) {
      this.retry = retry;
   }

   @JsonProperty("retry")
   public boolean getRetry() {
      return this.retry;
   }
}
