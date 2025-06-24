package com.jd.open.api.sdk.domain.hudong.CustomActivityResource.response.validate;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SkuErrorVo implements Serializable {
   private String errorType;
   private String errorMessage;
   private List<String[]> skuId;

   @JsonProperty("errorType")
   public void setErrorType(String errorType) {
      this.errorType = errorType;
   }

   @JsonProperty("errorType")
   public String getErrorType() {
      return this.errorType;
   }

   @JsonProperty("errorMessage")
   public void setErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
   }

   @JsonProperty("errorMessage")
   public String getErrorMessage() {
      return this.errorMessage;
   }

   @JsonProperty("skuId")
   public void setSkuId(List<String[]> skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public List<String[]> getSkuId() {
      return this.skuId;
   }
}
