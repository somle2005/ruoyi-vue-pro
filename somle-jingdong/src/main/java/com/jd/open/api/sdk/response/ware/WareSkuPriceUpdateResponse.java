package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareSkuPriceUpdateResponse extends AbstractResponse {
   private String modified;
   private String skuId;
   private String outerId;

   @JsonProperty("modified")
   public String getModified() {
      return this.modified;
   }

   @JsonProperty("modified")
   public void setModified(String modified) {
      this.modified = modified;
   }

   @JsonProperty("sku_id")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("sku_id")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("outer_id")
   public String getOuterId() {
      return this.outerId;
   }

   @JsonProperty("outer_id")
   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }
}
