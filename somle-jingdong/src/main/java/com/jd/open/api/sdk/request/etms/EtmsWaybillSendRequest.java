package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.EtmsWaybillSendResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EtmsWaybillSendRequest extends AbstractRequest implements JdRequest<EtmsWaybillSendResponse> {
   private String deliveryId;
   private String salePlat;
   private String customerCode;
   private String orderId;
   private String thrOrderId;
   private Integer selfPrintWayBill;
   private String pickMethod;
   private String packageRequired;
   private String senderName;
   private String senderAddress;
   private String senderTel;
   private String senderMobile;
   private String senderPostcode;
   private String receiveName;
   private String receiveAddress;
   private String province;
   private String city;
   private String county;
   private String town;
   private Integer provinceId;
   private Integer cityId;
   private Integer countyId;
   private Integer townId;
   private Integer siteType;
   private Integer siteId;
   private String siteName;
   private String receiveTel;
   private String receiveMobile;
   private String postcode;
   private Integer packageCount;
   private Double weight;
   private Double vloumLong;
   private Double vloumWidth;
   private Double vloumHeight;
   private Double vloumn;
   private String description;
   private Integer collectionValue;
   private Double collectionMoney;
   private Integer guaranteeValue;
   private Double guaranteeValueAmount;
   private Integer signReturn;
   private Integer aging;
   private Integer transType;
   private String remark;
   private Integer goodsType;
   private Integer orderType;
   private String shopCode;
   private String orderSendTime;
   private String warehouseCode;
   private Integer areaProvId;
   private Integer areaCityId;
   private Date shipmentStartTime;
   private Date shipmentEndTime;
   private String idNumber;
   private String addedService;
   private String extendField1;
   private String extendField2;
   private String extendField3;
   private Integer extendField4;
   private Integer extendField5;
   private String senderCompany;
   private String receiveCompany;
   private BigDecimal freightPre;
   private String goods;
   private Integer goodsCount;
   private Integer promiseTimeType;
   private Double freight;
   private String unpackingInspection;
   private String fileUrl;
   private String customerBoxCode;
   private String customerBoxNumber;
   private Date pickUpStartTime;
   private Date pickUpEndTime;
   private String receiveOAID;

   public void setDeliveryId(String deliveryId) {
      this.deliveryId = deliveryId;
   }

   public String getDeliveryId() {
      return this.deliveryId;
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

   public void setSelfPrintWayBill(Integer selfPrintWayBill) {
      this.selfPrintWayBill = selfPrintWayBill;
   }

   public Integer getSelfPrintWayBill() {
      return this.selfPrintWayBill;
   }

   public void setPickMethod(String pickMethod) {
      this.pickMethod = pickMethod;
   }

   public String getPickMethod() {
      return this.pickMethod;
   }

   public void setPackageRequired(String packageRequired) {
      this.packageRequired = packageRequired;
   }

   public String getPackageRequired() {
      return this.packageRequired;
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

   public void setSenderPostcode(String senderPostcode) {
      this.senderPostcode = senderPostcode;
   }

   public String getSenderPostcode() {
      return this.senderPostcode;
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

   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   public Integer getProvinceId() {
      return this.provinceId;
   }

   public void setCityId(Integer cityId) {
      this.cityId = cityId;
   }

   public Integer getCityId() {
      return this.cityId;
   }

   public void setCountyId(Integer countyId) {
      this.countyId = countyId;
   }

   public Integer getCountyId() {
      return this.countyId;
   }

   public void setTownId(Integer townId) {
      this.townId = townId;
   }

   public Integer getTownId() {
      return this.townId;
   }

   public void setSiteType(Integer siteType) {
      this.siteType = siteType;
   }

   public Integer getSiteType() {
      return this.siteType;
   }

   public void setSiteId(Integer siteId) {
      this.siteId = siteId;
   }

   public Integer getSiteId() {
      return this.siteId;
   }

   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   public String getSiteName() {
      return this.siteName;
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

   public void setPostcode(String postcode) {
      this.postcode = postcode;
   }

   public String getPostcode() {
      return this.postcode;
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

   public void setTransType(Integer transType) {
      this.transType = transType;
   }

   public Integer getTransType() {
      return this.transType;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setGoodsType(Integer goodsType) {
      this.goodsType = goodsType;
   }

   public Integer getGoodsType() {
      return this.goodsType;
   }

   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   public Integer getOrderType() {
      return this.orderType;
   }

   public void setShopCode(String shopCode) {
      this.shopCode = shopCode;
   }

   public String getShopCode() {
      return this.shopCode;
   }

   public void setOrderSendTime(String orderSendTime) {
      this.orderSendTime = orderSendTime;
   }

   public String getOrderSendTime() {
      return this.orderSendTime;
   }

   public void setWarehouseCode(String warehouseCode) {
      this.warehouseCode = warehouseCode;
   }

   public String getWarehouseCode() {
      return this.warehouseCode;
   }

   public void setAreaProvId(Integer areaProvId) {
      this.areaProvId = areaProvId;
   }

   public Integer getAreaProvId() {
      return this.areaProvId;
   }

   public void setAreaCityId(Integer areaCityId) {
      this.areaCityId = areaCityId;
   }

   public Integer getAreaCityId() {
      return this.areaCityId;
   }

   public void setShipmentStartTime(Date shipmentStartTime) {
      this.shipmentStartTime = shipmentStartTime;
   }

   public Date getShipmentStartTime() {
      return this.shipmentStartTime;
   }

   public void setShipmentEndTime(Date shipmentEndTime) {
      this.shipmentEndTime = shipmentEndTime;
   }

   public Date getShipmentEndTime() {
      return this.shipmentEndTime;
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

   public void setExtendField1(String extendField1) {
      this.extendField1 = extendField1;
   }

   public String getExtendField1() {
      return this.extendField1;
   }

   public void setExtendField2(String extendField2) {
      this.extendField2 = extendField2;
   }

   public String getExtendField2() {
      return this.extendField2;
   }

   public void setExtendField3(String extendField3) {
      this.extendField3 = extendField3;
   }

   public String getExtendField3() {
      return this.extendField3;
   }

   public void setExtendField4(Integer extendField4) {
      this.extendField4 = extendField4;
   }

   public Integer getExtendField4() {
      return this.extendField4;
   }

   public void setExtendField5(Integer extendField5) {
      this.extendField5 = extendField5;
   }

   public Integer getExtendField5() {
      return this.extendField5;
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

   public void setFreightPre(BigDecimal freightPre) {
      this.freightPre = freightPre;
   }

   public BigDecimal getFreightPre() {
      return this.freightPre;
   }

   public void setGoods(String goods) {
      this.goods = goods;
   }

   public String getGoods() {
      return this.goods;
   }

   public void setGoodsCount(Integer goodsCount) {
      this.goodsCount = goodsCount;
   }

   public Integer getGoodsCount() {
      return this.goodsCount;
   }

   public void setPromiseTimeType(Integer promiseTimeType) {
      this.promiseTimeType = promiseTimeType;
   }

   public Integer getPromiseTimeType() {
      return this.promiseTimeType;
   }

   public void setFreight(Double freight) {
      this.freight = freight;
   }

   public Double getFreight() {
      return this.freight;
   }

   public void setUnpackingInspection(String unpackingInspection) {
      this.unpackingInspection = unpackingInspection;
   }

   public String getUnpackingInspection() {
      return this.unpackingInspection;
   }

   public void setFileUrl(String fileUrl) {
      this.fileUrl = fileUrl;
   }

   public String getFileUrl() {
      return this.fileUrl;
   }

   public void setCustomerBoxCode(String customerBoxCode) {
      this.customerBoxCode = customerBoxCode;
   }

   public String getCustomerBoxCode() {
      return this.customerBoxCode;
   }

   public void setCustomerBoxNumber(String customerBoxNumber) {
      this.customerBoxNumber = customerBoxNumber;
   }

   public String getCustomerBoxNumber() {
      return this.customerBoxNumber;
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

   public void setReceiveOAID(String receiveOAID) {
      this.receiveOAID = receiveOAID;
   }

   public String getReceiveOAID() {
      return this.receiveOAID;
   }

   public String getApiMethod() {
      return "jingdong.etms.waybill.send";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deliveryId", this.deliveryId);
      pmap.put("salePlat", this.salePlat);
      pmap.put("customerCode", this.customerCode);
      pmap.put("orderId", this.orderId);
      pmap.put("thrOrderId", this.thrOrderId);
      pmap.put("selfPrintWayBill", this.selfPrintWayBill);
      pmap.put("pickMethod", this.pickMethod);
      pmap.put("packageRequired", this.packageRequired);
      pmap.put("senderName", this.senderName);
      pmap.put("senderAddress", this.senderAddress);
      pmap.put("senderTel", this.senderTel);
      pmap.put("senderMobile", this.senderMobile);
      pmap.put("senderPostcode", this.senderPostcode);
      pmap.put("receiveName", this.receiveName);
      pmap.put("receiveAddress", this.receiveAddress);
      pmap.put("province", this.province);
      pmap.put("city", this.city);
      pmap.put("county", this.county);
      pmap.put("town", this.town);
      pmap.put("provinceId", this.provinceId);
      pmap.put("cityId", this.cityId);
      pmap.put("countyId", this.countyId);
      pmap.put("townId", this.townId);
      pmap.put("siteType", this.siteType);
      pmap.put("siteId", this.siteId);
      pmap.put("siteName", this.siteName);
      pmap.put("receiveTel", this.receiveTel);
      pmap.put("receiveMobile", this.receiveMobile);
      pmap.put("postcode", this.postcode);
      pmap.put("packageCount", this.packageCount);
      pmap.put("weight", this.weight);
      pmap.put("vloumLong", this.vloumLong);
      pmap.put("vloumWidth", this.vloumWidth);
      pmap.put("vloumHeight", this.vloumHeight);
      pmap.put("vloumn", this.vloumn);
      pmap.put("description", this.description);
      pmap.put("collectionValue", this.collectionValue);
      pmap.put("collectionMoney", this.collectionMoney);
      pmap.put("guaranteeValue", this.guaranteeValue);
      pmap.put("guaranteeValueAmount", this.guaranteeValueAmount);
      pmap.put("signReturn", this.signReturn);
      pmap.put("aging", this.aging);
      pmap.put("transType", this.transType);
      pmap.put("remark", this.remark);
      pmap.put("goodsType", this.goodsType);
      pmap.put("orderType", this.orderType);
      pmap.put("shopCode", this.shopCode);
      pmap.put("orderSendTime", this.orderSendTime);
      pmap.put("warehouseCode", this.warehouseCode);
      pmap.put("areaProvId", this.areaProvId);
      pmap.put("areaCityId", this.areaCityId);

      try {
         if (this.shipmentStartTime != null) {
            pmap.put("shipmentStartTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.shipmentStartTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.shipmentEndTime != null) {
            pmap.put("shipmentEndTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.shipmentEndTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("idNumber", this.idNumber);
      pmap.put("addedService", this.addedService);
      pmap.put("extendField1", this.extendField1);
      pmap.put("extendField2", this.extendField2);
      pmap.put("extendField3", this.extendField3);
      pmap.put("extendField4", this.extendField4);
      pmap.put("extendField5", this.extendField5);
      pmap.put("senderCompany", this.senderCompany);
      pmap.put("receiveCompany", this.receiveCompany);
      pmap.put("freightPre", this.freightPre);
      pmap.put("goods", this.goods);
      pmap.put("goodsCount", this.goodsCount);
      pmap.put("promiseTimeType", this.promiseTimeType);
      pmap.put("freight", this.freight);
      pmap.put("unpackingInspection", this.unpackingInspection);
      pmap.put("fileUrl", this.fileUrl);
      pmap.put("customerBoxCode", this.customerBoxCode);
      pmap.put("customerBoxNumber", this.customerBoxNumber);

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

      pmap.put("receiveOAID", this.receiveOAID);
      return JsonUtil.toJson(pmap);
   }

   public Class<EtmsWaybillSendResponse> getResponseClass() {
      return EtmsWaybillSendResponse.class;
   }
}
