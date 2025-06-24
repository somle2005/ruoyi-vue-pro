package com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.request.skuCustomServiceBatchApply;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SkuServiceApplyVo implements Serializable {
   private List<SkuServiceApplyDetailVo> serviceDetailList;
   private List<String> previewImageList;
   private String skuName;
   private String systemCode;
   private String identityId;
   private String supplier;
   private Long serviceProjectId;
   private String skuId;
   private String customExt;

   @JsonProperty("serviceDetailList")
   public void setServiceDetailList(List<SkuServiceApplyDetailVo> serviceDetailList) {
      this.serviceDetailList = serviceDetailList;
   }

   @JsonProperty("serviceDetailList")
   public List<SkuServiceApplyDetailVo> getServiceDetailList() {
      return this.serviceDetailList;
   }

   @JsonProperty("previewImageList")
   public void setPreviewImageList(List<String> previewImageList) {
      this.previewImageList = previewImageList;
   }

   @JsonProperty("previewImageList")
   public List<String> getPreviewImageList() {
      return this.previewImageList;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("systemCode")
   public void setSystemCode(String systemCode) {
      this.systemCode = systemCode;
   }

   @JsonProperty("systemCode")
   public String getSystemCode() {
      return this.systemCode;
   }

   @JsonProperty("identityId")
   public void setIdentityId(String identityId) {
      this.identityId = identityId;
   }

   @JsonProperty("identityId")
   public String getIdentityId() {
      return this.identityId;
   }

   @JsonProperty("supplier")
   public void setSupplier(String supplier) {
      this.supplier = supplier;
   }

   @JsonProperty("supplier")
   public String getSupplier() {
      return this.supplier;
   }

   @JsonProperty("serviceProjectId")
   public void setServiceProjectId(Long serviceProjectId) {
      this.serviceProjectId = serviceProjectId;
   }

   @JsonProperty("serviceProjectId")
   public Long getServiceProjectId() {
      return this.serviceProjectId;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("customExt")
   public void setCustomExt(String customExt) {
      this.customExt = customExt;
   }

   @JsonProperty("customExt")
   public String getCustomExt() {
      return this.customExt;
   }
}
