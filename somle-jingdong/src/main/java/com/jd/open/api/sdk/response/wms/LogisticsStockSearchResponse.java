package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LogisticsStockSearchResponse extends AbstractResponse {
   private ResponseStock stock;

   @JsonProperty("stock")
   public void setStock(ResponseStock stock) {
      this.stock = stock;
   }

   @JsonProperty("stock")
   public ResponseStock getStock() {
      return this.stock;
   }
}
