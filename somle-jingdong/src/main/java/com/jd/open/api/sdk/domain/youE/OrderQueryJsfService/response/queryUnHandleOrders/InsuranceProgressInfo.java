package com.jd.open.api.sdk.domain.youE.OrderQueryJsfService.response.queryUnHandleOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class InsuranceProgressInfo implements Serializable {
   private String productSn;
   private Integer insuranceType;
   private Date mainOrderFinishDate;
   private Date mainOrderDate;
   private Date exchangeDate;
   private Date serviceOrderFinishDate;
   private Date returnsDate;
   private Integer mainQty;
   private String extOrderNo;
   private Date extMainOrderFinishTime;
   private String extMainOrderId;
   private String extMainSn;
   private Date currentBeginDate;
   private Date currentEndDate;
   private Date extensionBeginDate;
   private Date extensionEndDate;
   private String userMobile;
   private Date serviceOrderBuyDate;
   private Integer currentNum;
   private Integer stageType;
   private Integer totalNum;
   private Integer extInsuranceMode;
   private Integer skuFlag;
   private BigDecimal mainSkuJdPrice;
   private String mainSkuPromotionPrice;

   @JsonProperty("productSn")
   public void setProductSn(String productSn) {
      this.productSn = productSn;
   }

   @JsonProperty("productSn")
   public String getProductSn() {
      return this.productSn;
   }

   @JsonProperty("insuranceType")
   public void setInsuranceType(Integer insuranceType) {
      this.insuranceType = insuranceType;
   }

   @JsonProperty("insuranceType")
   public Integer getInsuranceType() {
      return this.insuranceType;
   }

   @JsonProperty("mainOrderFinishDate")
   public void setMainOrderFinishDate(Date mainOrderFinishDate) {
      this.mainOrderFinishDate = mainOrderFinishDate;
   }

   @JsonProperty("mainOrderFinishDate")
   public Date getMainOrderFinishDate() {
      return this.mainOrderFinishDate;
   }

   @JsonProperty("mainOrderDate")
   public void setMainOrderDate(Date mainOrderDate) {
      this.mainOrderDate = mainOrderDate;
   }

   @JsonProperty("mainOrderDate")
   public Date getMainOrderDate() {
      return this.mainOrderDate;
   }

   @JsonProperty("exchangeDate")
   public void setExchangeDate(Date exchangeDate) {
      this.exchangeDate = exchangeDate;
   }

   @JsonProperty("exchangeDate")
   public Date getExchangeDate() {
      return this.exchangeDate;
   }

   @JsonProperty("serviceOrderFinishDate")
   public void setServiceOrderFinishDate(Date serviceOrderFinishDate) {
      this.serviceOrderFinishDate = serviceOrderFinishDate;
   }

   @JsonProperty("serviceOrderFinishDate")
   public Date getServiceOrderFinishDate() {
      return this.serviceOrderFinishDate;
   }

   @JsonProperty("returnsDate")
   public void setReturnsDate(Date returnsDate) {
      this.returnsDate = returnsDate;
   }

   @JsonProperty("returnsDate")
   public Date getReturnsDate() {
      return this.returnsDate;
   }

   @JsonProperty("mainQty")
   public void setMainQty(Integer mainQty) {
      this.mainQty = mainQty;
   }

   @JsonProperty("mainQty")
   public Integer getMainQty() {
      return this.mainQty;
   }

   @JsonProperty("extOrderNo")
   public void setExtOrderNo(String extOrderNo) {
      this.extOrderNo = extOrderNo;
   }

   @JsonProperty("extOrderNo")
   public String getExtOrderNo() {
      return this.extOrderNo;
   }

   @JsonProperty("extMainOrderFinishTime")
   public void setExtMainOrderFinishTime(Date extMainOrderFinishTime) {
      this.extMainOrderFinishTime = extMainOrderFinishTime;
   }

   @JsonProperty("extMainOrderFinishTime")
   public Date getExtMainOrderFinishTime() {
      return this.extMainOrderFinishTime;
   }

   @JsonProperty("extMainOrderId")
   public void setExtMainOrderId(String extMainOrderId) {
      this.extMainOrderId = extMainOrderId;
   }

   @JsonProperty("extMainOrderId")
   public String getExtMainOrderId() {
      return this.extMainOrderId;
   }

   @JsonProperty("extMainSn")
   public void setExtMainSn(String extMainSn) {
      this.extMainSn = extMainSn;
   }

   @JsonProperty("extMainSn")
   public String getExtMainSn() {
      return this.extMainSn;
   }

   @JsonProperty("currentBeginDate")
   public void setCurrentBeginDate(Date currentBeginDate) {
      this.currentBeginDate = currentBeginDate;
   }

   @JsonProperty("currentBeginDate")
   public Date getCurrentBeginDate() {
      return this.currentBeginDate;
   }

   @JsonProperty("currentEndDate")
   public void setCurrentEndDate(Date currentEndDate) {
      this.currentEndDate = currentEndDate;
   }

   @JsonProperty("currentEndDate")
   public Date getCurrentEndDate() {
      return this.currentEndDate;
   }

   @JsonProperty("extensionBeginDate")
   public void setExtensionBeginDate(Date extensionBeginDate) {
      this.extensionBeginDate = extensionBeginDate;
   }

   @JsonProperty("extensionBeginDate")
   public Date getExtensionBeginDate() {
      return this.extensionBeginDate;
   }

   @JsonProperty("extensionEndDate")
   public void setExtensionEndDate(Date extensionEndDate) {
      this.extensionEndDate = extensionEndDate;
   }

   @JsonProperty("extensionEndDate")
   public Date getExtensionEndDate() {
      return this.extensionEndDate;
   }

   @JsonProperty("userMobile")
   public void setUserMobile(String userMobile) {
      this.userMobile = userMobile;
   }

   @JsonProperty("userMobile")
   public String getUserMobile() {
      return this.userMobile;
   }

   @JsonProperty("serviceOrderBuyDate")
   public void setServiceOrderBuyDate(Date serviceOrderBuyDate) {
      this.serviceOrderBuyDate = serviceOrderBuyDate;
   }

   @JsonProperty("serviceOrderBuyDate")
   public Date getServiceOrderBuyDate() {
      return this.serviceOrderBuyDate;
   }

   @JsonProperty("currentNum")
   public void setCurrentNum(Integer currentNum) {
      this.currentNum = currentNum;
   }

   @JsonProperty("currentNum")
   public Integer getCurrentNum() {
      return this.currentNum;
   }

   @JsonProperty("stageType")
   public void setStageType(Integer stageType) {
      this.stageType = stageType;
   }

   @JsonProperty("stageType")
   public Integer getStageType() {
      return this.stageType;
   }

   @JsonProperty("totalNum")
   public void setTotalNum(Integer totalNum) {
      this.totalNum = totalNum;
   }

   @JsonProperty("totalNum")
   public Integer getTotalNum() {
      return this.totalNum;
   }

   @JsonProperty("extInsuranceMode")
   public void setExtInsuranceMode(Integer extInsuranceMode) {
      this.extInsuranceMode = extInsuranceMode;
   }

   @JsonProperty("extInsuranceMode")
   public Integer getExtInsuranceMode() {
      return this.extInsuranceMode;
   }

   @JsonProperty("skuFlag")
   public void setSkuFlag(Integer skuFlag) {
      this.skuFlag = skuFlag;
   }

   @JsonProperty("skuFlag")
   public Integer getSkuFlag() {
      return this.skuFlag;
   }

   @JsonProperty("mainSkuJdPrice")
   public void setMainSkuJdPrice(BigDecimal mainSkuJdPrice) {
      this.mainSkuJdPrice = mainSkuJdPrice;
   }

   @JsonProperty("mainSkuJdPrice")
   public BigDecimal getMainSkuJdPrice() {
      return this.mainSkuJdPrice;
   }

   @JsonProperty("mainSkuPromotionPrice")
   public void setMainSkuPromotionPrice(String mainSkuPromotionPrice) {
      this.mainSkuPromotionPrice = mainSkuPromotionPrice;
   }

   @JsonProperty("mainSkuPromotionPrice")
   public String getMainSkuPromotionPrice() {
      return this.mainSkuPromotionPrice;
   }
}
