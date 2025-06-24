package com.jd.open.api.sdk.domain.B2B.NsspSubmitProvider.request.batchSubmit;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class NSSkuReq implements Serializable {
   private Integer[] orignalNum;
   private String[] skuUuid;
   private BigDecimal[] price;
   private String[] nsspUnit;
   private Integer[] actualNum;
   private Long[] skuId;
   private Integer[] skuNum;

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

   @JsonProperty("price")
   public void setPrice(BigDecimal[] price) {
      this.price = price;
   }

   @JsonProperty("price")
   public BigDecimal[] getPrice() {
      return this.price;
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
}
