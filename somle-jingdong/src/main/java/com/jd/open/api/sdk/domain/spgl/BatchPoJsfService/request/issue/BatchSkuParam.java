package com.jd.open.api.sdk.domain.spgl.BatchPoJsfService.request.issue;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BatchSkuParam implements Serializable {
   private String skuName;
   private String expiryDate;
   private Integer isShelfLifeManaged;
   private String batchNo;
   private String productionDate;
   private Integer bookQty;
   private String skuCode;

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("expiryDate")
   public void setExpiryDate(String expiryDate) {
      this.expiryDate = expiryDate;
   }

   @JsonProperty("expiryDate")
   public String getExpiryDate() {
      return this.expiryDate;
   }

   @JsonProperty("isShelfLifeManaged")
   public void setIsShelfLifeManaged(Integer isShelfLifeManaged) {
      this.isShelfLifeManaged = isShelfLifeManaged;
   }

   @JsonProperty("isShelfLifeManaged")
   public Integer getIsShelfLifeManaged() {
      return this.isShelfLifeManaged;
   }

   @JsonProperty("batchNo")
   public void setBatchNo(String batchNo) {
      this.batchNo = batchNo;
   }

   @JsonProperty("batchNo")
   public String getBatchNo() {
      return this.batchNo;
   }

   @JsonProperty("productionDate")
   public void setProductionDate(String productionDate) {
      this.productionDate = productionDate;
   }

   @JsonProperty("productionDate")
   public String getProductionDate() {
      return this.productionDate;
   }

   @JsonProperty("bookQty")
   public void setBookQty(Integer bookQty) {
      this.bookQty = bookQty;
   }

   @JsonProperty("bookQty")
   public Integer getBookQty() {
      return this.bookQty;
   }

   @JsonProperty("skuCode")
   public void setSkuCode(String skuCode) {
      this.skuCode = skuCode;
   }

   @JsonProperty("skuCode")
   public String getSkuCode() {
      return this.skuCode;
   }
}
