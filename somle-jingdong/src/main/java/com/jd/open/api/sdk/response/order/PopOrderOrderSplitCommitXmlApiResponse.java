package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.IPopOrderSplitService.response.orderSplitCommitXmlApi.ApiSafResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderOrderSplitCommitXmlApiResponse extends AbstractResponse {
   private ApiSafResult apiSafResult;

   @JsonProperty("apiSafResult")
   public void setApiSafResult(ApiSafResult apiSafResult) {
      this.apiSafResult = apiSafResult;
   }

   @JsonProperty("apiSafResult")
   public ApiSafResult getApiSafResult() {
      return this.apiSafResult;
   }
}
