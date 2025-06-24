package com.jd.open.api.sdk.domain.platform.JosDraftReadService.response.getDraftInfoByVersion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class JosHouseSku implements Serializable {
   private String skuName;
   private List<String> skuIcons;
   private Integer skuLayout;
   private String skuProfit;
   private Integer skuGetRate;
   private BigDecimal skuAreaReal;
   private BigDecimal skuTotalAmt;
   private Short skuStatus;
   private BigDecimal skuAreaBuild;
   private BigDecimal skuDeveloperPay;

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("skuIcons")
   public void setSkuIcons(List<String> skuIcons) {
      this.skuIcons = skuIcons;
   }

   @JsonProperty("skuIcons")
   public List<String> getSkuIcons() {
      return this.skuIcons;
   }

   @JsonProperty("skuLayout")
   public void setSkuLayout(Integer skuLayout) {
      this.skuLayout = skuLayout;
   }

   @JsonProperty("skuLayout")
   public Integer getSkuLayout() {
      return this.skuLayout;
   }

   @JsonProperty("skuProfit")
   public void setSkuProfit(String skuProfit) {
      this.skuProfit = skuProfit;
   }

   @JsonProperty("skuProfit")
   public String getSkuProfit() {
      return this.skuProfit;
   }

   @JsonProperty("skuGetRate")
   public void setSkuGetRate(Integer skuGetRate) {
      this.skuGetRate = skuGetRate;
   }

   @JsonProperty("skuGetRate")
   public Integer getSkuGetRate() {
      return this.skuGetRate;
   }

   @JsonProperty("skuAreaReal")
   public void setSkuAreaReal(BigDecimal skuAreaReal) {
      this.skuAreaReal = skuAreaReal;
   }

   @JsonProperty("skuAreaReal")
   public BigDecimal getSkuAreaReal() {
      return this.skuAreaReal;
   }

   @JsonProperty("skuTotalAmt")
   public void setSkuTotalAmt(BigDecimal skuTotalAmt) {
      this.skuTotalAmt = skuTotalAmt;
   }

   @JsonProperty("skuTotalAmt")
   public BigDecimal getSkuTotalAmt() {
      return this.skuTotalAmt;
   }

   @JsonProperty("skuStatus")
   public void setSkuStatus(Short skuStatus) {
      this.skuStatus = skuStatus;
   }

   @JsonProperty("skuStatus")
   public Short getSkuStatus() {
      return this.skuStatus;
   }

   @JsonProperty("skuAreaBuild")
   public void setSkuAreaBuild(BigDecimal skuAreaBuild) {
      this.skuAreaBuild = skuAreaBuild;
   }

   @JsonProperty("skuAreaBuild")
   public BigDecimal getSkuAreaBuild() {
      return this.skuAreaBuild;
   }

   @JsonProperty("skuDeveloperPay")
   public void setSkuDeveloperPay(BigDecimal skuDeveloperPay) {
      this.skuDeveloperPay = skuDeveloperPay;
   }

   @JsonProperty("skuDeveloperPay")
   public BigDecimal getSkuDeveloperPay() {
      return this.skuDeveloperPay;
   }
}
