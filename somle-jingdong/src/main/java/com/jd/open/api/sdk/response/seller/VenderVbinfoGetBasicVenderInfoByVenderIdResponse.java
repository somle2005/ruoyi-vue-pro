package com.jd.open.api.sdk.response.seller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.seller.VenderBasicSafService.response.getBasicVenderInfoByVenderId.VenderBasicResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VenderVbinfoGetBasicVenderInfoByVenderIdResponse extends AbstractResponse {
   private VenderBasicResult getbasicvenderinfobyvenderidResult;

   @JsonProperty("getbasicvenderinfobyvenderid_result")
   public void setGetbasicvenderinfobyvenderidResult(VenderBasicResult getbasicvenderinfobyvenderidResult) {
      this.getbasicvenderinfobyvenderidResult = getbasicvenderinfobyvenderidResult;
   }

   @JsonProperty("getbasicvenderinfobyvenderid_result")
   public VenderBasicResult getGetbasicvenderinfobyvenderidResult() {
      return this.getbasicvenderinfobyvenderidResult;
   }
}
