package com.jd.open.api.sdk.domain.B2B.NsspSubmitProvider.request.batchUpsert;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class UpsertNsspSkuReq implements Serializable {
   private String[] weightUuid;
   private Integer[] actionType;
   private Integer[] orignalNum;
   private String[] skuUuid;
   private String[] nsspUnit;
   private Integer[] actualNum;
   private Long[] skuId;
   private Integer[] skuNum;
   private BigDecimal[] price;

   @JsonProperty("weightUuid")
   public void setWeightUuid(String[] weightUuid) {
      this.weightUuid = weightUuid;
   }

   @JsonProperty("weightUuid")
   public String[] getWeightUuid() {
      return this.weightUuid;
   }

   @JsonProperty("actionType")
   public void setActionType(Integer[] actionType) {
      this.actionType = actionType;
   }

   @JsonProperty("actionType")
   public Integer[] getActionType() {
      return this.actionType;
   }

   @JsonProperty("orignalNum")
   public void setOrignalNum(Integer[] orignalNum) {
      this.orignalNum = orignalNum;
   }

   @JsonProperty("orignalNum")
   public Integer[] getOrignalNum() {
      return this.orignalNum;
   }

   @JsonProperty("skuUuid")
   public void setSkuUuid(String[] skuUuid) {
      this.skuUuid = skuUuid;
   }

   @JsonProperty("skuUuid")
   public String[] getSkuUuid() {
      return this.skuUuid;
   }

   @JsonProperty("nsspUnit")
   public void setNsspUnit(String[] nsspUnit) {
      this.nsspUnit = nsspUnit;
   }

   @JsonProperty("nsspUnit")
   public String[] getNsspUnit() {
      return this.nsspUnit;
   }

   @JsonProperty("actualNum")
   public void setActualNum(Integer[] actualNum) {
      this.actualNum = actualNum;
   }

   @JsonProperty("actualNum")
   public Integer[] getActualNum() {
      return this.actualNum;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long[] skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long[] getSkuId() {
      return this.skuId;
   }

   @JsonProperty("skuNum")
   public void setSkuNum(Integer[] skuNum) {
      this.skuNum = skuNum;
   }

   @JsonProperty("skuNum")
   public Integer[] getSkuNum() {
      return this.skuNum;
   }

   @JsonProperty("price")
   public void setPrice(BigDecimal[] price) {
      this.price = price;
   }

   @JsonProperty("price")
   public BigDecimal[] getPrice() {
      return this.price;
   }
}
