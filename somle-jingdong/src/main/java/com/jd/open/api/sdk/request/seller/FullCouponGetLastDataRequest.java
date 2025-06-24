package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.FullCouponGetLastDataResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FullCouponGetLastDataRequest extends AbstractRequest implements JdRequest<FullCouponGetLastDataResponse> {
   private String date;
   private String appKey;
   private Long shopId;
   private Long promoId;

   public void setDate(String date) {
      this.date = date;
   }

   public String getDate() {
      return this.date;
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

   public String getApiMethod() {
      return "jingdong.fullCoupon.getLastData";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("date", this.date);
      pmap.put("appKey", this.appKey);
      pmap.put("shopId", this.shopId);
      pmap.put("promoId", this.promoId);
      return JsonUtil.toJson(pmap);
   }

   public Class<FullCouponGetLastDataResponse> getResponseClass() {
      return FullCouponGetLastDataResponse.class;
   }
}
