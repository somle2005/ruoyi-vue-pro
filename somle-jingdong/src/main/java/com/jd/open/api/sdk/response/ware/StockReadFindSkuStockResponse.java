package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.StockReadService.response.findSkuStock.SkuStock;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class StockReadFindSkuStockResponse extends AbstractResponse {
   private List<SkuStock> skuStocks;

   @JsonProperty("skuStocks")
   public void setSkuStocks(List<SkuStock> skuStocks) {
      this.skuStocks = skuStocks;
   }

   @JsonProperty("skuStocks")
   public List<SkuStock> getSkuStocks() {
      return this.skuStocks;
   }
}
