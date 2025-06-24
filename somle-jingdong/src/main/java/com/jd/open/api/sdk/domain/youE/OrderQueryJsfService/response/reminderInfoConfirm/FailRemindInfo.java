package com.jd.open.api.sdk.domain.youE.OrderQueryJsfService.response.reminderInfoConfirm;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FailRemindInfo implements Serializable {
   private String orderNo;
   private Long remindId;
   private Integer failCode;
   private String failInfo;

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

   @JsonProperty("failCode")
   public void setFailCode(Integer failCode) {
      this.failCode = failCode;
   }

   @JsonProperty("failCode")
   public Integer getFailCode() {
      return this.failCode;
   }

   @JsonProperty("failInfo")
   public void setFailInfo(String failInfo) {
      this.failInfo = failInfo;
   }

   @JsonProperty("failInfo")
   public String getFailInfo() {
      return this.failInfo;
   }
}
