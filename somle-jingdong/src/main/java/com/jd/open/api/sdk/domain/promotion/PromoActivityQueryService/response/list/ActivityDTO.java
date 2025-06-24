package com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ActivityDTO implements Serializable {
   private ActivityBaseDTO activityBaseDTO;

   @JsonProperty("activityBaseDTO")
   public void setActivityBaseDTO(ActivityBaseDTO activityBaseDTO) {
      this.activityBaseDTO = activityBaseDTO;
   }

   @JsonProperty("activityBaseDTO")
   public ActivityBaseDTO getActivityBaseDTO() {
      return this.activityBaseDTO;
   }
}
