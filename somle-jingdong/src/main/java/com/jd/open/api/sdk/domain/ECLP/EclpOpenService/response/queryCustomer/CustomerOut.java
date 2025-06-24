package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryCustomer;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CustomerOut implements Serializable {
   private String[] deptNo;
   private String[] sellerNo;
   private String[] customerNo;
   private String[] customerName;
   private String[] contacts;
   private String[] phone;
   private String[] customerEmail;
   private String[] customerAddress;
   private Byte[] customerType;
   private Byte[] transitType;
   private String[] warehouseName;
   private Byte[] rection;
   private String[] customerRemark;
   private String[] licenseAddr;
   private String[] licenseUnit;
   private String[] licenseUnitNo;
   private String[] provinceName;
   private String[] cityName;
   private String[] countyName;
   private String[] townName;
   private String[] sellerName;

   @JsonProperty("deptNo")
   public void setDeptNo(String[] deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String[] getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("sellerNo")
   public void setSellerNo(String[] sellerNo) {
      this.sellerNo = sellerNo;
   }

   @JsonProperty("sellerNo")
   public String[] getSellerNo() {
      return this.sellerNo;
   }

   @JsonProperty("customerNo")
   public void setCustomerNo(String[] customerNo) {
      this.customerNo = customerNo;
   }

   @JsonProperty("customerNo")
   public String[] getCustomerNo() {
      return this.customerNo;
   }

   @JsonProperty("customerName")
   public void setCustomerName(String[] customerName) {
      this.customerName = customerName;
   }

   @JsonProperty("customerName")
   public String[] getCustomerName() {
      return this.customerName;
   }

   @JsonProperty("contacts")
   public void setContacts(String[] contacts) {
      this.contacts = contacts;
   }

   @JsonProperty("contacts")
   public String[] getContacts() {
      return this.contacts;
   }

   @JsonProperty("phone")
   public void setPhone(String[] phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String[] getPhone() {
      return this.phone;
   }

   @JsonProperty("customerEmail")
   public void setCustomerEmail(String[] customerEmail) {
      this.customerEmail = customerEmail;
   }

   @JsonProperty("customerEmail")
   public String[] getCustomerEmail() {
      return this.customerEmail;
   }

   @JsonProperty("customerAddress")
   public void setCustomerAddress(String[] customerAddress) {
      this.customerAddress = customerAddress;
   }

   @JsonProperty("customerAddress")
   public String[] getCustomerAddress() {
      return this.customerAddress;
   }

   @JsonProperty("customerType")
   public void setCustomerType(Byte[] customerType) {
      this.customerType = customerType;
   }

   @JsonProperty("customerType")
   public Byte[] getCustomerType() {
      return this.customerType;
   }

   @JsonProperty("transitType")
   public void setTransitType(Byte[] transitType) {
      this.transitType = transitType;
   }

   @JsonProperty("transitType")
   public Byte[] getTransitType() {
      return this.transitType;
   }

   @JsonProperty("warehouseName")
   public void setWarehouseName(String[] warehouseName) {
      this.warehouseName = warehouseName;
   }

   @JsonProperty("warehouseName")
   public String[] getWarehouseName() {
      return this.warehouseName;
   }

   @JsonProperty("rection")
   public void setRection(Byte[] rection) {
      this.rection = rection;
   }

   @JsonProperty("rection")
   public Byte[] getRection() {
      return this.rection;
   }

   @JsonProperty("customerRemark")
   public void setCustomerRemark(String[] customerRemark) {
      this.customerRemark = customerRemark;
   }

   @JsonProperty("customerRemark")
   public String[] getCustomerRemark() {
      return this.customerRemark;
   }

   @JsonProperty("licenseAddr")
   public void setLicenseAddr(String[] licenseAddr) {
      this.licenseAddr = licenseAddr;
   }

   @JsonProperty("licenseAddr")
   public String[] getLicenseAddr() {
      return this.licenseAddr;
   }

   @JsonProperty("licenseUnit")
   public void setLicenseUnit(String[] licenseUnit) {
      this.licenseUnit = licenseUnit;
   }

   @JsonProperty("licenseUnit")
   public String[] getLicenseUnit() {
      return this.licenseUnit;
   }

   @JsonProperty("licenseUnitNo")
   public void setLicenseUnitNo(String[] licenseUnitNo) {
      this.licenseUnitNo = licenseUnitNo;
   }

   @JsonProperty("licenseUnitNo")
   public String[] getLicenseUnitNo() {
      return this.licenseUnitNo;
   }

   @JsonProperty("provinceName")
   public void setProvinceName(String[] provinceName) {
      this.provinceName = provinceName;
   }

   @JsonProperty("provinceName")
   public String[] getProvinceName() {
      return this.provinceName;
   }

   @JsonProperty("cityName")
   public void setCityName(String[] cityName) {
      this.cityName = cityName;
   }

   @JsonProperty("cityName")
   public String[] getCityName() {
      return this.cityName;
   }

   @JsonProperty("countyName")
   public void setCountyName(String[] countyName) {
      this.countyName = countyName;
   }

   @JsonProperty("countyName")
   public String[] getCountyName() {
      return this.countyName;
   }

   @JsonProperty("townName")
   public void setTownName(String[] townName) {
      this.townName = townName;
   }

   @JsonProperty("townName")
   public String[] getTownName() {
      return this.townName;
   }

   @JsonProperty("sellerName")
   public void setSellerName(String[] sellerName) {
      this.sellerName = sellerName;
   }

   @JsonProperty("sellerName")
   public String[] getSellerName() {
      return this.sellerName;
   }
}
