package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.searchShopStockFlow.ShopStockSearchFlowResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpStockSearchShopStockFlowResponse extends AbstractResponse {
   private ShopStockSearchFlowResponse shopStockSearchFlowResponse;

   @JsonProperty("shopStockSearchFlowResponse")
   public void setShopStockSearchFlowResponse(ShopStockSearchFlowResponse shopStockSearchFlowResponse) {
      this.shopStockSearchFlowResponse = shopStockSearchFlowResponse;
   }

   @JsonProperty("shopStockSearchFlowResponse")
   public ShopStockSearchFlowResponse getShopStockSearchFlowResponse() {
      return this.shopStockSearchFlowResponse;
   }
}
