package com.jd.open.api.sdk.request.customsglobalAPI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.customsglobalAPI.PopCustomsCenterServiceSoaChargeInternationalTransInfoJsfServiceSaveTransInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopCustomsCenterServiceSoaChargeInternationalTransInfoJsfServiceSaveTransInfoRequest extends AbstractRequest implements JdRequest<PopCustomsCenterServiceSoaChargeInternationalTransInfoJsfServiceSaveTransInfoResponse> {
   private String customsId;
   private String venderId;
   private String orderId;
   private String platformId;
   private String interWayBillNo;
   private String interTransName;
   private String interTransMode;
   private String fromCity;
   private String toCity;
   private String actualW;
   private String chargedW;
   private String mainOrderNo;
   private String isVolume;
   private String tax;
   private String ex1;
   private String ex2;
   private String ex3;
   private String ex4;
   private String ex5;

   public void setCustomsId(String customsId) {
      this.customsId = customsId;
   }

   public String getCustomsId() {
      return this.customsId;
   }

   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   public String getVenderId() {
      return this.venderId;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setPlatformId(String platformId) {
      this.platformId = platformId;
   }

   public String getPlatformId() {
      return this.platformId;
   }

   public void setInterWayBillNo(String interWayBillNo) {
      this.interWayBillNo = interWayBillNo;
   }

   public String getInterWayBillNo() {
      return this.interWayBillNo;
   }

   public void setInterTransName(String interTransName) {
      this.interTransName = interTransName;
   }

   public String getInterTransName() {
      return this.interTransName;
   }

   public void setInterTransMode(String interTransMode) {
      this.interTransMode = interTransMode;
   }

   public String getInterTransMode() {
      return this.interTransMode;
   }

   public void setFromCity(String fromCity) {
      this.fromCity = fromCity;
   }

   public String getFromCity() {
      return this.fromCity;
   }

   public void setToCity(String toCity) {
      this.toCity = toCity;
   }

   public String getToCity() {
      return this.toCity;
   }

   public void setActualW(String actualW) {
      this.actualW = actualW;
   }

   public String getActualW() {
      return this.actualW;
   }

   public void setChargedW(String chargedW) {
      this.chargedW = chargedW;
   }

   public String getChargedW() {
      return this.chargedW;
   }

   public void setMainOrderNo(String mainOrderNo) {
      this.mainOrderNo = mainOrderNo;
   }

   public String getMainOrderNo() {
      return this.mainOrderNo;
   }

   public void setIsVolume(String isVolume) {
      this.isVolume = isVolume;
   }

   public String getIsVolume() {
      return this.isVolume;
   }

   public void setTax(String tax) {
      this.tax = tax;
   }

   public String getTax() {
      return this.tax;
   }

   public void setEx1(String ex1) {
      this.ex1 = ex1;
   }

   public String getEx1() {
      return this.ex1;
   }

   public void setEx2(String ex2) {
      this.ex2 = ex2;
   }

   public String getEx2() {
      return this.ex2;
   }

   public void setEx3(String ex3) {
      this.ex3 = ex3;
   }

   public String getEx3() {
      return this.ex3;
   }

   public void setEx4(String ex4) {
      this.ex4 = ex4;
   }

   public String getEx4() {
      return this.ex4;
   }

   public void setEx5(String ex5) {
      this.ex5 = ex5;
   }

   public String getEx5() {
      return this.ex5;
   }

   public String getApiMethod() {
      return "jingdong.pop.customs.center.service.soa.charge.InternationalTransInfoJsfService.saveTransInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customsId", this.customsId);
      pmap.put("venderId", this.venderId);
      pmap.put("orderId", this.orderId);
      pmap.put("platformId", this.platformId);
      pmap.put("interWayBillNo", this.interWayBillNo);
      pmap.put("interTransName", this.interTransName);
      pmap.put("interTransMode", this.interTransMode);
      pmap.put("fromCity", this.fromCity);
      pmap.put("toCity", this.toCity);
      pmap.put("actualW", this.actualW);
      pmap.put("chargedW", this.chargedW);
      pmap.put("mainOrderNo", this.mainOrderNo);
      pmap.put("isVolume", this.isVolume);
      pmap.put("tax", this.tax);
      pmap.put("ex1", this.ex1);
      pmap.put("ex2", this.ex2);
      pmap.put("ex3", this.ex3);
      pmap.put("ex4", this.ex4);
      pmap.put("ex5", this.ex5);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopCustomsCenterServiceSoaChargeInternationalTransInfoJsfServiceSaveTransInfoResponse> getResponseClass() {
      return PopCustomsCenterServiceSoaChargeInternationalTransInfoJsfServiceSaveTransInfoResponse.class;
   }
}
