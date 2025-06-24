package com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ListActivityDtoResponse implements Serializable {
   private ResponseResult result;
   private List<ActivityDTO> activityDTOList;

   @JsonProperty("result")
   public void setResult(ResponseResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ResponseResult getResult() {
      return this.result;
   }

   @JsonProperty("activityDTOList")
   public void setActivityDTOList(List<ActivityDTO> activityDTOList) {
      this.activityDTOList = activityDTOList;
   }

   @JsonProperty("activityDTOList")
   public List<ActivityDTO> getActivityDTOList() {
      return this.activityDTOList;
   }
}
