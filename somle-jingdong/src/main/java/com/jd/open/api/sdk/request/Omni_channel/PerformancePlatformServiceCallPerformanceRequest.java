package com.jd.open.api.sdk.request.Omni_channel;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.Omni_channel.PerformancePlatformServiceCallPerformanceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PerformancePlatformServiceCallPerformanceRequest extends AbstractRequest implements JdRequest<PerformancePlatformServiceCallPerformanceResponse> {
   private String authKey;
   private String pin;
   private String shopCode;
   private String venderCode;
   private String amount;
   private String address;
   private String orderId;
   private String city;
   private String latitude;
   private String latType;
   private String weight;
   private String skuType;
   private String consigneeName;
   private String province;
   private String phone;
   private String advancePayment;
   private String street;
   private String district;
   private String tel;
   private String performancer;
   private String orderMark;
   private String skuNum;
   private String longitude;
   private String virtualPhone;
   private String source;

   public void setAuthKey(String authKey) {
      this.authKey = authKey;
   }

   public String getAuthKey() {
      return this.authKey;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setShopCode(String shopCode) {
      this.shopCode = shopCode;
   }

   public String getShopCode() {
      return this.shopCode;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setAmount(String amount) {
      this.amount = amount;
   }

   public String getAmount() {
      return this.amount;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getAddress() {
      return this.address;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getCity() {
      return this.city;
   }

   public void setLatitude(String latitude) {
      this.latitude = latitude;
   }

   public String getLatitude() {
      return this.latitude;
   }

   public void setLatType(String latType) {
      this.latType = latType;
   }

   public String getLatType() {
      return this.latType;
   }

   public void setWeight(String weight) {
      this.weight = weight;
   }

   public String getWeight() {
      return this.weight;
   }

   public void setSkuType(String skuType) {
      this.skuType = skuType;
   }

   public String getSkuType() {
      return this.skuType;
   }

   public void setConsigneeName(String consigneeName) {
      this.consigneeName = consigneeName;
   }

   public String getConsigneeName() {
      return this.consigneeName;
   }

   public void setProvince(String province) {
      this.province = province;
   }

   public String getProvince() {
      return this.province;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getPhone() {
      return this.phone;
   }

   public void setAdvancePayment(String advancePayment) {
      this.advancePayment = advancePayment;
   }

   public String getAdvancePayment() {
      return this.advancePayment;
   }

   public void setStreet(String street) {
      this.street = street;
   }

   public String getStreet() {
      return this.street;
   }

   public void setDistrict(String district) {
      this.district = district;
   }

   public String getDistrict() {
      return this.district;
   }

   public void setTel(String tel) {
      this.tel = tel;
   }

   public String getTel() {
      return this.tel;
   }

   public void setPerformancer(String performancer) {
      this.performancer = performancer;
   }

   public String getPerformancer() {
      return this.performancer;
   }

   public void setOrderMark(String orderMark) {
      this.orderMark = orderMark;
   }

   public String getOrderMark() {
      return this.orderMark;
   }

   public void setSkuNum(String skuNum) {
      this.skuNum = skuNum;
   }

   public String getSkuNum() {
      return this.skuNum;
   }

   public void setLongitude(String longitude) {
      this.longitude = longitude;
   }

   public String getLongitude() {
      return this.longitude;
   }

   public void setVirtualPhone(String virtualPhone) {
      this.virtualPhone = virtualPhone;
   }

   public String getVirtualPhone() {
      return this.virtualPhone;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public String getApiMethod() {
      return "jingdong.PerformancePlatformService.callPerformance";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authKey", this.authKey);
      pmap.put("pin", this.pin);
      pmap.put("shopCode", this.shopCode);
      pmap.put("venderCode", this.venderCode);
      pmap.put("amount", this.amount);
      pmap.put("address", this.address);
      pmap.put("orderId", this.orderId);
      pmap.put("city", this.city);
      pmap.put("latitude", this.latitude);
      pmap.put("latType", this.latType);
      pmap.put("weight", this.weight);
      pmap.put("skuType", this.skuType);
      pmap.put("consigneeName", this.consigneeName);
      pmap.put("province", this.province);
      pmap.put("phone", this.phone);
      pmap.put("advancePayment", this.advancePayment);
      pmap.put("street", this.street);
      pmap.put("district", this.district);
      pmap.put("tel", this.tel);
      pmap.put("performancer", this.performancer);
      pmap.put("orderMark", this.orderMark);
      pmap.put("skuNum", this.skuNum);
      pmap.put("longitude", this.longitude);
      pmap.put("virtualPhone", this.virtualPhone);
      pmap.put("source", this.source);
      return JsonUtil.toJson(pmap);
   }

   public Class<PerformancePlatformServiceCallPerformanceResponse> getResponseClass() {
      return PerformancePlatformServiceCallPerformanceResponse.class;
   }
}
