package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.response.queryInteractiveRewardInfo.InteractiveRewardInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class InteractiveQueryInteractiveRewardInfoResponse extends AbstractResponse {
   private InteractiveRewardInfo interactiveRewardInfo;

   @JsonProperty("interactiveRewardInfo")
   public void setInteractiveRewardInfo(InteractiveRewardInfo interactiveRewardInfo) {
      this.interactiveRewardInfo = interactiveRewardInfo;
   }

   @JsonProperty("interactiveRewardInfo")
   public InteractiveRewardInfo getInteractiveRewardInfo() {
      return this.interactiveRewardInfo;
   }
}
