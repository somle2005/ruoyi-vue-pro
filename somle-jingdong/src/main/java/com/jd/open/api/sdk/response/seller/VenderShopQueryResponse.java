package com.jd.open.api.sdk.response.seller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.seller.ShopSafService.response.query.ShopJosResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderShopQueryResponse extends AbstractResponse {
   private ShopJosResult shopJosResult;

   @JsonProperty("shop_jos_result")
   public void setShopJosResult(ShopJosResult shopJosResult) {
      this.shopJosResult = shopJosResult;
   }

   @JsonProperty("shop_jos_result")
   public ShopJosResult getShopJosResult() {
      return this.shopJosResult;
   }
}
