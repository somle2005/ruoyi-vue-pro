package com.jd.open.api.sdk.domain.youE.BizProgressJsfService.request.dispatchOrder2Site;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderSendSiteParam implements Serializable {
   private String sendDate;
   private List<OrderSendSite> orderSendSiteList;
   private String appId;
   private String sendBy;

   @JsonProperty("sendDate")
   public void setSendDate(String sendDate) {
      this.sendDate = sendDate;
   }

   @JsonProperty("sendDate")
   public String getSendDate() {
      return this.sendDate;
   }

   @JsonProperty("orderSendSiteList")
   public void setOrderSendSiteList(List<OrderSendSite> orderSendSiteList) {
      this.orderSendSiteList = orderSendSiteList;
   }

   @JsonProperty("orderSendSiteList")
   public List<OrderSendSite> getOrderSendSiteList() {
      return this.orderSendSiteList;
   }

   @JsonProperty("appId")
   public void setAppId(String appId) {
      this.appId = appId;
   }

   @JsonProperty("appId")
   public String getAppId() {
      return this.appId;
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
