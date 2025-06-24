package com.jd.open.api.sdk.request.aqyzzx;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.aqyzzx.MfaUserUnifiedAuthenticationResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MfaUserUnifiedAuthenticationRequest extends AbstractRequest implements JdRequest<MfaUserUnifiedAuthenticationResponse> {
   private String returnUrl;
   private String deviceOSType;
   private String appId;
   private Integer businessType;
   private String eid;
   private String openUDID;
   private String source;
   private String deviceName;
   private String email;
   private String deviceOSVersion;
   private String pin;
   private String appVersion;
   private String loginChannel;
   private String authType;
   private String clientIp;
   private String uuid;
   private String mobile;
   private String openIdBuyer;
   private String xidBuyer;

   public void setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
   }

   public String getReturnUrl() {
      return this.returnUrl;
   }

   public void setDeviceOSType(String deviceOSType) {
      this.deviceOSType = deviceOSType;
   }

   public String getDeviceOSType() {
      return this.deviceOSType;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setBusinessType(Integer businessType) {
      this.businessType = businessType;
   }

   public Integer getBusinessType() {
      return this.businessType;
   }

   public void setEid(String eid) {
      this.eid = eid;
   }

   public String getEid() {
      return this.eid;
   }

   public void setOpenUDID(String openUDID) {
      this.openUDID = openUDID;
   }

   public String getOpenUDID() {
      return this.openUDID;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public void setDeviceName(String deviceName) {
      this.deviceName = deviceName;
   }

   public String getDeviceName() {
      return this.deviceName;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getEmail() {
      return this.email;
   }

   public void setDeviceOSVersion(String deviceOSVersion) {
      this.deviceOSVersion = deviceOSVersion;
   }

   public String getDeviceOSVersion() {
      return this.deviceOSVersion;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setAppVersion(String appVersion) {
      this.appVersion = appVersion;
   }

   public String getAppVersion() {
      return this.appVersion;
   }

   public void setLoginChannel(String loginChannel) {
      this.loginChannel = loginChannel;
   }

   public String getLoginChannel() {
      return this.loginChannel;
   }

   public void setAuthType(String authType) {
      this.authType = authType;
   }

   public String getAuthType() {
      return this.authType;
   }

   public void setClientIp(String clientIp) {
      this.clientIp = clientIp;
   }

   public String getClientIp() {
      return this.clientIp;
   }

   public void setUuid(String uuid) {
      this.uuid = uuid;
   }

   public String getUuid() {
      return this.uuid;
   }

   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   public String getMobile() {
      return this.mobile;
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
      return "jingdong.mfa.userUnifiedAuthentication";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("returnUrl", this.returnUrl);
      pmap.put("deviceOSType", this.deviceOSType);
      pmap.put("appId", this.appId);
      pmap.put("businessType", this.businessType);
      pmap.put("eid", this.eid);
      pmap.put("openUDID", this.openUDID);
      pmap.put("source", this.source);
      pmap.put("deviceName", this.deviceName);
      pmap.put("email", this.email);
      pmap.put("deviceOSVersion", this.deviceOSVersion);
      pmap.put("pin", this.pin);
      pmap.put("appVersion", this.appVersion);
      pmap.put("loginChannel", this.loginChannel);
      pmap.put("authType", this.authType);
      pmap.put("clientIp", this.clientIp);
      pmap.put("uuid", this.uuid);
      pmap.put("mobile", this.mobile);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<MfaUserUnifiedAuthenticationResponse> getResponseClass() {
      return MfaUserUnifiedAuthenticationResponse.class;
   }
}
