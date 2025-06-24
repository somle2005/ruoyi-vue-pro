package com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.request.skuCustomServiceBatchApply;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuServiceApplyDetailVo implements Serializable {
   private String customContents;
   private Long serviceCd2Id;
   private Long serviceCd1Id;
   private Double salePrice;
   private String indexName;
   private String indexId;
   private Double purchasePrice;
   private Long techId;
   private Boolean required;

   @JsonProperty("customContents")
   public void setCustomContents(String customContents) {
      this.customContents = customContents;
   }

   @JsonProperty("customContents")
   public String getCustomContents() {
      return this.customContents;
   }

   @JsonProperty("serviceCd2Id")
   public void setServiceCd2Id(Long serviceCd2Id) {
      this.serviceCd2Id = serviceCd2Id;
   }

   @JsonProperty("serviceCd2Id")
   public Long getServiceCd2Id() {
      return this.serviceCd2Id;
   }

   @JsonProperty("serviceCd1Id")
   public void setServiceCd1Id(Long serviceCd1Id) {
      this.serviceCd1Id = serviceCd1Id;
   }

   @JsonProperty("serviceCd1Id")
   public Long getServiceCd1Id() {
      return this.serviceCd1Id;
   }

   @JsonProperty("salePrice")
   public void setSalePrice(Double salePrice) {
      this.salePrice = salePrice;
   }

   @JsonProperty("salePrice")
   public Double getSalePrice() {
      return this.salePrice;
   }

   @JsonProperty("indexName")
   public void setIndexName(String indexName) {
      this.indexName = indexName;
   }

   @JsonProperty("indexName")
   public String getIndexName() {
      return this.indexName;
   }

   @JsonProperty("indexId")
   public void setIndexId(String indexId) {
      this.indexId = indexId;
   }

   @JsonProperty("indexId")
   public String getIndexId() {
      return this.indexId;
   }

   @JsonProperty("purchasePrice")
   public void setPurchasePrice(Double purchasePrice) {
      this.purchasePrice = purchasePrice;
   }

   @JsonProperty("purchasePrice")
   public Double getPurchasePrice() {
      return this.purchasePrice;
   }

   @JsonProperty("techId")
   public void setTechId(Long techId) {
      this.techId = techId;
   }

   @JsonProperty("techId")
   public Long getTechId() {
      return this.techId;
   }

   @JsonProperty("required")
   public void setRequired(Boolean required) {
      this.required = required;
   }

   @JsonProperty("required")
   public Boolean getRequired() {
      return this.required;
   }
}
