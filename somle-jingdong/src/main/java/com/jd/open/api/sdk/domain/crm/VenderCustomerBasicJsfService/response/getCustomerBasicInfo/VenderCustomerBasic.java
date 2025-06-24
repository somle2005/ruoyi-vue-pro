package com.jd.open.api.sdk.domain.crm.VenderCustomerBasicJsfService.response.getCustomerBasicInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VenderCustomerBasic implements Serializable {
   private String birthday;
   private String gender;
   private String city;
   private Long venderId;
   private Integer channel;
   private String cardNo;
   private String phoneNo;
   private Integer customerLevel;
   private String extend;
   private Integer customerType;
   private String province;
   private String street;
   private String customerPin;
   private Integer status;
   private String desenPhoneNo;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("birthday")
   public void setBirthday(String birthday) {
      this.birthday = birthday;
   }

   @JsonProperty("birthday")
   public String getBirthday() {
      return this.birthday;
   }

   @JsonProperty("gender")
   public void setGender(String gender) {
      this.gender = gender;
   }

   @JsonProperty("gender")
   public String getGender() {
      return this.gender;
   }

   @JsonProperty("city")
   public void setCity(String city) {
      this.city = city;
   }

   @JsonProperty("city")
   public String getCity() {
      return this.city;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("channel")
   public void setChannel(Integer channel) {
      this.channel = channel;
   }

   @JsonProperty("channel")
   public Integer getChannel() {
      return this.channel;
   }

   @JsonProperty("cardNo")
   public void setCardNo(String cardNo) {
      this.cardNo = cardNo;
   }

   @JsonProperty("cardNo")
   public String getCardNo() {
      return this.cardNo;
   }

   @JsonProperty("phoneNo")
   public void setPhoneNo(String phoneNo) {
      this.phoneNo = phoneNo;
   }

   @JsonProperty("phoneNo")
   public String getPhoneNo() {
      return this.phoneNo;
   }

   @JsonProperty("customerLevel")
   public void setCustomerLevel(Integer customerLevel) {
      this.customerLevel = customerLevel;
   }

   @JsonProperty("customerLevel")
   public Integer getCustomerLevel() {
      return this.customerLevel;
   }

   @JsonProperty("extend")
   public void setExtend(String extend) {
      this.extend = extend;
   }

   @JsonProperty("extend")
   public String getExtend() {
      return this.extend;
   }

   @JsonProperty("customerType")
   public void setCustomerType(Integer customerType) {
      this.customerType = customerType;
   }

   @JsonProperty("customerType")
   public Integer getCustomerType() {
      return this.customerType;
   }

   @JsonProperty("province")
   public void setProvince(String province) {
      this.province = province;
   }

   @JsonProperty("province")
   public String getProvince() {
      return this.province;
   }

   @JsonProperty("street")
   public void setStreet(String street) {
      this.street = street;
   }

   @JsonProperty("street")
   public String getStreet() {
      return this.street;
   }

   @JsonProperty("customerPin")
   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   @JsonProperty("customerPin")
   public String getCustomerPin() {
      return this.customerPin;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("desen_phoneNo")
   public void setDesenPhoneNo(String desenPhoneNo) {
      this.desenPhoneNo = desenPhoneNo;
   }

   @JsonProperty("desen_phoneNo")
   public String getDesenPhoneNo() {
      return this.desenPhoneNo;
   }

   @JsonProperty("open_id_buyer")
   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   @JsonProperty("open_id_buyer")
   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   @JsonProperty("xid_buyer")
   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   @JsonProperty("xid_buyer")
   public String getXidBuyer() {
      return this.xidBuyer;
   }
}
