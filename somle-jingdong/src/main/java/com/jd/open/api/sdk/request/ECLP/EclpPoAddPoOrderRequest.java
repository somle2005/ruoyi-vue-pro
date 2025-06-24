package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpPoAddPoOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpPoAddPoOrderRequest extends AbstractRequest implements JdRequest<EclpPoAddPoOrderResponse> {
   private String spPoOrderNo;
   private String deptNo;
   private String referenceOrder;
   private String inboundRemark;
   private String buyer;
   private String logicParam;
   private String supplierNo;
   private String sellerSaleOrder;
   private String saleOrder;
   private String orderMark;
   private String billType;
   private String acceptUnQcFlag;
   private String boxFlag;
   private String entirePrice;
   private String boxNo;
   private String boxGoodsNo;
   private String boxGoodsQty;
   private String boxSerialNo;
   private String boxIsvGoodsNo;
   private int poReturnMode;
   private String customsInfo;
   private String poType;
   private String billOfLading;
   private Byte receiveLevel;
   private Byte multiReceivingFlag;
   private String waybillNo;
   private String isvOutWarehouse;
   private Byte bizType;
   private Byte waitBoxDetailFlag;
   private Byte unitFlag;
   private String serialDetailMapJson;
   private String serialNoScopeMapJson;
   private Byte allowLackFlag;
   private Byte isUpdate;
   private String sellerOrderType;
   private String customField;
   private String sellerWarehouseNo;
   private String whNo;
   private String soNo;
   private String deptGoodsNo;
   private String isvGoodsNo;
   private String numApplication;
   private String goodsStatus;
   private String barCodeType;
   private String sidCheckout;
   private String unitPrice;
   private String totalPrice;
   private String qualityCheckRate;
   private String batAttrListJson;
   private String orderLine;
   private String isvLotattrs;
   private String checkLotattrs;
   private String goodsPrice;
   private String warehousingFlag;
   private String isvGoodsUnit;

   public void setSpPoOrderNo(String spPoOrderNo) {
      this.spPoOrderNo = spPoOrderNo;
   }

   public String getSpPoOrderNo() {
      return this.spPoOrderNo;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setReferenceOrder(String referenceOrder) {
      this.referenceOrder = referenceOrder;
   }

   public String getReferenceOrder() {
      return this.referenceOrder;
   }

   public void setInboundRemark(String inboundRemark) {
      this.inboundRemark = inboundRemark;
   }

   public String getInboundRemark() {
      return this.inboundRemark;
   }

   public void setBuyer(String buyer) {
      this.buyer = buyer;
   }

   public String getBuyer() {
      return this.buyer;
   }

   public void setLogicParam(String logicParam) {
      this.logicParam = logicParam;
   }

   public String getLogicParam() {
      return this.logicParam;
   }

   public void setSupplierNo(String supplierNo) {
      this.supplierNo = supplierNo;
   }

   public String getSupplierNo() {
      return this.supplierNo;
   }

   public void setSellerSaleOrder(String sellerSaleOrder) {
      this.sellerSaleOrder = sellerSaleOrder;
   }

   public String getSellerSaleOrder() {
      return this.sellerSaleOrder;
   }

   public void setSaleOrder(String saleOrder) {
      this.saleOrder = saleOrder;
   }

   public String getSaleOrder() {
      return this.saleOrder;
   }

   public void setOrderMark(String orderMark) {
      this.orderMark = orderMark;
   }

   public String getOrderMark() {
      return this.orderMark;
   }

   public void setBillType(String billType) {
      this.billType = billType;
   }

   public String getBillType() {
      return this.billType;
   }

   public void setAcceptUnQcFlag(String acceptUnQcFlag) {
      this.acceptUnQcFlag = acceptUnQcFlag;
   }

   public String getAcceptUnQcFlag() {
      return this.acceptUnQcFlag;
   }

   public void setBoxFlag(String boxFlag) {
      this.boxFlag = boxFlag;
   }

   public String getBoxFlag() {
      return this.boxFlag;
   }

   public void setEntirePrice(String entirePrice) {
      this.entirePrice = entirePrice;
   }

   public String getEntirePrice() {
      return this.entirePrice;
   }

   public void setBoxNo(String boxNo) {
      this.boxNo = boxNo;
   }

   public String getBoxNo() {
      return this.boxNo;
   }

   public void setBoxGoodsNo(String boxGoodsNo) {
      this.boxGoodsNo = boxGoodsNo;
   }

   public String getBoxGoodsNo() {
      return this.boxGoodsNo;
   }

   public void setBoxGoodsQty(String boxGoodsQty) {
      this.boxGoodsQty = boxGoodsQty;
   }

   public String getBoxGoodsQty() {
      return this.boxGoodsQty;
   }

   public void setBoxSerialNo(String boxSerialNo) {
      this.boxSerialNo = boxSerialNo;
   }

   public String getBoxSerialNo() {
      return this.boxSerialNo;
   }

   public void setBoxIsvGoodsNo(String boxIsvGoodsNo) {
      this.boxIsvGoodsNo = boxIsvGoodsNo;
   }

   public String getBoxIsvGoodsNo() {
      return this.boxIsvGoodsNo;
   }

   public void setPoReturnMode(int poReturnMode) {
      this.poReturnMode = poReturnMode;
   }

   public int getPoReturnMode() {
      return this.poReturnMode;
   }

   public void setCustomsInfo(String customsInfo) {
      this.customsInfo = customsInfo;
   }

   public String getCustomsInfo() {
      return this.customsInfo;
   }

   public void setPoType(String poType) {
      this.poType = poType;
   }

   public String getPoType() {
      return this.poType;
   }

   public void setBillOfLading(String billOfLading) {
      this.billOfLading = billOfLading;
   }

   public String getBillOfLading() {
      return this.billOfLading;
   }

   public void setReceiveLevel(Byte receiveLevel) {
      this.receiveLevel = receiveLevel;
   }

   public Byte getReceiveLevel() {
      return this.receiveLevel;
   }

   public void setMultiReceivingFlag(Byte multiReceivingFlag) {
      this.multiReceivingFlag = multiReceivingFlag;
   }

   public Byte getMultiReceivingFlag() {
      return this.multiReceivingFlag;
   }

   public void setWaybillNo(String waybillNo) {
      this.waybillNo = waybillNo;
   }

   public String getWaybillNo() {
      return this.waybillNo;
   }

   public void setIsvOutWarehouse(String isvOutWarehouse) {
      this.isvOutWarehouse = isvOutWarehouse;
   }

   public String getIsvOutWarehouse() {
      return this.isvOutWarehouse;
   }

   public void setBizType(Byte bizType) {
      this.bizType = bizType;
   }

   public Byte getBizType() {
      return this.bizType;
   }

   public void setWaitBoxDetailFlag(Byte waitBoxDetailFlag) {
      this.waitBoxDetailFlag = waitBoxDetailFlag;
   }

   public Byte getWaitBoxDetailFlag() {
      return this.waitBoxDetailFlag;
   }

   public void setUnitFlag(Byte unitFlag) {
      this.unitFlag = unitFlag;
   }

   public Byte getUnitFlag() {
      return this.unitFlag;
   }

   public void setSerialDetailMapJson(String serialDetailMapJson) {
      this.serialDetailMapJson = serialDetailMapJson;
   }

   public String getSerialDetailMapJson() {
      return this.serialDetailMapJson;
   }

   public void setSerialNoScopeMapJson(String serialNoScopeMapJson) {
      this.serialNoScopeMapJson = serialNoScopeMapJson;
   }

   public String getSerialNoScopeMapJson() {
      return this.serialNoScopeMapJson;
   }

   public void setAllowLackFlag(Byte allowLackFlag) {
      this.allowLackFlag = allowLackFlag;
   }

   public Byte getAllowLackFlag() {
      return this.allowLackFlag;
   }

   public void setIsUpdate(Byte isUpdate) {
      this.isUpdate = isUpdate;
   }

   public Byte getIsUpdate() {
      return this.isUpdate;
   }

   public void setSellerOrderType(String sellerOrderType) {
      this.sellerOrderType = sellerOrderType;
   }

   public String getSellerOrderType() {
      return this.sellerOrderType;
   }

   public void setCustomField(String customField) {
      this.customField = customField;
   }

   public String getCustomField() {
      return this.customField;
   }

   public void setSellerWarehouseNo(String sellerWarehouseNo) {
      this.sellerWarehouseNo = sellerWarehouseNo;
   }

   public String getSellerWarehouseNo() {
      return this.sellerWarehouseNo;
   }

   public void setWhNo(String whNo) {
      this.whNo = whNo;
   }

   public String getWhNo() {
      return this.whNo;
   }

   public void setSoNo(String soNo) {
      this.soNo = soNo;
   }

   public String getSoNo() {
      return this.soNo;
   }

   public void setDeptGoodsNo(String deptGoodsNo) {
      this.deptGoodsNo = deptGoodsNo;
   }

   public String getDeptGoodsNo() {
      return this.deptGoodsNo;
   }

   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   public void setNumApplication(String numApplication) {
      this.numApplication = numApplication;
   }

   public String getNumApplication() {
      return this.numApplication;
   }

   public void setGoodsStatus(String goodsStatus) {
      this.goodsStatus = goodsStatus;
   }

   public String getGoodsStatus() {
      return this.goodsStatus;
   }

   public void setBarCodeType(String barCodeType) {
      this.barCodeType = barCodeType;
   }

   public String getBarCodeType() {
      return this.barCodeType;
   }

   public void setSidCheckout(String sidCheckout) {
      this.sidCheckout = sidCheckout;
   }

   public String getSidCheckout() {
      return this.sidCheckout;
   }

   public void setUnitPrice(String unitPrice) {
      this.unitPrice = unitPrice;
   }

   public String getUnitPrice() {
      return this.unitPrice;
   }

   public void setTotalPrice(String totalPrice) {
      this.totalPrice = totalPrice;
   }

   public String getTotalPrice() {
      return this.totalPrice;
   }

   public void setQualityCheckRate(String qualityCheckRate) {
      this.qualityCheckRate = qualityCheckRate;
   }

   public String getQualityCheckRate() {
      return this.qualityCheckRate;
   }

   public void setBatAttrListJson(String batAttrListJson) {
      this.batAttrListJson = batAttrListJson;
   }

   public String getBatAttrListJson() {
      return this.batAttrListJson;
   }

   public void setOrderLine(String orderLine) {
      this.orderLine = orderLine;
   }

   public String getOrderLine() {
      return this.orderLine;
   }

   public void setIsvLotattrs(String isvLotattrs) {
      this.isvLotattrs = isvLotattrs;
   }

   public String getIsvLotattrs() {
      return this.isvLotattrs;
   }

   public void setCheckLotattrs(String checkLotattrs) {
      this.checkLotattrs = checkLotattrs;
   }

   public String getCheckLotattrs() {
      return this.checkLotattrs;
   }

   public void setGoodsPrice(String goodsPrice) {
      this.goodsPrice = goodsPrice;
   }

   public String getGoodsPrice() {
      return this.goodsPrice;
   }

   public void setWarehousingFlag(String warehousingFlag) {
      this.warehousingFlag = warehousingFlag;
   }

   public String getWarehousingFlag() {
      return this.warehousingFlag;
   }

   public void setIsvGoodsUnit(String isvGoodsUnit) {
      this.isvGoodsUnit = isvGoodsUnit;
   }

   public String getIsvGoodsUnit() {
      return this.isvGoodsUnit;
   }

   public String getApiMethod() {
      return "jingdong.eclp.po.addPoOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("spPoOrderNo", this.spPoOrderNo);
      pmap.put("deptNo", this.deptNo);
      pmap.put("referenceOrder", this.referenceOrder);
      pmap.put("inboundRemark", this.inboundRemark);
      pmap.put("buyer", this.buyer);
      pmap.put("logicParam", this.logicParam);
      pmap.put("supplierNo", this.supplierNo);
      pmap.put("sellerSaleOrder", this.sellerSaleOrder);
      pmap.put("saleOrder", this.saleOrder);
      pmap.put("orderMark", this.orderMark);
      pmap.put("billType", this.billType);
      pmap.put("acceptUnQcFlag", this.acceptUnQcFlag);
      pmap.put("boxFlag", this.boxFlag);
      pmap.put("entirePrice", this.entirePrice);
      pmap.put("boxNo", this.boxNo);
      pmap.put("boxGoodsNo", this.boxGoodsNo);
      pmap.put("boxGoodsQty", this.boxGoodsQty);
      pmap.put("boxSerialNo", this.boxSerialNo);
      pmap.put("boxIsvGoodsNo", this.boxIsvGoodsNo);
      pmap.put("poReturnMode", this.poReturnMode);
      pmap.put("customsInfo", this.customsInfo);
      pmap.put("poType", this.poType);
      pmap.put("billOfLading", this.billOfLading);
      pmap.put("receiveLevel", this.receiveLevel);
      pmap.put("multiReceivingFlag", this.multiReceivingFlag);
      pmap.put("waybillNo", this.waybillNo);
      pmap.put("isvOutWarehouse", this.isvOutWarehouse);
      pmap.put("bizType", this.bizType);
      pmap.put("waitBoxDetailFlag", this.waitBoxDetailFlag);
      pmap.put("unitFlag", this.unitFlag);
      pmap.put("serialDetailMapJson", this.serialDetailMapJson);
      pmap.put("serialNoScopeMapJson", this.serialNoScopeMapJson);
      pmap.put("allowLackFlag", this.allowLackFlag);
      pmap.put("isUpdate", this.isUpdate);
      pmap.put("sellerOrderType", this.sellerOrderType);
      pmap.put("customField", this.customField);
      pmap.put("sellerWarehouseNo", this.sellerWarehouseNo);
      pmap.put("whNo", this.whNo);
      pmap.put("soNo", this.soNo);
      pmap.put("deptGoodsNo", this.deptGoodsNo);
      pmap.put("isvGoodsNo", this.isvGoodsNo);
      pmap.put("numApplication", this.numApplication);
      pmap.put("goodsStatus", this.goodsStatus);
      pmap.put("barCodeType", this.barCodeType);
      pmap.put("sidCheckout", this.sidCheckout);
      pmap.put("unitPrice", this.unitPrice);
      pmap.put("totalPrice", this.totalPrice);
      pmap.put("qualityCheckRate", this.qualityCheckRate);
      pmap.put("batAttrListJson", this.batAttrListJson);
      pmap.put("orderLine", this.orderLine);
      pmap.put("isvLotattrs", this.isvLotattrs);
      pmap.put("checkLotattrs", this.checkLotattrs);
      pmap.put("goodsPrice", this.goodsPrice);
      pmap.put("warehousingFlag", this.warehousingFlag);
      pmap.put("isvGoodsUnit", this.isvGoodsUnit);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpPoAddPoOrderResponse> getResponseClass() {
      return EclpPoAddPoOrderResponse.class;
   }
}
