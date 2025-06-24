package com.jd.open.api.sdk.domain.hudong.JosFansActivityWriteService.response.createGiftActivityWithResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GiftActivity implements Serializable {
   private Long activityId;

   @JsonProperty("activityId")
   public void setActivityId(Long activityId) {
      this.activityId = activityId;
   }

   @JsonProperty("activityId")
   public Long getActivityId() {
      return this.activityId;
   }
}
