package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpRtwAddRtwOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpRtwAddRtwOrderRequest extends AbstractRequest implements JdRequest<EclpRtwAddRtwOrderResponse> {
   private String eclpSoNo;
   private String eclpRtwNo;
   private String isvRtwNum;
   private String warehouseNo;
   private String logicParam;
   private String reson;
   private Byte orderType;
   private String packageNo;
   private String isvSoNo;
   private String orderMark;
   private String shipperName;
   private String ownerNo;
   private Byte orderInType;
   private Byte receiveLevel;
   private String sellerRemark;
   private String salesMan;
   private String salesBillingStaff;
   private String drugElectronicSupervisionCode;
   private String registerOrgNo;
   private String registerOrgName;
   private String customerName;
   private String receivePriority;
   private String sellerRtwType;
   private String sellerRtwTypeName;
   private String salesPlatformName;
   private String spSoNo;
   private String shopName;
   private String workOrderNo;
   private String senderName;
   private String senderTelPhone;
   private String senderMobilePhone;
   private String customerId;
   private String customField;
   private String salesPlatformNo;
   private String relatedOrderNo;
   private String serialVersion;
   private Byte serialBizType;
   private String serialDetailMapJson;
   private String isvGoodsNo;
   private String planQty;
   private String goodsLevel;
   private String productionDate;
   private String packageBatchNo;
   private String eclpOutOrderNo;
   private String sellerOutOrderNo;
   private String unitPrice;
   private String money;
   private String mediumPackage;
   private String bigPackage;
   private String orderLine;
   private String batAttrListJson;
   private String deptGoodsNo;
   private String planRtwReasonNo;
   private String planRtwReasonDesc;
   private String reserve1;

   public void setEclpSoNo(String eclpSoNo) {
      this.eclpSoNo = eclpSoNo;
   }

   public String getEclpSoNo() {
      return this.eclpSoNo;
   }

   public void setEclpRtwNo(String eclpRtwNo) {
      this.eclpRtwNo = eclpRtwNo;
   }

   public String getEclpRtwNo() {
      return this.eclpRtwNo;
   }

   public void setIsvRtwNum(String isvRtwNum) {
      this.isvRtwNum = isvRtwNum;
   }

   public String getIsvRtwNum() {
      return this.isvRtwNum;
   }

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   public void setLogicParam(String logicParam) {
      this.logicParam = logicParam;
   }

   public String getLogicParam() {
      return this.logicParam;
   }

   public void setReson(String reson) {
      this.reson = reson;
   }

   public String getReson() {
      return this.reson;
   }

   public void setOrderType(Byte orderType) {
      this.orderType = orderType;
   }

   public Byte getOrderType() {
      return this.orderType;
   }

   public void setPackageNo(String packageNo) {
      this.packageNo = packageNo;
   }

   public String getPackageNo() {
      return this.packageNo;
   }

   public void setIsvSoNo(String isvSoNo) {
      this.isvSoNo = isvSoNo;
   }

   public String getIsvSoNo() {
      return this.isvSoNo;
   }

   public void setOrderMark(String orderMark) {
      this.orderMark = orderMark;
   }

   public String getOrderMark() {
      return this.orderMark;
   }

   public void setShipperName(String shipperName) {
      this.shipperName = shipperName;
   }

   public String getShipperName() {
      return this.shipperName;
   }

   public void setOwnerNo(String ownerNo) {
      this.ownerNo = ownerNo;
   }

   public String getOwnerNo() {
      return this.ownerNo;
   }

   public void setOrderInType(Byte orderInType) {
      this.orderInType = orderInType;
   }

   public Byte getOrderInType() {
      return this.orderInType;
   }

   public void setReceiveLevel(Byte receiveLevel) {
      this.receiveLevel = receiveLevel;
   }

   public Byte getReceiveLevel() {
      return this.receiveLevel;
   }

   public void setSellerRemark(String sellerRemark) {
      this.sellerRemark = sellerRemark;
   }

   public String getSellerRemark() {
      return this.sellerRemark;
   }

   public void setSalesMan(String salesMan) {
      this.salesMan = salesMan;
   }

   public String getSalesMan() {
      return this.salesMan;
   }

   public void setSalesBillingStaff(String salesBillingStaff) {
      this.salesBillingStaff = salesBillingStaff;
   }

   public String getSalesBillingStaff() {
      return this.salesBillingStaff;
   }

   public void setDrugElectronicSupervisionCode(String drugElectronicSupervisionCode) {
      this.drugElectronicSupervisionCode = drugElectronicSupervisionCode;
   }

   public String getDrugElectronicSupervisionCode() {
      return this.drugElectronicSupervisionCode;
   }

   public void setRegisterOrgNo(String registerOrgNo) {
      this.registerOrgNo = registerOrgNo;
   }

   public String getRegisterOrgNo() {
      return this.registerOrgNo;
   }

   public void setRegisterOrgName(String registerOrgName) {
      this.registerOrgName = registerOrgName;
   }

   public String getRegisterOrgName() {
      return this.registerOrgName;
   }

   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   public String getCustomerName() {
      return this.customerName;
   }

   public void setReceivePriority(String receivePriority) {
      this.receivePriority = receivePriority;
   }

   public String getReceivePriority() {
      return this.receivePriority;
   }

   public void setSellerRtwType(String sellerRtwType) {
      this.sellerRtwType = sellerRtwType;
   }

   public String getSellerRtwType() {
      return this.sellerRtwType;
   }

   public void setSellerRtwTypeName(String sellerRtwTypeName) {
      this.sellerRtwTypeName = sellerRtwTypeName;
   }

   public String getSellerRtwTypeName() {
      return this.sellerRtwTypeName;
   }

   public void setSalesPlatformName(String salesPlatformName) {
      this.salesPlatformName = salesPlatformName;
   }

   public String getSalesPlatformName() {
      return this.salesPlatformName;
   }

   public void setSpSoNo(String spSoNo) {
      this.spSoNo = spSoNo;
   }

   public String getSpSoNo() {
      return this.spSoNo;
   }

   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   public String getShopName() {
      return this.shopName;
   }

   public void setWorkOrderNo(String workOrderNo) {
      this.workOrderNo = workOrderNo;
   }

   public String getWorkOrderNo() {
      return this.workOrderNo;
   }

   public void setSenderName(String senderName) {
      this.senderName = senderName;
   }

   public String getSenderName() {
      return this.senderName;
   }

   public void setSenderTelPhone(String senderTelPhone) {
      this.senderTelPhone = senderTelPhone;
   }

   public String getSenderTelPhone() {
      return this.senderTelPhone;
   }

   public void setSenderMobilePhone(String senderMobilePhone) {
      this.senderMobilePhone = senderMobilePhone;
   }

   public String getSenderMobilePhone() {
      return this.senderMobilePhone;
   }

   public void setCustomerId(String customerId) {
      this.customerId = customerId;
   }

   public String getCustomerId() {
      return this.customerId;
   }

   public void setCustomField(String customField) {
      this.customField = customField;
   }

   public String getCustomField() {
      return this.customField;
   }

   public void setSalesPlatformNo(String salesPlatformNo) {
      this.salesPlatformNo = salesPlatformNo;
   }

   public String getSalesPlatformNo() {
      return this.salesPlatformNo;
   }

   public void setRelatedOrderNo(String relatedOrderNo) {
      this.relatedOrderNo = relatedOrderNo;
   }

   public String getRelatedOrderNo() {
      return this.relatedOrderNo;
   }

   public void setSerialVersion(String serialVersion) {
      this.serialVersion = serialVersion;
   }

   public String getSerialVersion() {
      return this.serialVersion;
   }

   public void setSerialBizType(Byte serialBizType) {
      this.serialBizType = serialBizType;
   }

   public Byte getSerialBizType() {
      return this.serialBizType;
   }

   public void setSerialDetailMapJson(String serialDetailMapJson) {
      this.serialDetailMapJson = serialDetailMapJson;
   }

   public String getSerialDetailMapJson() {
      return this.serialDetailMapJson;
   }

   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   public void setPlanQty(String planQty) {
      this.planQty = planQty;
   }

   public String getPlanQty() {
      return this.planQty;
   }

   public void setGoodsLevel(String goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   public String getGoodsLevel() {
      return this.goodsLevel;
   }

   public void setProductionDate(String productionDate) {
      this.productionDate = productionDate;
   }

   public String getProductionDate() {
      return this.productionDate;
   }

   public void setPackageBatchNo(String packageBatchNo) {
      this.packageBatchNo = packageBatchNo;
   }

   public String getPackageBatchNo() {
      return this.packageBatchNo;
   }

   public void setEclpOutOrderNo(String eclpOutOrderNo) {
      this.eclpOutOrderNo = eclpOutOrderNo;
   }

   public String getEclpOutOrderNo() {
      return this.eclpOutOrderNo;
   }

   public void setSellerOutOrderNo(String sellerOutOrderNo) {
      this.sellerOutOrderNo = sellerOutOrderNo;
   }

   public String getSellerOutOrderNo() {
      return this.sellerOutOrderNo;
   }

   public void setUnitPrice(String unitPrice) {
      this.unitPrice = unitPrice;
   }

   public String getUnitPrice() {
      return this.unitPrice;
   }

   public void setMoney(String money) {
      this.money = money;
   }

   public String getMoney() {
      return this.money;
   }

   public void setMediumPackage(String mediumPackage) {
      this.mediumPackage = mediumPackage;
   }

   public String getMediumPackage() {
      return this.mediumPackage;
   }

   public void setBigPackage(String bigPackage) {
      this.bigPackage = bigPackage;
   }

   public String getBigPackage() {
      return this.bigPackage;
   }

   public void setOrderLine(String orderLine) {
      this.orderLine = orderLine;
   }

   public String getOrderLine() {
      return this.orderLine;
   }

   public void setBatAttrListJson(String batAttrListJson) {
      this.batAttrListJson = batAttrListJson;
   }

   public String getBatAttrListJson() {
      return this.batAttrListJson;
   }

   public void setDeptGoodsNo(String deptGoodsNo) {
      this.deptGoodsNo = deptGoodsNo;
   }

   public String getDeptGoodsNo() {
      return this.deptGoodsNo;
   }

   public void setPlanRtwReasonNo(String planRtwReasonNo) {
      this.planRtwReasonNo = planRtwReasonNo;
   }

   public String getPlanRtwReasonNo() {
      return this.planRtwReasonNo;
   }

   public void setPlanRtwReasonDesc(String planRtwReasonDesc) {
      this.planRtwReasonDesc = planRtwReasonDesc;
   }

   public String getPlanRtwReasonDesc() {
      return this.planRtwReasonDesc;
   }

   public void setReserve1(String reserve1) {
      this.reserve1 = reserve1;
   }

   public String getReserve1() {
      return this.reserve1;
   }

   public String getApiMethod() {
      return "jingdong.eclp.rtw.addRtwOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("eclpSoNo", this.eclpSoNo);
      pmap.put("eclpRtwNo", this.eclpRtwNo);
      pmap.put("isvRtwNum", this.isvRtwNum);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("logicParam", this.logicParam);
      pmap.put("reson", this.reson);
      pmap.put("orderType", this.orderType);
      pmap.put("packageNo", this.packageNo);
      pmap.put("isvSoNo", this.isvSoNo);
      pmap.put("orderMark", this.orderMark);
      pmap.put("shipperName", this.shipperName);
      pmap.put("ownerNo", this.ownerNo);
      pmap.put("orderInType", this.orderInType);
      pmap.put("receiveLevel", this.receiveLevel);
      pmap.put("sellerRemark", this.sellerRemark);
      pmap.put("salesMan", this.salesMan);
      pmap.put("salesBillingStaff", this.salesBillingStaff);
      pmap.put("drugElectronicSupervisionCode", this.drugElectronicSupervisionCode);
      pmap.put("registerOrgNo", this.registerOrgNo);
      pmap.put("registerOrgName", this.registerOrgName);
      pmap.put("customerName", this.customerName);
      pmap.put("receivePriority", this.receivePriority);
      pmap.put("sellerRtwType", this.sellerRtwType);
      pmap.put("sellerRtwTypeName", this.sellerRtwTypeName);
      pmap.put("salesPlatformName", this.salesPlatformName);
      pmap.put("spSoNo", this.spSoNo);
      pmap.put("shopName", this.shopName);
      pmap.put("workOrderNo", this.workOrderNo);
      pmap.put("senderName", this.senderName);
      pmap.put("senderTelPhone", this.senderTelPhone);
      pmap.put("senderMobilePhone", this.senderMobilePhone);
      pmap.put("customerId", this.customerId);
      pmap.put("customField", this.customField);
      pmap.put("salesPlatformNo", this.salesPlatformNo);
      pmap.put("relatedOrderNo", this.relatedOrderNo);
      pmap.put("serialVersion", this.serialVersion);
      pmap.put("serialBizType", this.serialBizType);
      pmap.put("serialDetailMapJson", this.serialDetailMapJson);
      pmap.put("isvGoodsNo", this.isvGoodsNo);
      pmap.put("planQty", this.planQty);
      pmap.put("goodsLevel", this.goodsLevel);
      pmap.put("productionDate", this.productionDate);
      pmap.put("packageBatchNo", this.packageBatchNo);
      pmap.put("eclpOutOrderNo", this.eclpOutOrderNo);
      pmap.put("sellerOutOrderNo", this.sellerOutOrderNo);
      pmap.put("unitPrice", this.unitPrice);
      pmap.put("money", this.money);
      pmap.put("mediumPackage", this.mediumPackage);
      pmap.put("bigPackage", this.bigPackage);
      pmap.put("orderLine", this.orderLine);
      pmap.put("batAttrListJson", this.batAttrListJson);
      pmap.put("deptGoodsNo", this.deptGoodsNo);
      pmap.put("planRtwReasonNo", this.planRtwReasonNo);
      pmap.put("planRtwReasonDesc", this.planRtwReasonDesc);
      pmap.put("reserve1", this.reserve1);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpRtwAddRtwOrderResponse> getResponseClass() {
      return EclpRtwAddRtwOrderResponse.class;
   }
}
