package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.response.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CreateActivityResponse implements Serializable {
   private ResponseResult result;
   private Long activityId;
   private List<SkuErrorInfo> errorSkuList;

   @JsonProperty("result")
   public void setResult(ResponseResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ResponseResult getResult() {
      return this.result;
   }

   @JsonProperty("activityId")
   public void setActivityId(Long activityId) {
      this.activityId = activityId;
   }

   @JsonProperty("activityId")
   public Long getActivityId() {
      return this.activityId;
   }

   @JsonProperty("errorSkuList")
   public void setErrorSkuList(List<SkuErrorInfo> errorSkuList) {
      this.errorSkuList = errorSkuList;
   }

   @JsonProperty("errorSkuList")
   public List<SkuErrorInfo> getErrorSkuList() {
      return this.errorSkuList;
   }
}
