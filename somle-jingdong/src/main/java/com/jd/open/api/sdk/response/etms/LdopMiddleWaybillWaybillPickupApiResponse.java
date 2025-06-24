package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.WaybillPickupApi.response.WaybillPickupApi.BaseResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopMiddleWaybillWaybillPickupApiResponse extends AbstractResponse {
   private BaseResult baseResult;

   @JsonProperty("baseResult")
   public void setBaseResult(BaseResult baseResult) {
      this.baseResult = baseResult;
   }

   @JsonProperty("baseResult")
   public BaseResult getBaseResult() {
      return this.baseResult;
   }
}
