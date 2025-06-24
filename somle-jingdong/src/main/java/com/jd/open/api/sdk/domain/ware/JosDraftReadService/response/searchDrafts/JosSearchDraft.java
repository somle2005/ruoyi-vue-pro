package com.jd.open.api.sdk.domain.ware.JosDraftReadService.response.searchDrafts;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class JosSearchDraft implements Serializable {
   private Long productId;
   private String productName;
   private Long version;
   private Date created;
   private Date modified;
   private Integer draftType;
   private Integer draftComputeStatus;
   private Integer draftStatus;
   private Integer auditStatus;
   private String auditReason;
   private String logo;
   private Integer colType;
   private Date auditTime;
   private Set<JosFeature> features;
   private String pushReason;

   @JsonProperty("productId")
   public void setProductId(Long productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public Long getProductId() {
      return this.productId;
   }

   @JsonProperty("productName")
   public void setProductName(String productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String getProductName() {
      return this.productName;
   }

   @JsonProperty("version")
   public void setVersion(Long version) {
      this.version = version;
   }

   @JsonProperty("version")
   public Long getVersion() {
      return this.version;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("draftType")
   public void setDraftType(Integer draftType) {
      this.draftType = draftType;
   }

   @JsonProperty("draftType")
   public Integer getDraftType() {
      return this.draftType;
   }

   @JsonProperty("draftComputeStatus")
   public void setDraftComputeStatus(Integer draftComputeStatus) {
      this.draftComputeStatus = draftComputeStatus;
   }

   @JsonProperty("draftComputeStatus")
   public Integer getDraftComputeStatus() {
      return this.draftComputeStatus;
   }

   @JsonProperty("draftStatus")
   public void setDraftStatus(Integer draftStatus) {
      this.draftStatus = draftStatus;
   }

   @JsonProperty("draftStatus")
   public Integer getDraftStatus() {
      return this.draftStatus;
   }

   @JsonProperty("auditStatus")
   public void setAuditStatus(Integer auditStatus) {
      this.auditStatus = auditStatus;
   }

   @JsonProperty("auditStatus")
   public Integer getAuditStatus() {
      return this.auditStatus;
   }

   @JsonProperty("auditReason")
   public void setAuditReason(String auditReason) {
      this.auditReason = auditReason;
   }

   @JsonProperty("auditReason")
   public String getAuditReason() {
      return this.auditReason;
   }

   @JsonProperty("logo")
   public void setLogo(String logo) {
      this.logo = logo;
   }

   @JsonProperty("logo")
   public String getLogo() {
      return this.logo;
   }

   @JsonProperty("colType")
   public void setColType(Integer colType) {
      this.colType = colType;
   }

   @JsonProperty("colType")
   public Integer getColType() {
      return this.colType;
   }

   @JsonProperty("auditTime")
   public void setAuditTime(Date auditTime) {
      this.auditTime = auditTime;
   }

   @JsonProperty("auditTime")
   public Date getAuditTime() {
      return this.auditTime;
   }

   @JsonProperty("features")
   public void setFeatures(Set<JosFeature> features) {
      this.features = features;
   }

   @JsonProperty("features")
   public Set<JosFeature> getFeatures() {
      return this.features;
   }

   @JsonProperty("pushReason")
   public void setPushReason(String pushReason) {
      this.pushReason = pushReason;
   }

   @JsonProperty("pushReason")
   public String getPushReason() {
      return this.pushReason;
   }
}
