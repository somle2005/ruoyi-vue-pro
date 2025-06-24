package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCoCreateWbOrderResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpCoCreateWbOrderRequest extends AbstractRequest implements JdRequest<EclpCoCreateWbOrderResponse> {
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
   private Long spId;
   private String saleOrderNo;
   private Byte packageServiceOn;
   private Byte deliveryMthd;
   private String providerCode;
   private String packageNo;
   private String clientNo;
   private Byte orderType;
   private Byte siteCollect;
   private Byte siteDelivery;
   private Byte quarantineCert;
   private Integer selfCollectSiteId;
   private Integer selfDeliverySiteId;
   private String expectedArrivalStartTime;
   private String expectedArrivalEndTime;
   private String vehicleOrderNo;
   private Byte messageSign;
   private Byte checkPreSort;
   private String receiverNameSplit;
   private String receiverCompanySplit;
   private String receiverMobileSplit;
   private String receiverPhoneSplit;
   private String receiverProvinceNameSplit;
   private String receiverProvinceSplit;
   private String receiverCityNameSplit;
   private String receiverCitySplit;
   private String receiverCountyNameSplit;
   private String receiverCountySplit;
   private String receiverTownNameSplit;
   private String receiverTownSplit;
   private String receiverAddressSplit;
   private String expectedArrivalStartTimeSplit;
   private String expectedArrivalEndTimeSplit;
   private String orderNoSplit;
   private String expressItemNameSplit;
   private String grossVolumeSplit;
   private String grossWeightSplit;
   private String expressItemQtySplit;
   private String temptureNumSplit;
   private String quarantineCertSplit;
   private String deliveryIntoWarehouseSplit;
   private String inStorageNoSplit;
   private String inStorageTimeSplit;
   private String inStorageRemarkSplit;
   private String loadFlagSplit;
   private String unloadFlagSplit;
   private String remarkSplit;
   private String packageModelNosSplit;
   private String qingzhenOnSplit;
   private String yiwuranOnSplit;
   private String receiverNickNameSplit;
   private String guaranteeValueSplit;
   private String heavyUpstairSplit;
   private String hospitalServicesYYSplit;
   private Double isvOrderAmount;
   private Byte tracker;
   private Byte deliveryMode;
   private Byte warehouseServiceType;
   private Byte homeDeliveryOn;
   private String siteCode;
   private String referCancelDate;
   private Byte rebackConfluenceOn;
   private Byte expressDeliveryOn;
   private String expectPickupDate;
   private String expectDeliveryDate;
   private String warehousePlatformName;
   private Byte temporaryStorage;
   private String predictReceiptDate;
   private String extendFieldStr;
   private Byte peaceMindReceive;
   private String backInfoOn;
   private String backName;
   private String backMobile;
   private String backPhone;
   private String backProvinceName;
   private String backCityName;
   private String backCountyName;
   private String backTownName;
   private String backAddress;
   private Byte importFlag;
   private Byte fileWithCargo;
   private Byte hospitalServicesYY;
   private String param;
   private String oaid;
   private String param1;
   private String platOrderType;
   private String packageName;
   private String unpackingService;

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

   public void setSpId(Long spId) {
      this.spId = spId;
   }

   public Long getSpId() {
      return this.spId;
   }

   public void setSaleOrderNo(String saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   public String getSaleOrderNo() {
      return this.saleOrderNo;
   }

   public void setPackageServiceOn(Byte packageServiceOn) {
      this.packageServiceOn = packageServiceOn;
   }

   public Byte getPackageServiceOn() {
      return this.packageServiceOn;
   }

   public void setDeliveryMthd(Byte deliveryMthd) {
      this.deliveryMthd = deliveryMthd;
   }

   public Byte getDeliveryMthd() {
      return this.deliveryMthd;
   }

   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   public String getProviderCode() {
      return this.providerCode;
   }

   public void setPackageNo(String packageNo) {
      this.packageNo = packageNo;
   }

   public String getPackageNo() {
      return this.packageNo;
   }

   public void setClientNo(String clientNo) {
      this.clientNo = clientNo;
   }

   public String getClientNo() {
      return this.clientNo;
   }

   public void setOrderType(Byte orderType) {
      this.orderType = orderType;
   }

   public Byte getOrderType() {
      return this.orderType;
   }

   public void setSiteCollect(Byte siteCollect) {
      this.siteCollect = siteCollect;
   }

   public Byte getSiteCollect() {
      return this.siteCollect;
   }

   public void setSiteDelivery(Byte siteDelivery) {
      this.siteDelivery = siteDelivery;
   }

   public Byte getSiteDelivery() {
      return this.siteDelivery;
   }

   public void setQuarantineCert(Byte quarantineCert) {
      this.quarantineCert = quarantineCert;
   }

   public Byte getQuarantineCert() {
      return this.quarantineCert;
   }

   public void setSelfCollectSiteId(Integer selfCollectSiteId) {
      this.selfCollectSiteId = selfCollectSiteId;
   }

   public Integer getSelfCollectSiteId() {
      return this.selfCollectSiteId;
   }

   public void setSelfDeliverySiteId(Integer selfDeliverySiteId) {
      this.selfDeliverySiteId = selfDeliverySiteId;
   }

   public Integer getSelfDeliverySiteId() {
      return this.selfDeliverySiteId;
   }

   public void setExpectedArrivalStartTime(String expectedArrivalStartTime) {
      this.expectedArrivalStartTime = expectedArrivalStartTime;
   }

   public String getExpectedArrivalStartTime() {
      return this.expectedArrivalStartTime;
   }

   public void setExpectedArrivalEndTime(String expectedArrivalEndTime) {
      this.expectedArrivalEndTime = expectedArrivalEndTime;
   }

   public String getExpectedArrivalEndTime() {
      return this.expectedArrivalEndTime;
   }

   public void setVehicleOrderNo(String vehicleOrderNo) {
      this.vehicleOrderNo = vehicleOrderNo;
   }

   public String getVehicleOrderNo() {
      return this.vehicleOrderNo;
   }

   public void setMessageSign(Byte messageSign) {
      this.messageSign = messageSign;
   }

   public Byte getMessageSign() {
      return this.messageSign;
   }

   public void setCheckPreSort(Byte checkPreSort) {
      this.checkPreSort = checkPreSort;
   }

   public Byte getCheckPreSort() {
      return this.checkPreSort;
   }

   public void setReceiverNameSplit(String receiverNameSplit) {
      this.receiverNameSplit = receiverNameSplit;
   }

   public String getReceiverNameSplit() {
      return this.receiverNameSplit;
   }

   public void setReceiverCompanySplit(String receiverCompanySplit) {
      this.receiverCompanySplit = receiverCompanySplit;
   }

   public String getReceiverCompanySplit() {
      return this.receiverCompanySplit;
   }

   public void setReceiverMobileSplit(String receiverMobileSplit) {
      this.receiverMobileSplit = receiverMobileSplit;
   }

   public String getReceiverMobileSplit() {
      return this.receiverMobileSplit;
   }

   public void setReceiverPhoneSplit(String receiverPhoneSplit) {
      this.receiverPhoneSplit = receiverPhoneSplit;
   }

   public String getReceiverPhoneSplit() {
      return this.receiverPhoneSplit;
   }

   public void setReceiverProvinceNameSplit(String receiverProvinceNameSplit) {
      this.receiverProvinceNameSplit = receiverProvinceNameSplit;
   }

   public String getReceiverProvinceNameSplit() {
      return this.receiverProvinceNameSplit;
   }

   public void setReceiverProvinceSplit(String receiverProvinceSplit) {
      this.receiverProvinceSplit = receiverProvinceSplit;
   }

   public String getReceiverProvinceSplit() {
      return this.receiverProvinceSplit;
   }

   public void setReceiverCityNameSplit(String receiverCityNameSplit) {
      this.receiverCityNameSplit = receiverCityNameSplit;
   }

   public String getReceiverCityNameSplit() {
      return this.receiverCityNameSplit;
   }

   public void setReceiverCitySplit(String receiverCitySplit) {
      this.receiverCitySplit = receiverCitySplit;
   }

   public String getReceiverCitySplit() {
      return this.receiverCitySplit;
   }

   public void setReceiverCountyNameSplit(String receiverCountyNameSplit) {
      this.receiverCountyNameSplit = receiverCountyNameSplit;
   }

   public String getReceiverCountyNameSplit() {
      return this.receiverCountyNameSplit;
   }

   public void setReceiverCountySplit(String receiverCountySplit) {
      this.receiverCountySplit = receiverCountySplit;
   }

   public String getReceiverCountySplit() {
      return this.receiverCountySplit;
   }

   public void setReceiverTownNameSplit(String receiverTownNameSplit) {
      this.receiverTownNameSplit = receiverTownNameSplit;
   }

   public String getReceiverTownNameSplit() {
      return this.receiverTownNameSplit;
   }

   public void setReceiverTownSplit(String receiverTownSplit) {
      this.receiverTownSplit = receiverTownSplit;
   }

   public String getReceiverTownSplit() {
      return this.receiverTownSplit;
   }

   public void setReceiverAddressSplit(String receiverAddressSplit) {
      this.receiverAddressSplit = receiverAddressSplit;
   }

   public String getReceiverAddressSplit() {
      return this.receiverAddressSplit;
   }

   public void setExpectedArrivalStartTimeSplit(String expectedArrivalStartTimeSplit) {
      this.expectedArrivalStartTimeSplit = expectedArrivalStartTimeSplit;
   }

   public String getExpectedArrivalStartTimeSplit() {
      return this.expectedArrivalStartTimeSplit;
   }

   public void setExpectedArrivalEndTimeSplit(String expectedArrivalEndTimeSplit) {
      this.expectedArrivalEndTimeSplit = expectedArrivalEndTimeSplit;
   }

   public String getExpectedArrivalEndTimeSplit() {
      return this.expectedArrivalEndTimeSplit;
   }

   public void setOrderNoSplit(String orderNoSplit) {
      this.orderNoSplit = orderNoSplit;
   }

   public String getOrderNoSplit() {
      return this.orderNoSplit;
   }

   public void setExpressItemNameSplit(String expressItemNameSplit) {
      this.expressItemNameSplit = expressItemNameSplit;
   }

   public String getExpressItemNameSplit() {
      return this.expressItemNameSplit;
   }

   public void setGrossVolumeSplit(String grossVolumeSplit) {
      this.grossVolumeSplit = grossVolumeSplit;
   }

   public String getGrossVolumeSplit() {
      return this.grossVolumeSplit;
   }

   public void setGrossWeightSplit(String grossWeightSplit) {
      this.grossWeightSplit = grossWeightSplit;
   }

   public String getGrossWeightSplit() {
      return this.grossWeightSplit;
   }

   public void setExpressItemQtySplit(String expressItemQtySplit) {
      this.expressItemQtySplit = expressItemQtySplit;
   }

   public String getExpressItemQtySplit() {
      return this.expressItemQtySplit;
   }

   public void setTemptureNumSplit(String temptureNumSplit) {
      this.temptureNumSplit = temptureNumSplit;
   }

   public String getTemptureNumSplit() {
      return this.temptureNumSplit;
   }

   public void setQuarantineCertSplit(String quarantineCertSplit) {
      this.quarantineCertSplit = quarantineCertSplit;
   }

   public String getQuarantineCertSplit() {
      return this.quarantineCertSplit;
   }

   public void setDeliveryIntoWarehouseSplit(String deliveryIntoWarehouseSplit) {
      this.deliveryIntoWarehouseSplit = deliveryIntoWarehouseSplit;
   }

   public String getDeliveryIntoWarehouseSplit() {
      return this.deliveryIntoWarehouseSplit;
   }

   public void setInStorageNoSplit(String inStorageNoSplit) {
      this.inStorageNoSplit = inStorageNoSplit;
   }

   public String getInStorageNoSplit() {
      return this.inStorageNoSplit;
   }

   public void setInStorageTimeSplit(String inStorageTimeSplit) {
      this.inStorageTimeSplit = inStorageTimeSplit;
   }

   public String getInStorageTimeSplit() {
      return this.inStorageTimeSplit;
   }

   public void setInStorageRemarkSplit(String inStorageRemarkSplit) {
      this.inStorageRemarkSplit = inStorageRemarkSplit;
   }

   public String getInStorageRemarkSplit() {
      return this.inStorageRemarkSplit;
   }

   public void setLoadFlagSplit(String loadFlagSplit) {
      this.loadFlagSplit = loadFlagSplit;
   }

   public String getLoadFlagSplit() {
      return this.loadFlagSplit;
   }

   public void setUnloadFlagSplit(String unloadFlagSplit) {
      this.unloadFlagSplit = unloadFlagSplit;
   }

   public String getUnloadFlagSplit() {
      return this.unloadFlagSplit;
   }

   public void setRemarkSplit(String remarkSplit) {
      this.remarkSplit = remarkSplit;
   }

   public String getRemarkSplit() {
      return this.remarkSplit;
   }

   public void setPackageModelNosSplit(String packageModelNosSplit) {
      this.packageModelNosSplit = packageModelNosSplit;
   }

   public String getPackageModelNosSplit() {
      return this.packageModelNosSplit;
   }

   public void setQingzhenOnSplit(String qingzhenOnSplit) {
      this.qingzhenOnSplit = qingzhenOnSplit;
   }

   public String getQingzhenOnSplit() {
      return this.qingzhenOnSplit;
   }

   public void setYiwuranOnSplit(String yiwuranOnSplit) {
      this.yiwuranOnSplit = yiwuranOnSplit;
   }

   public String getYiwuranOnSplit() {
      return this.yiwuranOnSplit;
   }

   public void setReceiverNickNameSplit(String receiverNickNameSplit) {
      this.receiverNickNameSplit = receiverNickNameSplit;
   }

   public String getReceiverNickNameSplit() {
      return this.receiverNickNameSplit;
   }

   public void setGuaranteeValueSplit(String guaranteeValueSplit) {
      this.guaranteeValueSplit = guaranteeValueSplit;
   }

   public String getGuaranteeValueSplit() {
      return this.guaranteeValueSplit;
   }

   public void setHeavyUpstairSplit(String heavyUpstairSplit) {
      this.heavyUpstairSplit = heavyUpstairSplit;
   }

   public String getHeavyUpstairSplit() {
      return this.heavyUpstairSplit;
   }

   public void setHospitalServicesYYSplit(String hospitalServicesYYSplit) {
      this.hospitalServicesYYSplit = hospitalServicesYYSplit;
   }

   public String getHospitalServicesYYSplit() {
      return this.hospitalServicesYYSplit;
   }

   public void setIsvOrderAmount(Double isvOrderAmount) {
      this.isvOrderAmount = isvOrderAmount;
   }

   public Double getIsvOrderAmount() {
      return this.isvOrderAmount;
   }

   public void setTracker(Byte tracker) {
      this.tracker = tracker;
   }

   public Byte getTracker() {
      return this.tracker;
   }

   public void setDeliveryMode(Byte deliveryMode) {
      this.deliveryMode = deliveryMode;
   }

   public Byte getDeliveryMode() {
      return this.deliveryMode;
   }

   public void setWarehouseServiceType(Byte warehouseServiceType) {
      this.warehouseServiceType = warehouseServiceType;
   }

   public Byte getWarehouseServiceType() {
      return this.warehouseServiceType;
   }

   public void setHomeDeliveryOn(Byte homeDeliveryOn) {
      this.homeDeliveryOn = homeDeliveryOn;
   }

   public Byte getHomeDeliveryOn() {
      return this.homeDeliveryOn;
   }

   public void setSiteCode(String siteCode) {
      this.siteCode = siteCode;
   }

   public String getSiteCode() {
      return this.siteCode;
   }

   public void setReferCancelDate(String referCancelDate) {
      this.referCancelDate = referCancelDate;
   }

   public String getReferCancelDate() {
      return this.referCancelDate;
   }

   public void setRebackConfluenceOn(Byte rebackConfluenceOn) {
      this.rebackConfluenceOn = rebackConfluenceOn;
   }

   public Byte getRebackConfluenceOn() {
      return this.rebackConfluenceOn;
   }

   public void setExpressDeliveryOn(Byte expressDeliveryOn) {
      this.expressDeliveryOn = expressDeliveryOn;
   }

   public Byte getExpressDeliveryOn() {
      return this.expressDeliveryOn;
   }

   public void setExpectPickupDate(String expectPickupDate) {
      this.expectPickupDate = expectPickupDate;
   }

   public String getExpectPickupDate() {
      return this.expectPickupDate;
   }

   public void setExpectDeliveryDate(String expectDeliveryDate) {
      this.expectDeliveryDate = expectDeliveryDate;
   }

   public String getExpectDeliveryDate() {
      return this.expectDeliveryDate;
   }

   public void setWarehousePlatformName(String warehousePlatformName) {
      this.warehousePlatformName = warehousePlatformName;
   }

   public String getWarehousePlatformName() {
      return this.warehousePlatformName;
   }

   public void setTemporaryStorage(Byte temporaryStorage) {
      this.temporaryStorage = temporaryStorage;
   }

   public Byte getTemporaryStorage() {
      return this.temporaryStorage;
   }

   public void setPredictReceiptDate(String predictReceiptDate) {
      this.predictReceiptDate = predictReceiptDate;
   }

   public String getPredictReceiptDate() {
      return this.predictReceiptDate;
   }

   public void setExtendFieldStr(String extendFieldStr) {
      this.extendFieldStr = extendFieldStr;
   }

   public String getExtendFieldStr() {
      return this.extendFieldStr;
   }

   public void setPeaceMindReceive(Byte peaceMindReceive) {
      this.peaceMindReceive = peaceMindReceive;
   }

   public Byte getPeaceMindReceive() {
      return this.peaceMindReceive;
   }

   public void setBackInfoOn(String backInfoOn) {
      this.backInfoOn = backInfoOn;
   }

   public String getBackInfoOn() {
      return this.backInfoOn;
   }

   public void setBackName(String backName) {
      this.backName = backName;
   }

   public String getBackName() {
      return this.backName;
   }

   public void setBackMobile(String backMobile) {
      this.backMobile = backMobile;
   }

   public String getBackMobile() {
      return this.backMobile;
   }

   public void setBackPhone(String backPhone) {
      this.backPhone = backPhone;
   }

   public String getBackPhone() {
      return this.backPhone;
   }

   public void setBackProvinceName(String backProvinceName) {
      this.backProvinceName = backProvinceName;
   }

   public String getBackProvinceName() {
      return this.backProvinceName;
   }

   public void setBackCityName(String backCityName) {
      this.backCityName = backCityName;
   }

   public String getBackCityName() {
      return this.backCityName;
   }

   public void setBackCountyName(String backCountyName) {
      this.backCountyName = backCountyName;
   }

   public String getBackCountyName() {
      return this.backCountyName;
   }

   public void setBackTownName(String backTownName) {
      this.backTownName = backTownName;
   }

   public String getBackTownName() {
      return this.backTownName;
   }

   public void setBackAddress(String backAddress) {
      this.backAddress = backAddress;
   }

   public String getBackAddress() {
      return this.backAddress;
   }

   public void setImportFlag(Byte importFlag) {
      this.importFlag = importFlag;
   }

   public Byte getImportFlag() {
      return this.importFlag;
   }

   public void setFileWithCargo(Byte fileWithCargo) {
      this.fileWithCargo = fileWithCargo;
   }

   public Byte getFileWithCargo() {
      return this.fileWithCargo;
   }

   public void setHospitalServicesYY(Byte hospitalServicesYY) {
      this.hospitalServicesYY = hospitalServicesYY;
   }

   public Byte getHospitalServicesYY() {
      return this.hospitalServicesYY;
   }

   public void setParam(String param) {
      this.param = param;
   }

   public String getParam() {
      return this.param;
   }

   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   public String getOaid() {
      return this.oaid;
   }

   public void setParam1(String param1) {
      this.param1 = param1;
   }

   public String getParam1() {
      return this.param1;
   }

   public void setPlatOrderType(String platOrderType) {
      this.platOrderType = platOrderType;
   }

   public String getPlatOrderType() {
      return this.platOrderType;
   }

   public void setPackageName(String packageName) {
      this.packageName = packageName;
   }

   public String getPackageName() {
      return this.packageName;
   }

   public void setUnpackingService(String unpackingService) {
      this.unpackingService = unpackingService;
   }

   public String getUnpackingService() {
      return this.unpackingService;
   }

   public String getApiMethod() {
      return "jingdong.eclp.co.createWbOrder";
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
      pmap.put("spId", this.spId);
      pmap.put("saleOrderNo", this.saleOrderNo);
      pmap.put("packageServiceOn", this.packageServiceOn);
      pmap.put("deliveryMthd", this.deliveryMthd);
      pmap.put("providerCode", this.providerCode);
      pmap.put("packageNo", this.packageNo);
      pmap.put("clientNo", this.clientNo);
      pmap.put("orderType", this.orderType);
      pmap.put("siteCollect", this.siteCollect);
      pmap.put("siteDelivery", this.siteDelivery);
      pmap.put("quarantineCert", this.quarantineCert);
      pmap.put("selfCollectSiteId", this.selfCollectSiteId);
      pmap.put("selfDeliverySiteId", this.selfDeliverySiteId);
      pmap.put("expectedArrivalStartTime", this.expectedArrivalStartTime);
      pmap.put("expectedArrivalEndTime", this.expectedArrivalEndTime);
      pmap.put("vehicleOrderNo", this.vehicleOrderNo);
      pmap.put("messageSign", this.messageSign);
      pmap.put("checkPreSort", this.checkPreSort);
      pmap.put("receiverNameSplit", this.receiverNameSplit);
      pmap.put("receiverCompanySplit", this.receiverCompanySplit);
      pmap.put("receiverMobileSplit", this.receiverMobileSplit);
      pmap.put("receiverPhoneSplit", this.receiverPhoneSplit);
      pmap.put("receiverProvinceNameSplit", this.receiverProvinceNameSplit);
      pmap.put("receiverProvinceSplit", this.receiverProvinceSplit);
      pmap.put("receiverCityNameSplit", this.receiverCityNameSplit);
      pmap.put("receiverCitySplit", this.receiverCitySplit);
      pmap.put("receiverCountyNameSplit", this.receiverCountyNameSplit);
      pmap.put("receiverCountySplit", this.receiverCountySplit);
      pmap.put("receiverTownNameSplit", this.receiverTownNameSplit);
      pmap.put("receiverTownSplit", this.receiverTownSplit);
      pmap.put("receiverAddressSplit", this.receiverAddressSplit);
      pmap.put("expectedArrivalStartTimeSplit", this.expectedArrivalStartTimeSplit);
      pmap.put("expectedArrivalEndTimeSplit", this.expectedArrivalEndTimeSplit);
      pmap.put("orderNoSplit", this.orderNoSplit);
      pmap.put("expressItemNameSplit", this.expressItemNameSplit);
      pmap.put("grossVolumeSplit", this.grossVolumeSplit);
      pmap.put("grossWeightSplit", this.grossWeightSplit);
      pmap.put("expressItemQtySplit", this.expressItemQtySplit);
      pmap.put("temptureNumSplit", this.temptureNumSplit);
      pmap.put("quarantineCertSplit", this.quarantineCertSplit);
      pmap.put("deliveryIntoWarehouseSplit", this.deliveryIntoWarehouseSplit);
      pmap.put("inStorageNoSplit", this.inStorageNoSplit);
      pmap.put("inStorageTimeSplit", this.inStorageTimeSplit);
      pmap.put("inStorageRemarkSplit", this.inStorageRemarkSplit);
      pmap.put("loadFlagSplit", this.loadFlagSplit);
      pmap.put("unloadFlagSplit", this.unloadFlagSplit);
      pmap.put("remarkSplit", this.remarkSplit);
      pmap.put("packageModelNosSplit", this.packageModelNosSplit);
      pmap.put("qingzhenOnSplit", this.qingzhenOnSplit);
      pmap.put("yiwuranOnSplit", this.yiwuranOnSplit);
      pmap.put("receiverNickNameSplit", this.receiverNickNameSplit);
      pmap.put("guaranteeValueSplit", this.guaranteeValueSplit);
      pmap.put("heavyUpstairSplit", this.heavyUpstairSplit);
      pmap.put("hospitalServicesYYSplit", this.hospitalServicesYYSplit);
      pmap.put("isvOrderAmount", this.isvOrderAmount);
      pmap.put("tracker", this.tracker);
      pmap.put("deliveryMode", this.deliveryMode);
      pmap.put("warehouseServiceType", this.warehouseServiceType);
      pmap.put("homeDeliveryOn", this.homeDeliveryOn);
      pmap.put("siteCode", this.siteCode);
      pmap.put("referCancelDate", this.referCancelDate);
      pmap.put("rebackConfluenceOn", this.rebackConfluenceOn);
      pmap.put("expressDeliveryOn", this.expressDeliveryOn);
      pmap.put("expectPickupDate", this.expectPickupDate);
      pmap.put("expectDeliveryDate", this.expectDeliveryDate);
      pmap.put("warehousePlatformName", this.warehousePlatformName);
      pmap.put("temporaryStorage", this.temporaryStorage);
      pmap.put("predictReceiptDate", this.predictReceiptDate);
      pmap.put("extendFieldStr", this.extendFieldStr);
      pmap.put("peaceMindReceive", this.peaceMindReceive);
      pmap.put("backInfoOn", this.backInfoOn);
      pmap.put("backName", this.backName);
      pmap.put("backMobile", this.backMobile);
      pmap.put("backPhone", this.backPhone);
      pmap.put("backProvinceName", this.backProvinceName);
      pmap.put("backCityName", this.backCityName);
      pmap.put("backCountyName", this.backCountyName);
      pmap.put("backTownName", this.backTownName);
      pmap.put("backAddress", this.backAddress);
      pmap.put("importFlag", this.importFlag);
      pmap.put("fileWithCargo", this.fileWithCargo);
      pmap.put("hospitalServicesYY", this.hospitalServicesYY);
      pmap.put("param", this.param);
      pmap.put("oaid", this.oaid);
      pmap.put("param1", this.param1);
      pmap.put("platOrderType", this.platOrderType);
      pmap.put("packageName", this.packageName);
      pmap.put("unpackingService", this.unpackingService);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCoCreateWbOrderResponse> getResponseClass() {
      return EclpCoCreateWbOrderResponse.class;
   }
}
