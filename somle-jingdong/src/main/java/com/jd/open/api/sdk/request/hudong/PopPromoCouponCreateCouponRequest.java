package com.jd.open.api.sdk.request.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.CouponOuterWriteService.request.createCoupon.ClientInfo;
import com.jd.open.api.sdk.domain.hudong.CouponOuterWriteService.request.createCoupon.CouponOuterParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.PopPromoCouponCreateCouponResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopPromoCouponCreateCouponRequest extends AbstractRequest implements JdRequest<PopPromoCouponCreateCouponResponse> {
   private ClientInfo clientInfo;
   private CouponOuterParam couponOuterParam;

   public String getApiMethod() {
      return "jingdong.pop.promo.coupon.createCoupon";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("clientInfo", this.clientInfo);
      pmap.put("couponOuterParam", this.couponOuterParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopPromoCouponCreateCouponResponse> getResponseClass() {
      return PopPromoCouponCreateCouponResponse.class;
   }

   @JsonProperty("clientInfo")
   public void setClientInfo(ClientInfo clientInfo) {
      this.clientInfo = clientInfo;
   }

   @JsonProperty("clientInfo")
   public ClientInfo getClientInfo() {
      return this.clientInfo;
   }

   @JsonProperty("couponOuterParam")
   public void setCouponOuterParam(CouponOuterParam couponOuterParam) {
      this.couponOuterParam = couponOuterParam;
   }

   @JsonProperty("couponOuterParam")
   public CouponOuterParam getCouponOuterParam() {
      return this.couponOuterParam;
   }
}
