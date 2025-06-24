package com.jd.open.api.sdk.domain.B2B.OrderMiddleProvider.response.queryOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderInvoiceResp implements Serializable {
   private Integer invoiceType;
   private Integer invoiceTitle;
   private Integer invoicePutType;
   private Integer normalInvoiceContent;
   private Integer bookInvoiceContent;
   private String name;
   private String phone;
   private Integer provinceId;
   private Integer cityId;
   private Integer countyId;
   private Integer townId;
   private String address;
   private String companyName;
   private String companyRegistAddr;
   private String companyRegistPhone;
   private String companyRegistBank;
   private String companyRegistBankAccount;
   private String taxpayerId;

   @JsonProperty("invoiceType")
   public void setInvoiceType(Integer invoiceType) {
      this.invoiceType = invoiceType;
   }

   @JsonProperty("invoiceType")
   public Integer getInvoiceType() {
      return this.invoiceType;
   }

   @JsonProperty("invoiceTitle")
   public void setInvoiceTitle(Integer invoiceTitle) {
      this.invoiceTitle = invoiceTitle;
   }

   @JsonProperty("invoiceTitle")
   public Integer getInvoiceTitle() {
      return this.invoiceTitle;
   }

   @JsonProperty("invoicePutType")
   public void setInvoicePutType(Integer invoicePutType) {
      this.invoicePutType = invoicePutType;
   }

   @JsonProperty("invoicePutType")
   public Integer getInvoicePutType() {
      return this.invoicePutType;
   }

   @JsonProperty("normalInvoiceContent")
   public void setNormalInvoiceContent(Integer normalInvoiceContent) {
      this.normalInvoiceContent = normalInvoiceContent;
   }

   @JsonProperty("normalInvoiceContent")
   public Integer getNormalInvoiceContent() {
      return this.normalInvoiceContent;
   }

   @JsonProperty("bookInvoiceContent")
   public void setBookInvoiceContent(Integer bookInvoiceContent) {
      this.bookInvoiceContent = bookInvoiceContent;
   }

   @JsonProperty("bookInvoiceContent")
   public Integer getBookInvoiceContent() {
      return this.bookInvoiceContent;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("phone")
   public void setPhone(String phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String getPhone() {
      return this.phone;
   }

   @JsonProperty("provinceId")
   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public Integer getProvinceId() {
      return this.provinceId;
   }

   @JsonProperty("cityId")
   public void setCityId(Integer cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("cityId")
   public Integer getCityId() {
      return this.cityId;
   }

   @JsonProperty("countyId")
   public void setCountyId(Integer countyId) {
      this.countyId = countyId;
   }

   @JsonProperty("countyId")
   public Integer getCountyId() {
      return this.countyId;
   }

   @JsonProperty("townId")
   public void setTownId(Integer townId) {
      this.townId = townId;
   }

   @JsonProperty("townId")
   public Integer getTownId() {
      return this.townId;
   }

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String getAddress() {
      return this.address;
   }

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("companyRegistAddr")
   public void setCompanyRegistAddr(String companyRegistAddr) {
      this.companyRegistAddr = companyRegistAddr;
   }

   @JsonProperty("companyRegistAddr")
   public String getCompanyRegistAddr() {
      return this.companyRegistAddr;
   }

   @JsonProperty("companyRegistPhone")
   public void setCompanyRegistPhone(String companyRegistPhone) {
      this.companyRegistPhone = companyRegistPhone;
   }

   @JsonProperty("companyRegistPhone")
   public String getCompanyRegistPhone() {
      return this.companyRegistPhone;
   }

   @JsonProperty("companyRegistBank")
   public void setCompanyRegistBank(String companyRegistBank) {
      this.companyRegistBank = companyRegistBank;
   }

   @JsonProperty("companyRegistBank")
   public String getCompanyRegistBank() {
      return this.companyRegistBank;
   }

   @JsonProperty("companyRegistBankAccount")
   public void setCompanyRegistBankAccount(String companyRegistBankAccount) {
      this.companyRegistBankAccount = companyRegistBankAccount;
   }

   @JsonProperty("companyRegistBankAccount")
   public String getCompanyRegistBankAccount() {
      return this.companyRegistBankAccount;
   }

   @JsonProperty("taxpayerId")
   public void setTaxpayerId(String taxpayerId) {
      this.taxpayerId = taxpayerId;
   }

   @JsonProperty("taxpayerId")
   public String getTaxpayerId() {
      return this.taxpayerId;
   }
}
