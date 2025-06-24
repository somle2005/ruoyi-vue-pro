package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCoEvaluateB2BLwbFreightMainResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpCoEvaluateB2BLwbFreightMainRequest extends AbstractRequest implements JdRequest<EclpCoEvaluateB2BLwbFreightMainResponse> {
   private String orderNo;
   private String deptNo;
   private String senderNickName;
   private String senderName;
   private String senderMobile;
   private String senderPhone;
   private String senderProvince;
   private String senderCity;
   private String senderCounty;
   private String senderTown;
   private String senderProvinceName;
   private String senderCityName;
   private String senderCountyName;
   private String senderTownName;
   private String senderAddress;
   private String receiverNickName;
   private String receiverName;
   private String receiverMobile;
   private String receiverPhone;
   private String receiverProvince;
   private String receiverCity;
   private String receiverCounty;
   private String receiverTown;
   private String receiverProvinceName;
   private String receiverCityName;
   private String receiverCountyName;
   private String receiverTownName;
   private String remark;
   private Double grossWeight;
   private Double grossVolume;
   private String createTime;
   private String createUser;
   private Double receivable;
   private Byte isCod;
   private String vehicleTypeName;
   private String vehicleTypeNo;
   private Integer vehicleQty;
   private String expressItemName;
   private Integer expressItemQty;
   private Byte signReceiptFlag;
   private Byte deliveryReceiptFlag;
   private Byte deliveryIntoWarehouse;
   private Byte loadFlag;
   private Byte unloadFlag;
   private Byte receiptFlag;
   private Byte fcFlag;
   private Double guaranteeValue;
   private String pickupBeginTime;
   private String pickupEndTime;
   private Byte bussinessType;
   private Byte deliveryType;
   private String senderCompany;
   private String receiverCompany;
   private String receiverAddress;
   private String warehouseCode;
   private String projectName;
   private String actualSpId;
   private Byte coldChainOn;
   private Byte temptureNum;
   private Byte qingzhenOn;
   private Byte yiwuranOn;
   private String inStorageNo;
   private Date inStorageTime;
   private String inStorageRemark;
   private Byte heavyUpstair;
   private String wayBillCode;

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setSenderNickName(String senderNickName) {
      this.senderNickName = senderNickName;
   }

   public String getSenderNickName() {
      return this.senderNickName;
   }

   public void setSenderName(String senderName) {
      this.senderName = senderName;
   }

   public String getSenderName() {
      return this.senderName;
   }

   public void setSenderMobile(String senderMobile) {
      this.senderMobile = senderMobile;
   }

   public String getSenderMobile() {
      return this.senderMobile;
   }

   public void setSenderPhone(String senderPhone) {
      this.senderPhone = senderPhone;
   }

   public String getSenderPhone() {
      return this.senderPhone;
   }

   public void setSenderProvince(String senderProvince) {
      this.senderProvince = senderProvince;
   }

   public String getSenderProvince() {
      return this.senderProvince;
   }

   public void setSenderCity(String senderCity) {
      this.senderCity = senderCity;
   }

   public String getSenderCity() {
      return this.senderCity;
   }

   public void setSenderCounty(String senderCounty) {
      this.senderCounty = senderCounty;
   }

   public String getSenderCounty() {
      return this.senderCounty;
   }

   public void setSenderTown(String senderTown) {
      this.senderTown = senderTown;
   }

   public String getSenderTown() {
      return this.senderTown;
   }

   public void setSenderProvinceName(String senderProvinceName) {
      this.senderProvinceName = senderProvinceName;
   }

   public String getSenderProvinceName() {
      return this.senderProvinceName;
   }

   public void setSenderCityName(String senderCityName) {
      this.senderCityName = senderCityName;
   }

   public String getSenderCityName() {
      return this.senderCityName;
   }

   public void setSenderCountyName(String senderCountyName) {
      this.senderCountyName = senderCountyName;
   }

   public String getSenderCountyName() {
      return this.senderCountyName;
   }

   public void setSenderTownName(String senderTownName) {
      this.senderTownName = senderTownName;
   }

   public String getSenderTownName() {
      return this.senderTownName;
   }

   public void setSenderAddress(String senderAddress) {
      this.senderAddress = senderAddress;
   }

   public String getSenderAddress() {
      return this.senderAddress;
   }

   public void setReceiverNickName(String receiverNickName) {
      this.receiverNickName = receiverNickName;
   }

   public String getReceiverNickName() {
      return this.receiverNickName;
   }

   public void setReceiverName(String receiverName) {
      this.receiverName = receiverName;
   }

   public String getReceiverName() {
      return this.receiverName;
   }

   public void setReceiverMobile(String receiverMobile) {
      this.receiverMobile = receiverMobile;
   }

   public String getReceiverMobile() {
      return this.receiverMobile;
   }

   public void setReceiverPhone(String receiverPhone) {
      this.receiverPhone = receiverPhone;
   }

   public String getReceiverPhone() {
      return this.receiverPhone;
   }

   public void setReceiverProvince(String receiverProvince) {
      this.receiverProvince = receiverProvince;
   }

   public String getReceiverProvince() {
      return this.receiverProvince;
   }

   public void setReceiverCity(String receiverCity) {
      this.receiverCity = receiverCity;
   }

   public String getReceiverCity() {
      return this.receiverCity;
   }

   public void setReceiverCounty(String receiverCounty) {
      this.receiverCounty = receiverCounty;
   }

   public String getReceiverCounty() {
      return this.receiverCounty;
   }

   public void setReceiverTown(String receiverTown) {
      this.receiverTown = receiverTown;
   }

   public String getReceiverTown() {
      return this.receiverTown;
   }

   public void setReceiverProvinceName(String receiverProvinceName) {
      this.receiverProvinceName = receiverProvinceName;
   }

   public String getReceiverProvinceName() {
      return this.receiverProvinceName;
   }

   public void setReceiverCityName(String receiverCityName) {
      this.receiverCityName = receiverCityName;
   }

   public String getReceiverCityName() {
      return this.receiverCityName;
   }

   public void setReceiverCountyName(String receiverCountyName) {
      this.receiverCountyName = receiverCountyName;
   }

   public String getReceiverCountyName() {
      return this.receiverCountyName;
   }

   public void setReceiverTownName(String receiverTownName) {
      this.receiverTownName = receiverTownName;
   }

   public String getReceiverTownName() {
      return this.receiverTownName;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setGrossWeight(Double grossWeight) {
      this.grossWeight = grossWeight;
   }

   public Double getGrossWeight() {
      return this.grossWeight;
   }

   public void setGrossVolume(Double grossVolume) {
      this.grossVolume = grossVolume;
   }

   public Double getGrossVolume() {
      return this.grossVolume;
   }

   public void setCreateTime(String createTime) {
      this.createTime = createTime;
   }

   public String getCreateTime() {
      return this.createTime;
   }

   public void setCreateUser(String createUser) {
      this.createUser = createUser;
   }

   public String getCreateUser() {
      return this.createUser;
   }

   public void setReceivable(Double receivable) {
      this.receivable = receivable;
   }

   public Double getReceivable() {
      return this.receivable;
   }

   public void setIsCod(Byte isCod) {
      this.isCod = isCod;
   }

   public Byte getIsCod() {
      return this.isCod;
   }

   public void setVehicleTypeName(String vehicleTypeName) {
      this.vehicleTypeName = vehicleTypeName;
   }

   public String getVehicleTypeName() {
      return this.vehicleTypeName;
   }

   public void setVehicleTypeNo(String vehicleTypeNo) {
      this.vehicleTypeNo = vehicleTypeNo;
   }

   public String getVehicleTypeNo() {
      return this.vehicleTypeNo;
   }

   public void setVehicleQty(Integer vehicleQty) {
      this.vehicleQty = vehicleQty;
   }

   public Integer getVehicleQty() {
      return this.vehicleQty;
   }

   public void setExpressItemName(String expressItemName) {
      this.expressItemName = expressItemName;
   }

   public String getExpressItemName() {
      return this.expressItemName;
   }

   public void setExpressItemQty(Integer expressItemQty) {
      this.expressItemQty = expressItemQty;
   }

   public Integer getExpressItemQty() {
      return this.expressItemQty;
   }

   public void setSignReceiptFlag(Byte signReceiptFlag) {
      this.signReceiptFlag = signReceiptFlag;
   }

   public Byte getSignReceiptFlag() {
      return this.signReceiptFlag;
   }

   public void setDeliveryReceiptFlag(Byte deliveryReceiptFlag) {
      this.deliveryReceiptFlag = deliveryReceiptFlag;
   }

   public Byte getDeliveryReceiptFlag() {
      return this.deliveryReceiptFlag;
   }

   public void setDeliveryIntoWarehouse(Byte deliveryIntoWarehouse) {
      this.deliveryIntoWarehouse = deliveryIntoWarehouse;
   }

   public Byte getDeliveryIntoWarehouse() {
      return this.deliveryIntoWarehouse;
   }

   public void setLoadFlag(Byte loadFlag) {
      this.loadFlag = loadFlag;
   }

   public Byte getLoadFlag() {
      return this.loadFlag;
   }

   public void setUnloadFlag(Byte unloadFlag) {
      this.unloadFlag = unloadFlag;
   }

   public Byte getUnloadFlag() {
      return this.unloadFlag;
   }

   public void setReceiptFlag(Byte receiptFlag) {
      this.receiptFlag = receiptFlag;
   }

   public Byte getReceiptFlag() {
      return this.receiptFlag;
   }

   public void setFcFlag(Byte fcFlag) {
      this.fcFlag = fcFlag;
   }

   public Byte getFcFlag() {
      return this.fcFlag;
   }

   public void setGuaranteeValue(Double guaranteeValue) {
      this.guaranteeValue = guaranteeValue;
   }

   public Double getGuaranteeValue() {
      return this.guaranteeValue;
   }

   public void setPickupBeginTime(String pickupBeginTime) {
      this.pickupBeginTime = pickupBeginTime;
   }

   public String getPickupBeginTime() {
      return this.pickupBeginTime;
   }

   public void setPickupEndTime(String pickupEndTime) {
      this.pickupEndTime = pickupEndTime;
   }

   public String getPickupEndTime() {
      return this.pickupEndTime;
   }

   public void setBussinessType(Byte bussinessType) {
      this.bussinessType = bussinessType;
   }

   public Byte getBussinessType() {
      return this.bussinessType;
   }

   public void setDeliveryType(Byte deliveryType) {
      this.deliveryType = deliveryType;
   }

   public Byte getDeliveryType() {
      return this.deliveryType;
   }

   public void setSenderCompany(String senderCompany) {
      this.senderCompany = senderCompany;
   }

   public String getSenderCompany() {
      return this.senderCompany;
   }

   public void setReceiverCompany(String receiverCompany) {
      this.receiverCompany = receiverCompany;
   }

   public String getReceiverCompany() {
      return this.receiverCompany;
   }

   public void setReceiverAddress(String receiverAddress) {
      this.receiverAddress = receiverAddress;
   }

   public String getReceiverAddress() {
      return this.receiverAddress;
   }

   public void setWarehouseCode(String warehouseCode) {
      this.warehouseCode = warehouseCode;
   }

   public String getWarehouseCode() {
      return this.warehouseCode;
   }

   public void setProjectName(String projectName) {
      this.projectName = projectName;
   }

   public String getProjectName() {
      return this.projectName;
   }

   public void setActualSpId(String actualSpId) {
      this.actualSpId = actualSpId;
   }

   public String getActualSpId() {
      return this.actualSpId;
   }

   public void setColdChainOn(Byte coldChainOn) {
      this.coldChainOn = coldChainOn;
   }

   public Byte getColdChainOn() {
      return this.coldChainOn;
   }

   public void setTemptureNum(Byte temptureNum) {
      this.temptureNum = temptureNum;
   }

   public Byte getTemptureNum() {
      return this.temptureNum;
   }

   public void setQingzhenOn(Byte qingzhenOn) {
      this.qingzhenOn = qingzhenOn;
   }

   public Byte getQingzhenOn() {
      return this.qingzhenOn;
   }

   public void setYiwuranOn(Byte yiwuranOn) {
      this.yiwuranOn = yiwuranOn;
   }

   public Byte getYiwuranOn() {
      return this.yiwuranOn;
   }

   public void setInStorageNo(String inStorageNo) {
      this.inStorageNo = inStorageNo;
   }

   public String getInStorageNo() {
      return this.inStorageNo;
   }

   public void setInStorageTime(Date inStorageTime) {
      this.inStorageTime = inStorageTime;
   }

   public Date getInStorageTime() {
      return this.inStorageTime;
   }

   public void setInStorageRemark(String inStorageRemark) {
      this.inStorageRemark = inStorageRemark;
   }

   public String getInStorageRemark() {
      return this.inStorageRemark;
   }

   public void setHeavyUpstair(Byte heavyUpstair) {
      this.heavyUpstair = heavyUpstair;
   }

   public Byte getHeavyUpstair() {
      return this.heavyUpstair;
   }

   public void setWayBillCode(String wayBillCode) {
      this.wayBillCode = wayBillCode;
   }

   public String getWayBillCode() {
      return this.wayBillCode;
   }

   public String getApiMethod() {
      return "jingdong.eclp.co.evaluateB2BLwbFreightMain";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderNo", this.orderNo);
      pmap.put("deptNo", this.deptNo);
      pmap.put("senderNickName", this.senderNickName);
      pmap.put("senderName", this.senderName);
      pmap.put("senderMobile", this.senderMobile);
      pmap.put("senderPhone", this.senderPhone);
      pmap.put("senderProvince", this.senderProvince);
      pmap.put("senderCity", this.senderCity);
      pmap.put("senderCounty", this.senderCounty);
      pmap.put("senderTown", this.senderTown);
      pmap.put("senderProvinceName", this.senderProvinceName);
      pmap.put("senderCityName", this.senderCityName);
      pmap.put("senderCountyName", this.senderCountyName);
      pmap.put("senderTownName", this.senderTownName);
      pmap.put("senderAddress", this.senderAddress);
      pmap.put("receiverNickName", this.receiverNickName);
      pmap.put("receiverName", this.receiverName);
      pmap.put("receiverMobile", this.receiverMobile);
      pmap.put("receiverPhone", this.receiverPhone);
      pmap.put("receiverProvince", this.receiverProvince);
      pmap.put("receiverCity", this.receiverCity);
      pmap.put("receiverCounty", this.receiverCounty);
      pmap.put("receiverTown", this.receiverTown);
      pmap.put("receiverProvinceName", this.receiverProvinceName);
      pmap.put("receiverCityName", this.receiverCityName);
      pmap.put("receiverCountyName", this.receiverCountyName);
      pmap.put("receiverTownName", this.receiverTownName);
      pmap.put("remark", this.remark);
      pmap.put("grossWeight", this.grossWeight);
      pmap.put("grossVolume", this.grossVolume);
      pmap.put("createTime", this.createTime);
      pmap.put("createUser", this.createUser);
      pmap.put("receivable", this.receivable);
      pmap.put("isCod", this.isCod);
      pmap.put("vehicleTypeName", this.vehicleTypeName);
      pmap.put("vehicleTypeNo", this.vehicleTypeNo);
      pmap.put("vehicleQty", this.vehicleQty);
      pmap.put("expressItemName", this.expressItemName);
      pmap.put("expressItemQty", this.expressItemQty);
      pmap.put("signReceiptFlag", this.signReceiptFlag);
      pmap.put("deliveryReceiptFlag", this.deliveryReceiptFlag);
      pmap.put("deliveryIntoWarehouse", this.deliveryIntoWarehouse);
      pmap.put("loadFlag", this.loadFlag);
      pmap.put("unloadFlag", this.unloadFlag);
      pmap.put("receiptFlag", this.receiptFlag);
      pmap.put("fcFlag", this.fcFlag);
      pmap.put("guaranteeValue", this.guaranteeValue);
      pmap.put("pickupBeginTime", this.pickupBeginTime);
      pmap.put("pickupEndTime", this.pickupEndTime);
      pmap.put("bussinessType", this.bussinessType);
      pmap.put("deliveryType", this.deliveryType);
      pmap.put("senderCompany", this.senderCompany);
      pmap.put("receiverCompany", this.receiverCompany);
      pmap.put("receiverAddress", this.receiverAddress);
      pmap.put("warehouseCode", this.warehouseCode);
      pmap.put("projectName", this.projectName);
      pmap.put("actualSpId", this.actualSpId);
      pmap.put("coldChainOn", this.coldChainOn);
      pmap.put("temptureNum", this.temptureNum);
      pmap.put("qingzhenOn", this.qingzhenOn);
      pmap.put("yiwuranOn", this.yiwuranOn);
      pmap.put("inStorageNo", this.inStorageNo);

      try {
         if (this.inStorageTime != null) {
            pmap.put("inStorageTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.inStorageTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("inStorageRemark", this.inStorageRemark);
      pmap.put("heavyUpstair", this.heavyUpstair);
      pmap.put("wayBillCode", this.wayBillCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCoEvaluateB2BLwbFreightMainResponse> getResponseClass() {
      return EclpCoEvaluateB2BLwbFreightMainResponse.class;
   }
}
