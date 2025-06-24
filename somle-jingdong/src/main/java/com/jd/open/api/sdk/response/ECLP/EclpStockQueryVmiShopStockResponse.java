package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryVmiShopStock.VmiShopStockResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpStockQueryVmiShopStockResponse extends AbstractResponse {
   private VmiShopStockResponse queryvmishopstockResult;

   @JsonProperty("queryvmishopstock_result")
   public void setQueryvmishopstockResult(VmiShopStockResponse queryvmishopstockResult) {
      this.queryvmishopstockResult = queryvmishopstockResult;
   }

   @JsonProperty("queryvmishopstock_result")
   public VmiShopStockResponse getQueryvmishopstockResult() {
      return this.queryvmishopstockResult;
   }
}
