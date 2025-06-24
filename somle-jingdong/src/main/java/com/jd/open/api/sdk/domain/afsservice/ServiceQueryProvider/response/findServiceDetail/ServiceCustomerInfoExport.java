package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findServiceDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ServiceCustomerInfoExport implements Serializable {
   private String customerPin;
   private String customerName;
   private String customerContactName;
   private String customerTel;
   private String customerMobilePhone;
   private String customerEmail;
   private String customerPostcode;
   private Integer customerGrade;
   private String openIdBuyer;
   private String xidBuyer;
   private String desenCustomerTel;
   private String desenCustomerMobilePhone;

   @JsonProperty("customerPin")
   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   @JsonProperty("customerPin")
   public String getCustomerPin() {
      return this.customerPin;
   }

   @JsonProperty("customerName")
   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   @JsonProperty("customerName")
   public String getCustomerName() {
      return this.customerName;
   }

   @JsonProperty("customerContactName")
   public void setCustomerContactName(String customerContactName) {
      this.customerContactName = customerContactName;
   }

   @JsonProperty("customerContactName")
   public String getCustomerContactName() {
      return this.customerContactName;
   }

   @JsonProperty("customerTel")
   public void setCustomerTel(String customerTel) {
      this.customerTel = customerTel;
   }

   @JsonProperty("customerTel")
   public String getCustomerTel() {
      return this.customerTel;
   }

   @JsonProperty("customerMobilePhone")
   public void setCustomerMobilePhone(String customerMobilePhone) {
      this.customerMobilePhone = customerMobilePhone;
   }

   @JsonProperty("customerMobilePhone")
   public String getCustomerMobilePhone() {
      return this.customerMobilePhone;
   }

   @JsonProperty("customerEmail")
   public void setCustomerEmail(String customerEmail) {
      this.customerEmail = customerEmail;
   }

   @JsonProperty("customerEmail")
   public String getCustomerEmail() {
      return this.customerEmail;
   }

   @JsonProperty("customerPostcode")
   public void setCustomerPostcode(String customerPostcode) {
      this.customerPostcode = customerPostcode;
   }

   @JsonProperty("customerPostcode")
   public String getCustomerPostcode() {
      return this.customerPostcode;
   }

   @JsonProperty("customerGrade")
   public void setCustomerGrade(Integer customerGrade) {
      this.customerGrade = customerGrade;
   }

   @JsonProperty("customerGrade")
   public Integer getCustomerGrade() {
      return this.customerGrade;
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

   @JsonProperty("desen_customerTel")
   public void setDesenCustomerTel(String desenCustomerTel) {
      this.desenCustomerTel = desenCustomerTel;
   }

   @JsonProperty("desen_customerTel")
   public String getDesenCustomerTel() {
      return this.desenCustomerTel;
   }

   @JsonProperty("desen_customerMobilePhone")
   public void setDesenCustomerMobilePhone(String desenCustomerMobilePhone) {
      this.desenCustomerMobilePhone = desenCustomerMobilePhone;
   }

   @JsonProperty("desen_customerMobilePhone")
   public String getDesenCustomerMobilePhone() {
      return this.desenCustomerMobilePhone;
   }
}
