package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.FullCouponGetPromoSkusResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FullCouponGetPromoSkusRequest extends AbstractRequest implements JdRequest<FullCouponGetPromoSkusResponse> {
   private Long wareId;
   private String appKey;
   private Long promoId;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   public Long getPromoId() {
      return this.promoId;
   }

   public String getApiMethod() {
      return "jingdong.fullCoupon.getPromoSkus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("appKey", this.appKey);
      pmap.put("promoId", this.promoId);
      return JsonUtil.toJson(pmap);
   }

   public Class<FullCouponGetPromoSkusResponse> getResponseClass() {
      return FullCouponGetPromoSkusResponse.class;
   }
}
