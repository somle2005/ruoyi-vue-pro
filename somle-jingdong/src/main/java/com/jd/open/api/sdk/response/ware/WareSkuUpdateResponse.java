package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareSkuUpdateResponse extends AbstractResponse {
   private static final long serialVersionUID = -8839990462610319025L;
   private String modified;
   private String skuId;

   public WareSkuUpdateResponse() {
   }

   public WareSkuUpdateResponse(String modified, String skuId) {
      this.modified = modified;
      this.skuId = skuId;
   }

   @JsonProperty("sku_id")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("sku_id")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("modified")
   public String getModified() {
      return this.modified;
   }

   @JsonProperty("modified")
   public void setModified(String modified) {
      this.modified = modified;
   }
}
