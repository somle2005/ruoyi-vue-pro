package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryRtw;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class RtwResult implements Serializable {
   private String[] eclpRtwNo;
   private String[] isvRtwNum;
   private String[] eclpSoNo;
   private String[] deptNo;
   private String[] warehouseNo;
   private String[] source;
   private String[] reason;
   private String[] createTime;
   private String[] updateTime;
   private String[] createUser;
   private String[] status;
   private String[] resultCode;
   private String[] msg;
   private String[] newWayBill;
   private List<RtwBatAttrModel> rtwBatAttrModelList;
   private List<RtwDetailsResult> rtwDetailsModelList;
   private String[] productsName;
   private String[] billingMode;
   private Integer[] receiveBoxNum;
   private String[] salesPlatformName;
   private String[] spSoNo;
   private String[] shipperName;
   private String[] shopName;
   private String[] workOrderNo;
   private String[] senderName;
   private String[] senderTelPhone;
   private String[] senderMobilePhone;
   private String[] logicParam;
   private String[] outstoreNo;
   private Map<String, String> serialNoMap;
   private String[] twiceWaybill;
   private String finishTime;

   @JsonProperty("eclpRtwNo")
   public void setEclpRtwNo(String[] eclpRtwNo) {
      this.eclpRtwNo = eclpRtwNo;
   }

   @JsonProperty("eclpRtwNo")
   public String[] getEclpRtwNo() {
      return this.eclpRtwNo;
   }

   @JsonProperty("isvRtwNum")
   public void setIsvRtwNum(String[] isvRtwNum) {
      this.isvRtwNum = isvRtwNum;
   }

   @JsonProperty("isvRtwNum")
   public String[] getIsvRtwNum() {
      return this.isvRtwNum;
   }

   @JsonProperty("eclpSoNo")
   public void setEclpSoNo(String[] eclpSoNo) {
      this.eclpSoNo = eclpSoNo;
   }

   @JsonProperty("eclpSoNo")
   public String[] getEclpSoNo() {
      return this.eclpSoNo;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String[] deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String[] getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String[] warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String[] getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("source")
   public void setSource(String[] source) {
      this.source = source;
   }

   @JsonProperty("source")
   public String[] getSource() {
      return this.source;
   }

   @JsonProperty("reason")
   public void setReason(String[] reason) {
      this.reason = reason;
   }

   @JsonProperty("reason")
   public String[] getReason() {
      return this.reason;
   }

   @JsonProperty("createTime")
   public void setCreateTime(String[] createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public String[] getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("updateTime")
   public void setUpdateTime(String[] updateTime) {
      this.updateTime = updateTime;
   }

   @JsonProperty("updateTime")
   public String[] getUpdateTime() {
      return this.updateTime;
   }

   @JsonProperty("createUser")
   public void setCreateUser(String[] createUser) {
      this.createUser = createUser;
   }

   @JsonProperty("createUser")
   public String[] getCreateUser() {
      return this.createUser;
   }

   @JsonProperty("status")
   public void setStatus(String[] status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String[] getStatus() {
      return this.status;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String[] resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String[] getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("msg")
   public void setMsg(String[] msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String[] getMsg() {
      return this.msg;
   }

   @JsonProperty("newWayBill")
   public void setNewWayBill(String[] newWayBill) {
      this.newWayBill = newWayBill;
   }

   @JsonProperty("newWayBill")
   public String[] getNewWayBill() {
      return this.newWayBill;
   }

   @JsonProperty("rtwBatAttrModelList")
   public void setRtwBatAttrModelList(List<RtwBatAttrModel> rtwBatAttrModelList) {
      this.rtwBatAttrModelList = rtwBatAttrModelList;
   }

   @JsonProperty("rtwBatAttrModelList")
   public List<RtwBatAttrModel> getRtwBatAttrModelList() {
      return this.rtwBatAttrModelList;
   }

   @JsonProperty("rtwDetailsModelList")
   public void setRtwDetailsModelList(List<RtwDetailsResult> rtwDetailsModelList) {
      this.rtwDetailsModelList = rtwDetailsModelList;
   }

   @JsonProperty("rtwDetailsModelList")
   public List<RtwDetailsResult> getRtwDetailsModelList() {
      return this.rtwDetailsModelList;
   }

   @JsonProperty("productsName")
   public void setProductsName(String[] productsName) {
      this.productsName = productsName;
   }

   @JsonProperty("productsName")
   public String[] getProductsName() {
      return this.productsName;
   }

   @JsonProperty("billingMode")
   public void setBillingMode(String[] billingMode) {
      this.billingMode = billingMode;
   }

   @JsonProperty("billingMode")
   public String[] getBillingMode() {
      return this.billingMode;
   }

   @JsonProperty("receiveBoxNum")
   public void setReceiveBoxNum(Integer[] receiveBoxNum) {
      this.receiveBoxNum = receiveBoxNum;
   }

   @JsonProperty("receiveBoxNum")
   public Integer[] getReceiveBoxNum() {
      return this.receiveBoxNum;
   }

   @JsonProperty("salesPlatformName")
   public void setSalesPlatformName(String[] salesPlatformName) {
      this.salesPlatformName = salesPlatformName;
   }

   @JsonProperty("salesPlatformName")
   public String[] getSalesPlatformName() {
      return this.salesPlatformName;
   }

   @JsonProperty("spSoNo")
   public void setSpSoNo(String[] spSoNo) {
      this.spSoNo = spSoNo;
   }

   @JsonProperty("spSoNo")
   public String[] getSpSoNo() {
      return this.spSoNo;
   }

   @JsonProperty("shipperName")
   public void setShipperName(String[] shipperName) {
      this.shipperName = shipperName;
   }

   @JsonProperty("shipperName")
   public String[] getShipperName() {
      return this.shipperName;
   }

   @JsonProperty("shopName")
   public void setShopName(String[] shopName) {
      this.shopName = shopName;
   }

   @JsonProperty("shopName")
   public String[] getShopName() {
      return this.shopName;
   }

   @JsonProperty("workOrderNo")
   public void setWorkOrderNo(String[] workOrderNo) {
      this.workOrderNo = workOrderNo;
   }

   @JsonProperty("workOrderNo")
   public String[] getWorkOrderNo() {
      return this.workOrderNo;
   }

   @JsonProperty("senderName")
   public void setSenderName(String[] senderName) {
      this.senderName = senderName;
   }

   @JsonProperty("senderName")
   public String[] getSenderName() {
      return this.senderName;
   }

   @JsonProperty("senderTelPhone")
   public void setSenderTelPhone(String[] senderTelPhone) {
      this.senderTelPhone = senderTelPhone;
   }

   @JsonProperty("senderTelPhone")
   public String[] getSenderTelPhone() {
      return this.senderTelPhone;
   }

   @JsonProperty("senderMobilePhone")
   public void setSenderMobilePhone(String[] senderMobilePhone) {
      this.senderMobilePhone = senderMobilePhone;
   }

   @JsonProperty("senderMobilePhone")
   public String[] getSenderMobilePhone() {
      return this.senderMobilePhone;
   }

   @JsonProperty("logicParam")
   public void setLogicParam(String[] logicParam) {
      this.logicParam = logicParam;
   }

   @JsonProperty("logicParam")
   public String[] getLogicParam() {
      return this.logicParam;
   }

   @JsonProperty("outstoreNo")
   public void setOutstoreNo(String[] outstoreNo) {
      this.outstoreNo = outstoreNo;
   }

   @JsonProperty("outstoreNo")
   public String[] getOutstoreNo() {
      return this.outstoreNo;
   }

   @JsonProperty("serialNoMap")
   public void setSerialNoMap(Map<String, String> serialNoMap) {
      this.serialNoMap = serialNoMap;
   }

   @JsonProperty("serialNoMap")
   public Map<String, String> getSerialNoMap() {
      return this.serialNoMap;
   }

   @JsonProperty("twiceWaybill")
   public void setTwiceWaybill(String[] twiceWaybill) {
      this.twiceWaybill = twiceWaybill;
   }

   @JsonProperty("twiceWaybill")
   public String[] getTwiceWaybill() {
      return this.twiceWaybill;
   }

   @JsonProperty("finishTime")
   public void setFinishTime(String finishTime) {
      this.finishTime = finishTime;
   }

   @JsonProperty("finishTime")
   public String getFinishTime() {
      return this.finishTime;
   }
}
