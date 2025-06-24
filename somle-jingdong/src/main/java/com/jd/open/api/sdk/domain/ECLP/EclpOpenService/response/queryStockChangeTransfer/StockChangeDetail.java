package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryStockChangeTransfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class StockChangeDetail implements Serializable {
   private String ownerNo;
   private String skuNo;
   private String productLevel;
   private BigDecimal changeQty;
   private String toOwnerNo;
   private String toSkuNo;
   private String toProductLevel;
   private String isvLotattrs;
   private String toIsvLotattrs;

   @JsonProperty("ownerNo")
   public void setOwnerNo(String ownerNo) {
      this.ownerNo = ownerNo;
   }

   @JsonProperty("ownerNo")
   public String getOwnerNo() {
      return this.ownerNo;
   }

   @JsonProperty("skuNo")
   public void setSkuNo(String skuNo) {
      this.skuNo = skuNo;
   }

   @JsonProperty("skuNo")
   public String getSkuNo() {
      return this.skuNo;
   }

   @JsonProperty("productLevel")
   public void setProductLevel(String productLevel) {
      this.productLevel = productLevel;
   }

   @JsonProperty("productLevel")
   public String getProductLevel() {
      return this.productLevel;
   }

   @JsonProperty("changeQty")
   public void setChangeQty(BigDecimal changeQty) {
      this.changeQty = changeQty;
   }

   @JsonProperty("changeQty")
   public BigDecimal getChangeQty() {
      return this.changeQty;
   }

   @JsonProperty("toOwnerNo")
   public void setToOwnerNo(String toOwnerNo) {
      this.toOwnerNo = toOwnerNo;
   }

   @JsonProperty("toOwnerNo")
   public String getToOwnerNo() {
      return this.toOwnerNo;
   }

   @JsonProperty("toSkuNo")
   public void setToSkuNo(String toSkuNo) {
      this.toSkuNo = toSkuNo;
   }

   @JsonProperty("toSkuNo")
   public String getToSkuNo() {
      return this.toSkuNo;
   }

   @JsonProperty("toProductLevel")
   public void setToProductLevel(String toProductLevel) {
      this.toProductLevel = toProductLevel;
   }

   @JsonProperty("toProductLevel")
   public String getToProductLevel() {
      return this.toProductLevel;
   }

   @JsonProperty("isvLotattrs")
   public void setIsvLotattrs(String isvLotattrs) {
      this.isvLotattrs = isvLotattrs;
   }

   @JsonProperty("isvLotattrs")
   public String getIsvLotattrs() {
      return this.isvLotattrs;
   }

   @JsonProperty("toIsvLotattrs")
   public void setToIsvLotattrs(String toIsvLotattrs) {
      this.toIsvLotattrs = toIsvLotattrs;
   }

   @JsonProperty("toIsvLotattrs")
   public String getToIsvLotattrs() {
      return this.toIsvLotattrs;
   }
}
