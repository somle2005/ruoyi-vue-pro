package com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GetActivityResponse implements Serializable {
   private ResponseResult result;
   private ActivityDTO activity;

   @JsonProperty("result")
   public void setResult(ResponseResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ResponseResult getResult() {
      return this.result;
   }

   @JsonProperty("activity")
   public void setActivity(ActivityDTO activity) {
      this.activity = activity;
   }

   @JsonProperty("activity")
   public ActivityDTO getActivity() {
      return this.activity;
   }
}
