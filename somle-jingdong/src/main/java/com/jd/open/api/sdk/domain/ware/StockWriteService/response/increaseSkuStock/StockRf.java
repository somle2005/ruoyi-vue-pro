package com.jd.open.api.sdk.domain.ware.StockWriteService.response.increaseSkuStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StockRf implements Serializable {
   private String stockRfId;

   @JsonProperty("stockRfId")
   public void setStockRfId(String stockRfId) {
      this.stockRfId = stockRfId;
   }

   @JsonProperty("stockRfId")
   public String getStockRfId() {
      return this.stockRfId;
   }
}
