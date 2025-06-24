package com.jd.open.api.sdk.domain.youE.EvaluateService.response.evaluate;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class Evaluate implements Serializable {
   private String orderNo;
   private String saleOrderNo;
   private String installContent;
   private String skuContent;
   private String skuName;
   private Integer installScore;
   private String installTags;
   private String sku;
   private Integer skuScore;
   private Date createDate;
   private Date installDate;
   private Date shDate;
   private Integer shScore;
   private String shTags;
   private Integer installInTimeScore;
   private Integer installPriceScore;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("saleOrderNo")
   public void setSaleOrderNo(String saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   @JsonProperty("saleOrderNo")
   public String getSaleOrderNo() {
      return this.saleOrderNo;
   }

   @JsonProperty("installContent")
   public void setInstallContent(String installContent) {
      this.installContent = installContent;
   }

   @JsonProperty("installContent")
   public String getInstallContent() {
      return this.installContent;
   }

   @JsonProperty("skuContent")
   public void setSkuContent(String skuContent) {
      this.skuContent = skuContent;
   }

   @JsonProperty("skuContent")
   public String getSkuContent() {
      return this.skuContent;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("installScore")
   public void setInstallScore(Integer installScore) {
      this.installScore = installScore;
   }

   @JsonProperty("installScore")
   public Integer getInstallScore() {
      return this.installScore;
   }

   @JsonProperty("installTags")
   public void setInstallTags(String installTags) {
      this.installTags = installTags;
   }

   @JsonProperty("installTags")
   public String getInstallTags() {
      return this.installTags;
   }

   @JsonProperty("sku")
   public void setSku(String sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public String getSku() {
      return this.sku;
   }

   @JsonProperty("skuScore")
   public void setSkuScore(Integer skuScore) {
      this.skuScore = skuScore;
   }

   @JsonProperty("skuScore")
   public Integer getSkuScore() {
      return this.skuScore;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("installDate")
   public void setInstallDate(Date installDate) {
      this.installDate = installDate;
   }

   @JsonProperty("installDate")
   public Date getInstallDate() {
      return this.installDate;
   }

   @JsonProperty("shDate")
   public void setShDate(Date shDate) {
      this.shDate = shDate;
   }

   @JsonProperty("shDate")
   public Date getShDate() {
      return this.shDate;
   }

   @JsonProperty("shScore")
   public void setShScore(Integer shScore) {
      this.shScore = shScore;
   }

   @JsonProperty("shScore")
   public Integer getShScore() {
      return this.shScore;
   }

   @JsonProperty("shTags")
   public void setShTags(String shTags) {
      this.shTags = shTags;
   }

   @JsonProperty("shTags")
   public String getShTags() {
      return this.shTags;
   }

   @JsonProperty("installInTimeScore")
   public void setInstallInTimeScore(Integer installInTimeScore) {
      this.installInTimeScore = installInTimeScore;
   }

   @JsonProperty("installInTimeScore")
   public Integer getInstallInTimeScore() {
      return this.installInTimeScore;
   }

   @JsonProperty("installPriceScore")
   public void setInstallPriceScore(Integer installPriceScore) {
      this.installPriceScore = installPriceScore;
   }

   @JsonProperty("installPriceScore")
   public Integer getInstallPriceScore() {
      return this.installPriceScore;
   }
}
