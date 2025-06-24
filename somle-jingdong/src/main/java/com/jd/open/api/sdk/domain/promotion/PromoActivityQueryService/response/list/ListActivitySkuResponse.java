package com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ListActivitySkuResponse implements Serializable {
   private List<ActivitySkuDTO> activitySkuDTOList;
   private ResponseResult result;

   @JsonProperty("activitySkuDTOList")
   public void setActivitySkuDTOList(List<ActivitySkuDTO> activitySkuDTOList) {
      this.activitySkuDTOList = activitySkuDTOList;
   }

   @JsonProperty("activitySkuDTOList")
   public List<ActivitySkuDTO> getActivitySkuDTOList() {
      return this.activitySkuDTOList;
   }

   @JsonProperty("result")
   public void setResult(ResponseResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ResponseResult getResult() {
      return this.result;
   }
}
