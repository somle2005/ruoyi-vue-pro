package com.jd.open.api.sdk.request.seller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.request.createFullCoupon.OpenOrderPromoInfo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.FullCouponCreateFullCouponResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FullCouponCreateFullCouponRequest extends AbstractRequest implements JdRequest<FullCouponCreateFullCouponResponse> {
   private OpenOrderPromoInfo param;

   public String getApiMethod() {
      return "jingdong.fullCoupon.createFullCoupon";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<FullCouponCreateFullCouponResponse> getResponseClass() {
      return FullCouponCreateFullCouponResponse.class;
   }

   @JsonProperty("param")
   public void setParam(OpenOrderPromoInfo param) {
      this.param = param;
   }

   @JsonProperty("param")
   public OpenOrderPromoInfo getParam() {
      return this.param;
   }
}
