package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerCouponWriteLockCouponResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerCouponWriteLockCouponRequest extends AbstractRequest implements JdRequest<SellerCouponWriteLockCouponResponse> {
   private String port;
   private String requestId;
   private long time;
   private String purpose;
   private String operateTime;
   private Long couponId;

   public void setPort(String port) {
      this.port = port;
   }

   public String getPort() {
      return this.port;
   }

   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   public String getRequestId() {
      return this.requestId;
   }

   public void setTime(long time) {
      this.time = time;
   }

   public long getTime() {
      return this.time;
   }

   public void setPurpose(String purpose) {
      this.purpose = purpose;
   }

   public String getPurpose() {
      return this.purpose;
   }

   public void setOperateTime(String operateTime) {
      this.operateTime = operateTime;
   }

   public String getOperateTime() {
      return this.operateTime;
   }

   public void setCouponId(Long couponId) {
      this.couponId = couponId;
   }

   public Long getCouponId() {
      return this.couponId;
   }

   public String getApiMethod() {
      return "jingdong.seller.coupon.write.lockCoupon";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("port", this.port);
      pmap.put("requestId", this.requestId);
      pmap.put("time", this.time);
      pmap.put("purpose", this.purpose);
      pmap.put("operateTime", this.operateTime);
      pmap.put("couponId", this.couponId);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerCouponWriteLockCouponResponse> getResponseClass() {
      return SellerCouponWriteLockCouponResponse.class;
   }
}
