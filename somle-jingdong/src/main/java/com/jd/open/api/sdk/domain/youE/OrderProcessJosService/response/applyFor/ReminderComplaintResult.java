package com.jd.open.api.sdk.domain.youE.OrderProcessJosService.response.applyFor;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ReminderComplaintResult implements Serializable {
   private Integer reminderNum;
   private String orderNo;
   private String reminderId;

   @JsonProperty("reminderNum")
   public void setReminderNum(Integer reminderNum) {
      this.reminderNum = reminderNum;
   }

   @JsonProperty("reminderNum")
   public Integer getReminderNum() {
      return this.reminderNum;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("reminderId")
   public void setReminderId(String reminderId) {
      this.reminderId = reminderId;
   }

   @JsonProperty("reminderId")
   public String getReminderId() {
      return this.reminderId;
   }
}
