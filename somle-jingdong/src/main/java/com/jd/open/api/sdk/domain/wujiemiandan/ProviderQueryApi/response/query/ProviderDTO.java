package com.jd.open.api.sdk.domain.wujiemiandan.ProviderQueryApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ProviderDTO implements Serializable {
   private Integer id;
   private String providerCode;
   private String providerName;
   private Byte providerType;
   private Byte operationType;
   private Byte rangeType;
   private String contactName;
   private String contactPhone;
   private String contactMobile;
   private Boolean inPlatform;
   private Boolean supportCod;
   private Byte approveState;
   private String approveComment;
   private Byte providerState;

   @JsonProperty("id")
   public void setId(Integer id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Integer getId() {
      return this.id;
   }

   @JsonProperty("providerCode")
   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   @JsonProperty("providerCode")
   public String getProviderCode() {
      return this.providerCode;
   }

   @JsonProperty("providerName")
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }

   @JsonProperty("providerName")
   public String getProviderName() {
      return this.providerName;
   }

   @JsonProperty("providerType")
   public void setProviderType(Byte providerType) {
      this.providerType = providerType;
   }

   @JsonProperty("providerType")
   public Byte getProviderType() {
      return this.providerType;
   }

   @JsonProperty("operationType")
   public void setOperationType(Byte operationType) {
      this.operationType = operationType;
   }

   @JsonProperty("operationType")
   public Byte getOperationType() {
      return this.operationType;
   }

   @JsonProperty("rangeType")
   public void setRangeType(Byte rangeType) {
      this.rangeType = rangeType;
   }

   @JsonProperty("rangeType")
   public Byte getRangeType() {
      return this.rangeType;
   }

   @JsonProperty("contactName")
   public void setContactName(String contactName) {
      this.contactName = contactName;
   }

   @JsonProperty("contactName")
   public String getContactName() {
      return this.contactName;
   }

   @JsonProperty("contactPhone")
   public void setContactPhone(String contactPhone) {
      this.contactPhone = contactPhone;
   }

   @JsonProperty("contactPhone")
   public String getContactPhone() {
      return this.contactPhone;
   }

   @JsonProperty("contactMobile")
   public void setContactMobile(String contactMobile) {
      this.contactMobile = contactMobile;
   }

   @JsonProperty("contactMobile")
   public String getContactMobile() {
      return this.contactMobile;
   }

   @JsonProperty("inPlatform")
   public void setInPlatform(Boolean inPlatform) {
      this.inPlatform = inPlatform;
   }

   @JsonProperty("inPlatform")
   public Boolean getInPlatform() {
      return this.inPlatform;
   }

   @JsonProperty("supportCod")
   public void setSupportCod(Boolean supportCod) {
      this.supportCod = supportCod;
   }

   @JsonProperty("supportCod")
   public Boolean getSupportCod() {
      return this.supportCod;
   }

   @JsonProperty("approveState")
   public void setApproveState(Byte approveState) {
      this.approveState = approveState;
   }

   @JsonProperty("approveState")
   public Byte getApproveState() {
      return this.approveState;
   }

   @JsonProperty("approveComment")
   public void setApproveComment(String approveComment) {
      this.approveComment = approveComment;
   }

   @JsonProperty("approveComment")
   public String getApproveComment() {
      return this.approveComment;
   }

   @JsonProperty("providerState")
   public void setProviderState(Byte providerState) {
      this.providerState = providerState;
   }

   @JsonProperty("providerState")
   public Byte getProviderState() {
      return this.providerState;
   }
}
