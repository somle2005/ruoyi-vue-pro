package com.jd.open.api.sdk.domain.video.JOSVideoSkuRelativeService.response.unRelativeSku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RelativeResult implements Serializable {
   private List<Long> failSkuIds;
   private Long productId;
   private List<Long> successSkuIds;
   private String message;

   @JsonProperty("failSkuIds")
   public void setFailSkuIds(List<Long> failSkuIds) {
      this.failSkuIds = failSkuIds;
   }

   @JsonProperty("failSkuIds")
   public List<Long> getFailSkuIds() {
      return this.failSkuIds;
   }

   @JsonProperty("productId")
   public void setProductId(Long productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public Long getProductId() {
      return this.productId;
   }

   @JsonProperty("successSkuIds")
   public void setSuccessSkuIds(List<Long> successSkuIds) {
      this.successSkuIds = successSkuIds;
   }

   @JsonProperty("successSkuIds")
   public List<Long> getSuccessSkuIds() {
      return this.successSkuIds;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }
}
