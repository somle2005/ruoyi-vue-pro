package com.jd.open.api.sdk.request.unboundedShop;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.SubmitStoreOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SubmitStoreOrderRequest extends AbstractRequest implements JdRequest<SubmitStoreOrderResponse> {
   private String pin;
   private String code;
   private String address;
   private Integer provinceId;
   private Integer cityId;
   private Integer countryId;
   private Integer townId;
   private String receiver;
   private String mobile;
   private String email;
   private String phone;
   private String totalPrice;
   private String salesPin;
   private Long storeId;
   private String remark;
   private String deliveryType;
   private Long categoryId1;
   private Long categoryId2;
   private Long categoryId3;
   private String skuId;
   private String skuName;
   private Integer purchaseNum;
   private String skuPrice;

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getAddress() {
      return this.address;
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

   public void setCountryId(Integer countryId) {
      this.countryId = countryId;
   }

   public Integer getCountryId() {
      return this.countryId;
   }

   public void setTownId(Integer townId) {
      this.townId = townId;
   }

   public Integer getTownId() {
      return this.townId;
   }

   public void setReceiver(String receiver) {
      this.receiver = receiver;
   }

   public String getReceiver() {
      return this.receiver;
   }

   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   public String getMobile() {
      return this.mobile;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getEmail() {
      return this.email;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getPhone() {
      return this.phone;
   }

   public void setTotalPrice(String totalPrice) {
      this.totalPrice = totalPrice;
   }

   public String getTotalPrice() {
      return this.totalPrice;
   }

   public void setSalesPin(String salesPin) {
      this.salesPin = salesPin;
   }

   public String getSalesPin() {
      return this.salesPin;
   }

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setDeliveryType(String deliveryType) {
      this.deliveryType = deliveryType;
   }

   public String getDeliveryType() {
      return this.deliveryType;
   }

   public void setCategoryId1(Long categoryId1) {
      this.categoryId1 = categoryId1;
   }

   public Long getCategoryId1() {
      return this.categoryId1;
   }

   public void setCategoryId2(Long categoryId2) {
      this.categoryId2 = categoryId2;
   }

   public Long getCategoryId2() {
      return this.categoryId2;
   }

   public void setCategoryId3(Long categoryId3) {
      this.categoryId3 = categoryId3;
   }

   public Long getCategoryId3() {
      return this.categoryId3;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   public String getSkuName() {
      return this.skuName;
   }

   public void setPurchaseNum(Integer purchaseNum) {
      this.purchaseNum = purchaseNum;
   }

   public Integer getPurchaseNum() {
      return this.purchaseNum;
   }

   public void setSkuPrice(String skuPrice) {
      this.skuPrice = skuPrice;
   }

   public String getSkuPrice() {
      return this.skuPrice;
   }

   public String getApiMethod() {
      return "jingdong.submitStoreOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pin", this.pin);
      pmap.put("code", this.code);
      pmap.put("address", this.address);
      pmap.put("provinceId", this.provinceId);
      pmap.put("cityId", this.cityId);
      pmap.put("countryId", this.countryId);
      pmap.put("townId", this.townId);
      pmap.put("receiver", this.receiver);
      pmap.put("mobile", this.mobile);
      pmap.put("email", this.email);
      pmap.put("phone", this.phone);
      pmap.put("totalPrice", this.totalPrice);
      pmap.put("salesPin", this.salesPin);
      pmap.put("storeId", this.storeId);
      pmap.put("remark", this.remark);
      pmap.put("deliveryType", this.deliveryType);
      pmap.put("categoryId1", this.categoryId1);
      pmap.put("categoryId2", this.categoryId2);
      pmap.put("categoryId3", this.categoryId3);
      pmap.put("skuId", this.skuId);
      pmap.put("skuName", this.skuName);
      pmap.put("purchaseNum", this.purchaseNum);
      pmap.put("skuPrice", this.skuPrice);
      return JsonUtil.toJson(pmap);
   }

   public Class<SubmitStoreOrderResponse> getResponseClass() {
      return SubmitStoreOrderResponse.class;
   }
}
