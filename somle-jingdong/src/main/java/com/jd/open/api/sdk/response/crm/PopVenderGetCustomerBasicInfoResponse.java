package com.jd.open.api.sdk.response.crm;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.crm.VenderCustomerBasicJsfService.response.getCustomerBasicInfo.ReturnResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopVenderGetCustomerBasicInfoResponse extends AbstractResponse {
   private ReturnResult returnResult;

   @JsonProperty("returnResult")
   public void setReturnResult(ReturnResult returnResult) {
      this.returnResult = returnResult;
   }

   @JsonProperty("returnResult")
   public ReturnResult getReturnResult() {
      return this.returnResult;
   }
}
