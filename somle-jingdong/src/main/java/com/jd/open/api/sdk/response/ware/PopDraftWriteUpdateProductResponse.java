package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.JosDraftWriteService.response.updateProduct.CommonResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopDraftWriteUpdateProductResponse extends AbstractResponse {
   private CommonResult result;

   @JsonProperty("result")
   public void setResult(CommonResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public CommonResult getResult() {
      return this.result;
   }
}
