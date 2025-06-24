package com.jd.open.api.sdk.domain.gxpt.PurchaseOrderJosService.response.page;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class PurchaseOrderSkuJosDO implements Serializable {
   private Long purchaseId;
   private Long wareId;
   private Long skuId;
   private String skuName;
   private String outerSkuId;
   private Integer skuNum;
   private BigDecimal cgPrice;

   @JsonProperty("purchaseId")
   public void setPurchaseId(Long purchaseId) {
      this.purchaseId = purchaseId;
   }

   @JsonProperty("purchaseId")
   public Long getPurchaseId() {
      return this.purchaseId;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("outerSkuId")
   public void setOuterSkuId(String outerSkuId) {
      this.outerSkuId = outerSkuId;
   }

   @JsonProperty("outerSkuId")
   public String getOuterSkuId() {
      return this.outerSkuId;
   }

   @JsonProperty("skuNum")
   public void setSkuNum(Integer skuNum) {
      this.skuNum = skuNum;
   }

   @JsonProperty("skuNum")
   public Integer getSkuNum() {
      return this.skuNum;
   }

   @JsonProperty("cgPrice")
   public void setCgPrice(BigDecimal cgPrice) {
      this.cgPrice = cgPrice;
   }

   @JsonProperty("cgPrice")
   public BigDecimal getCgPrice() {
      return this.cgPrice;
   }
}
