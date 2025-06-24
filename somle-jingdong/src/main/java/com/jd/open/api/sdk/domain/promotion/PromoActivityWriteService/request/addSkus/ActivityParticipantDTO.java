package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.request.addSkus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ActivityParticipantDTO implements Serializable {
   private Integer bound;
   private Integer bindType;
   private Long activityId;
   private List<ActivitySkuDTO> activitySkuDTOList;

   @JsonProperty("bound")
   public void setBound(Integer bound) {
      this.bound = bound;
   }

   @JsonProperty("bound")
   public Integer getBound() {
      return this.bound;
   }

   @JsonProperty("bindType")
   public void setBindType(Integer bindType) {
      this.bindType = bindType;
   }

   @JsonProperty("bindType")
   public Integer getBindType() {
      return this.bindType;
   }

   @JsonProperty("activityId")
   public void setActivityId(Long activityId) {
      this.activityId = activityId;
   }

   @JsonProperty("activityId")
   public Long getActivityId() {
      return this.activityId;
   }

   @JsonProperty("activitySkuDTOList")
   public void setActivitySkuDTOList(List<ActivitySkuDTO> activitySkuDTOList) {
      this.activitySkuDTOList = activitySkuDTOList;
   }

   @JsonProperty("activitySkuDTOList")
   public List<ActivitySkuDTO> getActivitySkuDTOList() {
      return this.activitySkuDTOList;
   }
}
