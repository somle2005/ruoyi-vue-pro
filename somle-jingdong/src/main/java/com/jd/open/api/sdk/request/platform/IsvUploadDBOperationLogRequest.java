package com.jd.open.api.sdk.request.platform;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.platform.IsvUploadDBOperationLogResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class IsvUploadDBOperationLogRequest extends AbstractRequest implements JdRequest<IsvUploadDBOperationLogResponse> {
   private String userIp;
   private String appName;
   private String josAppKey;
   private String deviceId;
   private String userId;
   private String url;
   private String db;
   private String sql;
   private long timeStamp;

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

   public void setUrl(String url) {
      this.url = url;
   }

   public String getUrl() {
      return this.url;
   }

   public void setDb(String db) {
      this.db = db;
   }

   public String getDb() {
      return this.db;
   }

   public void setSql(String sql) {
      this.sql = sql;
   }

   public String getSql() {
      return this.sql;
   }

   public void setTimeStamp(long timeStamp) {
      this.timeStamp = timeStamp;
   }

   public long getTimeStamp() {
      return this.timeStamp;
   }

   public String getApiMethod() {
      return "jingdong.isv.uploadDBOperationLog";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("user_ip", this.userIp);
      pmap.put("app_name", this.appName);
      pmap.put("josAppKey", this.josAppKey);
      pmap.put("device_id", this.deviceId);
      pmap.put("user_id", this.userId);
      pmap.put("url", this.url);
      pmap.put("db", this.db);
      pmap.put("sql", this.sql);
      pmap.put("time_stamp", this.timeStamp);
      return JsonUtil.toJson(pmap);
   }

   public Class<IsvUploadDBOperationLogResponse> getResponseClass() {
      return IsvUploadDBOperationLogResponse.class;
   }
}
