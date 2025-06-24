package com.jd.open.api.sdk.domain.youE.OrderQueryJsfService.response.queryOrderEvaluate;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class EvaluateInfo implements Serializable {
   private String orderNo;
   private String saleOrderNo;
   private Date afterSalesDate;
   private String installContent;
   private String skuContent;
   private String afterSalesTags;
   private String skuName;
   private Date installDate;
   private Integer installScore;
   private String installTags;
   private Integer skuScore;
   private Integer afterSalesScore;
   private String skuId;
   private Date createDate;
   private Integer installInTimeScore;
   private Integer installPriceScore;
   private Integer evaluateType;

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

   @JsonProperty("afterSalesDate")
   public void setAfterSalesDate(Date afterSalesDate) {
      this.afterSalesDate = afterSalesDate;
   }

   @JsonProperty("afterSalesDate")
   public Date getAfterSalesDate() {
      return this.afterSalesDate;
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

   @JsonProperty("afterSalesTags")
   public void setAfterSalesTags(String afterSalesTags) {
      this.afterSalesTags = afterSalesTags;
   }

   @JsonProperty("afterSalesTags")
   public String getAfterSalesTags() {
      return this.afterSalesTags;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("installDate")
   public void setInstallDate(Date installDate) {
      this.installDate = installDate;
   }

   @JsonProperty("installDate")
   public Date getInstallDate() {
      return this.installDate;
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

   @JsonProperty("skuScore")
   public void setSkuScore(Integer skuScore) {
      this.skuScore = skuScore;
   }

   @JsonProperty("skuScore")
   public Integer getSkuScore() {
      return this.skuScore;
   }

   @JsonProperty("afterSalesScore")
   public void setAfterSalesScore(Integer afterSalesScore) {
      this.afterSalesScore = afterSalesScore;
   }

   @JsonProperty("afterSalesScore")
   public Integer getAfterSalesScore() {
      return this.afterSalesScore;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
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

   @JsonProperty("evaluateType")
   public void setEvaluateType(Integer evaluateType) {
      this.evaluateType = evaluateType;
   }

   @JsonProperty("evaluateType")
   public Integer getEvaluateType() {
      return this.evaluateType;
   }
}
