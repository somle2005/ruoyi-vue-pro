package com.jd.open.api.sdk.domain.c2mdzkfpt.CartForThirdPartyCustomService.response.getCartSuitInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SuitProductChildVo implements Serializable {
   private String mainSkuId;
   private String skuId;
   private Integer skuCount;
   private Integer suitSkuType;
   private Integer skuNumRule;
   private Integer skuNum;

   @JsonProperty("mainSkuId")
   public void setMainSkuId(String mainSkuId) {
      this.mainSkuId = mainSkuId;
   }

   @JsonProperty("mainSkuId")
   public String getMainSkuId() {
      return this.mainSkuId;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("skuCount")
   public void setSkuCount(Integer skuCount) {
      this.skuCount = skuCount;
   }

   @JsonProperty("skuCount")
   public Integer getSkuCount() {
      return this.skuCount;
   }

   @JsonProperty("suitSkuType")
   public void setSuitSkuType(Integer suitSkuType) {
      this.suitSkuType = suitSkuType;
   }

   @JsonProperty("suitSkuType")
   public Integer getSuitSkuType() {
      return this.suitSkuType;
   }

   @JsonProperty("skuNumRule")
   public void setSkuNumRule(Integer skuNumRule) {
      this.skuNumRule = skuNumRule;
   }

   @JsonProperty("skuNumRule")
   public Integer getSkuNumRule() {
      return this.skuNumRule;
   }

   @JsonProperty("skuNum")
   public void setSkuNum(Integer skuNum) {
      this.skuNum = skuNum;
   }

   @JsonProperty("skuNum")
   public Integer getSkuNum() {
      return this.skuNum;
   }
}
