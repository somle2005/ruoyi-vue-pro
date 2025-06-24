package com.jd.open.api.sdk.domain.video.JOSVideoSkuRelativeService.response.delete;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JOSRelativeResult implements Serializable {
   private long productId;
   private String successSkudIds;
   private String failSkuIds;

   @JsonProperty("productId")
   public void setProductId(long productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public long getProductId() {
      return this.productId;
   }

   @JsonProperty("success_skud_ids")
   public void setSuccessSkudIds(String successSkudIds) {
      this.successSkudIds = successSkudIds;
   }

   @JsonProperty("success_skud_ids")
   public String getSuccessSkudIds() {
      return this.successSkudIds;
   }

   @JsonProperty("failSkuIds")
   public void setFailSkuIds(String failSkuIds) {
      this.failSkuIds = failSkuIds;
   }

   @JsonProperty("failSkuIds")
   public String getFailSkuIds() {
      return this.failSkuIds;
   }
}
