package com.jd.open.api.sdk.domain.ware.JOSTextMaterialService.request.batchadd;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ShortTitleSellerInfo implements Serializable {
   private List<String> sellPoint;
   private String marketTitle;
   private List<Long> skuIds;
   private List<String> marketPoint;

   @JsonProperty("sellPoint")
   public void setSellPoint(List<String> sellPoint) {
      this.sellPoint = sellPoint;
   }

   @JsonProperty("sellPoint")
   public List<String> getSellPoint() {
      return this.sellPoint;
   }

   @JsonProperty("marketTitle")
   public void setMarketTitle(String marketTitle) {
      this.marketTitle = marketTitle;
   }

   @JsonProperty("marketTitle")
   public String getMarketTitle() {
      return this.marketTitle;
   }

   @JsonProperty("skuIds")
   public void setSkuIds(List<Long> skuIds) {
      this.skuIds = skuIds;
   }

   @JsonProperty("skuIds")
   public List<Long> getSkuIds() {
      return this.skuIds;
   }

   @JsonProperty("marketPoint")
   public void setMarketPoint(List<String> marketPoint) {
      this.marketPoint = marketPoint;
   }

   @JsonProperty("marketPoint")
   public List<String> getMarketPoint() {
      return this.marketPoint;
   }
}
