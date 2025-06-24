package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryB2BSWbMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Waybill implements Serializable {
   private String packageCode;
   private Double weight;
   private String orderMark;
   private String origSortCenter;
   private String destSortCenter;
   private String origCrossCode;
   private String origTabletrolleyCode;
   private String destCrossCode;
   private String destTabletrolleyCode;
   private Integer siteId;
   private String siteName;
   private String road;
   private Integer packageNum;
   private Integer packageCount;
   private String senderName;
   private String senderMobile;
   private String senderTel;
   private String senderAddress;
   private String receiveName;
   private String receiveMobile;
   private String receiveTel;
   private String receiveAddress;
   private Double collectionMoney;
   private String remark;
   private String deliveryId;
   private String orderId;
   private String agingName;
   private String customerCode;
   private String goodsType;
   private String sendCity;
   private String airTransport;
   private Integer guaranteeValue;
   private String senderCompany;
   private String receiveCompany;
   private String receiveProvince;
   private String receiveCity;
   private String receiveCounty;
   private String truckSpot;
   private String weightFlagText;
   private String jZDFlag;
   private String freightText;
   private String receiptFlag;
   private String packageServiceOn;
   private String goUpstairsOn;
   private String deliveryIntoWarehouse;
   private String transferCenterRouteList;
   private String backupSiteId;
   private String backupSiteName;
   private String roadCode;
   private String temporaryStorage;

   @JsonProperty("packageCode")
   public void setPackageCode(String packageCode) {
      this.packageCode = packageCode;
   }

   @JsonProperty("packageCode")
   public String getPackageCode() {
      return this.packageCode;
   }

   @JsonProperty("weight")
   public void setWeight(Double weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public Double getWeight() {
      return this.weight;
   }

   @JsonProperty("orderMark")
   public void setOrderMark(String orderMark) {
      this.orderMark = orderMark;
   }

   @JsonProperty("orderMark")
   public String getOrderMark() {
      return this.orderMark;
   }

   @JsonProperty("origSortCenter")
   public void setOrigSortCenter(String origSortCenter) {
      this.origSortCenter = origSortCenter;
   }

   @JsonProperty("origSortCenter")
   public String getOrigSortCenter() {
      return this.origSortCenter;
   }

   @JsonProperty("destSortCenter")
   public void setDestSortCenter(String destSortCenter) {
      this.destSortCenter = destSortCenter;
   }

   @JsonProperty("destSortCenter")
   public String getDestSortCenter() {
      return this.destSortCenter;
   }

   @JsonProperty("origCrossCode")
   public void setOrigCrossCode(String origCrossCode) {
      this.origCrossCode = origCrossCode;
   }

   @JsonProperty("origCrossCode")
   public String getOrigCrossCode() {
      return this.origCrossCode;
   }

   @JsonProperty("origTabletrolleyCode")
   public void setOrigTabletrolleyCode(String origTabletrolleyCode) {
      this.origTabletrolleyCode = origTabletrolleyCode;
   }

   @JsonProperty("origTabletrolleyCode")
   public String getOrigTabletrolleyCode() {
      return this.origTabletrolleyCode;
   }

   @JsonProperty("destCrossCode")
   public void setDestCrossCode(String destCrossCode) {
      this.destCrossCode = destCrossCode;
   }

   @JsonProperty("destCrossCode")
   public String getDestCrossCode() {
      return this.destCrossCode;
   }

   @JsonProperty("destTabletrolleyCode")
   public void setDestTabletrolleyCode(String destTabletrolleyCode) {
      this.destTabletrolleyCode = destTabletrolleyCode;
   }

   @JsonProperty("destTabletrolleyCode")
   public String getDestTabletrolleyCode() {
      return this.destTabletrolleyCode;
   }

   @JsonProperty("siteId")
   public void setSiteId(Integer siteId) {
      this.siteId = siteId;
   }

   @JsonProperty("siteId")
   public Integer getSiteId() {
      return this.siteId;
   }

   @JsonProperty("siteName")
   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   @JsonProperty("siteName")
   public String getSiteName() {
      return this.siteName;
   }

   @JsonProperty("road")
   public void setRoad(String road) {
      this.road = road;
   }

   @JsonProperty("road")
   public String getRoad() {
      return this.road;
   }

   @JsonProperty("packageNum")
   public void setPackageNum(Integer packageNum) {
      this.packageNum = packageNum;
   }

   @JsonProperty("packageNum")
   public Integer getPackageNum() {
      return this.packageNum;
   }

   @JsonProperty("packageCount")
   public void setPackageCount(Integer packageCount) {
      this.packageCount = packageCount;
   }

   @JsonProperty("packageCount")
   public Integer getPackageCount() {
      return this.packageCount;
   }

   @JsonProperty("senderName")
   public void setSenderName(String senderName) {
      this.senderName = senderName;
   }

   @JsonProperty("senderName")
   public String getSenderName() {
      return this.senderName;
   }

   @JsonProperty("senderMobile")
   public void setSenderMobile(String senderMobile) {
      this.senderMobile = senderMobile;
   }

   @JsonProperty("senderMobile")
   public String getSenderMobile() {
      return this.senderMobile;
   }

   @JsonProperty("senderTel")
   public void setSenderTel(String senderTel) {
      this.senderTel = senderTel;
   }

   @JsonProperty("senderTel")
   public String getSenderTel() {
      return this.senderTel;
   }

   @JsonProperty("senderAddress")
   public void setSenderAddress(String senderAddress) {
      this.senderAddress = senderAddress;
   }

   @JsonProperty("senderAddress")
   public String getSenderAddress() {
      return this.senderAddress;
   }

   @JsonProperty("receiveName")
   public void setReceiveName(String receiveName) {
      this.receiveName = receiveName;
   }

   @JsonProperty("receiveName")
   public String getReceiveName() {
      return this.receiveName;
   }

   @JsonProperty("receiveMobile")
   public void setReceiveMobile(String receiveMobile) {
      this.receiveMobile = receiveMobile;
   }

   @JsonProperty("receiveMobile")
   public String getReceiveMobile() {
      return this.receiveMobile;
   }

   @JsonProperty("receiveTel")
   public void setReceiveTel(String receiveTel) {
      this.receiveTel = receiveTel;
   }

   @JsonProperty("receiveTel")
   public String getReceiveTel() {
      return this.receiveTel;
   }

   @JsonProperty("receiveAddress")
   public void setReceiveAddress(String receiveAddress) {
      this.receiveAddress = receiveAddress;
   }

   @JsonProperty("receiveAddress")
   public String getReceiveAddress() {
      return this.receiveAddress;
   }

   @JsonProperty("collectionMoney")
   public void setCollectionMoney(Double collectionMoney) {
      this.collectionMoney = collectionMoney;
   }

   @JsonProperty("collectionMoney")
   public Double getCollectionMoney() {
      return this.collectionMoney;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("deliveryId")
   public void setDeliveryId(String deliveryId) {
      this.deliveryId = deliveryId;
   }

   @JsonProperty("deliveryId")
   public String getDeliveryId() {
      return this.deliveryId;
   }

   @JsonProperty("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("agingName")
   public void setAgingName(String agingName) {
      this.agingName = agingName;
   }

   @JsonProperty("agingName")
   public String getAgingName() {
      return this.agingName;
   }

   @JsonProperty("customerCode")
   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   @JsonProperty("customerCode")
   public String getCustomerCode() {
      return this.customerCode;
   }

   @JsonProperty("goodsType")
   public void setGoodsType(String goodsType) {
      this.goodsType = goodsType;
   }

   @JsonProperty("goodsType")
   public String getGoodsType() {
      return this.goodsType;
   }

   @JsonProperty("sendCity")
   public void setSendCity(String sendCity) {
      this.sendCity = sendCity;
   }

   @JsonProperty("sendCity")
   public String getSendCity() {
      return this.sendCity;
   }

   @JsonProperty("airTransport")
   public void setAirTransport(String airTransport) {
      this.airTransport = airTransport;
   }

   @JsonProperty("airTransport")
   public String getAirTransport() {
      return this.airTransport;
   }

   @JsonProperty("guaranteeValue")
   public void setGuaranteeValue(Integer guaranteeValue) {
      this.guaranteeValue = guaranteeValue;
   }

   @JsonProperty("guaranteeValue")
   public Integer getGuaranteeValue() {
      return this.guaranteeValue;
   }

   @JsonProperty("senderCompany")
   public void setSenderCompany(String senderCompany) {
      this.senderCompany = senderCompany;
   }

   @JsonProperty("senderCompany")
   public String getSenderCompany() {
      return this.senderCompany;
   }

   @JsonProperty("receiveCompany")
   public void setReceiveCompany(String receiveCompany) {
      this.receiveCompany = receiveCompany;
   }

   @JsonProperty("receiveCompany")
   public String getReceiveCompany() {
      return this.receiveCompany;
   }

   @JsonProperty("receiveProvince")
   public void setReceiveProvince(String receiveProvince) {
      this.receiveProvince = receiveProvince;
   }

   @JsonProperty("receiveProvince")
   public String getReceiveProvince() {
      return this.receiveProvince;
   }

   @JsonProperty("receiveCity")
   public void setReceiveCity(String receiveCity) {
      this.receiveCity = receiveCity;
   }

   @JsonProperty("receiveCity")
   public String getReceiveCity() {
      return this.receiveCity;
   }

   @JsonProperty("receiveCounty")
   public void setReceiveCounty(String receiveCounty) {
      this.receiveCounty = receiveCounty;
   }

   @JsonProperty("receiveCounty")
   public String getReceiveCounty() {
      return this.receiveCounty;
   }

   @JsonProperty("truckSpot")
   public void setTruckSpot(String truckSpot) {
      this.truckSpot = truckSpot;
   }

   @JsonProperty("truckSpot")
   public String getTruckSpot() {
      return this.truckSpot;
   }

   @JsonProperty("weightFlagText")
   public void setWeightFlagText(String weightFlagText) {
      this.weightFlagText = weightFlagText;
   }

   @JsonProperty("weightFlagText")
   public String getWeightFlagText() {
      return this.weightFlagText;
   }

   @JsonProperty("jZDFlag")
   public void setJZDFlag(String jZDFlag) {
      this.jZDFlag = jZDFlag;
   }

   @JsonProperty("jZDFlag")
   public String getJZDFlag() {
      return this.jZDFlag;
   }

   @JsonProperty("freightText")
   public void setFreightText(String freightText) {
      this.freightText = freightText;
   }

   @JsonProperty("freightText")
   public String getFreightText() {
      return this.freightText;
   }

   @JsonProperty("receiptFlag")
   public void setReceiptFlag(String receiptFlag) {
      this.receiptFlag = receiptFlag;
   }

   @JsonProperty("receiptFlag")
   public String getReceiptFlag() {
      return this.receiptFlag;
   }

   @JsonProperty("packageServiceOn")
   public void setPackageServiceOn(String packageServiceOn) {
      this.packageServiceOn = packageServiceOn;
   }

   @JsonProperty("packageServiceOn")
   public String getPackageServiceOn() {
      return this.packageServiceOn;
   }

   @JsonProperty("goUpstairsOn")
   public void setGoUpstairsOn(String goUpstairsOn) {
      this.goUpstairsOn = goUpstairsOn;
   }

   @JsonProperty("goUpstairsOn")
   public String getGoUpstairsOn() {
      return this.goUpstairsOn;
   }

   @JsonProperty("deliveryIntoWarehouse")
   public void setDeliveryIntoWarehouse(String deliveryIntoWarehouse) {
      this.deliveryIntoWarehouse = deliveryIntoWarehouse;
   }

   @JsonProperty("deliveryIntoWarehouse")
   public String getDeliveryIntoWarehouse() {
      return this.deliveryIntoWarehouse;
   }

   @JsonProperty("transferCenterRouteList")
   public void setTransferCenterRouteList(String transferCenterRouteList) {
      this.transferCenterRouteList = transferCenterRouteList;
   }

   @JsonProperty("transferCenterRouteList")
   public String getTransferCenterRouteList() {
      return this.transferCenterRouteList;
   }

   @JsonProperty("backupSiteId")
   public void setBackupSiteId(String backupSiteId) {
      this.backupSiteId = backupSiteId;
   }

   @JsonProperty("backupSiteId")
   public String getBackupSiteId() {
      return this.backupSiteId;
   }

   @JsonProperty("backupSiteName")
   public void setBackupSiteName(String backupSiteName) {
      this.backupSiteName = backupSiteName;
   }

   @JsonProperty("backupSiteName")
   public String getBackupSiteName() {
      return this.backupSiteName;
   }

   @JsonProperty("roadCode")
   public void setRoadCode(String roadCode) {
      this.roadCode = roadCode;
   }

   @JsonProperty("roadCode")
   public String getRoadCode() {
      return this.roadCode;
   }

   @JsonProperty("temporaryStorage")
   public void setTemporaryStorage(String temporaryStorage) {
      this.temporaryStorage = temporaryStorage;
   }

   @JsonProperty("temporaryStorage")
   public String getTemporaryStorage() {
      return this.temporaryStorage;
   }
}
