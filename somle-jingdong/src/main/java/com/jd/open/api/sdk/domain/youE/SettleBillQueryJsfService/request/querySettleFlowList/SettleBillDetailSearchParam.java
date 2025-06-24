package com.jd.open.api.sdk.domain.youE.SettleBillQueryJsfService.request.querySettleFlowList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SettleBillDetailSearchParam implements Serializable {
   private Integer secondServiceType;
   private List<String> itemCatIds;
   private Integer pageNo;
   private Integer pageSize;
   private Long startTime;
   private Long endTime;
   private String settleRule;
   private Integer staging;

   @JsonProperty("secondServiceType")
   public void setSecondServiceType(Integer secondServiceType) {
      this.secondServiceType = secondServiceType;
   }

   @JsonProperty("secondServiceType")
   public Integer getSecondServiceType() {
      return this.secondServiceType;
   }

   @JsonProperty("itemCatIds")
   public void setItemCatIds(List<String> itemCatIds) {
      this.itemCatIds = itemCatIds;
   }

   @JsonProperty("itemCatIds")
   public List<String> getItemCatIds() {
      return this.itemCatIds;
   }

   @JsonProperty("pageNo")
   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   @JsonProperty("pageNo")
   public Integer getPageNo() {
      return this.pageNo;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("startTime")
   public void setStartTime(Long startTime) {
      this.startTime = startTime;
   }

   @JsonProperty("startTime")
   public Long getStartTime() {
      return this.startTime;
   }

   @JsonProperty("endTime")
   public void setEndTime(Long endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public Long getEndTime() {
      return this.endTime;
   }

   @JsonProperty("settleRule")
   public void setSettleRule(String settleRule) {
      this.settleRule = settleRule;
   }

   @JsonProperty("settleRule")
   public String getSettleRule() {
      return this.settleRule;
   }

   @JsonProperty("staging")
   public void setStaging(Integer staging) {
      this.staging = staging;
   }

   @JsonProperty("staging")
   public Integer getStaging() {
      return this.staging;
   }
}
