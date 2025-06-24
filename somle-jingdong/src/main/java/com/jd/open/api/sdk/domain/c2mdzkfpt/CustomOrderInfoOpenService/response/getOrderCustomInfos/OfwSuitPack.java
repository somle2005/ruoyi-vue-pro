package com.jd.open.api.sdk.domain.c2mdzkfpt.CustomOrderInfoOpenService.response.getOrderCustomInfos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OfwSuitPack implements Serializable {
   private String packSkuId;
   private Integer packCount;
   private List<OfwSuitPackProduct> suitProducts;

   @JsonProperty("packSkuId")
   public void setPackSkuId(String packSkuId) {
      this.packSkuId = packSkuId;
   }

   @JsonProperty("packSkuId")
   public String getPackSkuId() {
      return this.packSkuId;
   }

   @JsonProperty("packCount")
   public void setPackCount(Integer packCount) {
      this.packCount = packCount;
   }

   @JsonProperty("packCount")
   public Integer getPackCount() {
      return this.packCount;
   }

   @JsonProperty("suitProducts")
   public void setSuitProducts(List<OfwSuitPackProduct> suitProducts) {
      this.suitProducts = suitProducts;
   }

   @JsonProperty("suitProducts")
   public List<OfwSuitPackProduct> getSuitProducts() {
      return this.suitProducts;
   }
}
