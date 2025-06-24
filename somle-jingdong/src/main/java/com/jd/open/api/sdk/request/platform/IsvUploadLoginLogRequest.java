package com.jd.open.api.sdk.request.platform;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.platform.IsvUploadLoginLogResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class IsvUploadLoginLogRequest extends AbstractRequest implements JdRequest<IsvUploadLoginLogResponse> {
   private int result;
   private String userIp;
   private String appName;
   private String josAppKey;
   private String jdId;
   private String deviceId;
   private String userId;
   private String message;
   private long timeStamp;

   public void setResult(int result) {
      this.result = result;
   }

   public int getResult() {
      return this.result;
   }

   public void setUserIp(String userIp) {
      this.userIp = userIp;
   }

   public String getUserIp() {
      return this.userIp;
   }

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setJosAppKey(String josAppKey) {
      this.josAppKey = josAppKey;
   }

   public String getJosAppKey() {
      return this.josAppKey;
   }

   public void setJdId(String jdId) {
      this.jdId = jdId;
   }

   public String getJdId() {
      return this.jdId;
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

   public void setMessage(String message) {
      this.message = message;
   }

   public String getMessage() {
      return this.message;
   }

   public void setTimeStamp(long timeStamp) {
      this.timeStamp = timeStamp;
   }

   public long getTimeStamp() {
      return this.timeStamp;
   }

   public String getApiMethod() {
      return "jingdong.isv.uploadLoginLog";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("result", this.result);
      pmap.put("user_ip", this.userIp);
      pmap.put("app_name", this.appName);
      pmap.put("josAppKey", this.josAppKey);
      pmap.put("jd_id", this.jdId);
      pmap.put("device_id", this.deviceId);
      pmap.put("user_id", this.userId);
      pmap.put("message", this.message);
      pmap.put("time_stamp", this.timeStamp);
      return JsonUtil.toJson(pmap);
   }

   public Class<IsvUploadLoginLogResponse> getResponseClass() {
      return IsvUploadLoginLogResponse.class;
   }
}
