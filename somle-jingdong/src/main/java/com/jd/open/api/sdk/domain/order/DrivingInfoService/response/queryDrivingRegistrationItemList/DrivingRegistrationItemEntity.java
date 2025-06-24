package com.jd.open.api.sdk.domain.order.DrivingInfoService.response.queryDrivingRegistrationItemList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DrivingRegistrationItemEntity implements Serializable {
   private Long[] orderId;
   private String[] orderStatus;
   private Long[] skuId;
   private String[] skuName;
   private String[] name;
   private String[] phoneNumber;
   private String[] householdRegistration;
   private String[] idType;
   private String[] idNumber;
   private String[] certificateIssuance;
   private String[] liveAddress;
   private String[] addressDetail;
   private String[] drivingName;
   private String[] drivingAddress;
   private String[] drivingAddressee;
   private String[] drivingPhone;

   @JsonProperty("orderId")
   public void setOrderId(Long[] orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long[] getOrderId() {
      return this.orderId;
   }

   @JsonProperty("orderStatus")
   public void setOrderStatus(String[] orderStatus) {
      this.orderStatus = orderStatus;
   }

   @JsonProperty("orderStatus")
   public String[] getOrderStatus() {
      return this.orderStatus;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long[] skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long[] getSkuId() {
      return this.skuId;
   }

   @JsonProperty("skuName")
   public void setSkuName(String[] skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String[] getSkuName() {
      return this.skuName;
   }

   @JsonProperty("name")
   public void setName(String[] name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String[] getName() {
      return this.name;
   }

   @JsonProperty("phoneNumber")
   public void setPhoneNumber(String[] phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   @JsonProperty("phoneNumber")
   public String[] getPhoneNumber() {
      return this.phoneNumber;
   }

   @JsonProperty("householdRegistration")
   public void setHouseholdRegistration(String[] householdRegistration) {
      this.householdRegistration = householdRegistration;
   }

   @JsonProperty("householdRegistration")
   public String[] getHouseholdRegistration() {
      return this.householdRegistration;
   }

   @JsonProperty("idType")
   public void setIdType(String[] idType) {
      this.idType = idType;
   }

   @JsonProperty("idType")
   public String[] getIdType() {
      return this.idType;
   }

   @JsonProperty("idNumber")
   public void setIdNumber(String[] idNumber) {
      this.idNumber = idNumber;
   }

   @JsonProperty("idNumber")
   public String[] getIdNumber() {
      return this.idNumber;
   }

   @JsonProperty("certificateIssuance")
   public void setCertificateIssuance(String[] certificateIssuance) {
      this.certificateIssuance = certificateIssuance;
   }

   @JsonProperty("certificateIssuance")
   public String[] getCertificateIssuance() {
      return this.certificateIssuance;
   }

   @JsonProperty("liveAddress")
   public void setLiveAddress(String[] liveAddress) {
      this.liveAddress = liveAddress;
   }

   @JsonProperty("liveAddress")
   public String[] getLiveAddress() {
      return this.liveAddress;
   }

   @JsonProperty("addressDetail")
   public void setAddressDetail(String[] addressDetail) {
      this.addressDetail = addressDetail;
   }

   @JsonProperty("addressDetail")
   public String[] getAddressDetail() {
      return this.addressDetail;
   }

   @JsonProperty("drivingName")
   public void setDrivingName(String[] drivingName) {
      this.drivingName = drivingName;
   }

   @JsonProperty("drivingName")
   public String[] getDrivingName() {
      return this.drivingName;
   }

   @JsonProperty("drivingAddress")
   public void setDrivingAddress(String[] drivingAddress) {
      this.drivingAddress = drivingAddress;
   }

   @JsonProperty("drivingAddress")
   public String[] getDrivingAddress() {
      return this.drivingAddress;
   }

   @JsonProperty("drivingAddressee")
   public void setDrivingAddressee(String[] drivingAddressee) {
      this.drivingAddressee = drivingAddressee;
   }

   @JsonProperty("drivingAddressee")
   public String[] getDrivingAddressee() {
      return this.drivingAddressee;
   }

   @JsonProperty("drivingPhone")
   public void setDrivingPhone(String[] drivingPhone) {
      this.drivingPhone = drivingPhone;
   }

   @JsonProperty("drivingPhone")
   public String[] getDrivingPhone() {
      return this.drivingPhone;
   }
}
