package com.jd.open.api.sdk.domain.platform.JosDraftReadService.response.getDraftInfoByVersion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class JosDraftBaseInfo implements Serializable {
   private Long productId;
   private Integer draftStatus;
   private Date created;
   private Integer auditStatus;
   private Date modified;
   private Long version;
   private Integer draftType;
   private Integer draftComputeStatus;
   private String pushReason;
   private String auditReason;

   @JsonProperty("productId")
   public void setProductId(Long productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public Long getProductId() {
      return this.productId;
   }

   @JsonProperty("draftStatus")
   public void setDraftStatus(Integer draftStatus) {
      this.draftStatus = draftStatus;
   }

   @JsonProperty("draftStatus")
   public Integer getDraftStatus() {
      return this.draftStatus;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("auditStatus")
   public void setAuditStatus(Integer auditStatus) {
      this.auditStatus = auditStatus;
   }

   @JsonProperty("auditStatus")
   public Integer getAuditStatus() {
      return this.auditStatus;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("version")
   public void setVersion(Long version) {
      this.version = version;
   }

   @JsonProperty("version")
   public Long getVersion() {
      return this.version;
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

   @JsonProperty("pushReason")
   public void setPushReason(String pushReason) {
      this.pushReason = pushReason;
   }

   @JsonProperty("pushReason")
   public String getPushReason() {
      return this.pushReason;
   }

   @JsonProperty("auditReason")
   public void setAuditReason(String auditReason) {
      this.auditReason = auditReason;
   }

   @JsonProperty("auditReason")
   public String getAuditReason() {
      return this.auditReason;
   }
}
