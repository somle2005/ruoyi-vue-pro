package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpRtsIsvRtsTransferResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpRtsIsvRtsTransferRequest extends AbstractRequest implements JdRequest<EclpRtsIsvRtsTransferResponse> {
   private String eclpRtsNo;
   private String isvRtsNum;
   private String rtsType;
   private String deptNo;
   private String deliveryMode;
   private String warehouseNo;
   private String supplierNo;
   private String receiver;
   private String receiverPhone;
   private String email;
   private String province;
   private String city;
   private String county;
   private String town;
   private String address;
   private String createUser;
   private String packFlag;
   private String allowLack;
   private String logicParam;
   private String remark;
   private String purchaser;
   private String customField;
   private String sellerBizType;
   private String insuredPrice;
   private String deptGoodsNo;
   private String goodsName;
   private String quantity;
   private String realQuantity;
   private String goodsStatus;
   private String goodsLevel;
   private String lotProductionBatchNo;
   private String lotProductionDate;
   private String lotSupplier;
   private String batAttrListJson;
   private String goodsPrice;
   private String totalAmount;
   private String isvGoodsNo;
   private String orderLine;

   public void setEclpRtsNo(String eclpRtsNo) {
      this.eclpRtsNo = eclpRtsNo;
   }

   public String getEclpRtsNo() {
      return this.eclpRtsNo;
   }

   public void setIsvRtsNum(String isvRtsNum) {
      this.isvRtsNum = isvRtsNum;
   }

   public String getIsvRtsNum() {
      return this.isvRtsNum;
   }

   public void setRtsType(String rtsType) {
      this.rtsType = rtsType;
   }

   public String getRtsType() {
      return this.rtsType;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setDeliveryMode(String deliveryMode) {
      this.deliveryMode = deliveryMode;
   }

   public String getDeliveryMode() {
      return this.deliveryMode;
   }

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   public void setSupplierNo(String supplierNo) {
      this.supplierNo = supplierNo;
   }

   public String getSupplierNo() {
      return this.supplierNo;
   }

   public void setReceiver(String receiver) {
      this.receiver = receiver;
   }

   public String getReceiver() {
      return this.receiver;
   }

   public void setReceiverPhone(String receiverPhone) {
      this.receiverPhone = receiverPhone;
   }

   public String getReceiverPhone() {
      return this.receiverPhone;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getEmail() {
      return this.email;
   }

   public void setProvince(String province) {
      this.province = province;
   }

   public String getProvince() {
      return this.province;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getCity() {
      return this.city;
   }

   public void setCounty(String county) {
      this.county = county;
   }

   public String getCounty() {
      return this.county;
   }

   public void setTown(String town) {
      this.town = town;
   }

   public String getTown() {
      return this.town;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getAddress() {
      return this.address;
   }

   public void setCreateUser(String createUser) {
      this.createUser = createUser;
   }

   public String getCreateUser() {
      return this.createUser;
   }

   public void setPackFlag(String packFlag) {
      this.packFlag = packFlag;
   }

   public String getPackFlag() {
      return this.packFlag;
   }

   public void setAllowLack(String allowLack) {
      this.allowLack = allowLack;
   }

   public String getAllowLack() {
      return this.allowLack;
   }

   public void setLogicParam(String logicParam) {
      this.logicParam = logicParam;
   }

   public String getLogicParam() {
      return this.logicParam;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setPurchaser(String purchaser) {
      this.purchaser = purchaser;
   }

   public String getPurchaser() {
      return this.purchaser;
   }

   public void setCustomField(String customField) {
      this.customField = customField;
   }

   public String getCustomField() {
      return this.customField;
   }

   public void setSellerBizType(String sellerBizType) {
      this.sellerBizType = sellerBizType;
   }

   public String getSellerBizType() {
      return this.sellerBizType;
   }

   public void setInsuredPrice(String insuredPrice) {
      this.insuredPrice = insuredPrice;
   }

   public String getInsuredPrice() {
      return this.insuredPrice;
   }

   public void setDeptGoodsNo(String deptGoodsNo) {
      this.deptGoodsNo = deptGoodsNo;
   }

   public String getDeptGoodsNo() {
      return this.deptGoodsNo;
   }

   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   public String getGoodsName() {
      return this.goodsName;
   }

   public void setQuantity(String quantity) {
      this.quantity = quantity;
   }

   public String getQuantity() {
      return this.quantity;
   }

   public void setRealQuantity(String realQuantity) {
      this.realQuantity = realQuantity;
   }

   public String getRealQuantity() {
      return this.realQuantity;
   }

   public void setGoodsStatus(String goodsStatus) {
      this.goodsStatus = goodsStatus;
   }

   public String getGoodsStatus() {
      return this.goodsStatus;
   }

   public void setGoodsLevel(String goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   public String getGoodsLevel() {
      return this.goodsLevel;
   }

   public void setLotProductionBatchNo(String lotProductionBatchNo) {
      this.lotProductionBatchNo = lotProductionBatchNo;
   }

   public String getLotProductionBatchNo() {
      return this.lotProductionBatchNo;
   }

   public void setLotProductionDate(String lotProductionDate) {
      this.lotProductionDate = lotProductionDate;
   }

   public String getLotProductionDate() {
      return this.lotProductionDate;
   }

   public void setLotSupplier(String lotSupplier) {
      this.lotSupplier = lotSupplier;
   }

   public String getLotSupplier() {
      return this.lotSupplier;
   }

   public void setBatAttrListJson(String batAttrListJson) {
      this.batAttrListJson = batAttrListJson;
   }

   public String getBatAttrListJson() {
      return this.batAttrListJson;
   }

   public void setGoodsPrice(String goodsPrice) {
      this.goodsPrice = goodsPrice;
   }

   public String getGoodsPrice() {
      return this.goodsPrice;
   }

   public void setTotalAmount(String totalAmount) {
      this.totalAmount = totalAmount;
   }

   public String getTotalAmount() {
      return this.totalAmount;
   }

   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   public void setOrderLine(String orderLine) {
      this.orderLine = orderLine;
   }

   public String getOrderLine() {
      return this.orderLine;
   }

   public String getApiMethod() {
      return "jingdong.eclp.rts.isvRtsTransfer";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("eclpRtsNo", this.eclpRtsNo);
      pmap.put("isvRtsNum", this.isvRtsNum);
      pmap.put("rtsType", this.rtsType);
      pmap.put("deptNo", this.deptNo);
      pmap.put("deliveryMode", this.deliveryMode);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("supplierNo", this.supplierNo);
      pmap.put("receiver", this.receiver);
      pmap.put("receiverPhone", this.receiverPhone);
      pmap.put("email", this.email);
      pmap.put("province", this.province);
      pmap.put("city", this.city);
      pmap.put("county", this.county);
      pmap.put("town", this.town);
      pmap.put("address", this.address);
      pmap.put("createUser", this.createUser);
      pmap.put("packFlag", this.packFlag);
      pmap.put("allowLack", this.allowLack);
      pmap.put("logicParam", this.logicParam);
      pmap.put("remark", this.remark);
      pmap.put("purchaser", this.purchaser);
      pmap.put("customField", this.customField);
      pmap.put("sellerBizType", this.sellerBizType);
      pmap.put("insuredPrice", this.insuredPrice);
      pmap.put("deptGoodsNo", this.deptGoodsNo);
      pmap.put("goodsName", this.goodsName);
      pmap.put("quantity", this.quantity);
      pmap.put("realQuantity", this.realQuantity);
      pmap.put("goodsStatus", this.goodsStatus);
      pmap.put("goodsLevel", this.goodsLevel);
      pmap.put("lotProductionBatchNo", this.lotProductionBatchNo);
      pmap.put("lotProductionDate", this.lotProductionDate);
      pmap.put("lotSupplier", this.lotSupplier);
      pmap.put("batAttrListJson", this.batAttrListJson);
      pmap.put("goodsPrice", this.goodsPrice);
      pmap.put("totalAmount", this.totalAmount);
      pmap.put("isvGoodsNo", this.isvGoodsNo);
      pmap.put("orderLine", this.orderLine);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpRtsIsvRtsTransferResponse> getResponseClass() {
      return EclpRtsIsvRtsTransferResponse.class;
   }
}
