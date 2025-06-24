package com.jd.open.api.sdk.request.platform;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.platform.IsvUploadOrderInfoLogResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class IsvUploadOrderInfoLogRequest extends AbstractRequest implements JdRequest<IsvUploadOrderInfoLogResponse> {
   private String userIp;
   private String appName;
   private String josAppKey;
   private String jdId;
   private String deviceId;
   private String userId;
   private String fileMd5;
   private String orderIds;
   private int operation;
   private String url;
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

   public void setFileMd5(String fileMd5) {
      this.fileMd5 = fileMd5;
   }

   public String getFileMd5() {
      return this.fileMd5;
   }

   public void setOrderIds(String orderIds) {
      this.orderIds = orderIds;
   }

   public String getOrderIds() {
      return this.orderIds;
   }

   public void setOperation(int operation) {
      this.operation = operation;
   }

   public int getOperation() {
      return this.operation;
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
      return "jingdong.isv.uploadOrderInfoLog";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("user_ip", this.userIp);
      pmap.put("app_name", this.appName);
      pmap.put("josAppKey", this.josAppKey);
      pmap.put("jd_id", this.jdId);
      pmap.put("device_id", this.deviceId);
      pmap.put("user_id", this.userId);
      pmap.put("file_md5", this.fileMd5);
      pmap.put("order_ids", this.orderIds);
      pmap.put("operation", this.operation);
      pmap.put("url", this.url);
      pmap.put("time_stamp", this.timeStamp);
      return JsonUtil.toJson(pmap);
   }

   public Class<IsvUploadOrderInfoLogResponse> getResponseClass() {
      return IsvUploadOrderInfoLogResponse.class;
   }
}
