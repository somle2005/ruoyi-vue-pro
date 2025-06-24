package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolCouponApiServiceCouponBaseReadOuterServiceInitBaseRuleInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolCouponApiServiceCouponBaseReadOuterServiceInitBaseRuleInfoRequest extends AbstractRequest implements JdRequest<MarketToolCouponApiServiceCouponBaseReadOuterServiceInitBaseRuleInfoResponse> {
   private String busiCode;
   private String appName;
   private String ip;
   private String appId;

   public void setBusiCode(String busiCode) {
      this.busiCode = busiCode;
   }

   public String getBusiCode() {
      return this.busiCode;
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
      return "jingdong.market.tool.coupon.api.service.CouponBaseReadOuterService.initBaseRuleInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("busiCode", this.busiCode);
      pmap.put("appName", this.appName);
      pmap.put("ip", this.ip);
      pmap.put("appId", this.appId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolCouponApiServiceCouponBaseReadOuterServiceInitBaseRuleInfoResponse> getResponseClass() {
      return MarketToolCouponApiServiceCouponBaseReadOuterServiceInitBaseRuleInfoResponse.class;
   }
}
