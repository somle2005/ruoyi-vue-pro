package com.jd.open.api.sdk.domain.order.OutShipJosService.response.judge;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PartialShipmentItemDto implements Serializable {
   private Boolean supportPartialShipment;
   private Long orderId;
   private String notSupportSendPay;
   private Integer notSupportType;
   private String notSupportMsg;

   @JsonProperty("supportPartialShipment")
   public void setSupportPartialShipment(Boolean supportPartialShipment) {
      this.supportPartialShipment = supportPartialShipment;
   }

   @JsonProperty("supportPartialShipment")
   public Boolean getSupportPartialShipment() {
      return this.supportPartialShipment;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("notSupportSendPay")
   public void setNotSupportSendPay(String notSupportSendPay) {
      this.notSupportSendPay = notSupportSendPay;
   }

   @JsonProperty("notSupportSendPay")
   public String getNotSupportSendPay() {
      return this.notSupportSendPay;
   }

   @JsonProperty("notSupportType")
   public void setNotSupportType(Integer notSupportType) {
      this.notSupportType = notSupportType;
   }

   @JsonProperty("notSupportType")
   public Integer getNotSupportType() {
      return this.notSupportType;
   }

   @JsonProperty("notSupportMsg")
   public void setNotSupportMsg(String notSupportMsg) {
      this.notSupportMsg = notSupportMsg;
   }

   @JsonProperty("notSupportMsg")
   public String getNotSupportMsg() {
      return this.notSupportMsg;
   }
}
