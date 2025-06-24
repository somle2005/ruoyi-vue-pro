package com.jd.open.api.sdk.domain.gysyuyue.SvcBookingApiService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class SvcApiBooking implements Serializable {
   private Long id;
   private Long storeId;
   private String storeName;
   private String lcnNo;
   private String mobile;
   private String verificationCode;
   private Date bookingTime;
   private Date receiveGoodsTime;
   private Date verificationTime;
   private Date submitTime;
   private Integer businessType;
   private Integer receiveStatus;
   private Integer verificationStatus;
   private Long cardOrderId;
   private Map<String, Long> configInfoMap;
   private Long serviceSkuId;
   private String serviceSkuName;
   private String phoneNumberX;
   private String extension;
   private String expiration;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("storeId")
   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Long getStoreId() {
      return this.storeId;
   }

   @JsonProperty("storeName")
   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   @JsonProperty("storeName")
   public String getStoreName() {
      return this.storeName;
   }

   @JsonProperty("lcnNo")
   public void setLcnNo(String lcnNo) {
      this.lcnNo = lcnNo;
   }

   @JsonProperty("lcnNo")
   public String getLcnNo() {
      return this.lcnNo;
   }

   @JsonProperty("mobile")
   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   @JsonProperty("mobile")
   public String getMobile() {
      return this.mobile;
   }

   @JsonProperty("verificationCode")
   public void setVerificationCode(String verificationCode) {
      this.verificationCode = verificationCode;
   }

   @JsonProperty("verificationCode")
   public String getVerificationCode() {
      return this.verificationCode;
   }

   @JsonProperty("bookingTime")
   public void setBookingTime(Date bookingTime) {
      this.bookingTime = bookingTime;
   }

   @JsonProperty("bookingTime")
   public Date getBookingTime() {
      return this.bookingTime;
   }

   @JsonProperty("receiveGoodsTime")
   public void setReceiveGoodsTime(Date receiveGoodsTime) {
      this.receiveGoodsTime = receiveGoodsTime;
   }

   @JsonProperty("receiveGoodsTime")
   public Date getReceiveGoodsTime() {
      return this.receiveGoodsTime;
   }

   @JsonProperty("verificationTime")
   public void setVerificationTime(Date verificationTime) {
      this.verificationTime = verificationTime;
   }

   @JsonProperty("verificationTime")
   public Date getVerificationTime() {
      return this.verificationTime;
   }

   @JsonProperty("submitTime")
   public void setSubmitTime(Date submitTime) {
      this.submitTime = submitTime;
   }

   @JsonProperty("submitTime")
   public Date getSubmitTime() {
      return this.submitTime;
   }

   @JsonProperty("businessType")
   public void setBusinessType(Integer businessType) {
      this.businessType = businessType;
   }

   @JsonProperty("businessType")
   public Integer getBusinessType() {
      return this.businessType;
   }

   @JsonProperty("receiveStatus")
   public void setReceiveStatus(Integer receiveStatus) {
      this.receiveStatus = receiveStatus;
   }

   @JsonProperty("receiveStatus")
   public Integer getReceiveStatus() {
      return this.receiveStatus;
   }

   @JsonProperty("verificationStatus")
   public void setVerificationStatus(Integer verificationStatus) {
      this.verificationStatus = verificationStatus;
   }

   @JsonProperty("verificationStatus")
   public Integer getVerificationStatus() {
      return this.verificationStatus;
   }

   @JsonProperty("cardOrderId")
   public void setCardOrderId(Long cardOrderId) {
      this.cardOrderId = cardOrderId;
   }

   @JsonProperty("cardOrderId")
   public Long getCardOrderId() {
      return this.cardOrderId;
   }

   @JsonProperty("configInfoMap")
   public void setConfigInfoMap(Map<String, Long> configInfoMap) {
      this.configInfoMap = configInfoMap;
   }

   @JsonProperty("configInfoMap")
   public Map<String, Long> getConfigInfoMap() {
      return this.configInfoMap;
   }

   @JsonProperty("serviceSkuId")
   public void setServiceSkuId(Long serviceSkuId) {
      this.serviceSkuId = serviceSkuId;
   }

   @JsonProperty("serviceSkuId")
   public Long getServiceSkuId() {
      return this.serviceSkuId;
   }

   @JsonProperty("serviceSkuName")
   public void setServiceSkuName(String serviceSkuName) {
      this.serviceSkuName = serviceSkuName;
   }

   @JsonProperty("serviceSkuName")
   public String getServiceSkuName() {
      return this.serviceSkuName;
   }

   @JsonProperty("phoneNumberX")
   public void setPhoneNumberX(String phoneNumberX) {
      this.phoneNumberX = phoneNumberX;
   }

   @JsonProperty("phoneNumberX")
   public String getPhoneNumberX() {
      return this.phoneNumberX;
   }

   @JsonProperty("extension")
   public void setExtension(String extension) {
      this.extension = extension;
   }

   @JsonProperty("extension")
   public String getExtension() {
      return this.extension;
   }

   @JsonProperty("expiration")
   public void setExpiration(String expiration) {
      this.expiration = expiration;
   }

   @JsonProperty("expiration")
   public String getExpiration() {
      return this.expiration;
   }
}
