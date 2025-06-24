package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareSkuAddResponse extends AbstractResponse {
   private static final long serialVersionUID = -8839990461033319025L;
   private String created;
   private String skuId;

   public WareSkuAddResponse() {
   }

   public WareSkuAddResponse(String created, String skuId) {
      this.created = created;
      this.skuId = skuId;
   }

   public String getCreated() {
      return this.created;
   }

   public void setCreated(String created) {
      this.created = created;
   }

   @JsonProperty("sku_id")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("sku_id")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }
}
