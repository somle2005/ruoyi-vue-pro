package com.jd.open.api.sdk.domain.ware.JosDraftWriteService.response.commitDraft;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class JosDraftBaseInfo implements Serializable {
   private Long productId;
   private Long version;
   private Integer auditStatus;
   private Integer draftStatus;
   private Integer draftType;
   private Date created;
   private Date modified;
   private Integer draftComputeStatus;

   @JsonProperty("productId")
   public void setProductId(Long productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public Long getProductId() {
      return this.productId;
   }

   @JsonProperty("version")
   public void setVersion(Long version) {
      this.version = version;
   }

   @JsonProperty("version")
   public Long getVersion() {
      return this.version;
   }

   @JsonProperty("auditStatus")
   public void setAuditStatus(Integer auditStatus) {
      this.auditStatus = auditStatus;
   }

   @JsonProperty("auditStatus")
   public Integer getAuditStatus() {
      return this.auditStatus;
   }

   @JsonProperty("draftStatus")
   public void setDraftStatus(Integer draftStatus) {
      this.draftStatus = draftStatus;
   }

   @JsonProperty("draftStatus")
   public Integer getDraftStatus() {
      return this.draftStatus;
   }

   @JsonProperty("draftType")
   public void setDraftType(Integer draftType) {
      this.draftType = draftType;
   }

   @JsonProperty("draftType")
   public Integer getDraftType() {
      return this.draftType;
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

   @JsonProperty("draftComputeStatus")
   public void setDraftComputeStatus(Integer draftComputeStatus) {
      this.draftComputeStatus = draftComputeStatus;
   }

   @JsonProperty("draftComputeStatus")
   public Integer getDraftComputeStatus() {
      return this.draftComputeStatus;
   }
}
