package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionActivitymodeGetResponse extends AbstractResponse {
   private ActivityModeVO activityMode;

   @JsonProperty("activity_mode")
   public void setActivityMode(ActivityModeVO activityMode) {
      this.activityMode = activityMode;
   }

   @JsonProperty("activity_mode")
   public ActivityModeVO getActivityMode() {
      return this.activityMode;
   }
}
