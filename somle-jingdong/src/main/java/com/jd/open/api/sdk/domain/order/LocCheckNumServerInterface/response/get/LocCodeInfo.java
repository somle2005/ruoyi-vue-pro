package com.jd.open.api.sdk.domain.order.LocCheckNumServerInterface.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class LocCodeInfo implements Serializable {
   private Long orderId;
   private Long skuId;
   private Integer codeStatus;
   private String orderCreateTime;
   private String statusModifiedTime;
   private String effectiveDateStart;
   private String effectiveDateEnd;
   private Integer sendCount;
   private String consumeShopId;
   private String consumeShopName;
   private String orderShopId;
   private String orderShopName;
   private String pin;
   private String phoneNum;
   private String codeConsumedTime;
   private String cardNumber;
   private String pwdNumber;
   private String couponsAmount;
   private String minConsumption;
   private String desenPhoneNum;

   @JsonProperty("order_id")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("order_id")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("sku_id")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("sku_id")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("code_status")
   public void setCodeStatus(Integer codeStatus) {
      this.codeStatus = codeStatus;
   }

   @JsonProperty("code_status")
   public Integer getCodeStatus() {
      return this.codeStatus;
   }

   @JsonProperty("order_create_time")
   public void setOrderCreateTime(String orderCreateTime) {
      this.orderCreateTime = orderCreateTime;
   }

   @JsonProperty("order_create_time")
   public String getOrderCreateTime() {
      return this.orderCreateTime;
   }

   @JsonProperty("status_modified_time")
   public void setStatusModifiedTime(String statusModifiedTime) {
      this.statusModifiedTime = statusModifiedTime;
   }

   @JsonProperty("status_modified_time")
   public String getStatusModifiedTime() {
      return this.statusModifiedTime;
   }

   @JsonProperty("effective_date_start")
   public void setEffectiveDateStart(String effectiveDateStart) {
      this.effectiveDateStart = effectiveDateStart;
   }

   @JsonProperty("effective_date_start")
   public String getEffectiveDateStart() {
      return this.effectiveDateStart;
   }

   @JsonProperty("effective_date_end")
   public void setEffectiveDateEnd(String effectiveDateEnd) {
      this.effectiveDateEnd = effectiveDateEnd;
   }

   @JsonProperty("effective_date_end")
   public String getEffectiveDateEnd() {
      return this.effectiveDateEnd;
   }

   @JsonProperty("send_count")
   public void setSendCount(Integer sendCount) {
      this.sendCount = sendCount;
   }

   @JsonProperty("send_count")
   public Integer getSendCount() {
      return this.sendCount;
   }

   @JsonProperty("consume_shop_id")
   public void setConsumeShopId(String consumeShopId) {
      this.consumeShopId = consumeShopId;
   }

   @JsonProperty("consume_shop_id")
   public String getConsumeShopId() {
      return this.consumeShopId;
   }

   @JsonProperty("consume_shop_name")
   public void setConsumeShopName(String consumeShopName) {
      this.consumeShopName = consumeShopName;
   }

   @JsonProperty("consume_shop_name")
   public String getConsumeShopName() {
      return this.consumeShopName;
   }

   @JsonProperty("order_shop_id")
   public void setOrderShopId(String orderShopId) {
      this.orderShopId = orderShopId;
   }

   @JsonProperty("order_shop_id")
   public String getOrderShopId() {
      return this.orderShopId;
   }

   @JsonProperty("order_shop_name")
   public void setOrderShopName(String orderShopName) {
      this.orderShopName = orderShopName;
   }

   @JsonProperty("order_shop_name")
   public String getOrderShopName() {
      return this.orderShopName;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("phone_num")
   public void setPhoneNum(String phoneNum) {
      this.phoneNum = phoneNum;
   }

   @JsonProperty("phone_num")
   public String getPhoneNum() {
      return this.phoneNum;
   }

   @JsonProperty("code_consumed_time")
   public void setCodeConsumedTime(String codeConsumedTime) {
      this.codeConsumedTime = codeConsumedTime;
   }

   @JsonProperty("code_consumed_time")
   public String getCodeConsumedTime() {
      return this.codeConsumedTime;
   }

   @JsonProperty("card_number")
   public void setCardNumber(String cardNumber) {
      this.cardNumber = cardNumber;
   }

   @JsonProperty("card_number")
   public String getCardNumber() {
      return this.cardNumber;
   }

   @JsonProperty("pwd_number")
   public void setPwdNumber(String pwdNumber) {
      this.pwdNumber = pwdNumber;
   }

   @JsonProperty("pwd_number")
   public String getPwdNumber() {
      return this.pwdNumber;
   }

   @JsonProperty("coupons_amount")
   public void setCouponsAmount(String couponsAmount) {
      this.couponsAmount = couponsAmount;
   }

   @JsonProperty("coupons_amount")
   public String getCouponsAmount() {
      return this.couponsAmount;
   }

   @JsonProperty("min_consumption")
   public void setMinConsumption(String minConsumption) {
      this.minConsumption = minConsumption;
   }

   @JsonProperty("min_consumption")
   public String getMinConsumption() {
      return this.minConsumption;
   }

   @JsonProperty("desen_phone_num")
   public void setDesenPhoneNum(String desenPhoneNum) {
      this.desenPhoneNum = desenPhoneNum;
   }

   @JsonProperty("desen_phone_num")
   public String getDesenPhoneNum() {
      return this.desenPhoneNum;
   }
}
