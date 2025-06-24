package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryBatchAttrStock.BatchAttrStockResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpStockQueryBatchAttrStockResponse extends AbstractResponse {
   private BatchAttrStockResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(BatchAttrStockResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public BatchAttrStockResponse getReturnType() {
      return this.returnType;
   }
}
