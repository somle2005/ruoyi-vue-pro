package com.jd.open.api.sdk.domain.wujiemiandan.WaybillReceiveOpenApi.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class WaybillReceiveRequest implements Serializable {
   private String providerCode;
   private List<WaybillGoodsDTO> goodsList;
   private String remark;
   private String collectRemark;
   private Integer receiveTimeType;
   private String vendorCode;
   private String expressPayMethod;
   private String salePlatform;
   private Integer payType;
   private Boolean needGuarantee;
   private Integer providerId;
   private String goodsName;
   private String expressType;
   private Integer waybillCount;
   private BigDecimal weight;
   private String settlementCode;
   private BigDecimal shouldPayMoney;
   private Integer isDocall;
   private String branchCode;
   private BigDecimal volume;
   private BigDecimal guaranteeMoney;
   private String vendorOrderCode;
   private String platformOrderNo;
   private boolean childMotherOrder;
   private List<ValueAddedService> serviceList;
   private List<ProductDTO> productList;
   private WaybillAddress toAddress;
   private WaybillAddress fromAddress;
   private Integer orderType;
   private List<WaybillCodeTypeInfoDTO> waybillCodeTypeInfoList;
   private BigDecimal quantity;
   private Integer orderFulfillmentMode;
   private String outboundStoreCode;
   private String expectedFulfillmentProviderCode;
   private String customBusinessNo;
   private Integer multiPackageMode;
   private WaybillBondedDTO bondedInfo;
   private Integer shipmentOrigin;
   private Date expectedCollectBeginTime;
   private Date expectedCollectEndTime;

   @JsonProperty("providerCode")
   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   @JsonProperty("providerCode")
   public String getProviderCode() {
      return this.providerCode;
   }

   @JsonProperty("goodsList")
   public void setGoodsList(List<WaybillGoodsDTO> goodsList) {
      this.goodsList = goodsList;
   }

   @JsonProperty("goodsList")
   public List<WaybillGoodsDTO> getGoodsList() {
      return this.goodsList;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("collectRemark")
   public void setCollectRemark(String collectRemark) {
      this.collectRemark = collectRemark;
   }

   @JsonProperty("collectRemark")
   public String getCollectRemark() {
      return this.collectRemark;
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

   @JsonProperty("expressPayMethod")
   public void setExpressPayMethod(String expressPayMethod) {
      this.expressPayMethod = expressPayMethod;
   }

   @JsonProperty("expressPayMethod")
   public String getExpressPayMethod() {
      return this.expressPayMethod;
   }

   @JsonProperty("salePlatform")
   public void setSalePlatform(String salePlatform) {
      this.salePlatform = salePlatform;
   }

   @JsonProperty("salePlatform")
   public String getSalePlatform() {
      return this.salePlatform;
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

   @JsonProperty("providerId")
   public void setProviderId(Integer providerId) {
      this.providerId = providerId;
   }

   @JsonProperty("providerId")
   public Integer getProviderId() {
      return this.providerId;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String getGoodsName() {
      return this.goodsName;
   }

   @JsonProperty("expressType")
   public void setExpressType(String expressType) {
      this.expressType = expressType;
   }

   @JsonProperty("expressType")
   public String getExpressType() {
      return this.expressType;
   }

   @JsonProperty("waybillCount")
   public void setWaybillCount(Integer waybillCount) {
      this.waybillCount = waybillCount;
   }

   @JsonProperty("waybillCount")
   public Integer getWaybillCount() {
      return this.waybillCount;
   }

   @JsonProperty("weight")
   public void setWeight(BigDecimal weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public BigDecimal getWeight() {
      return this.weight;
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

   @JsonProperty("isDocall")
   public void setIsDocall(Integer isDocall) {
      this.isDocall = isDocall;
   }

   @JsonProperty("isDocall")
   public Integer getIsDocall() {
      return this.isDocall;
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

   @JsonProperty("platformOrderNo")
   public void setPlatformOrderNo(String platformOrderNo) {
      this.platformOrderNo = platformOrderNo;
   }

   @JsonProperty("platformOrderNo")
   public String getPlatformOrderNo() {
      return this.platformOrderNo;
   }

   @JsonProperty("childMotherOrder")
   public void setChildMotherOrder(boolean childMotherOrder) {
      this.childMotherOrder = childMotherOrder;
   }

   @JsonProperty("childMotherOrder")
   public boolean getChildMotherOrder() {
      return this.childMotherOrder;
   }

   @JsonProperty("serviceList")
   public void setServiceList(List<ValueAddedService> serviceList) {
      this.serviceList = serviceList;
   }

   @JsonProperty("serviceList")
   public List<ValueAddedService> getServiceList() {
      return this.serviceList;
   }

   @JsonProperty("productList")
   public void setProductList(List<ProductDTO> productList) {
      this.productList = productList;
   }

   @JsonProperty("productList")
   public List<ProductDTO> getProductList() {
      return this.productList;
   }

   @JsonProperty("toAddress")
   public void setToAddress(WaybillAddress toAddress) {
      this.toAddress = toAddress;
   }

   @JsonProperty("toAddress")
   public WaybillAddress getToAddress() {
      return this.toAddress;
   }

   @JsonProperty("fromAddress")
   public void setFromAddress(WaybillAddress fromAddress) {
      this.fromAddress = fromAddress;
   }

   @JsonProperty("fromAddress")
   public WaybillAddress getFromAddress() {
      return this.fromAddress;
   }

   @JsonProperty("orderType")
   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public Integer getOrderType() {
      return this.orderType;
   }

   @JsonProperty("waybillCodeTypeInfoList")
   public void setWaybillCodeTypeInfoList(List<WaybillCodeTypeInfoDTO> waybillCodeTypeInfoList) {
      this.waybillCodeTypeInfoList = waybillCodeTypeInfoList;
   }

   @JsonProperty("waybillCodeTypeInfoList")
   public List<WaybillCodeTypeInfoDTO> getWaybillCodeTypeInfoList() {
      return this.waybillCodeTypeInfoList;
   }

   @JsonProperty("quantity")
   public void setQuantity(BigDecimal quantity) {
      this.quantity = quantity;
   }

   @JsonProperty("quantity")
   public BigDecimal getQuantity() {
      return this.quantity;
   }

   @JsonProperty("orderFulfillmentMode")
   public void setOrderFulfillmentMode(Integer orderFulfillmentMode) {
      this.orderFulfillmentMode = orderFulfillmentMode;
   }

   @JsonProperty("orderFulfillmentMode")
   public Integer getOrderFulfillmentMode() {
      return this.orderFulfillmentMode;
   }

   @JsonProperty("outboundStoreCode")
   public void setOutboundStoreCode(String outboundStoreCode) {
      this.outboundStoreCode = outboundStoreCode;
   }

   @JsonProperty("outboundStoreCode")
   public String getOutboundStoreCode() {
      return this.outboundStoreCode;
   }

   @JsonProperty("expectedFulfillmentProviderCode")
   public void setExpectedFulfillmentProviderCode(String expectedFulfillmentProviderCode) {
      this.expectedFulfillmentProviderCode = expectedFulfillmentProviderCode;
   }

   @JsonProperty("expectedFulfillmentProviderCode")
   public String getExpectedFulfillmentProviderCode() {
      return this.expectedFulfillmentProviderCode;
   }

   @JsonProperty("customBusinessNo")
   public void setCustomBusinessNo(String customBusinessNo) {
      this.customBusinessNo = customBusinessNo;
   }

   @JsonProperty("customBusinessNo")
   public String getCustomBusinessNo() {
      return this.customBusinessNo;
   }

   @JsonProperty("multiPackageMode")
   public void setMultiPackageMode(Integer multiPackageMode) {
      this.multiPackageMode = multiPackageMode;
   }

   @JsonProperty("multiPackageMode")
   public Integer getMultiPackageMode() {
      return this.multiPackageMode;
   }

   @JsonProperty("bondedInfo")
   public void setBondedInfo(WaybillBondedDTO bondedInfo) {
      this.bondedInfo = bondedInfo;
   }

   @JsonProperty("bondedInfo")
   public WaybillBondedDTO getBondedInfo() {
      return this.bondedInfo;
   }

   @JsonProperty("shipmentOrigin")
   public void setShipmentOrigin(Integer shipmentOrigin) {
      this.shipmentOrigin = shipmentOrigin;
   }

   @JsonProperty("shipmentOrigin")
   public Integer getShipmentOrigin() {
      return this.shipmentOrigin;
   }

   @JsonProperty("expectedCollectBeginTime")
   public void setExpectedCollectBeginTime(Date expectedCollectBeginTime) {
      this.expectedCollectBeginTime = expectedCollectBeginTime;
   }

   @JsonProperty("expectedCollectBeginTime")
   public Date getExpectedCollectBeginTime() {
      return this.expectedCollectBeginTime;
   }

   @JsonProperty("expectedCollectEndTime")
   public void setExpectedCollectEndTime(Date expectedCollectEndTime) {
      this.expectedCollectEndTime = expectedCollectEndTime;
   }

   @JsonProperty("expectedCollectEndTime")
   public Date getExpectedCollectEndTime() {
      return this.expectedCollectEndTime;
   }
}
