package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.FullCouponGetPromoDetailInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FullCouponGetPromoDetailInfoRequest extends AbstractRequest implements JdRequest<FullCouponGetPromoDetailInfoResponse> {
   private String appKey;
   private Long promoId;

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
      return "jingdong.fullCoupon.getPromoDetailInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appKey", this.appKey);
      pmap.put("promoId", this.promoId);
      return JsonUtil.toJson(pmap);
   }

   public Class<FullCouponGetPromoDetailInfoResponse> getResponseClass() {
      return FullCouponGetPromoDetailInfoResponse.class;
   }
}
