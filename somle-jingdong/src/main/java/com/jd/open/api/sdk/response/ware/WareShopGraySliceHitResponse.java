package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.jd.open.api.sdk.domain.ware.GrayScaleService.response.hit.DsmResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareShopGraySliceHitResponse extends AbstractResponse {
   private DsmResult result;

   @JsonProperty("result")
   public void setResult(DsmResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public DsmResult getResult() {
      return this.result;
   }
}
