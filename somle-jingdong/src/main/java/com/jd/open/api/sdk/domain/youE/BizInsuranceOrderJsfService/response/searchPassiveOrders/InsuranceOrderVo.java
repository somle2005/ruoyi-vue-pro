package com.jd.open.api.sdk.domain.youE.BizInsuranceOrderJsfService.response.searchPassiveOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class InsuranceOrderVo implements Serializable {
   private Date exchangeDate;
   private String serviceSkuName;
   private Date buyDate;
   private String itemCode;
   private String orderParentId;
   private Date deliverArriveDate;
   private Integer insuranceType;
   private String mainBrandName;
   private String itemName;
   private String extOrderNo;
   private Date extMainFinishTime;
   private Date currentEndDate;
   private Date currentBeginDate;
   private Integer currentNum;
   private String salesOrderNo;
   private Date createDate;
   private String category2;
   private String category3;
   private String orderNo;
   private String productSn;
   private Integer stageType;
   private String serviceSkuCode;
   private String category1;
   private Date mainOrderDate;
   private Integer categoryId1;
   private Date extensionEndDate;
   private Integer categoryId2;
   private Integer categoryId3;
   private Integer mainQty;
   private String extMainOrderNo;
   private Date extensionBeginDate;
   private Integer totalNum;
   private Date mainOrderFinishDate;
   private String extMainSn;
   private String mainOrderNo;
   private Date returnsDate;
   private String mainBrandId;
   private Integer extinsuranceMode;

   @JsonProperty("exchangeDate")
   public void setExchangeDate(Date exchangeDate) {
      this.exchangeDate = exchangeDate;
   }

   @JsonProperty("exchangeDate")
   public Date getExchangeDate() {
      return this.exchangeDate;
   }

   @JsonProperty("serviceSkuName")
   public void setServiceSkuName(String serviceSkuName) {
      this.serviceSkuName = serviceSkuName;
   }

   @JsonProperty("serviceSkuName")
   public String getServiceSkuName() {
      return this.serviceSkuName;
   }

   @JsonProperty("buyDate")
   public void setBuyDate(Date buyDate) {
      this.buyDate = buyDate;
   }

   @JsonProperty("buyDate")
   public Date getBuyDate() {
      return this.buyDate;
   }

   @JsonProperty("itemCode")
   public void setItemCode(String itemCode) {
      this.itemCode = itemCode;
   }

   @JsonProperty("itemCode")
   public String getItemCode() {
      return this.itemCode;
   }

   @JsonProperty("orderParentId")
   public void setOrderParentId(String orderParentId) {
      this.orderParentId = orderParentId;
   }

   @JsonProperty("orderParentId")
   public String getOrderParentId() {
      return this.orderParentId;
   }

   @JsonProperty("deliverArriveDate")
   public void setDeliverArriveDate(Date deliverArriveDate) {
      this.deliverArriveDate = deliverArriveDate;
   }

   @JsonProperty("deliverArriveDate")
   public Date getDeliverArriveDate() {
      return this.deliverArriveDate;
   }

   @JsonProperty("insuranceType")
   public void setInsuranceType(Integer insuranceType) {
      this.insuranceType = insuranceType;
   }

   @JsonProperty("insuranceType")
   public Integer getInsuranceType() {
      return this.insuranceType;
   }

   @JsonProperty("mainBrandName")
   public void setMainBrandName(String mainBrandName) {
      this.mainBrandName = mainBrandName;
   }

   @JsonProperty("mainBrandName")
   public String getMainBrandName() {
      return this.mainBrandName;
   }

   @JsonProperty("itemName")
   public void setItemName(String itemName) {
      this.itemName = itemName;
   }

   @JsonProperty("itemName")
   public String getItemName() {
      return this.itemName;
   }

   @JsonProperty("extOrderNo")
   public void setExtOrderNo(String extOrderNo) {
      this.extOrderNo = extOrderNo;
   }

   @JsonProperty("extOrderNo")
   public String getExtOrderNo() {
      return this.extOrderNo;
   }

   @JsonProperty("extMainFinishTime")
   public void setExtMainFinishTime(Date extMainFinishTime) {
      this.extMainFinishTime = extMainFinishTime;
   }

   @JsonProperty("extMainFinishTime")
   public Date getExtMainFinishTime() {
      return this.extMainFinishTime;
   }

   @JsonProperty("currentEndDate")
   public void setCurrentEndDate(Date currentEndDate) {
      this.currentEndDate = currentEndDate;
   }

   @JsonProperty("currentEndDate")
   public Date getCurrentEndDate() {
      return this.currentEndDate;
   }

   @JsonProperty("currentBeginDate")
   public void setCurrentBeginDate(Date currentBeginDate) {
      this.currentBeginDate = currentBeginDate;
   }

   @JsonProperty("currentBeginDate")
   public Date getCurrentBeginDate() {
      return this.currentBeginDate;
   }

   @JsonProperty("currentNum")
   public void setCurrentNum(Integer currentNum) {
      this.currentNum = currentNum;
   }

   @JsonProperty("currentNum")
   public Integer getCurrentNum() {
      return this.currentNum;
   }

   @JsonProperty("salesOrderNo")
   public void setSalesOrderNo(String salesOrderNo) {
      this.salesOrderNo = salesOrderNo;
   }

   @JsonProperty("salesOrderNo")
   public String getSalesOrderNo() {
      return this.salesOrderNo;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("category2")
   public void setCategory2(String category2) {
      this.category2 = category2;
   }

   @JsonProperty("category2")
   public String getCategory2() {
      return this.category2;
   }

   @JsonProperty("category3")
   public void setCategory3(String category3) {
      this.category3 = category3;
   }

   @JsonProperty("category3")
   public String getCategory3() {
      return this.category3;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("productSn")
   public void setProductSn(String productSn) {
      this.productSn = productSn;
   }

   @JsonProperty("productSn")
   public String getProductSn() {
      return this.productSn;
   }

   @JsonProperty("stageType")
   public void setStageType(Integer stageType) {
      this.stageType = stageType;
   }

   @JsonProperty("stageType")
   public Integer getStageType() {
      return this.stageType;
   }

   @JsonProperty("serviceSkuCode")
   public void setServiceSkuCode(String serviceSkuCode) {
      this.serviceSkuCode = serviceSkuCode;
   }

   @JsonProperty("serviceSkuCode")
   public String getServiceSkuCode() {
      return this.serviceSkuCode;
   }

   @JsonProperty("category1")
   public void setCategory1(String category1) {
      this.category1 = category1;
   }

   @JsonProperty("category1")
   public String getCategory1() {
      return this.category1;
   }

   @JsonProperty("mainOrderDate")
   public void setMainOrderDate(Date mainOrderDate) {
      this.mainOrderDate = mainOrderDate;
   }

   @JsonProperty("mainOrderDate")
   public Date getMainOrderDate() {
      return this.mainOrderDate;
   }

   @JsonProperty("categoryId1")
   public void setCategoryId1(Integer categoryId1) {
      this.categoryId1 = categoryId1;
   }

   @JsonProperty("categoryId1")
   public Integer getCategoryId1() {
      return this.categoryId1;
   }

   @JsonProperty("extensionEndDate")
   public void setExtensionEndDate(Date extensionEndDate) {
      this.extensionEndDate = extensionEndDate;
   }

   @JsonProperty("extensionEndDate")
   public Date getExtensionEndDate() {
      return this.extensionEndDate;
   }

   @JsonProperty("categoryId2")
   public void setCategoryId2(Integer categoryId2) {
      this.categoryId2 = categoryId2;
   }

   @JsonProperty("categoryId2")
   public Integer getCategoryId2() {
      return this.categoryId2;
   }

   @JsonProperty("categoryId3")
   public void setCategoryId3(Integer categoryId3) {
      this.categoryId3 = categoryId3;
   }

   @JsonProperty("categoryId3")
   public Integer getCategoryId3() {
      return this.categoryId3;
   }

   @JsonProperty("mainQty")
   public void setMainQty(Integer mainQty) {
      this.mainQty = mainQty;
   }

   @JsonProperty("mainQty")
   public Integer getMainQty() {
      return this.mainQty;
   }

   @JsonProperty("extMainOrderNo")
   public void setExtMainOrderNo(String extMainOrderNo) {
      this.extMainOrderNo = extMainOrderNo;
   }

   @JsonProperty("extMainOrderNo")
   public String getExtMainOrderNo() {
      return this.extMainOrderNo;
   }

   @JsonProperty("extensionBeginDate")
   public void setExtensionBeginDate(Date extensionBeginDate) {
      this.extensionBeginDate = extensionBeginDate;
   }

   @JsonProperty("extensionBeginDate")
   public Date getExtensionBeginDate() {
      return this.extensionBeginDate;
   }

   @JsonProperty("totalNum")
   public void setTotalNum(Integer totalNum) {
      this.totalNum = totalNum;
   }

   @JsonProperty("totalNum")
   public Integer getTotalNum() {
      return this.totalNum;
   }

   @JsonProperty("mainOrderFinishDate")
   public void setMainOrderFinishDate(Date mainOrderFinishDate) {
      this.mainOrderFinishDate = mainOrderFinishDate;
   }

   @JsonProperty("mainOrderFinishDate")
   public Date getMainOrderFinishDate() {
      return this.mainOrderFinishDate;
   }

   @JsonProperty("extMainSn")
   public void setExtMainSn(String extMainSn) {
      this.extMainSn = extMainSn;
   }

   @JsonProperty("extMainSn")
   public String getExtMainSn() {
      return this.extMainSn;
   }

   @JsonProperty("mainOrderNo")
   public void setMainOrderNo(String mainOrderNo) {
      this.mainOrderNo = mainOrderNo;
   }

   @JsonProperty("mainOrderNo")
   public String getMainOrderNo() {
      return this.mainOrderNo;
   }

   @JsonProperty("returnsDate")
   public void setReturnsDate(Date returnsDate) {
      this.returnsDate = returnsDate;
   }

   @JsonProperty("returnsDate")
   public Date getReturnsDate() {
      return this.returnsDate;
   }

   @JsonProperty("mainBrandId")
   public void setMainBrandId(String mainBrandId) {
      this.mainBrandId = mainBrandId;
   }

   @JsonProperty("mainBrandId")
   public String getMainBrandId() {
      return this.mainBrandId;
   }

   @JsonProperty("extinsuranceMode")
   public void setExtinsuranceMode(Integer extinsuranceMode) {
      this.extinsuranceMode = extinsuranceMode;
   }

   @JsonProperty("extinsuranceMode")
   public Integer getExtinsuranceMode() {
      return this.extinsuranceMode;
   }
}
