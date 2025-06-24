package com.jd.open.api.sdk.request.platform;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.platform.IsvUploadThirdAppTransmitOrderInfoLogResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class IsvUploadThirdAppTransmitOrderInfoLogRequest extends AbstractRequest implements JdRequest<IsvUploadThirdAppTransmitOrderInfoLogResponse> {
   private String appName;
   private String userIp;
   private String josAppKey;
   private String deviceId;
   private String userId;
   private String orderIds;
   private String sendtoUrl;
   private String url;
   private long timeStamp;

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setUserIp(String userIp) {
      this.userIp = userIp;
   }

   public String getUserIp() {
      return this.userIp;
   }

   public void setJosAppKey(String josAppKey) {
      this.josAppKey = josAppKey;
   }

   public String getJosAppKey() {
      return this.josAppKey;
   }

   public void setDeviceId(String deviceId) {
      this.deviceId = deviceId;
   }

   public String getDeviceId() {
      return this.deviceId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getUserId() {
      return this.userId;
   }

   public void setOrderIds(String orderIds) {
      this.orderIds = orderIds;
   }

   public String getOrderIds() {
      return this.orderIds;
   }

   public void setSendtoUrl(String sendtoUrl) {
      this.sendtoUrl = sendtoUrl;
   }

   public String getSendtoUrl() {
      return this.sendtoUrl;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public String getUrl() {
      return this.url;
   }

   public void setTimeStamp(long timeStamp) {
      this.timeStamp = timeStamp;
   }

   public long getTimeStamp() {
      return this.timeStamp;
   }

   public String getApiMethod() {
      return "jingdong.isv.uploadThirdAppTransmitOrderInfoLog";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("app_name", this.appName);
      pmap.put("user_ip", this.userIp);
      pmap.put("josAppKey", this.josAppKey);
      pmap.put("device_id", this.deviceId);
      pmap.put("user_id", this.userId);
      pmap.put("order_ids", this.orderIds);
      pmap.put("sendto_url", this.sendtoUrl);
      pmap.put("url", this.url);
      pmap.put("time_stamp", this.timeStamp);
      return JsonUtil.toJson(pmap);
   }

   public Class<IsvUploadThirdAppTransmitOrderInfoLogResponse> getResponseClass() {
      return IsvUploadThirdAppTransmitOrderInfoLogResponse.class;
   }
}
