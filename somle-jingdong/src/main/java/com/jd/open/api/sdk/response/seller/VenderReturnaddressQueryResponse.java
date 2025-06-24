package com.jd.open.api.sdk.response.seller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.seller.VenderContactSafService.response.query.ReturnAddressResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderReturnaddressQueryResponse extends AbstractResponse {
   private ReturnAddressResult returnAddressResult;

   @JsonProperty("returnAddressResult")
   public void setReturnAddressResult(ReturnAddressResult returnAddressResult) {
      this.returnAddressResult = returnAddressResult;
   }

   @JsonProperty("returnAddressResult")
   public ReturnAddressResult getReturnAddressResult() {
      return this.returnAddressResult;
   }
}
