package com.jd.open.api.sdk.domain.mall.OrderQueryResource.response.queryOrderPay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class QueryOrderByPayResVo implements Serializable {
   private Integer orderType;
   private String pin;
   private String orderId;
   private BigDecimal shouldPay;
   private BigDecimal orderPrice;
   private String merchantOrderNo;

   @JsonProperty("orderType")
   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public Integer getOrderType() {
      return this.orderType;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("shouldPay")
   public void setShouldPay(BigDecimal shouldPay) {
      this.shouldPay = shouldPay;
   }

   @JsonProperty("shouldPay")
   public BigDecimal getShouldPay() {
      return this.shouldPay;
   }

   @JsonProperty("orderPrice")
   public void setOrderPrice(BigDecimal orderPrice) {
      this.orderPrice = orderPrice;
   }

   @JsonProperty("orderPrice")
   public BigDecimal getOrderPrice() {
      return this.orderPrice;
   }

   @JsonProperty("merchantOrderNo")
   public void setMerchantOrderNo(String merchantOrderNo) {
      this.merchantOrderNo = merchantOrderNo;
   }

   @JsonProperty("merchantOrderNo")
   public String getMerchantOrderNo() {
      return this.merchantOrderNo;
   }
}
