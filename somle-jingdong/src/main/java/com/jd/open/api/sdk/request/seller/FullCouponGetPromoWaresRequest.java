package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.FullCouponGetPromoWaresResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FullCouponGetPromoWaresRequest extends AbstractRequest implements JdRequest<FullCouponGetPromoWaresResponse> {
   private Integer pageIndex;
   private String appKey;
   private Long promoId;

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
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
      return "jingdong.fullCoupon.getPromoWares";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("appKey", this.appKey);
      pmap.put("promoId", this.promoId);
      return JsonUtil.toJson(pmap);
   }

   public Class<FullCouponGetPromoWaresResponse> getResponseClass() {
      return FullCouponGetPromoWaresResponse.class;
   }
}
