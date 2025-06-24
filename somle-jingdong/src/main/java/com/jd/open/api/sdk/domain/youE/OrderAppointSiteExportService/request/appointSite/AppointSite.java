package com.jd.open.api.sdk.domain.youE.OrderAppointSiteExportService.request.appointSite;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AppointSite implements Serializable {
   private String orderNo;
   private String siteCode;
   private String siteMobile;
   private String siteJdId;
   private String siteName;
   private String siteAddress;
   private String unifiedCode;
   private String remark;
   private String siteContact;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("siteCode")
   public void setSiteCode(String siteCode) {
      this.siteCode = siteCode;
   }

   @JsonProperty("siteCode")
   public String getSiteCode() {
      return this.siteCode;
   }

   @JsonProperty("siteMobile")
   public void setSiteMobile(String siteMobile) {
      this.siteMobile = siteMobile;
   }

   @JsonProperty("siteMobile")
   public String getSiteMobile() {
      return this.siteMobile;
   }

   @JsonProperty("siteJdId")
   public void setSiteJdId(String siteJdId) {
      this.siteJdId = siteJdId;
   }

   @JsonProperty("siteJdId")
   public String getSiteJdId() {
      return this.siteJdId;
   }

   @JsonProperty("siteName")
   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   @JsonProperty("siteName")
   public String getSiteName() {
      return this.siteName;
   }

   @JsonProperty("siteAddress")
   public void setSiteAddress(String siteAddress) {
      this.siteAddress = siteAddress;
   }

   @JsonProperty("siteAddress")
   public String getSiteAddress() {
      return this.siteAddress;
   }

   @JsonProperty("unifiedCode")
   public void setUnifiedCode(String unifiedCode) {
      this.unifiedCode = unifiedCode;
   }

   @JsonProperty("unifiedCode")
   public String getUnifiedCode() {
      return this.unifiedCode;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("siteContact")
   public void setSiteContact(String siteContact) {
      this.siteContact = siteContact;
   }

   @JsonProperty("siteContact")
   public String getSiteContact() {
      return this.siteContact;
   }
}
