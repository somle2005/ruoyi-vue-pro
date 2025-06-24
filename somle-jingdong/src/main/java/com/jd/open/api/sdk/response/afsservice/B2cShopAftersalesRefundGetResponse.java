package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.afsservice.AfsRefundDetailSoaService.response.get.PublicResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class B2cShopAftersalesRefundGetResponse extends AbstractResponse {
   private PublicResult result;

   @JsonProperty("result")
   public void setResult(PublicResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public PublicResult getResult() {
      return this.result;
   }
}
