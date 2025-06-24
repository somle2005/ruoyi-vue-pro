package com.jd.open.api.sdk.domain.ware.JosDraftWriteService.response.updateProduct;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosDraftBaseInfoBO implements Serializable {
   private Long productId;
   private Integer draftStatus;
   private Integer draftType;
   private Long version;
   private Integer auditStatus;

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

   @JsonProperty("draftType")
   public void setDraftType(Integer draftType) {
      this.draftType = draftType;
   }

   @JsonProperty("draftType")
   public Integer getDraftType() {
      return this.draftType;
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
}
