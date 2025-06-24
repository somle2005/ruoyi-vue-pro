package com.jd.open.api.sdk.domain.youE.OrderQueryJsfService.request.reminderInfoConfirm;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RemindConfirmParam implements Serializable {
   private String orderNo;
   private Integer confirmStat;
   private Long remindId;
   private String brandRemark;
   private Integer sceneClassification;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("confirmStat")
   public void setConfirmStat(Integer confirmStat) {
      this.confirmStat = confirmStat;
   }

   @JsonProperty("confirmStat")
   public Integer getConfirmStat() {
      return this.confirmStat;
   }

   @JsonProperty("remindId")
   public void setRemindId(Long remindId) {
      this.remindId = remindId;
   }

   @JsonProperty("remindId")
   public Long getRemindId() {
      return this.remindId;
   }

   @JsonProperty("brandRemark")
   public void setBrandRemark(String brandRemark) {
      this.brandRemark = brandRemark;
   }

   @JsonProperty("brandRemark")
   public String getBrandRemark() {
      return this.brandRemark;
   }

   @JsonProperty("sceneClassification")
   public void setSceneClassification(Integer sceneClassification) {
      this.sceneClassification = sceneClassification;
   }

   @JsonProperty("sceneClassification")
   public Integer getSceneClassification() {
      return this.sceneClassification;
   }
}
