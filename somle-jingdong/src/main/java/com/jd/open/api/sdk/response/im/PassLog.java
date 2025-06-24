package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class PassLog implements Serializable {
   private String waiter;
   private Date loginTime;
   private Date logoutTime;
   private String ip;
   private String loginSid;

   @JsonProperty("waiter")
   public void setWaiter(String waiter) {
      this.waiter = waiter;
   }

   @JsonProperty("waiter")
   public String getWaiter() {
      return this.waiter;
   }

   @JsonProperty("loginTime")
   public void setLoginTime(Date loginTime) {
      this.loginTime = loginTime;
   }

   @JsonProperty("loginTime")
   public Date getLoginTime() {
      return this.loginTime;
   }

   @JsonProperty("logoutTime")
   public void setLogoutTime(Date logoutTime) {
      this.logoutTime = logoutTime;
   }

   @JsonProperty("logoutTime")
   public Date getLogoutTime() {
      return this.logoutTime;
   }

   @JsonProperty("ip")
   public void setIp(String ip) {
      this.ip = ip;
   }

   @JsonProperty("ip")
   public String getIp() {
      return this.ip;
   }

   @JsonProperty("loginSid")
   public void setLoginSid(String loginSid) {
      this.loginSid = loginSid;
   }

   @JsonProperty("loginSid")
   public String getLoginSid() {
      return this.loginSid;
   }
}
