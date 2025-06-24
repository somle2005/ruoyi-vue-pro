package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolCouponApiServiceCouponReadOuterServiceQueryWarePageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolCouponApiServiceCouponReadOuterServiceQueryWarePageRequest extends AbstractRequest implements JdRequest<MarketToolCouponApiServiceCouponReadOuterServiceQueryWarePageResponse> {
   private Integer pageIndex;
   private Integer pageSize;
   private Long couponId;
   private String appName;
   private String ip;
   private String appId;

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setCouponId(Long couponId) {
      this.couponId = couponId;
   }

   public Long getCouponId() {
      return this.couponId;
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
      return "jingdong.market.tool.coupon.api.service.CouponReadOuterService.queryWarePage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("pageSize", this.pageSize);
      pmap.put("couponId", this.couponId);
      pmap.put("appName", this.appName);
      pmap.put("ip", this.ip);
      pmap.put("appId", this.appId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolCouponApiServiceCouponReadOuterServiceQueryWarePageResponse> getResponseClass() {
      return MarketToolCouponApiServiceCouponReadOuterServiceQueryWarePageResponse.class;
   }
}
