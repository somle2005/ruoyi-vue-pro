package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryInStockSIDBySku.QueryInStockSIDBySkuResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpSerialQueryInStockSIDBySkuResponse extends AbstractResponse {
   private QueryInStockSIDBySkuResponse queryinstocksidbyskuResult;

   @JsonProperty("queryinstocksidbysku_result")
   public void setQueryinstocksidbyskuResult(QueryInStockSIDBySkuResponse queryinstocksidbyskuResult) {
      this.queryinstocksidbyskuResult = queryinstocksidbyskuResult;
   }

   @JsonProperty("queryinstocksidbysku_result")
   public QueryInStockSIDBySkuResponse getQueryinstocksidbyskuResult() {
      return this.queryinstocksidbyskuResult;
   }
}
