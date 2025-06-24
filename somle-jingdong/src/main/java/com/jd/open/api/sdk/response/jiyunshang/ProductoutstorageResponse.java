package com.jd.open.api.sdk.response.jiyunshang;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jiyunshang.ConsolidatorOutOperationJsfService.response.productoutstorage.ResultVO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ProductoutstorageResponse extends AbstractResponse {
   private ResultVO productoutstorageResult;

   @JsonProperty("productoutstorage_result")
   public void setProductoutstorageResult(ResultVO productoutstorageResult) {
      this.productoutstorageResult = productoutstorageResult;
   }

   @JsonProperty("productoutstorage_result")
   public ResultVO getProductoutstorageResult() {
      return this.productoutstorageResult;
   }
}
