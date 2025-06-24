package com.jd.open.api.sdk.domain.youE.OrderProcessJsfService.request.reminderInfoResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RemindResultParam implements Serializable {
   private String result;
   private String orderNo;
   private Long remindId;
   private Integer sceneClassification;
   private String details;

   @JsonProperty("result")
   public void setResult(String result) {
      this.result = result;
   }

   @JsonProperty("result")
   public String getResult() {
      return this.result;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("remindId")
   public void setRemindId(Long remindId) {
      this.remindId = remindId;
   }

   @JsonProperty("remindId")
   public Long getRemindId() {
      return this.remindId;
   }

   @JsonProperty("sceneClassification")
   public void setSceneClassification(Integer sceneClassification) {
      this.sceneClassification = sceneClassification;
   }

   @JsonProperty("sceneClassification")
   public Integer getSceneClassification() {
      return this.sceneClassification;
   }

   @JsonProperty("details")
   public void setDetails(String details) {
      this.details = details;
   }

   @JsonProperty("details")
   public String getDetails() {
      return this.details;
   }
}
