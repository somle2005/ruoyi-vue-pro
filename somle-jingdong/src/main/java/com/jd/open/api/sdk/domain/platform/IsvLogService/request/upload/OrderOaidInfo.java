package com.jd.open.api.sdk.domain.platform.IsvLogService.request.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderOaidInfo implements Serializable {
   private String receiverName;
   private String receiverPhone;
   private String orderId;
   private String receiverAddr;
   private String oaid;

   @JsonProperty("receiver_name")
   public void setReceiverName(String receiverName) {
      this.receiverName = receiverName;
   }

   @JsonProperty("receiver_name")
   public String getReceiverName() {
      return this.receiverName;
   }

   @JsonProperty("receiver_phone")
   public void setReceiverPhone(String receiverPhone) {
      this.receiverPhone = receiverPhone;
   }

   @JsonProperty("receiver_phone")
   public String getReceiverPhone() {
      return this.receiverPhone;
   }

   @JsonProperty("order_id")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("order_id")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("receiver_addr")
   public void setReceiverAddr(String receiverAddr) {
      this.receiverAddr = receiverAddr;
   }

   @JsonProperty("receiver_addr")
   public String getReceiverAddr() {
      return this.receiverAddr;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
   }
}
