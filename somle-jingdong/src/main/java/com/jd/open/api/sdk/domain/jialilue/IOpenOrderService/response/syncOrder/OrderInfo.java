package com.jd.open.api.sdk.domain.jialilue.IOpenOrderService.response.syncOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class OrderInfo implements Serializable {
   private String orderId;
   private String storeId;
   private String outStoreId;
   private Integer platform;
   private Integer paymentWayId;
   private Date orderCompleteTime;

   @JsonProperty("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("storeId")
   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public String getStoreId() {
      return this.storeId;
   }

   @JsonProperty("outStoreId")
   public void setOutStoreId(String outStoreId) {
      this.outStoreId = outStoreId;
   }

   @JsonProperty("outStoreId")
   public String getOutStoreId() {
      return this.outStoreId;
   }

   @JsonProperty("platform")
   public void setPlatform(Integer platform) {
      this.platform = platform;
   }

   @JsonProperty("platform")
   public Integer getPlatform() {
      return this.platform;
   }

   @JsonProperty("paymentWayId")
   public void setPaymentWayId(Integer paymentWayId) {
      this.paymentWayId = paymentWayId;
   }

   @JsonProperty("paymentWayId")
   public Integer getPaymentWayId() {
      return this.paymentWayId;
   }

   @JsonProperty("orderCompleteTime")
   public void setOrderCompleteTime(Date orderCompleteTime) {
      this.orderCompleteTime = orderCompleteTime;
   }

   @JsonProperty("orderCompleteTime")
   public Date getOrderCompleteTime() {
      return this.orderCompleteTime;
   }
}
