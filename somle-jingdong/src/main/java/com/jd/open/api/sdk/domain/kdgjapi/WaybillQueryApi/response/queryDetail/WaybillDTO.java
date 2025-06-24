package com.jd.open.api.sdk.domain.kdgjapi.WaybillQueryApi.response.queryDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class WaybillDTO implements Serializable {
   private List<String> waybillCodes;
   private String providerCode;
   private Integer signReturn;
   private Integer receiveTimeType;
   private String vendorCode;
   private boolean existWaybillCode;
   private Date promiseCompleteTime;
   private Integer payType;
   private Boolean needGuarantee;
   private String pin;
   private String extendField3;
   private String extendField2;
   private String extendField1;
   private String appKey;
   private Integer state;
   private String goodsName;
   private String thirdSectionCode;
   private String extendField5;
   private String extendField4;
   private String expressType;
   private BigDecimal weight;
   private String vendorName;
   private String branchCode;
   private BigDecimal volume;
   private BigDecimal guaranteeMoney;
   private String vendorOrderCode;
   private String remark;
   private String warehouseCode;
   private String expressPayMethod;
   private Integer waybillType;
   private String salePlatform;
   private Integer providerId;
   private String secondSectionCode;
   private Integer waybillCount;
   private Integer promiseTimeType;
   private String settlementCode;
   private BigDecimal shouldPayMoney;
   private BigDecimal goodsMoney;
   private Date createTime;
   private String platformOrderNo;
   private WaybillAddress fromAddress;
   private WaybillAddress toAddress;

   @JsonProperty("waybillCodes")
   public void setWaybillCodes(List<String> waybillCodes) {
      this.waybillCodes = waybillCodes;
   }

   @JsonProperty("waybillCodes")
   public List<String> getWaybillCodes() {
      return this.waybillCodes;
   }

   @JsonProperty("providerCode")
   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   @JsonProperty("providerCode")
   public String getProviderCode() {
      return this.providerCode;
   }

   @JsonProperty("signReturn")
   public void setSignReturn(Integer signReturn) {
      this.signReturn = signReturn;
   }

   @JsonProperty("signReturn")
   public Integer getSignReturn() {
      return this.signReturn;
   }

   @JsonProperty("receiveTimeType")
   public void setReceiveTimeType(Integer receiveTimeType) {
      this.receiveTimeType = receiveTimeType;
   }

   @JsonProperty("receiveTimeType")
   public Integer getReceiveTimeType() {
      return this.receiveTimeType;
   }

   @JsonProperty("vendorCode")
   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendorCode")
   public String getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("existWaybillCode")
   public void setExistWaybillCode(boolean existWaybillCode) {
      this.existWaybillCode = existWaybillCode;
   }

   @JsonProperty("existWaybillCode")
   public boolean getExistWaybillCode() {
      return this.existWaybillCode;
   }

   @JsonProperty("promiseCompleteTime")
   public void setPromiseCompleteTime(Date promiseCompleteTime) {
      this.promiseCompleteTime = promiseCompleteTime;
   }

   @JsonProperty("promiseCompleteTime")
   public Date getPromiseCompleteTime() {
      return this.promiseCompleteTime;
   }

   @JsonProperty("payType")
   public void setPayType(Integer payType) {
      this.payType = payType;
   }

   @JsonProperty("payType")
   public Integer getPayType() {
      return this.payType;
   }

   @JsonProperty("needGuarantee")
   public void setNeedGuarantee(Boolean needGuarantee) {
      this.needGuarantee = needGuarantee;
   }

   @JsonProperty("needGuarantee")
   public Boolean getNeedGuarantee() {
      return this.needGuarantee;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("extendField3")
   public void setExtendField3(String extendField3) {
      this.extendField3 = extendField3;
   }

   @JsonProperty("extendField3")
   public String getExtendField3() {
      return this.extendField3;
   }

   @JsonProperty("extendField2")
   public void setExtendField2(String extendField2) {
      this.extendField2 = extendField2;
   }

   @JsonProperty("extendField2")
   public String getExtendField2() {
      return this.extendField2;
   }

   @JsonProperty("extendField1")
   public void setExtendField1(String extendField1) {
      this.extendField1 = extendField1;
   }

   @JsonProperty("extendField1")
   public String getExtendField1() {
      return this.extendField1;
   }

   @JsonProperty("appKey")
   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   @JsonProperty("appKey")
   public String getAppKey() {
      return this.appKey;
   }

   @JsonProperty("state")
   public void setState(Integer state) {
      this.state = state;
   }

   @JsonProperty("state")
   public Integer getState() {
      return this.state;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String getGoodsName() {
      return this.goodsName;
   }

   @JsonProperty("thirdSectionCode")
   public void setThirdSectionCode(String thirdSectionCode) {
      this.thirdSectionCode = thirdSectionCode;
   }

   @JsonProperty("thirdSectionCode")
   public String getThirdSectionCode() {
      return this.thirdSectionCode;
   }

   @JsonProperty("extendField5")
   public void setExtendField5(String extendField5) {
      this.extendField5 = extendField5;
   }

   @JsonProperty("extendField5")
   public String getExtendField5() {
      return this.extendField5;
   }

   @JsonProperty("extendField4")
   public void setExtendField4(String extendField4) {
      this.extendField4 = extendField4;
   }

   @JsonProperty("extendField4")
   public String getExtendField4() {
      return this.extendField4;
   }

   @JsonProperty("expressType")
   public void setExpressType(String expressType) {
      this.expressType = expressType;
   }

   @JsonProperty("expressType")
   public String getExpressType() {
      return this.expressType;
   }

   @JsonProperty("weight")
   public void setWeight(BigDecimal weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public BigDecimal getWeight() {
      return this.weight;
   }

   @JsonProperty("vendorName")
   public void setVendorName(String vendorName) {
      this.vendorName = vendorName;
   }

   @JsonProperty("vendorName")
   public String getVendorName() {
      return this.vendorName;
   }

   @JsonProperty("branchCode")
   public void setBranchCode(String branchCode) {
      this.branchCode = branchCode;
   }

   @JsonProperty("branchCode")
   public String getBranchCode() {
      return this.branchCode;
   }

   @JsonProperty("volume")
   public void setVolume(BigDecimal volume) {
      this.volume = volume;
   }

   @JsonProperty("volume")
   public BigDecimal getVolume() {
      return this.volume;
   }

   @JsonProperty("guaranteeMoney")
   public void setGuaranteeMoney(BigDecimal guaranteeMoney) {
      this.guaranteeMoney = guaranteeMoney;
   }

   @JsonProperty("guaranteeMoney")
   public BigDecimal getGuaranteeMoney() {
      return this.guaranteeMoney;
   }

   @JsonProperty("vendorOrderCode")
   public void setVendorOrderCode(String vendorOrderCode) {
      this.vendorOrderCode = vendorOrderCode;
   }

   @JsonProperty("vendorOrderCode")
   public String getVendorOrderCode() {
      return this.vendorOrderCode;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("warehouseCode")
   public void setWarehouseCode(String warehouseCode) {
      this.warehouseCode = warehouseCode;
   }

   @JsonProperty("warehouseCode")
   public String getWarehouseCode() {
      return this.warehouseCode;
   }

   @JsonProperty("expressPayMethod")
   public void setExpressPayMethod(String expressPayMethod) {
      this.expressPayMethod = expressPayMethod;
   }

   @JsonProperty("expressPayMethod")
   public String getExpressPayMethod() {
      return this.expressPayMethod;
   }

   @JsonProperty("waybillType")
   public void setWaybillType(Integer waybillType) {
      this.waybillType = waybillType;
   }

   @JsonProperty("waybillType")
   public Integer getWaybillType() {
      return this.waybillType;
   }

   @JsonProperty("salePlatform")
   public void setSalePlatform(String salePlatform) {
      this.salePlatform = salePlatform;
   }

   @JsonProperty("salePlatform")
   public String getSalePlatform() {
      return this.salePlatform;
   }

   @JsonProperty("providerId")
   public void setProviderId(Integer providerId) {
      this.providerId = providerId;
   }

   @JsonProperty("providerId")
   public Integer getProviderId() {
      return this.providerId;
   }

   @JsonProperty("secondSectionCode")
   public void setSecondSectionCode(String secondSectionCode) {
      this.secondSectionCode = secondSectionCode;
   }

   @JsonProperty("secondSectionCode")
   public String getSecondSectionCode() {
      return this.secondSectionCode;
   }

   @JsonProperty("waybillCount")
   public void setWaybillCount(Integer waybillCount) {
      this.waybillCount = waybillCount;
   }

   @JsonProperty("waybillCount")
   public Integer getWaybillCount() {
      return this.waybillCount;
   }

   @JsonProperty("promiseTimeType")
   public void setPromiseTimeType(Integer promiseTimeType) {
      this.promiseTimeType = promiseTimeType;
   }

   @JsonProperty("promiseTimeType")
   public Integer getPromiseTimeType() {
      return this.promiseTimeType;
   }

   @JsonProperty("settlementCode")
   public void setSettlementCode(String settlementCode) {
      this.settlementCode = settlementCode;
   }

   @JsonProperty("settlementCode")
   public String getSettlementCode() {
      return this.settlementCode;
   }

   @JsonProperty("shouldPayMoney")
   public void setShouldPayMoney(BigDecimal shouldPayMoney) {
      this.shouldPayMoney = shouldPayMoney;
   }

   @JsonProperty("shouldPayMoney")
   public BigDecimal getShouldPayMoney() {
      return this.shouldPayMoney;
   }

   @JsonProperty("goodsMoney")
   public void setGoodsMoney(BigDecimal goodsMoney) {
      this.goodsMoney = goodsMoney;
   }

   @JsonProperty("goodsMoney")
   public BigDecimal getGoodsMoney() {
      return this.goodsMoney;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("platformOrderNo")
   public void setPlatformOrderNo(String platformOrderNo) {
      this.platformOrderNo = platformOrderNo;
   }

   @JsonProperty("platformOrderNo")
   public String getPlatformOrderNo() {
      return this.platformOrderNo;
   }

   @JsonProperty("fromAddress")
   public void setFromAddress(WaybillAddress fromAddress) {
      this.fromAddress = fromAddress;
   }

   @JsonProperty("fromAddress")
   public WaybillAddress getFromAddress() {
      return this.fromAddress;
   }

   @JsonProperty("toAddress")
   public void setToAddress(WaybillAddress toAddress) {
      this.toAddress = toAddress;
   }

   @JsonProperty("toAddress")
   public WaybillAddress getToAddress() {
      return this.toAddress;
   }
}
