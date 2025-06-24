package com.jd.open.api.sdk.domain.B2B.BWareSearchService.response.fx;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BizSkuDto implements Serializable {
   private Long jdSkuId;
   private String imagePath;
   private Double beingAuditPoint;
   private String operatorErp;
   private String skuName;
   private List<Long> tpPoolIds;
   private String instanceId;
   private Integer yn;
   private String supplier;
   private Integer auditStatus;
   private String processKey;
   private String pdPin;
   private Integer status;

   @JsonProperty("jdSkuId")
   public void setJdSkuId(Long jdSkuId) {
      this.jdSkuId = jdSkuId;
   }

   @JsonProperty("jdSkuId")
   public Long getJdSkuId() {
      return this.jdSkuId;
   }

   @JsonProperty("imagePath")
   public void setImagePath(String imagePath) {
      this.imagePath = imagePath;
   }

   @JsonProperty("imagePath")
   public String getImagePath() {
      return this.imagePath;
   }

   @JsonProperty("beingAuditPoint")
   public void setBeingAuditPoint(Double beingAuditPoint) {
      this.beingAuditPoint = beingAuditPoint;
   }

   @JsonProperty("beingAuditPoint")
   public Double getBeingAuditPoint() {
      return this.beingAuditPoint;
   }

   @JsonProperty("operatorErp")
   public void setOperatorErp(String operatorErp) {
      this.operatorErp = operatorErp;
   }

   @JsonProperty("operatorErp")
   public String getOperatorErp() {
      return this.operatorErp;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("tpPoolIds")
   public void setTpPoolIds(List<Long> tpPoolIds) {
      this.tpPoolIds = tpPoolIds;
   }

   @JsonProperty("tpPoolIds")
   public List<Long> getTpPoolIds() {
      return this.tpPoolIds;
   }

   @JsonProperty("instanceId")
   public void setInstanceId(String instanceId) {
      this.instanceId = instanceId;
   }

   @JsonProperty("instanceId")
   public String getInstanceId() {
      return this.instanceId;
   }

   @JsonProperty("yn")
   public void setYn(Integer yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public Integer getYn() {
      return this.yn;
   }

   @JsonProperty("supplier")
   public void setSupplier(String supplier) {
      this.supplier = supplier;
   }

   @JsonProperty("supplier")
   public String getSupplier() {
      return this.supplier;
   }

   @JsonProperty("auditStatus")
   public void setAuditStatus(Integer auditStatus) {
      this.auditStatus = auditStatus;
   }

   @JsonProperty("auditStatus")
   public Integer getAuditStatus() {
      return this.auditStatus;
   }

   @JsonProperty("processKey")
   public void setProcessKey(String processKey) {
      this.processKey = processKey;
   }

   @JsonProperty("processKey")
   public String getProcessKey() {
      return this.processKey;
   }

   @JsonProperty("pdPin")
   public void setPdPin(String pdPin) {
      this.pdPin = pdPin;
   }

   @JsonProperty("pdPin")
   public String getPdPin() {
      return this.pdPin;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }
}
