package com.jd.open.api.sdk.domain.video.JOSMaterialService.response.getMaterialBySkuIds;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SkuMaterialInfo implements Serializable {
   private Long productId;
   private Long skuId;
   private List<Material> smartPicMarketList;

   @JsonProperty("productId")
   public void setProductId(Long productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public Long getProductId() {
      return this.productId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("smartPicMarketList")
   public void setSmartPicMarketList(List<Material> smartPicMarketList) {
      this.smartPicMarketList = smartPicMarketList;
   }

   @JsonProperty("smartPicMarketList")
   public List<Material> getSmartPicMarketList() {
      return this.smartPicMarketList;
   }
}
