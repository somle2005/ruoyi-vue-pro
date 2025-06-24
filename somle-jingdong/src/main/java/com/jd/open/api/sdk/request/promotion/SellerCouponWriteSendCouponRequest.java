package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerCouponWriteSendCouponResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerCouponWriteSendCouponRequest extends AbstractRequest implements JdRequest<SellerCouponWriteSendCouponResponse> {
   private String ip;
   private String deployAppName;
   private String port;
   private String userPin;
   private String putKey;
   private String requestId;
   private boolean requestRetry;
   private String openIdBuyer;
   private String xidBuyer;

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setDeployAppName(String deployAppName) {
      this.deployAppName = deployAppName;
   }

   public String getDeployAppName() {
      return this.deployAppName;
   }

   public void setPort(String port) {
      this.port = port;
   }

   public String getPort() {
      return this.port;
   }

   public void setUserPin(String userPin) {
      this.userPin = userPin;
   }

   public String getUserPin() {
      return this.userPin;
   }

   public void setPutKey(String putKey) {
      this.putKey = putKey;
   }

   public String getPutKey() {
      return this.putKey;
   }

   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   public String getRequestId() {
      return this.requestId;
   }

   public void setRequestRetry(boolean requestRetry) {
      this.requestRetry = requestRetry;
   }

   public boolean getRequestRetry() {
      return this.requestRetry;
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
      return "jingdong.seller.coupon.write.sendCoupon";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ip", this.ip);
      pmap.put("deployAppName", this.deployAppName);
      pmap.put("port", this.port);
      pmap.put("userPin", this.userPin);
      pmap.put("putKey", this.putKey);
      pmap.put("requestId", this.requestId);
      pmap.put("requestRetry", this.requestRetry);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerCouponWriteSendCouponResponse> getResponseClass() {
      return SellerCouponWriteSendCouponResponse.class;
   }
}
