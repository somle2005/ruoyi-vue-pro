package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.searchShopStock.ShopStockSearchResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpStockSearchShopStockResponse extends AbstractResponse {
   private ShopStockSearchResponse shopStockSearchResponse;

   @JsonProperty("shopStockSearchResponse")
   public void setShopStockSearchResponse(ShopStockSearchResponse shopStockSearchResponse) {
      this.shopStockSearchResponse = shopStockSearchResponse;
   }

   @JsonProperty("shopStockSearchResponse")
   public ShopStockSearchResponse getShopStockSearchResponse() {
      return this.shopStockSearchResponse;
   }
}
