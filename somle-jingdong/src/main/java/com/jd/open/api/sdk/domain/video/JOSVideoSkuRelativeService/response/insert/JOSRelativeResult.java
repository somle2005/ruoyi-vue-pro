package com.jd.open.api.sdk.domain.video.JOSVideoSkuRelativeService.response.insert;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JOSRelativeResult implements Serializable {
   private long productId;
   private String successSkudIds;
   private String failSkuIds;

   @JsonProperty("product_id")
   public void setProductId(long productId) {
      this.productId = productId;
   }

   @JsonProperty("product_id")
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

   @JsonProperty("fail_sku_ids")
   public void setFailSkuIds(String failSkuIds) {
      this.failSkuIds = failSkuIds;
   }

   @JsonProperty("fail_sku_ids")
   public String getFailSkuIds() {
      return this.failSkuIds;
   }
}
