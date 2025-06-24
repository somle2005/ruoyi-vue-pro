package com.jd.open.api.sdk.domain.hudong.PresaleQueryService.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class PresaleSkuInfo implements Serializable {
   private List<PresaleApproveInfo> presaleApproveList;
   private Integer num;
   private Boolean xnzt;
   private Long vendorId;
   private BigDecimal stepTwoPrice;
   private BigDecimal plusDepositWorth;
   private Integer payType;
   private Integer yn;
   private Long stockNum;
   private String approveName;
   private Long skuId;
   private String imgRui;
   private Integer stepTwoNumber;
   private BigDecimal realTimePrice;
   private Integer stepThreeNumber;
   private BigDecimal stepThreePrice;
   private Long categoryId1;
   private Long categoryId2;
   private BigDecimal jdPrice;
   private Integer stepOneNumber;
   private String skuName;
   private BigDecimal stepOnePrice;
   private Integer synchStatus;
   private Long wareId;
   private Integer presaleStatus;
   private BigDecimal oriPrice;
   private BigDecimal earnest;
   private Long categoryId;

   @JsonProperty("presaleApproveList")
   public void setPresaleApproveList(List<PresaleApproveInfo> presaleApproveList) {
      this.presaleApproveList = presaleApproveList;
   }

   @JsonProperty("presaleApproveList")
   public List<PresaleApproveInfo> getPresaleApproveList() {
      return this.presaleApproveList;
   }

   @JsonProperty("num")
   public void setNum(Integer num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Integer getNum() {
      return this.num;
   }

   @JsonProperty("xnzt")
   public void setXnzt(Boolean xnzt) {
      this.xnzt = xnzt;
   }

   @JsonProperty("xnzt")
   public Boolean getXnzt() {
      return this.xnzt;
   }

   @JsonProperty("vendorId")
   public void setVendorId(Long vendorId) {
      this.vendorId = vendorId;
   }

   @JsonProperty("vendorId")
   public Long getVendorId() {
      return this.vendorId;
   }

   @JsonProperty("stepTwoPrice")
   public void setStepTwoPrice(BigDecimal stepTwoPrice) {
      this.stepTwoPrice = stepTwoPrice;
   }

   @JsonProperty("stepTwoPrice")
   public BigDecimal getStepTwoPrice() {
      return this.stepTwoPrice;
   }

   @JsonProperty("plusDepositWorth")
   public void setPlusDepositWorth(BigDecimal plusDepositWorth) {
      this.plusDepositWorth = plusDepositWorth;
   }

   @JsonProperty("plusDepositWorth")
   public BigDecimal getPlusDepositWorth() {
      return this.plusDepositWorth;
   }

   @JsonProperty("payType")
   public void setPayType(Integer payType) {
      this.payType = payType;
   }

   @JsonProperty("payType")
   public Integer getPayType() {
      return this.payType;
   }

   @JsonProperty("yn")
   public void setYn(Integer yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public Integer getYn() {
      return this.yn;
   }

   @JsonProperty("stockNum")
   public void setStockNum(Long stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Long getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("approveName")
   public void setApproveName(String approveName) {
      this.approveName = approveName;
   }

   @JsonProperty("approveName")
   public String getApproveName() {
      return this.approveName;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("imgRui")
   public void setImgRui(String imgRui) {
      this.imgRui = imgRui;
   }

   @JsonProperty("imgRui")
   public String getImgRui() {
      return this.imgRui;
   }

   @JsonProperty("stepTwoNumber")
   public void setStepTwoNumber(Integer stepTwoNumber) {
      this.stepTwoNumber = stepTwoNumber;
   }

   @JsonProperty("stepTwoNumber")
   public Integer getStepTwoNumber() {
      return this.stepTwoNumber;
   }

   @JsonProperty("realTimePrice")
   public void setRealTimePrice(BigDecimal realTimePrice) {
      this.realTimePrice = realTimePrice;
   }

   @JsonProperty("realTimePrice")
   public BigDecimal getRealTimePrice() {
      return this.realTimePrice;
   }

   @JsonProperty("stepThreeNumber")
   public void setStepThreeNumber(Integer stepThreeNumber) {
      this.stepThreeNumber = stepThreeNumber;
   }

   @JsonProperty("stepThreeNumber")
   public Integer getStepThreeNumber() {
      return this.stepThreeNumber;
   }

   @JsonProperty("stepThreePrice")
   public void setStepThreePrice(BigDecimal stepThreePrice) {
      this.stepThreePrice = stepThreePrice;
   }

   @JsonProperty("stepThreePrice")
   public BigDecimal getStepThreePrice() {
      return this.stepThreePrice;
   }

   @JsonProperty("categoryId1")
   public void setCategoryId1(Long categoryId1) {
      this.categoryId1 = categoryId1;
   }

   @JsonProperty("categoryId1")
   public Long getCategoryId1() {
      return this.categoryId1;
   }

   @JsonProperty("categoryId2")
   public void setCategoryId2(Long categoryId2) {
      this.categoryId2 = categoryId2;
   }

   @JsonProperty("categoryId2")
   public Long getCategoryId2() {
      return this.categoryId2;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("stepOneNumber")
   public void setStepOneNumber(Integer stepOneNumber) {
      this.stepOneNumber = stepOneNumber;
   }

   @JsonProperty("stepOneNumber")
   public Integer getStepOneNumber() {
      return this.stepOneNumber;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("stepOnePrice")
   public void setStepOnePrice(BigDecimal stepOnePrice) {
      this.stepOnePrice = stepOnePrice;
   }

   @JsonProperty("stepOnePrice")
   public BigDecimal getStepOnePrice() {
      return this.stepOnePrice;
   }

   @JsonProperty("synchStatus")
   public void setSynchStatus(Integer synchStatus) {
      this.synchStatus = synchStatus;
   }

   @JsonProperty("synchStatus")
   public Integer getSynchStatus() {
      return this.synchStatus;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("presaleStatus")
   public void setPresaleStatus(Integer presaleStatus) {
      this.presaleStatus = presaleStatus;
   }

   @JsonProperty("presaleStatus")
   public Integer getPresaleStatus() {
      return this.presaleStatus;
   }

   @JsonProperty("oriPrice")
   public void setOriPrice(BigDecimal oriPrice) {
      this.oriPrice = oriPrice;
   }

   @JsonProperty("oriPrice")
   public BigDecimal getOriPrice() {
      return this.oriPrice;
   }

   @JsonProperty("earnest")
   public void setEarnest(BigDecimal earnest) {
      this.earnest = earnest;
   }

   @JsonProperty("earnest")
   public BigDecimal getEarnest() {
      return this.earnest;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }
}
