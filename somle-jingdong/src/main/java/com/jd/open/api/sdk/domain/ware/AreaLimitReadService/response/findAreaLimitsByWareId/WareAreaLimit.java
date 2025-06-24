package com.jd.open.api.sdk.domain.ware.AreaLimitReadService.response.findAreaLimitsByWareId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WareAreaLimit implements Serializable {
   private Long areaId;
   private Integer limitType;
   private Long wareId;

   @JsonProperty("areaId")
   public void setAreaId(Long areaId) {
      this.areaId = areaId;
   }

   @JsonProperty("areaId")
   public Long getAreaId() {
      return this.areaId;
   }

   @JsonProperty("limitType")
   public void setLimitType(Integer limitType) {
      this.limitType = limitType;
   }

   @JsonProperty("limitType")
   public Integer getLimitType() {
      return this.limitType;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }
}
