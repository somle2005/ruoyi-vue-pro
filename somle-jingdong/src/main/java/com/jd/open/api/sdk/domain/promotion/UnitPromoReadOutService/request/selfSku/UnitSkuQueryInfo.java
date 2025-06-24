package com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.request.selfSku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class UnitSkuQueryInfo implements Serializable {
   private String startTime;
   private List<Long> skuIdList;
   private String endTime;

   @JsonProperty("startTime")
   public void setStartTime(String startTime) {
      this.startTime = startTime;
   }

   @JsonProperty("startTime")
   public String getStartTime() {
      return this.startTime;
   }

   @JsonProperty("skuIdList")
   public void setSkuIdList(List<Long> skuIdList) {
      this.skuIdList = skuIdList;
   }

   @JsonProperty("skuIdList")
   public List<Long> getSkuIdList() {
      return this.skuIdList;
   }

   @JsonProperty("endTime")
   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public String getEndTime() {
      return this.endTime;
   }
}
