package com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.getOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class OperateRecordDTO implements Serializable {
   private String operateText;
   private Date operateTime;
   private String operateUser;
   private Integer orderStatus;

   @JsonProperty("operateText")
   public void setOperateText(String operateText) {
      this.operateText = operateText;
   }

   @JsonProperty("operateText")
   public String getOperateText() {
      return this.operateText;
   }

   @JsonProperty("operateTime")
   public void setOperateTime(Date operateTime) {
      this.operateTime = operateTime;
   }

   @JsonProperty("operateTime")
   public Date getOperateTime() {
      return this.operateTime;
   }

   @JsonProperty("operateUser")
   public void setOperateUser(String operateUser) {
      this.operateUser = operateUser;
   }

   @JsonProperty("operateUser")
   public String getOperateUser() {
      return this.operateUser;
   }

   @JsonProperty("orderStatus")
   public void setOrderStatus(Integer orderStatus) {
      this.orderStatus = orderStatus;
   }

   @JsonProperty("orderStatus")
   public Integer getOrderStatus() {
      return this.orderStatus;
   }
}
