package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.PoBackForJosWebService.response.confirmpurchaseorder.BaseResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcConfirmpurchaseorderResponse extends AbstractResponse {
   private BaseResult baseResult;

   @JsonProperty("base_result")
   public void setBaseResult(BaseResult baseResult) {
      this.baseResult = baseResult;
   }

   @JsonProperty("base_result")
   public BaseResult getBaseResult() {
      return this.baseResult;
   }
}
