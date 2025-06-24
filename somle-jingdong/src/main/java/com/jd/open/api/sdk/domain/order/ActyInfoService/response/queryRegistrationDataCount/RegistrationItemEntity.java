package com.jd.open.api.sdk.domain.order.ActyInfoService.response.queryRegistrationDataCount;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class RegistrationItemEntity implements Serializable {
   private Long[] orderId;
   private Long[] skuId;
   private String[] skuName;
   private String[] name;
   private String[] sex;
   private Date[] birthday;
   private String[] idNumber;
   private String[] nationality;
   private String[] homeAddress;
   private String[] addressDetail;
   private String[] phoneNumber;
   private String[] email;
   private String[] emergencyContact;
   private String[] emergencyContactNumber;
   private String[] clothingSize;
   private String[] beastResult;
   private String[] certificatePictureUrl;
   private String[] job;
   private String[] informationChannel;
   private String[] desenPhoneNumber;

   @JsonProperty("orderId")
   public void setOrderId(Long[] orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long[] getOrderId() {
      return this.orderId;
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

   @JsonProperty("sex")
   public void setSex(String[] sex) {
      this.sex = sex;
   }

   @JsonProperty("sex")
   public String[] getSex() {
      return this.sex;
   }

   @JsonProperty("birthday")
   public void setBirthday(Date[] birthday) {
      this.birthday = birthday;
   }

   @JsonProperty("birthday")
   public Date[] getBirthday() {
      return this.birthday;
   }

   @JsonProperty("idNumber")
   public void setIdNumber(String[] idNumber) {
      this.idNumber = idNumber;
   }

   @JsonProperty("idNumber")
   public String[] getIdNumber() {
      return this.idNumber;
   }

   @JsonProperty("nationality")
   public void setNationality(String[] nationality) {
      this.nationality = nationality;
   }

   @JsonProperty("nationality")
   public String[] getNationality() {
      return this.nationality;
   }

   @JsonProperty("homeAddress")
   public void setHomeAddress(String[] homeAddress) {
      this.homeAddress = homeAddress;
   }

   @JsonProperty("homeAddress")
   public String[] getHomeAddress() {
      return this.homeAddress;
   }

   @JsonProperty("addressDetail")
   public void setAddressDetail(String[] addressDetail) {
      this.addressDetail = addressDetail;
   }

   @JsonProperty("addressDetail")
   public String[] getAddressDetail() {
      return this.addressDetail;
   }

   @JsonProperty("phoneNumber")
   public void setPhoneNumber(String[] phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   @JsonProperty("phoneNumber")
   public String[] getPhoneNumber() {
      return this.phoneNumber;
   }

   @JsonProperty("email")
   public void setEmail(String[] email) {
      this.email = email;
   }

   @JsonProperty("email")
   public String[] getEmail() {
      return this.email;
   }

   @JsonProperty("emergencyContact")
   public void setEmergencyContact(String[] emergencyContact) {
      this.emergencyContact = emergencyContact;
   }

   @JsonProperty("emergencyContact")
   public String[] getEmergencyContact() {
      return this.emergencyContact;
   }

   @JsonProperty("emergencyContactNumber")
   public void setEmergencyContactNumber(String[] emergencyContactNumber) {
      this.emergencyContactNumber = emergencyContactNumber;
   }

   @JsonProperty("emergencyContactNumber")
   public String[] getEmergencyContactNumber() {
      return this.emergencyContactNumber;
   }

   @JsonProperty("clothingSize")
   public void setClothingSize(String[] clothingSize) {
      this.clothingSize = clothingSize;
   }

   @JsonProperty("clothingSize")
   public String[] getClothingSize() {
      return this.clothingSize;
   }

   @JsonProperty("beastResult")
   public void setBeastResult(String[] beastResult) {
      this.beastResult = beastResult;
   }

   @JsonProperty("beastResult")
   public String[] getBeastResult() {
      return this.beastResult;
   }

   @JsonProperty("certificatePictureUrl")
   public void setCertificatePictureUrl(String[] certificatePictureUrl) {
      this.certificatePictureUrl = certificatePictureUrl;
   }

   @JsonProperty("certificatePictureUrl")
   public String[] getCertificatePictureUrl() {
      return this.certificatePictureUrl;
   }

   @JsonProperty("job")
   public void setJob(String[] job) {
      this.job = job;
   }

   @JsonProperty("job")
   public String[] getJob() {
      return this.job;
   }

   @JsonProperty("informationChannel")
   public void setInformationChannel(String[] informationChannel) {
      this.informationChannel = informationChannel;
   }

   @JsonProperty("informationChannel")
   public String[] getInformationChannel() {
      return this.informationChannel;
   }

   @JsonProperty("desen_phoneNumber")
   public void setDesenPhoneNumber(String[] desenPhoneNumber) {
      this.desenPhoneNumber = desenPhoneNumber;
   }

   @JsonProperty("desen_phoneNumber")
   public String[] getDesenPhoneNumber() {
      return this.desenPhoneNumber;
   }
}
