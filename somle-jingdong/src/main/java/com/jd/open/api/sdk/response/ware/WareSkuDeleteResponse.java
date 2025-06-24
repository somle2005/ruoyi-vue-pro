package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareSkuDeleteResponse extends AbstractResponse {
   private long skuId;
   private String modified;

   @JsonProperty("sku_id")
   public long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("sku_id")
   public void setSkuId(long skuId) {
      this.skuId = skuId;
   }

   public String getModified() {
      return this.modified;
   }

   public void setModified(String modified) {
      this.modified = modified;
   }
}
