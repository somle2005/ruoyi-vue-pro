package com.jd.open.api.sdk.domain.promotion.SkuPriceExternalService.response.directUpdateSkuPrice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuPriceResult implements Serializable {
   private Boolean success;
   private String message;
   private Integer status;

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }
}
