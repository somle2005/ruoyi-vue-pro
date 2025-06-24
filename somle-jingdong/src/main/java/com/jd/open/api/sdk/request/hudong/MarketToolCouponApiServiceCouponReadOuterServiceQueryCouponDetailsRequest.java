package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolCouponApiServiceCouponReadOuterServiceQueryCouponDetailsResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolCouponApiServiceCouponReadOuterServiceQueryCouponDetailsRequest extends AbstractRequest implements JdRequest<MarketToolCouponApiServiceCouponReadOuterServiceQueryCouponDetailsResponse> {
   private Long couponId;
   private String couponIdStr;
   private String appName;
   private String ip;
   private String appId;

   public void setCouponId(Long couponId) {
      this.couponId = couponId;
   }

   public Long getCouponId() {
      return this.couponId;
   }

   public void setCouponIdStr(String couponIdStr) {
      this.couponIdStr = couponIdStr;
   }

   public String getCouponIdStr() {
      return this.couponIdStr;
   }

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public String getApiMethod() {
      return "jingdong.market.tool.coupon.api.service.CouponReadOuterService.queryCouponDetails";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("couponId", this.couponId);
      pmap.put("couponIdStr", this.couponIdStr);
      pmap.put("appName", this.appName);
      pmap.put("ip", this.ip);
      pmap.put("appId", this.appId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolCouponApiServiceCouponReadOuterServiceQueryCouponDetailsResponse> getResponseClass() {
      return MarketToolCouponApiServiceCouponReadOuterServiceQueryCouponDetailsResponse.class;
   }
}
