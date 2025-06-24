package com.jd.open.api.sdk.domain.jialilue.IOpenOrderService.response.syncOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class SkuInfo implements Serializable {
   private BigDecimal realBuyAmount;
   private BigDecimal realSkuPrice;
   private Integer saleMode;
   private BigDecimal weight;
   private String uuid;
   private String skuId;
   private String weightUnit;
   private String packSkuUuid;

   @JsonProperty("realBuyAmount")
   public void setRealBuyAmount(BigDecimal realBuyAmount) {
      this.realBuyAmount = realBuyAmount;
   }

   @JsonProperty("realBuyAmount")
   public BigDecimal getRealBuyAmount() {
      return this.realBuyAmount;
   }

   @JsonProperty("realSkuPrice")
   public void setRealSkuPrice(BigDecimal realSkuPrice) {
      this.realSkuPrice = realSkuPrice;
   }

   @JsonProperty("realSkuPrice")
   public BigDecimal getRealSkuPrice() {
      return this.realSkuPrice;
   }

   @JsonProperty("saleMode")
   public void setSaleMode(Integer saleMode) {
      this.saleMode = saleMode;
   }

   @JsonProperty("saleMode")
   public Integer getSaleMode() {
      return this.saleMode;
   }

   @JsonProperty("weight")
   public void setWeight(BigDecimal weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public BigDecimal getWeight() {
      return this.weight;
   }

   @JsonProperty("uuid")
   public void setUuid(String uuid) {
      this.uuid = uuid;
   }

   @JsonProperty("uuid")
   public String getUuid() {
      return this.uuid;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("weightUnit")
   public void setWeightUnit(String weightUnit) {
      this.weightUnit = weightUnit;
   }

   @JsonProperty("weightUnit")
   public String getWeightUnit() {
      return this.weightUnit;
   }

   @JsonProperty("packSkuUuid")
   public void setPackSkuUuid(String packSkuUuid) {
      this.packSkuUuid = packSkuUuid;
   }

   @JsonProperty("packSkuUuid")
   public String getPackSkuUuid() {
      return this.packSkuUuid;
   }
}
