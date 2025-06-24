package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.setShopStockFixed.ShopStockBaseResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpStockSetShopStockFixedResponse extends AbstractResponse {
   private ShopStockBaseResponse ShopStockBaseResponse;

   @JsonProperty("ShopStockBaseResponse")
   public void setShopStockBaseResponse(ShopStockBaseResponse ShopStockBaseResponse) {
      this.ShopStockBaseResponse = ShopStockBaseResponse;
   }

   @JsonProperty("ShopStockBaseResponse")
   public ShopStockBaseResponse getShopStockBaseResponse() {
      return this.ShopStockBaseResponse;
   }
}
