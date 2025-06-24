package com.jd.open.api.sdk.domain.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderDetailInfos {
   private String waybillId;
   private String venderId;
   private String orderId;
   private String orderPayment;
   private String modified;
   private OrderUserInfo consigneeInfo;

   @JsonProperty("waybill_id")
   public String getWaybillId() {
      return this.waybillId;
   }

   @JsonProperty("waybill_id")
   public void setWaybillId(String waybillId) {
      this.waybillId = waybillId;
   }

   @JsonProperty("vender_id")
   public String getVenderId() {
      return this.venderId;
   }

   @JsonProperty("vender_id")
   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("order_id")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("order_id")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("order_payment")
   public String getOrderPayment() {
      return this.orderPayment;
   }

   @JsonProperty("order_payment")
   public void setOrderPayment(String orderPayment) {
      this.orderPayment = orderPayment;
   }

   @JsonProperty("modified")
   public String getModified() {
      return this.modified;
   }

   @JsonProperty("modified")
   public void setModified(String modified) {
      this.modified = modified;
   }

   @JsonProperty("consignee_info")
   public OrderUserInfo getConsigneeInfo() {
      return this.consigneeInfo;
   }

   @JsonProperty("consignee_info")
   public void setConsigneeInfo(OrderUserInfo consigneeInfo) {
      this.consigneeInfo = consigneeInfo;
   }
}
