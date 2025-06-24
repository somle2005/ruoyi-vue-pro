package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ProductApplyDto implements Serializable {
   private String applyId;
   private String createdBy;
   private Date createdTime;
   private String modifiedBy;
   private Date modifiedTime;
   private Date applyTime;
   private Integer state;
   private Integer archiveStatus;
   private Integer yn;
   private Integer productType;
   private ProductInfoDto productInfo;
   private AuditInfoDto currentAuditInfo;
   private List<AuditInfoDto> auditRecords;
   private AuditInfoDto keeperAuditInfo;
   private String sizeTemplateId;

   @JsonProperty("apply_id")
   public void setApplyId(String applyId) {
      this.applyId = applyId;
   }

   @JsonProperty("apply_id")
   public String getApplyId() {
      return this.applyId;
   }

   @JsonProperty("created_by")
   public void setCreatedBy(String createdBy) {
      this.createdBy = createdBy;
   }

   @JsonProperty("created_by")
   public String getCreatedBy() {
      return this.createdBy;
   }

   @JsonProperty("created_time")
   public void setCreatedTime(Date createdTime) {
      this.createdTime = createdTime;
   }

   @JsonProperty("created_time")
   public Date getCreatedTime() {
      return this.createdTime;
   }

   @JsonProperty("modified_by")
   public void setModifiedBy(String modifiedBy) {
      this.modifiedBy = modifiedBy;
   }

   @JsonProperty("modified_by")
   public String getModifiedBy() {
      return this.modifiedBy;
   }

   @JsonProperty("modified_time")
   public void setModifiedTime(Date modifiedTime) {
      this.modifiedTime = modifiedTime;
   }

   @JsonProperty("modified_time")
   public Date getModifiedTime() {
      return this.modifiedTime;
   }

   @JsonProperty("apply_time")
   public void setApplyTime(Date applyTime) {
      this.applyTime = applyTime;
   }

   @JsonProperty("apply_time")
   public Date getApplyTime() {
      return this.applyTime;
   }

   @JsonProperty("state")
   public void setState(Integer state) {
      this.state = state;
   }

   @JsonProperty("state")
   public Integer getState() {
      return this.state;
   }

   @JsonProperty("archive_status")
   public void setArchiveStatus(Integer archiveStatus) {
      this.archiveStatus = archiveStatus;
   }

   @JsonProperty("archive_status")
   public Integer getArchiveStatus() {
      return this.archiveStatus;
   }

   @JsonProperty("yn")
   public void setYn(Integer yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public Integer getYn() {
      return this.yn;
   }

   @JsonProperty("product_type")
   public void setProductType(Integer productType) {
      this.productType = productType;
   }

   @JsonProperty("product_type")
   public Integer getProductType() {
      return this.productType;
   }

   @JsonProperty("product_info")
   public void setProductInfo(ProductInfoDto productInfo) {
      this.productInfo = productInfo;
   }

   @JsonProperty("product_info")
   public ProductInfoDto getProductInfo() {
      return this.productInfo;
   }

   @JsonProperty("current_audit_info")
   public void setCurrentAuditInfo(AuditInfoDto currentAuditInfo) {
      this.currentAuditInfo = currentAuditInfo;
   }

   @JsonProperty("current_audit_info")
   public AuditInfoDto getCurrentAuditInfo() {
      return this.currentAuditInfo;
   }

   @JsonProperty("audit_records")
   public void setAuditRecords(List<AuditInfoDto> auditRecords) {
      this.auditRecords = auditRecords;
   }

   @JsonProperty("audit_records")
   public List<AuditInfoDto> getAuditRecords() {
      return this.auditRecords;
   }

   @JsonProperty("keeper_audit_info")
   public void setKeeperAuditInfo(AuditInfoDto keeperAuditInfo) {
      this.keeperAuditInfo = keeperAuditInfo;
   }

   @JsonProperty("keeper_audit_info")
   public AuditInfoDto getKeeperAuditInfo() {
      return this.keeperAuditInfo;
   }

   @JsonProperty("sizeTemplateId")
   public void setSizeTemplateId(String sizeTemplateId) {
      this.sizeTemplateId = sizeTemplateId;
   }

   @JsonProperty("sizeTemplateId")
   public String getSizeTemplateId() {
      return this.sizeTemplateId;
   }
}
