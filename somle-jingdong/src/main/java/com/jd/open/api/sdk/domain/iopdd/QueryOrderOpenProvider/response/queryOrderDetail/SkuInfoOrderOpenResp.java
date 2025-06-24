package com.jd.open.api.sdk.domain.iopdd.QueryOrderOpenProvider.response.queryOrderDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class SkuInfoOrderOpenResp implements Serializable {
   private String skuName;
   private long skuCategoryThird;
   private BigDecimal skuPrice;
   private BigDecimal skuSplitFreight;
   private BigDecimal skuTaxRate;
   private BigDecimal skuNakedPrice;
   private BigDecimal skuTaxPrice;
   private long skuId;
   private int skuNum;

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("skuCategoryThird")
   public void setSkuCategoryThird(long skuCategoryThird) {
      this.skuCategoryThird = skuCategoryThird;
   }

   @JsonProperty("skuCategoryThird")
   public long getSkuCategoryThird() {
      return this.skuCategoryThird;
   }

   @JsonProperty("skuPrice")
   public void setSkuPrice(BigDecimal skuPrice) {
      this.skuPrice = skuPrice;
   }

   @JsonProperty("skuPrice")
   public BigDecimal getSkuPrice() {
      return this.skuPrice;
   }

   @JsonProperty("skuSplitFreight")
   public void setSkuSplitFreight(BigDecimal skuSplitFreight) {
      this.skuSplitFreight = skuSplitFreight;
   }

   @JsonProperty("skuSplitFreight")
   public BigDecimal getSkuSplitFreight() {
      return this.skuSplitFreight;
   }

   @JsonProperty("skuTaxRate")
   public void setSkuTaxRate(BigDecimal skuTaxRate) {
      this.skuTaxRate = skuTaxRate;
   }

   @JsonProperty("skuTaxRate")
   public BigDecimal getSkuTaxRate() {
      return this.skuTaxRate;
   }

   @JsonProperty("skuNakedPrice")
   public void setSkuNakedPrice(BigDecimal skuNakedPrice) {
      this.skuNakedPrice = skuNakedPrice;
   }

   @JsonProperty("skuNakedPrice")
   public BigDecimal getSkuNakedPrice() {
      return this.skuNakedPrice;
   }

   @JsonProperty("skuTaxPrice")
   public void setSkuTaxPrice(BigDecimal skuTaxPrice) {
      this.skuTaxPrice = skuTaxPrice;
   }

   @JsonProperty("skuTaxPrice")
   public BigDecimal getSkuTaxPrice() {
      return this.skuTaxPrice;
   }

   @JsonProperty("skuId")
   public void setSkuId(long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("skuNum")
   public void setSkuNum(int skuNum) {
      this.skuNum = skuNum;
   }

   @JsonProperty("skuNum")
   public int getSkuNum() {
      return this.skuNum;
   }
}
