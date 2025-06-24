package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.EtmsRangeCheckResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EtmsRangeCheckRequest extends AbstractRequest implements JdRequest<EtmsRangeCheckResponse> {
   private String salePlat;
   private String customerCode;
   private String orderId;
   private Integer goodsType;
   private String wareHouseCode;
   private String receiveAddress;
   private Integer transType;
   private Integer senderProvinceId;
   private Integer senderCityId;
   private Integer senderCountyId;
   private Integer senderTownId;
   private Integer receiverProvinceId;
   private Integer receiverCityId;
   private Integer receiverCountyId;
   private Integer receiverTownId;
   private Date sendTime;
   private Integer isCod;
   private Integer siteId;
   private String siteName;
   private String addedService;
   private Integer promiseTimeType;
   private String senderAddress;
   private Integer pickupSiteId;
   private String pickupSiteCode;
   private String siteCode;
   private String senderProvince;
   private String senderCity;
   private String senderCounty;
   private String senderTown;
   private String receiverProvince;
   private String receiverCity;
   private String receiverCounty;
   private String receiverTown;
   private Integer settleType;
   private Integer requireDeliveryPresortMode;
   private String receiveOAID;

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

   public void setGoodsType(Integer goodsType) {
      this.goodsType = goodsType;
   }

   public Integer getGoodsType() {
      return this.goodsType;
   }

   public void setWareHouseCode(String wareHouseCode) {
      this.wareHouseCode = wareHouseCode;
   }

   public String getWareHouseCode() {
      return this.wareHouseCode;
   }

   public void setReceiveAddress(String receiveAddress) {
      this.receiveAddress = receiveAddress;
   }

   public String getReceiveAddress() {
      return this.receiveAddress;
   }

   public void setTransType(Integer transType) {
      this.transType = transType;
   }

   public Integer getTransType() {
      return this.transType;
   }

   public void setSenderProvinceId(Integer senderProvinceId) {
      this.senderProvinceId = senderProvinceId;
   }

   public Integer getSenderProvinceId() {
      return this.senderProvinceId;
   }

   public void setSenderCityId(Integer senderCityId) {
      this.senderCityId = senderCityId;
   }

   public Integer getSenderCityId() {
      return this.senderCityId;
   }

   public void setSenderCountyId(Integer senderCountyId) {
      this.senderCountyId = senderCountyId;
   }

   public Integer getSenderCountyId() {
      return this.senderCountyId;
   }

   public void setSenderTownId(Integer senderTownId) {
      this.senderTownId = senderTownId;
   }

   public Integer getSenderTownId() {
      return this.senderTownId;
   }

   public void setReceiverProvinceId(Integer receiverProvinceId) {
      this.receiverProvinceId = receiverProvinceId;
   }

   public Integer getReceiverProvinceId() {
      return this.receiverProvinceId;
   }

   public void setReceiverCityId(Integer receiverCityId) {
      this.receiverCityId = receiverCityId;
   }

   public Integer getReceiverCityId() {
      return this.receiverCityId;
   }

   public void setReceiverCountyId(Integer receiverCountyId) {
      this.receiverCountyId = receiverCountyId;
   }

   public Integer getReceiverCountyId() {
      return this.receiverCountyId;
   }

   public void setReceiverTownId(Integer receiverTownId) {
      this.receiverTownId = receiverTownId;
   }

   public Integer getReceiverTownId() {
      return this.receiverTownId;
   }

   public void setSendTime(Date sendTime) {
      this.sendTime = sendTime;
   }

   public Date getSendTime() {
      return this.sendTime;
   }

   public void setIsCod(Integer isCod) {
      this.isCod = isCod;
   }

   public Integer getIsCod() {
      return this.isCod;
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

   public void setAddedService(String addedService) {
      this.addedService = addedService;
   }

   public String getAddedService() {
      return this.addedService;
   }

   public void setPromiseTimeType(Integer promiseTimeType) {
      this.promiseTimeType = promiseTimeType;
   }

   public Integer getPromiseTimeType() {
      return this.promiseTimeType;
   }

   public void setSenderAddress(String senderAddress) {
      this.senderAddress = senderAddress;
   }

   public String getSenderAddress() {
      return this.senderAddress;
   }

   public void setPickupSiteId(Integer pickupSiteId) {
      this.pickupSiteId = pickupSiteId;
   }

   public Integer getPickupSiteId() {
      return this.pickupSiteId;
   }

   public void setPickupSiteCode(String pickupSiteCode) {
      this.pickupSiteCode = pickupSiteCode;
   }

   public String getPickupSiteCode() {
      return this.pickupSiteCode;
   }

   public void setSiteCode(String siteCode) {
      this.siteCode = siteCode;
   }

   public String getSiteCode() {
      return this.siteCode;
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

   public void setSettleType(Integer settleType) {
      this.settleType = settleType;
   }

   public Integer getSettleType() {
      return this.settleType;
   }

   public void setRequireDeliveryPresortMode(Integer requireDeliveryPresortMode) {
      this.requireDeliveryPresortMode = requireDeliveryPresortMode;
   }

   public Integer getRequireDeliveryPresortMode() {
      return this.requireDeliveryPresortMode;
   }

   public void setReceiveOAID(String receiveOAID) {
      this.receiveOAID = receiveOAID;
   }

   public String getReceiveOAID() {
      return this.receiveOAID;
   }

   public String getApiMethod() {
      return "jingdong.etms.range.check";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("salePlat", this.salePlat);
      pmap.put("customerCode", this.customerCode);
      pmap.put("orderId", this.orderId);
      pmap.put("goodsType", this.goodsType);
      pmap.put("wareHouseCode", this.wareHouseCode);
      pmap.put("receiveAddress", this.receiveAddress);
      pmap.put("transType", this.transType);
      pmap.put("senderProvinceId", this.senderProvinceId);
      pmap.put("senderCityId", this.senderCityId);
      pmap.put("senderCountyId", this.senderCountyId);
      pmap.put("senderTownId", this.senderTownId);
      pmap.put("receiverProvinceId", this.receiverProvinceId);
      pmap.put("receiverCityId", this.receiverCityId);
      pmap.put("receiverCountyId", this.receiverCountyId);
      pmap.put("receiverTownId", this.receiverTownId);

      try {
         if (this.sendTime != null) {
            pmap.put("sendTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.sendTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("isCod", this.isCod);
      pmap.put("siteId", this.siteId);
      pmap.put("siteName", this.siteName);
      pmap.put("addedService", this.addedService);
      pmap.put("promiseTimeType", this.promiseTimeType);
      pmap.put("senderAddress", this.senderAddress);
      pmap.put("pickupSiteId", this.pickupSiteId);
      pmap.put("pickupSiteCode", this.pickupSiteCode);
      pmap.put("siteCode", this.siteCode);
      pmap.put("senderProvince", this.senderProvince);
      pmap.put("senderCity", this.senderCity);
      pmap.put("senderCounty", this.senderCounty);
      pmap.put("senderTown", this.senderTown);
      pmap.put("receiverProvince", this.receiverProvince);
      pmap.put("receiverCity", this.receiverCity);
      pmap.put("receiverCounty", this.receiverCounty);
      pmap.put("receiverTown", this.receiverTown);
      pmap.put("settleType", this.settleType);
      pmap.put("requireDeliveryPresortMode", this.requireDeliveryPresortMode);
      pmap.put("receiveOAID", this.receiveOAID);
      return JsonUtil.toJson(pmap);
   }

   public Class<EtmsRangeCheckResponse> getResponseClass() {
      return EtmsRangeCheckResponse.class;
   }
}
