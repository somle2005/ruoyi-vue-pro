package com.jd.open.api.sdk.domain.platform.IsvLogService.request.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderInfoLog implements Serializable {
   private String userIp;
   private String josAppKey;
   private String jdId;
   private String deviceId;
   private String url;
   private String appName;
   private String userId;
   private String fileMd5;
   private List<OrderOaidInfo> orderOaidInfoList;
   private int operation;
   private long timestamp;

   @JsonProperty("user_ip")
   public void setUserIp(String userIp) {
      this.userIp = userIp;
   }

   @JsonProperty("user_ip")
   public String getUserIp() {
      return this.userIp;
   }

   @JsonProperty("josAppKey")
   public void setJosAppKey(String josAppKey) {
      this.josAppKey = josAppKey;
   }

   @JsonProperty("josAppKey")
   public String getJosAppKey() {
      return this.josAppKey;
   }

   @JsonProperty("jd_id")
   public void setJdId(String jdId) {
      this.jdId = jdId;
   }

   @JsonProperty("jd_id")
   public String getJdId() {
      return this.jdId;
   }

   @JsonProperty("device_id")
   public void setDeviceId(String deviceId) {
      this.deviceId = deviceId;
   }

   @JsonProperty("device_id")
   public String getDeviceId() {
      return this.deviceId;
   }

   @JsonProperty("url")
   public void setUrl(String url) {
      this.url = url;
   }

   @JsonProperty("url")
   public String getUrl() {
      return this.url;
   }

   @JsonProperty("app_name")
   public void setAppName(String appName) {
      this.appName = appName;
   }

   @JsonProperty("app_name")
   public String getAppName() {
      return this.appName;
   }

   @JsonProperty("user_id")
   public void setUserId(String userId) {
      this.userId = userId;
   }

   @JsonProperty("user_id")
   public String getUserId() {
      return this.userId;
   }

   @JsonProperty("file_md5")
   public void setFileMd5(String fileMd5) {
      this.fileMd5 = fileMd5;
   }

   @JsonProperty("file_md5")
   public String getFileMd5() {
      return this.fileMd5;
   }

   @JsonProperty("orderOaidInfoList")
   public void setOrderOaidInfoList(List<OrderOaidInfo> orderOaidInfoList) {
      this.orderOaidInfoList = orderOaidInfoList;
   }

   @JsonProperty("orderOaidInfoList")
   public List<OrderOaidInfo> getOrderOaidInfoList() {
      return this.orderOaidInfoList;
   }

   @JsonProperty("operation")
   public void setOperation(int operation) {
      this.operation = operation;
   }

   @JsonProperty("operation")
   public int getOperation() {
      return this.operation;
   }

   @JsonProperty("timestamp")
   public void setTimestamp(long timestamp) {
      this.timestamp = timestamp;
   }

   @JsonProperty("timestamp")
   public long getTimestamp() {
      return this.timestamp;
   }
}
