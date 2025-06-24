package com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.response.doInteractiveAssignment;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RewardsInfo implements Serializable {
   private Integer poolRewardZeroStock;
   private java.util.Map<String, Object> successRewards;
   private List<Map> failRewards;
   private java.util.Map<Integer, Object> noEnoughBalanceFilteredMap;

   @JsonProperty("poolRewardZeroStock")
   public void setPoolRewardZeroStock(Integer poolRewardZeroStock) {
      this.poolRewardZeroStock = poolRewardZeroStock;
   }

   @JsonProperty("poolRewardZeroStock")
   public Integer getPoolRewardZeroStock() {
      return this.poolRewardZeroStock;
   }

   @JsonProperty("successRewards")
   public void setSuccessRewards(java.util.Map<String, Object> successRewards) {
      this.successRewards = successRewards;
   }

   @JsonProperty("successRewards")
   public java.util.Map<String, Object> getSuccessRewards() {
      return this.successRewards;
   }

   @JsonProperty("failRewards")
   public void setFailRewards(List<Map> failRewards) {
      this.failRewards = failRewards;
   }

   @JsonProperty("failRewards")
   public List<Map> getFailRewards() {
      return this.failRewards;
   }

   @JsonProperty("noEnoughBalanceFilteredMap")
   public void setNoEnoughBalanceFilteredMap(java.util.Map<Integer, Object> noEnoughBalanceFilteredMap) {
      this.noEnoughBalanceFilteredMap = noEnoughBalanceFilteredMap;
   }

   @JsonProperty("noEnoughBalanceFilteredMap")
   public java.util.Map<Integer, Object> getNoEnoughBalanceFilteredMap() {
      return this.noEnoughBalanceFilteredMap;
   }
}
