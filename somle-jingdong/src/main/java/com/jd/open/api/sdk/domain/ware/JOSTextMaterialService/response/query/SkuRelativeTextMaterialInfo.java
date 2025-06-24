package com.jd.open.api.sdk.domain.ware.JOSTextMaterialService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuRelativeTextMaterialInfo implements Serializable {
   private Long skuId;
   private String[] sellList;
   private String marketShortTitle;
   private String[] marketSellTitleList;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("sellList")
   public void setSellList(String[] sellList) {
      this.sellList = sellList;
   }

   @JsonProperty("sellList")
   public String[] getSellList() {
      return this.sellList;
   }

   @JsonProperty("marketShortTitle")
   public void setMarketShortTitle(String marketShortTitle) {
      this.marketShortTitle = marketShortTitle;
   }

   @JsonProperty("marketShortTitle")
   public String getMarketShortTitle() {
      return this.marketShortTitle;
   }

   @JsonProperty("marketSellTitleList")
   public void setMarketSellTitleList(String[] marketSellTitleList) {
      this.marketSellTitleList = marketSellTitleList;
   }

   @JsonProperty("marketSellTitleList")
   public String[] getMarketSellTitleList() {
      return this.marketSellTitleList;
   }
}
