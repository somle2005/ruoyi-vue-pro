package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryAdventGoodsStock.AdventGoodsStockResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpStockQueryAdventGoodsStockResponse extends AbstractResponse {
   private AdventGoodsStockResponse queryadventgoodsstockResult;

   @JsonProperty("queryadventgoodsstock_result")
   public void setQueryadventgoodsstockResult(AdventGoodsStockResponse queryadventgoodsstockResult) {
      this.queryadventgoodsstockResult = queryadventgoodsstockResult;
   }

   @JsonProperty("queryadventgoodsstock_result")
   public AdventGoodsStockResponse getQueryadventgoodsstockResult() {
      return this.queryadventgoodsstockResult;
   }
}
