package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolPromoApiUnitServicePlusDiscountWriteOuterServiceCreateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolPromoApiUnitServicePlusDiscountWriteOuterServiceCreateRequest extends AbstractRequest implements JdRequest<MarketToolPromoApiUnitServicePlusDiscountWriteOuterServiceCreateResponse> {
   private String appName;
   private Integer bound;
   private String skuId;
   private String name;
   private String member;
   private String beginTime;
   private String endTime;
   private String platForm;
   private String plusDiscount;
   private Integer promoType;

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setBound(Integer bound) {
      this.bound = bound;
   }

   public Integer getBound() {
      return this.bound;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setMember(String member) {
      this.member = member;
   }

   public String getMember() {
      return this.member;
   }

   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   public String getBeginTime() {
      return this.beginTime;
   }

   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   public String getEndTime() {
      return this.endTime;
   }

   public void setPlatForm(String platForm) {
      this.platForm = platForm;
   }

   public String getPlatForm() {
      return this.platForm;
   }

   public void setPlusDiscount(String plusDiscount) {
      this.plusDiscount = plusDiscount;
   }

   public String getPlusDiscount() {
      return this.plusDiscount;
   }

   public void setPromoType(Integer promoType) {
      this.promoType = promoType;
   }

   public Integer getPromoType() {
      return this.promoType;
   }

   public String getApiMethod() {
      return "jingdong.market.tool.promo.api.unit.service.PlusDiscountWriteOuterService.create";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appName", this.appName);
      pmap.put("bound", this.bound);
      pmap.put("skuId", this.skuId);
      pmap.put("name", this.name);
      pmap.put("member", this.member);
      pmap.put("beginTime", this.beginTime);
      pmap.put("endTime", this.endTime);
      pmap.put("platForm", this.platForm);
      pmap.put("plusDiscount", this.plusDiscount);
      pmap.put("promoType", this.promoType);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolPromoApiUnitServicePlusDiscountWriteOuterServiceCreateResponse> getResponseClass() {
      return MarketToolPromoApiUnitServicePlusDiscountWriteOuterServiceCreateResponse.class;
   }
}
