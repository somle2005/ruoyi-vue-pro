package com.jd.open.api.sdk.request.customsglobalAPI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.customsglobalAPI.PopCustomsCenterServiceSoaChargeInternationalTransInfoJsfServiceSaveTransInfoMainResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopCustomsCenterServiceSoaChargeInternationalTransInfoJsfServiceSaveTransInfoMainRequest extends AbstractRequest implements JdRequest<PopCustomsCenterServiceSoaChargeInternationalTransInfoJsfServiceSaveTransInfoMainResponse> {
   private String customsId;
   private String venderId;
   private String mainOrderNo;
   private Integer orderAmount;
   private String fromPortDate;
   private String toPortDate;
   private String interTransMode;
   private String shipId;
   private String fromCity;
   private String toCity;
   private String actualW;
   private String chargedW;
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

   public void setMainOrderNo(String mainOrderNo) {
      this.mainOrderNo = mainOrderNo;
   }

   public String getMainOrderNo() {
      return this.mainOrderNo;
   }

   public void setOrderAmount(Integer orderAmount) {
      this.orderAmount = orderAmount;
   }

   public Integer getOrderAmount() {
      return this.orderAmount;
   }

   public void setFromPortDate(String fromPortDate) {
      this.fromPortDate = fromPortDate;
   }

   public String getFromPortDate() {
      return this.fromPortDate;
   }

   public void setToPortDate(String toPortDate) {
      this.toPortDate = toPortDate;
   }

   public String getToPortDate() {
      return this.toPortDate;
   }

   public void setInterTransMode(String interTransMode) {
      this.interTransMode = interTransMode;
   }

   public String getInterTransMode() {
      return this.interTransMode;
   }

   public void setShipId(String shipId) {
      this.shipId = shipId;
   }

   public String getShipId() {
      return this.shipId;
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
      return "jingdong.pop.customs.center.service.soa.charge.InternationalTransInfoJsfService.saveTransInfoMain";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customsId", this.customsId);
      pmap.put("venderId", this.venderId);
      pmap.put("mainOrderNo", this.mainOrderNo);
      pmap.put("orderAmount", this.orderAmount);
      pmap.put("fromPortDate", this.fromPortDate);
      pmap.put("toPortDate", this.toPortDate);
      pmap.put("interTransMode", this.interTransMode);
      pmap.put("shipId", this.shipId);
      pmap.put("fromCity", this.fromCity);
      pmap.put("toCity", this.toCity);
      pmap.put("actualW", this.actualW);
      pmap.put("chargedW", this.chargedW);
      pmap.put("ex1", this.ex1);
      pmap.put("ex2", this.ex2);
      pmap.put("ex3", this.ex3);
      pmap.put("ex4", this.ex4);
      pmap.put("ex5", this.ex5);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopCustomsCenterServiceSoaChargeInternationalTransInfoJsfServiceSaveTransInfoMainResponse> getResponseClass() {
      return PopCustomsCenterServiceSoaChargeInternationalTransInfoJsfServiceSaveTransInfoMainResponse.class;
   }
}
