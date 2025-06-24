package com.jd.open.api.sdk.domain.EPT.WareSkuApiClient.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class WareSku implements Serializable {
   private Long[] skuId;
   private Long[] wareId;
   private String[] status;
   private String[] attributes;
   private Double[] supplyPrice;
   private Integer[] stock;
   private String[] imgUri;
   private String[] hsCode;
   private Integer[] amountCount;
   private Integer[] lockCount;
   private Date[] lockStartTime;
   private Date[] lockEndTime;
   private Integer[] saleStockAmount;

   @JsonProperty("skuId")
   public void setSkuId(Long[] skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long[] getSkuId() {
      return this.skuId;
   }

   @JsonProperty("wareId")
   public void setWareId(Long[] wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long[] getWareId() {
      return this.wareId;
   }

   @JsonProperty("status")
   public void setStatus(String[] status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String[] getStatus() {
      return this.status;
   }

   @JsonProperty("attributes")
   public void setAttributes(String[] attributes) {
      this.attributes = attributes;
   }

   @JsonProperty("attributes")
   public String[] getAttributes() {
      return this.attributes;
   }

   @JsonProperty("supplyPrice")
   public void setSupplyPrice(Double[] supplyPrice) {
      this.supplyPrice = supplyPrice;
   }

   @JsonProperty("supplyPrice")
   public Double[] getSupplyPrice() {
      return this.supplyPrice;
   }

   @JsonProperty("stock")
   public void setStock(Integer[] stock) {
      this.stock = stock;
   }

   @JsonProperty("stock")
   public Integer[] getStock() {
      return this.stock;
   }

   @JsonProperty("imgUri")
   public void setImgUri(String[] imgUri) {
      this.imgUri = imgUri;
   }

   @JsonProperty("imgUri")
   public String[] getImgUri() {
      return this.imgUri;
   }

   @JsonProperty("hsCode")
   public void setHsCode(String[] hsCode) {
      this.hsCode = hsCode;
   }

   @JsonProperty("hsCode")
   public String[] getHsCode() {
      return this.hsCode;
   }

   @JsonProperty("amountCount")
   public void setAmountCount(Integer[] amountCount) {
      this.amountCount = amountCount;
   }

   @JsonProperty("amountCount")
   public Integer[] getAmountCount() {
      return this.amountCount;
   }

   @JsonProperty("lockCount")
   public void setLockCount(Integer[] lockCount) {
      this.lockCount = lockCount;
   }

   @JsonProperty("lockCount")
   public Integer[] getLockCount() {
      return this.lockCount;
   }

   @JsonProperty("lockStartTime")
   public void setLockStartTime(Date[] lockStartTime) {
      this.lockStartTime = lockStartTime;
   }

   @JsonProperty("lockStartTime")
   public Date[] getLockStartTime() {
      return this.lockStartTime;
   }

   @JsonProperty("lockEndTime")
   public void setLockEndTime(Date[] lockEndTime) {
      this.lockEndTime = lockEndTime;
   }

   @JsonProperty("lockEndTime")
   public Date[] getLockEndTime() {
      return this.lockEndTime;
   }

   @JsonProperty("saleStockAmount")
   public void setSaleStockAmount(Integer[] saleStockAmount) {
      this.saleStockAmount = saleStockAmount;
   }

   @JsonProperty("saleStockAmount")
   public Integer[] getSaleStockAmount() {
      return this.saleStockAmount;
   }
}
