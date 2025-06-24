package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.response.queryInteractiveInfo.InteractiveInfoResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class InteractiveQueryInteractiveInfoResponse extends AbstractResponse {
   private InteractiveInfoResult interactiveInfoResult;

   @JsonProperty("interactiveInfoResult")
   public void setInteractiveInfoResult(InteractiveInfoResult interactiveInfoResult) {
      this.interactiveInfoResult = interactiveInfoResult;
   }

   @JsonProperty("interactiveInfoResult")
   public InteractiveInfoResult getInteractiveInfoResult() {
      return this.interactiveInfoResult;
   }
}
