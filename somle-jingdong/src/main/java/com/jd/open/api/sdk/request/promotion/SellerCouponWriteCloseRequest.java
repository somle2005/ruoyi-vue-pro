package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerCouponWriteCloseResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerCouponWriteCloseRequest extends AbstractRequest implements JdRequest<SellerCouponWriteCloseResponse> {
   private String ip;
   private String port;
   private Long couponId;

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setPort(String port) {
      this.port = port;
   }

   public String getPort() {
      return this.port;
   }

   public void setCouponId(Long couponId) {
      this.couponId = couponId;
   }

   public Long getCouponId() {
      return this.couponId;
   }

   public String getApiMethod() {
      return "jingdong.seller.coupon.write.close";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ip", this.ip);
      pmap.put("port", this.port);
      pmap.put("couponId", this.couponId);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerCouponWriteCloseResponse> getResponseClass() {
      return SellerCouponWriteCloseResponse.class;
   }
}
