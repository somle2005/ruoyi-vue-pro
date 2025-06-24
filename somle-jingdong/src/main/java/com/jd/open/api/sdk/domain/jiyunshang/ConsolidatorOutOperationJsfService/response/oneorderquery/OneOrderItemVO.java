package com.jd.open.api.sdk.domain.jiyunshang.ConsolidatorOutOperationJsfService.response.oneorderquery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OneOrderItemVO implements Serializable {
   private Long oneOrderId;
   private Long skuId;
   private String skuName;
   private Integer skuTotal;
   private Integer jysSkuLength;
   private Integer jysSkuWidth;
   private Integer jysSkuHeight;
   private Long actualWeight;
   private Long billingWeight;
   private Integer jysStatus;
   private Integer jysRefuseType;
   private Long skuPrice;
   private String jysRefuseReason;
   private String extStr;

   @JsonProperty("oneOrderId")
   public void setOneOrderId(Long oneOrderId) {
      this.oneOrderId = oneOrderId;
   }

   @JsonProperty("oneOrderId")
   public Long getOneOrderId() {
      return this.oneOrderId;
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

   @JsonProperty("skuTotal")
   public void setSkuTotal(Integer skuTotal) {
      this.skuTotal = skuTotal;
   }

   @JsonProperty("skuTotal")
   public Integer getSkuTotal() {
      return this.skuTotal;
   }

   @JsonProperty("jysSkuLength")
   public void setJysSkuLength(Integer jysSkuLength) {
      this.jysSkuLength = jysSkuLength;
   }

   @JsonProperty("jysSkuLength")
   public Integer getJysSkuLength() {
      return this.jysSkuLength;
   }

   @JsonProperty("jysSkuWidth")
   public void setJysSkuWidth(Integer jysSkuWidth) {
      this.jysSkuWidth = jysSkuWidth;
   }

   @JsonProperty("jysSkuWidth")
   public Integer getJysSkuWidth() {
      return this.jysSkuWidth;
   }

   @JsonProperty("jysSkuHeight")
   public void setJysSkuHeight(Integer jysSkuHeight) {
      this.jysSkuHeight = jysSkuHeight;
   }

   @JsonProperty("jysSkuHeight")
   public Integer getJysSkuHeight() {
      return this.jysSkuHeight;
   }

   @JsonProperty("actualWeight")
   public void setActualWeight(Long actualWeight) {
      this.actualWeight = actualWeight;
   }

   @JsonProperty("actualWeight")
   public Long getActualWeight() {
      return this.actualWeight;
   }

   @JsonProperty("billingWeight")
   public void setBillingWeight(Long billingWeight) {
      this.billingWeight = billingWeight;
   }

   @JsonProperty("billingWeight")
   public Long getBillingWeight() {
      return this.billingWeight;
   }

   @JsonProperty("jysStatus")
   public void setJysStatus(Integer jysStatus) {
      this.jysStatus = jysStatus;
   }

   @JsonProperty("jysStatus")
   public Integer getJysStatus() {
      return this.jysStatus;
   }

   @JsonProperty("jysRefuseType")
   public void setJysRefuseType(Integer jysRefuseType) {
      this.jysRefuseType = jysRefuseType;
   }

   @JsonProperty("jysRefuseType")
   public Integer getJysRefuseType() {
      return this.jysRefuseType;
   }

   @JsonProperty("skuPrice")
   public void setSkuPrice(Long skuPrice) {
      this.skuPrice = skuPrice;
   }

   @JsonProperty("skuPrice")
   public Long getSkuPrice() {
      return this.skuPrice;
   }

   @JsonProperty("jysRefuseReason")
   public void setJysRefuseReason(String jysRefuseReason) {
      this.jysRefuseReason = jysRefuseReason;
   }

   @JsonProperty("jysRefuseReason")
   public String getJysRefuseReason() {
      return this.jysRefuseReason;
   }

   @JsonProperty("extStr")
   public void setExtStr(String extStr) {
      this.extStr = extStr;
   }

   @JsonProperty("extStr")
   public String getExtStr() {
      return this.extStr;
   }
}
