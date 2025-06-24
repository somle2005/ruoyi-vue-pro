package com.jd.open.api.sdk.domain.order.LocCheckNumServerInterface.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ConsumerCode implements Serializable {
   private Long orderId;
   private String codeNum;
   private Long skuId;
   private Integer status;
   private Date effectiveDate;
   private Integer sendCount;
   private String pin;
   private Integer consumerStatus;
   private Date consumerTime;
   private String cardNumber;
   private String pwdNumber;
   private String couponsAmount;
   private String minConsumption;

   @JsonProperty("order_id")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("order_id")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("code_num")
   public void setCodeNum(String codeNum) {
      this.codeNum = codeNum;
   }

   @JsonProperty("code_num")
   public String getCodeNum() {
      return this.codeNum;
   }

   @JsonProperty("sku_id")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("sku_id")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("effective_date")
   public void setEffectiveDate(Date effectiveDate) {
      this.effectiveDate = effectiveDate;
   }

   @JsonProperty("effective_date")
   public Date getEffectiveDate() {
      return this.effectiveDate;
   }

   @JsonProperty("send_count")
   public void setSendCount(Integer sendCount) {
      this.sendCount = sendCount;
   }

   @JsonProperty("send_count")
   public Integer getSendCount() {
      return this.sendCount;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("consumer_status")
   public void setConsumerStatus(Integer consumerStatus) {
      this.consumerStatus = consumerStatus;
   }

   @JsonProperty("consumer_status")
   public Integer getConsumerStatus() {
      return this.consumerStatus;
   }

   @JsonProperty("consumer_time")
   public void setConsumerTime(Date consumerTime) {
      this.consumerTime = consumerTime;
   }

   @JsonProperty("consumer_time")
   public Date getConsumerTime() {
      return this.consumerTime;
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
}
