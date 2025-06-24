package com.jd.open.api.sdk.response.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.BrandInfoService.response.queryBrandInfoByBid.CetusRemoteResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class BrandInfoServiceQueryBrandInfoByBidResponse extends AbstractResponse {
   private CetusRemoteResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(CetusRemoteResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public CetusRemoteResult getReturnType() {
      return this.returnType;
   }
}
