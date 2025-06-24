package com.jd.open.api.sdk.request.jialilue;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jialilue.JzoneSendCouponResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JzoneSendCouponRequest extends AbstractRequest implements JdRequest<JzoneSendCouponResponse> {
   private String channle;
   private String deployAppName;
   private String hostName;
   private String clientIP;
   private String version;
   private String deployAppId;
   private String activityKey;
   private String pin;

   public void setChannle(String channle) {
      this.channle = channle;
   }

   public String getChannle() {
      return this.channle;
   }

   public void setDeployAppName(String deployAppName) {
      this.deployAppName = deployAppName;
   }

   public String getDeployAppName() {
      return this.deployAppName;
   }

   public void setHostName(String hostName) {
      this.hostName = hostName;
   }

   public String getHostName() {
      return this.hostName;
   }

   public void setClientIP(String clientIP) {
      this.clientIP = clientIP;
   }

   public String getClientIP() {
      return this.clientIP;
   }

   public void setVersion(String version) {
      this.version = version;
   }

   public String getVersion() {
      return this.version;
   }

   public void setDeployAppId(String deployAppId) {
      this.deployAppId = deployAppId;
   }

   public String getDeployAppId() {
      return this.deployAppId;
   }

   public void setActivityKey(String activityKey) {
      this.activityKey = activityKey;
   }

   public String getActivityKey() {
      return this.activityKey;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public String getApiMethod() {
      return "jingdong.jzone.sendCoupon";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("channle", this.channle);
      pmap.put("deployAppName", this.deployAppName);
      pmap.put("hostName", this.hostName);
      pmap.put("clientIP", this.clientIP);
      pmap.put("version", this.version);
      pmap.put("deployAppId", this.deployAppId);
      pmap.put("activityKey", this.activityKey);
      pmap.put("pin", this.pin);
      return JsonUtil.toJson(pmap);
   }

   public Class<JzoneSendCouponResponse> getResponseClass() {
      return JzoneSendCouponResponse.class;
   }
}
