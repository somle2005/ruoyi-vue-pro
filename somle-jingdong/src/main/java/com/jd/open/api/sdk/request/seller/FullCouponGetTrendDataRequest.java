package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.FullCouponGetTrendDataResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FullCouponGetTrendDataRequest extends AbstractRequest implements JdRequest<FullCouponGetTrendDataResponse> {
   private String endDate;
   private String appKey;
   private Long shopId;
   private Long promoId;
   private String startDate;

   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   public String getEndDate() {
      return this.endDate;
   }

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   public Long getShopId() {
      return this.shopId;
   }

   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   public Long getPromoId() {
      return this.promoId;
   }

   public void setStartDate(String startDate) {
      this.startDate = startDate;
   }

   public String getStartDate() {
      return this.startDate;
   }

   public String getApiMethod() {
      return "jingdong.fullCoupon.getTrendData";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("endDate", this.endDate);
      pmap.put("appKey", this.appKey);
      pmap.put("shopId", this.shopId);
      pmap.put("promoId", this.promoId);
      pmap.put("startDate", this.startDate);
      return JsonUtil.toJson(pmap);
   }

   public Class<FullCouponGetTrendDataResponse> getResponseClass() {
      return FullCouponGetTrendDataResponse.class;
   }
}
