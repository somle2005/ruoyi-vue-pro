package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerCouponWritePushCouponResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerCouponWritePushCouponRequest extends AbstractRequest implements JdRequest<SellerCouponWritePushCouponResponse> {
   private String port;
   private String requestId;
   private String pin;
   private String distrTime;
   private Long couponId;
   private String uuid;
   private String openIdBuyer;
   private String xidBuyer;

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

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setDistrTime(String distrTime) {
      this.distrTime = distrTime;
   }

   public String getDistrTime() {
      return this.distrTime;
   }

   public void setCouponId(Long couponId) {
      this.couponId = couponId;
   }

   public Long getCouponId() {
      return this.couponId;
   }

   public void setUuid(String uuid) {
      this.uuid = uuid;
   }

   public String getUuid() {
      return this.uuid;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.seller.coupon.write.pushCoupon";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("port", this.port);
      pmap.put("requestId", this.requestId);
      pmap.put("pin", this.pin);
      pmap.put("distrTime", this.distrTime);
      pmap.put("couponId", this.couponId);
      pmap.put("uuid", this.uuid);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerCouponWritePushCouponResponse> getResponseClass() {
      return SellerCouponWritePushCouponResponse.class;
   }
}
