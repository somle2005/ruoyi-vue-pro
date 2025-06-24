package com.jd.open.api.sdk.domain.wlycangchu.StockQueryServiceHandler.response.sum;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class StockDto implements Serializable {
   private String skuNo;
   private String skuName;
   private BigDecimal qty;
   private BigDecimal canLocateQty;
   private BigDecimal allQty;
   private String ownerNo;
   private String productLevel;
   private String productLevelName;
   private String warehouseNo;
   private String tenantId;

   @JsonProperty("skuNo")
   public void setSkuNo(String skuNo) {
      this.skuNo = skuNo;
   }

   @JsonProperty("skuNo")
   public String getSkuNo() {
      return this.skuNo;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("qty")
   public void setQty(BigDecimal qty) {
      this.qty = qty;
   }

   @JsonProperty("qty")
   public BigDecimal getQty() {
      return this.qty;
   }

   @JsonProperty("canLocateQty")
   public void setCanLocateQty(BigDecimal canLocateQty) {
      this.canLocateQty = canLocateQty;
   }

   @JsonProperty("canLocateQty")
   public BigDecimal getCanLocateQty() {
      return this.canLocateQty;
   }

   @JsonProperty("allQty")
   public void setAllQty(BigDecimal allQty) {
      this.allQty = allQty;
   }

   @JsonProperty("allQty")
   public BigDecimal getAllQty() {
      return this.allQty;
   }

   @JsonProperty("ownerNo")
   public void setOwnerNo(String ownerNo) {
      this.ownerNo = ownerNo;
   }

   @JsonProperty("ownerNo")
   public String getOwnerNo() {
      return this.ownerNo;
   }

   @JsonProperty("productLevel")
   public void setProductLevel(String productLevel) {
      this.productLevel = productLevel;
   }

   @JsonProperty("productLevel")
   public String getProductLevel() {
      return this.productLevel;
   }

   @JsonProperty("productLevelName")
   public void setProductLevelName(String productLevelName) {
      this.productLevelName = productLevelName;
   }

   @JsonProperty("productLevelName")
   public String getProductLevelName() {
      return this.productLevelName;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("tenantId")
   public void setTenantId(String tenantId) {
      this.tenantId = tenantId;
   }

   @JsonProperty("tenantId")
   public String getTenantId() {
      return this.tenantId;
   }
}
