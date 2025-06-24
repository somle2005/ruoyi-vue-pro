package com.jd.open.api.sdk.domain.youE.BizProgressJsfService.request.dispatchOrder2Engineer;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderSendEngineerParam implements Serializable {
   private String sendDate;
   private String appId;
   private List<OrderSendEngineer> orderSendEngineerList;
   private String sendBy;

   @JsonProperty("sendDate")
   public void setSendDate(String sendDate) {
      this.sendDate = sendDate;
   }

   @JsonProperty("sendDate")
   public String getSendDate() {
      return this.sendDate;
   }

   @JsonProperty("appId")
   public void setAppId(String appId) {
      this.appId = appId;
   }

   @JsonProperty("appId")
   public String getAppId() {
      return this.appId;
   }

   @JsonProperty("orderSendEngineerList")
   public void setOrderSendEngineerList(List<OrderSendEngineer> orderSendEngineerList) {
      this.orderSendEngineerList = orderSendEngineerList;
   }

   @JsonProperty("orderSendEngineerList")
   public List<OrderSendEngineer> getOrderSendEngineerList() {
      return this.orderSendEngineerList;
   }

   @JsonProperty("sendBy")
   public void setSendBy(String sendBy) {
      this.sendBy = sendBy;
   }

   @JsonProperty("sendBy")
   public String getSendBy() {
      return this.sendBy;
   }
}
