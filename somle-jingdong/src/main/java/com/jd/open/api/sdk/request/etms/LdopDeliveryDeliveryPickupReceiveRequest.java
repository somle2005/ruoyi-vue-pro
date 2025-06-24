package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.LdopDeliveryDeliveryPickupReceiveResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class LdopDeliveryDeliveryPickupReceiveRequest extends AbstractRequest implements JdRequest<LdopDeliveryDeliveryPickupReceiveResponse> {
   private String josPin;
   private String salePlat;
   private String customerCode;
   private String orderId;
   private String thrOrderId;
   private String senderName;
   private String senderAddress;
   private String senderTel;
   private String senderMobile;
   private String receiveName;
   private String receiveAddress;
   private String receiveTel;
   private String receiveMobile;
   private String province;
   private String city;
   private String county;
   private String town;
   private Integer packageCount;
   private Double weight;
   private Double vloumLong;
   private Double vloumWidth;
   private Double vloumHeight;
   private Double vloumn;
   private String description;
   private Double goodsMoney;
   private Integer collectionValue;
   private Double collectionMoney;
   private Integer guaranteeValue;
   private Double guaranteeValueAmount;
   private Integer signReturn;
   private Integer aging;
   private Integer goodsType;
   private String warehouseCode;
   private String remark;
   private String idNumber;
   private String addedService;
   private String senderCompany;
   private String receiveCompany;
   private String senderIdNumber;
   private Integer senderIdType;
   private Integer sendAndPickupType;
   private String backName;
   private String backMobileNo;
   private String backTelNo;
   private String backProvinceName;
   private String backCityName;
   private String backCountry;
   private String backTown;
   private String backDetailAddress;
   private Integer productType;
   private Date pickUpStartTime;
   private Date pickUpEndTime;
   private String openIdSeller;
   private String xidSeller;
   private String customerTel;
   private String backAddress;
   private String customerContract;
   private String pickupOrderId;
   private Double pickupWeight;
   private String pickupRemark;
   private Double pickupVolume;
   private boolean isGuaranteeValue;
   private Double pickupGuaranteeValueAmount;
   private Integer pickupGoodsType;
   private Integer pickupBizType;
   private String valueAddService;
   private String pickupSenderIdNumber;
   private Integer pickupSenderIdType;
   private String productId;
   private String snCode;
   private String productName;
   private String productCount;
   private String skuAddService;
   private String skuCheckOutShapes;
   private String skuCheckAttachFile;
   private String skuServiceRequirements;
   private Integer promiseTimeType;
   private Integer guaranteeSettleType;
   private Integer packingSettleType;
   private Integer freightSettleType;

   public void setJosPin(String josPin) {
      this.josPin = josPin;
   }

   public String getJosPin() {
      return this.josPin;
   }

   public void setSalePlat(String salePlat) {
      this.salePlat = salePlat;
   }

   public String getSalePlat() {
      return this.salePlat;
   }

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setThrOrderId(String thrOrderId) {
      this.thrOrderId = thrOrderId;
   }

   public String getThrOrderId() {
      return this.thrOrderId;
   }

   public void setSenderName(String senderName) {
      this.senderName = senderName;
   }

   public String getSenderName() {
      return this.senderName;
   }

   public void setSenderAddress(String senderAddress) {
      this.senderAddress = senderAddress;
   }

   public String getSenderAddress() {
      return this.senderAddress;
   }

   public void setSenderTel(String senderTel) {
      this.senderTel = senderTel;
   }

   public String getSenderTel() {
      return this.senderTel;
   }

   public void setSenderMobile(String senderMobile) {
      this.senderMobile = senderMobile;
   }

   public String getSenderMobile() {
      return this.senderMobile;
   }

   public void setReceiveName(String receiveName) {
      this.receiveName = receiveName;
   }

   public String getReceiveName() {
      return this.receiveName;
   }

   public void setReceiveAddress(String receiveAddress) {
      this.receiveAddress = receiveAddress;
   }

   public String getReceiveAddress() {
      return this.receiveAddress;
   }

   public void setReceiveTel(String receiveTel) {
      this.receiveTel = receiveTel;
   }

   public String getReceiveTel() {
      return this.receiveTel;
   }

   public void setReceiveMobile(String receiveMobile) {
      this.receiveMobile = receiveMobile;
   }

   public String getReceiveMobile() {
      return this.receiveMobile;
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

   public void setPackageCount(Integer packageCount) {
      this.packageCount = packageCount;
   }

   public Integer getPackageCount() {
      return this.packageCount;
   }

   public void setWeight(Double weight) {
      this.weight = weight;
   }

   public Double getWeight() {
      return this.weight;
   }

   public void setVloumLong(Double vloumLong) {
      this.vloumLong = vloumLong;
   }

   public Double getVloumLong() {
      return this.vloumLong;
   }

   public void setVloumWidth(Double vloumWidth) {
      this.vloumWidth = vloumWidth;
   }

   public Double getVloumWidth() {
      return this.vloumWidth;
   }

   public void setVloumHeight(Double vloumHeight) {
      this.vloumHeight = vloumHeight;
   }

   public Double getVloumHeight() {
      return this.vloumHeight;
   }

   public void setVloumn(Double vloumn) {
      this.vloumn = vloumn;
   }

   public Double getVloumn() {
      return this.vloumn;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getDescription() {
      return this.description;
   }

   public void setGoodsMoney(Double goodsMoney) {
      this.goodsMoney = goodsMoney;
   }

   public Double getGoodsMoney() {
      return this.goodsMoney;
   }

   public void setCollectionValue(Integer collectionValue) {
      this.collectionValue = collectionValue;
   }

   public Integer getCollectionValue() {
      return this.collectionValue;
   }

   public void setCollectionMoney(Double collectionMoney) {
      this.collectionMoney = collectionMoney;
   }

   public Double getCollectionMoney() {
      return this.collectionMoney;
   }

   public void setGuaranteeValue(Integer guaranteeValue) {
      this.guaranteeValue = guaranteeValue;
   }

   public Integer getGuaranteeValue() {
      return this.guaranteeValue;
   }

   public void setGuaranteeValueAmount(Double guaranteeValueAmount) {
      this.guaranteeValueAmount = guaranteeValueAmount;
   }

   public Double getGuaranteeValueAmount() {
      return this.guaranteeValueAmount;
   }

   public void setSignReturn(Integer signReturn) {
      this.signReturn = signReturn;
   }

   public Integer getSignReturn() {
      return this.signReturn;
   }

   public void setAging(Integer aging) {
      this.aging = aging;
   }

   public Integer getAging() {
      return this.aging;
   }

   public void setGoodsType(Integer goodsType) {
      this.goodsType = goodsType;
   }

   public Integer getGoodsType() {
      return this.goodsType;
   }

   public void setWarehouseCode(String warehouseCode) {
      this.warehouseCode = warehouseCode;
   }

   public String getWarehouseCode() {
      return this.warehouseCode;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setIdNumber(String idNumber) {
      this.idNumber = idNumber;
   }

   public String getIdNumber() {
      return this.idNumber;
   }

   public void setAddedService(String addedService) {
      this.addedService = addedService;
   }

   public String getAddedService() {
      return this.addedService;
   }

   public void setSenderCompany(String senderCompany) {
      this.senderCompany = senderCompany;
   }

   public String getSenderCompany() {
      return this.senderCompany;
   }

   public void setReceiveCompany(String receiveCompany) {
      this.receiveCompany = receiveCompany;
   }

   public String getReceiveCompany() {
      return this.receiveCompany;
   }

   public void setSenderIdNumber(String senderIdNumber) {
      this.senderIdNumber = senderIdNumber;
   }

   public String getSenderIdNumber() {
      return this.senderIdNumber;
   }

   public void setSenderIdType(Integer senderIdType) {
      this.senderIdType = senderIdType;
   }

   public Integer getSenderIdType() {
      return this.senderIdType;
   }

   public void setSendAndPickupType(Integer sendAndPickupType) {
      this.sendAndPickupType = sendAndPickupType;
   }

   public Integer getSendAndPickupType() {
      return this.sendAndPickupType;
   }

   public void setBackName(String backName) {
      this.backName = backName;
   }

   public String getBackName() {
      return this.backName;
   }

   public void setBackMobileNo(String backMobileNo) {
      this.backMobileNo = backMobileNo;
   }

   public String getBackMobileNo() {
      return this.backMobileNo;
   }

   public void setBackTelNo(String backTelNo) {
      this.backTelNo = backTelNo;
   }

   public String getBackTelNo() {
      return this.backTelNo;
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

   public void setBackCountry(String backCountry) {
      this.backCountry = backCountry;
   }

   public String getBackCountry() {
      return this.backCountry;
   }

   public void setBackTown(String backTown) {
      this.backTown = backTown;
   }

   public String getBackTown() {
      return this.backTown;
   }

   public void setBackDetailAddress(String backDetailAddress) {
      this.backDetailAddress = backDetailAddress;
   }

   public String getBackDetailAddress() {
      return this.backDetailAddress;
   }

   public void setProductType(Integer productType) {
      this.productType = productType;
   }

   public Integer getProductType() {
      return this.productType;
   }

   public void setPickUpStartTime(Date pickUpStartTime) {
      this.pickUpStartTime = pickUpStartTime;
   }

   public Date getPickUpStartTime() {
      return this.pickUpStartTime;
   }

   public void setPickUpEndTime(Date pickUpEndTime) {
      this.pickUpEndTime = pickUpEndTime;
   }

   public Date getPickUpEndTime() {
      return this.pickUpEndTime;
   }

   public void setOpenIdSeller(String openIdSeller) {
      this.openIdSeller = openIdSeller;
   }

   public String getOpenIdSeller() {
      return this.openIdSeller;
   }

   public void setXidSeller(String xidSeller) {
      this.xidSeller = xidSeller;
   }

   public String getXidSeller() {
      return this.xidSeller;
   }

   public void setCustomerTel(String customerTel) {
      this.customerTel = customerTel;
   }

   public String getCustomerTel() {
      return this.customerTel;
   }

   public void setBackAddress(String backAddress) {
      this.backAddress = backAddress;
   }

   public String getBackAddress() {
      return this.backAddress;
   }

   public void setCustomerContract(String customerContract) {
      this.customerContract = customerContract;
   }

   public String getCustomerContract() {
      return this.customerContract;
   }

   public void setPickupOrderId(String pickupOrderId) {
      this.pickupOrderId = pickupOrderId;
   }

   public String getPickupOrderId() {
      return this.pickupOrderId;
   }

   public void setPickupWeight(Double pickupWeight) {
      this.pickupWeight = pickupWeight;
   }

   public Double getPickupWeight() {
      return this.pickupWeight;
   }

   public void setPickupRemark(String pickupRemark) {
      this.pickupRemark = pickupRemark;
   }

   public String getPickupRemark() {
      return this.pickupRemark;
   }

   public void setPickupVolume(Double pickupVolume) {
      this.pickupVolume = pickupVolume;
   }

   public Double getPickupVolume() {
      return this.pickupVolume;
   }

   public void setIsGuaranteeValue(boolean isGuaranteeValue) {
      this.isGuaranteeValue = isGuaranteeValue;
   }

   public boolean getIsGuaranteeValue() {
      return this.isGuaranteeValue;
   }

   public void setPickupGuaranteeValueAmount(Double pickupGuaranteeValueAmount) {
      this.pickupGuaranteeValueAmount = pickupGuaranteeValueAmount;
   }

   public Double getPickupGuaranteeValueAmount() {
      return this.pickupGuaranteeValueAmount;
   }

   public void setPickupGoodsType(Integer pickupGoodsType) {
      this.pickupGoodsType = pickupGoodsType;
   }

   public Integer getPickupGoodsType() {
      return this.pickupGoodsType;
   }

   public void setPickupBizType(Integer pickupBizType) {
      this.pickupBizType = pickupBizType;
   }

   public Integer getPickupBizType() {
      return this.pickupBizType;
   }

   public void setValueAddService(String valueAddService) {
      this.valueAddService = valueAddService;
   }

   public String getValueAddService() {
      return this.valueAddService;
   }

   public void setPickupSenderIdNumber(String pickupSenderIdNumber) {
      this.pickupSenderIdNumber = pickupSenderIdNumber;
   }

   public String getPickupSenderIdNumber() {
      return this.pickupSenderIdNumber;
   }

   public void setPickupSenderIdType(Integer pickupSenderIdType) {
      this.pickupSenderIdType = pickupSenderIdType;
   }

   public Integer getPickupSenderIdType() {
      return this.pickupSenderIdType;
   }

   public void setProductId(String productId) {
      this.productId = productId;
   }

   public String getProductId() {
      return this.productId;
   }

   public void setSnCode(String snCode) {
      this.snCode = snCode;
   }

   public String getSnCode() {
      return this.snCode;
   }

   public void setProductName(String productName) {
      this.productName = productName;
   }

   public String getProductName() {
      return this.productName;
   }

   public void setProductCount(String productCount) {
      this.productCount = productCount;
   }

   public String getProductCount() {
      return this.productCount;
   }

   public void setSkuAddService(String skuAddService) {
      this.skuAddService = skuAddService;
   }

   public String getSkuAddService() {
      return this.skuAddService;
   }

   public void setSkuCheckOutShapes(String skuCheckOutShapes) {
      this.skuCheckOutShapes = skuCheckOutShapes;
   }

   public String getSkuCheckOutShapes() {
      return this.skuCheckOutShapes;
   }

   public void setSkuCheckAttachFile(String skuCheckAttachFile) {
      this.skuCheckAttachFile = skuCheckAttachFile;
   }

   public String getSkuCheckAttachFile() {
      return this.skuCheckAttachFile;
   }

   public void setSkuServiceRequirements(String skuServiceRequirements) {
      this.skuServiceRequirements = skuServiceRequirements;
   }

   public String getSkuServiceRequirements() {
      return this.skuServiceRequirements;
   }

   public void setPromiseTimeType(Integer promiseTimeType) {
      this.promiseTimeType = promiseTimeType;
   }

   public Integer getPromiseTimeType() {
      return this.promiseTimeType;
   }

   public void setGuaranteeSettleType(Integer guaranteeSettleType) {
      this.guaranteeSettleType = guaranteeSettleType;
   }

   public Integer getGuaranteeSettleType() {
      return this.guaranteeSettleType;
   }

   public void setPackingSettleType(Integer packingSettleType) {
      this.packingSettleType = packingSettleType;
   }

   public Integer getPackingSettleType() {
      return this.packingSettleType;
   }

   public void setFreightSettleType(Integer freightSettleType) {
      this.freightSettleType = freightSettleType;
   }

   public Integer getFreightSettleType() {
      return this.freightSettleType;
   }

   public String getApiMethod() {
      return "jingdong.ldop.delivery.deliveryPickupReceive";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("josPin", this.josPin);
      pmap.put("salePlat", this.salePlat);
      pmap.put("customerCode", this.customerCode);
      pmap.put("orderId", this.orderId);
      pmap.put("thrOrderId", this.thrOrderId);
      pmap.put("senderName", this.senderName);
      pmap.put("senderAddress", this.senderAddress);
      pmap.put("senderTel", this.senderTel);
      pmap.put("senderMobile", this.senderMobile);
      pmap.put("receiveName", this.receiveName);
      pmap.put("receiveAddress", this.receiveAddress);
      pmap.put("receiveTel", this.receiveTel);
      pmap.put("receiveMobile", this.receiveMobile);
      pmap.put("province", this.province);
      pmap.put("city", this.city);
      pmap.put("county", this.county);
      pmap.put("town", this.town);
      pmap.put("packageCount", this.packageCount);
      pmap.put("weight", this.weight);
      pmap.put("vloumLong", this.vloumLong);
      pmap.put("vloumWidth", this.vloumWidth);
      pmap.put("vloumHeight", this.vloumHeight);
      pmap.put("vloumn", this.vloumn);
      pmap.put("description", this.description);
      pmap.put("goodsMoney", this.goodsMoney);
      pmap.put("collectionValue", this.collectionValue);
      pmap.put("collectionMoney", this.collectionMoney);
      pmap.put("guaranteeValue", this.guaranteeValue);
      pmap.put("guaranteeValueAmount", this.guaranteeValueAmount);
      pmap.put("signReturn", this.signReturn);
      pmap.put("aging", this.aging);
      pmap.put("goodsType", this.goodsType);
      pmap.put("warehouseCode", this.warehouseCode);
      pmap.put("remark", this.remark);
      pmap.put("idNumber", this.idNumber);
      pmap.put("addedService", this.addedService);
      pmap.put("senderCompany", this.senderCompany);
      pmap.put("receiveCompany", this.receiveCompany);
      pmap.put("senderIdNumber", this.senderIdNumber);
      pmap.put("senderIdType", this.senderIdType);
      pmap.put("sendAndPickupType", this.sendAndPickupType);
      pmap.put("backName", this.backName);
      pmap.put("backMobileNo", this.backMobileNo);
      pmap.put("backTelNo", this.backTelNo);
      pmap.put("backProvinceName", this.backProvinceName);
      pmap.put("backCityName", this.backCityName);
      pmap.put("backCountry", this.backCountry);
      pmap.put("backTown", this.backTown);
      pmap.put("backDetailAddress", this.backDetailAddress);
      pmap.put("productType", this.productType);

      try {
         if (this.pickUpStartTime != null) {
            pmap.put("pickUpStartTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.pickUpStartTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.pickUpEndTime != null) {
            pmap.put("pickUpEndTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.pickUpEndTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("open_id_seller", this.openIdSeller);
      pmap.put("xid_seller", this.xidSeller);
      pmap.put("customerTel", this.customerTel);
      pmap.put("backAddress", this.backAddress);
      pmap.put("customerContract", this.customerContract);
      pmap.put("pickupOrderId", this.pickupOrderId);
      pmap.put("pickupWeight", this.pickupWeight);
      pmap.put("pickupRemark", this.pickupRemark);
      pmap.put("pickupVolume", this.pickupVolume);
      pmap.put("isGuaranteeValue", this.isGuaranteeValue);
      pmap.put("pickupGuaranteeValueAmount", this.pickupGuaranteeValueAmount);
      pmap.put("pickupGoodsType", this.pickupGoodsType);
      pmap.put("pickupBizType", this.pickupBizType);
      pmap.put("valueAddService", this.valueAddService);
      pmap.put("pickupSenderIdNumber", this.pickupSenderIdNumber);
      pmap.put("pickupSenderIdType", this.pickupSenderIdType);
      pmap.put("productId", this.productId);
      pmap.put("snCode", this.snCode);
      pmap.put("productName", this.productName);
      pmap.put("productCount", this.productCount);
      pmap.put("skuAddService", this.skuAddService);
      pmap.put("skuCheckOutShapes", this.skuCheckOutShapes);
      pmap.put("skuCheckAttachFile", this.skuCheckAttachFile);
      pmap.put("skuServiceRequirements", this.skuServiceRequirements);
      pmap.put("promiseTimeType", this.promiseTimeType);
      pmap.put("guaranteeSettleType", this.guaranteeSettleType);
      pmap.put("packingSettleType", this.packingSettleType);
      pmap.put("freightSettleType", this.freightSettleType);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopDeliveryDeliveryPickupReceiveResponse> getResponseClass() {
      return LdopDeliveryDeliveryPickupReceiveResponse.class;
   }
}
