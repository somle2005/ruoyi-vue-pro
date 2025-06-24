package com.jd.open.api.sdk.response.jiyunshang;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jiyunshang.ConsolidatorOutOperationJsfService.response.productweigh.ResultVO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ProductweighResponse extends AbstractResponse {
   private ResultVO productweighResult;

   @JsonProperty("productweigh_result")
   public void setProductweighResult(ResultVO productweighResult) {
      this.productweighResult = productweighResult;
   }

   @JsonProperty("productweigh_result")
   public ResultVO getProductweighResult() {
      return this.productweighResult;
   }
}
