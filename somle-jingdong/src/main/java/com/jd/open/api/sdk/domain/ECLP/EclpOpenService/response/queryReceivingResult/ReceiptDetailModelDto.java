package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryReceivingResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class ReceiptDetailModelDto implements Serializable {
   private String receivingNo;
   private String skuNo;
   private String skuName;
   private BigDecimal receivedQty;
   private String lotNo;
   private String productLevel;
   private String isvLotattrs;

   @JsonProperty("receivingNo")
   public void setReceivingNo(String receivingNo) {
      this.receivingNo = receivingNo;
   }

   @JsonProperty("receivingNo")
   public String getReceivingNo() {
      return this.receivingNo;
   }

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

   @JsonProperty("receivedQty")
   public void setReceivedQty(BigDecimal receivedQty) {
      this.receivedQty = receivedQty;
   }

   @JsonProperty("receivedQty")
   public BigDecimal getReceivedQty() {
      return this.receivedQty;
   }

   @JsonProperty("lotNo")
   public void setLotNo(String lotNo) {
      this.lotNo = lotNo;
   }

   @JsonProperty("lotNo")
   public String getLotNo() {
      return this.lotNo;
   }

   @JsonProperty("productLevel")
   public void setProductLevel(String productLevel) {
      this.productLevel = productLevel;
   }

   @JsonProperty("productLevel")
   public String getProductLevel() {
      return this.productLevel;
   }

   @JsonProperty("isvLotattrs")
   public void setIsvLotattrs(String isvLotattrs) {
      this.isvLotattrs = isvLotattrs;
   }

   @JsonProperty("isvLotattrs")
   public String getIsvLotattrs() {
      return this.isvLotattrs;
   }
}
