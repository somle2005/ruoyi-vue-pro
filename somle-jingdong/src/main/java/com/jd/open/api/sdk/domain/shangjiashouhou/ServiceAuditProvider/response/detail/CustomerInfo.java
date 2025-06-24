package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CustomerInfo implements Serializable {
   private String jdPin;
   private String name;
   private Integer grade;
   private ContactInfo contactInfo;
   private String extJsonStr;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("jdPin")
   public void setJdPin(String jdPin) {
      this.jdPin = jdPin;
   }

   @JsonProperty("jdPin")
   public String getJdPin() {
      return this.jdPin;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("grade")
   public void setGrade(Integer grade) {
      this.grade = grade;
   }

   @JsonProperty("grade")
   public Integer getGrade() {
      return this.grade;
   }

   @JsonProperty("contactInfo")
   public void setContactInfo(ContactInfo contactInfo) {
      this.contactInfo = contactInfo;
   }

   @JsonProperty("contactInfo")
   public ContactInfo getContactInfo() {
      return this.contactInfo;
   }

   @JsonProperty("extJsonStr")
   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   @JsonProperty("extJsonStr")
   public String getExtJsonStr() {
      return this.extJsonStr;
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
