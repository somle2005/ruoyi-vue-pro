package com.jd.open.api.sdk.domain.user.TokenToPinJosCenter.response.getOpenId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private int code;
   private String message;
   private String requestId;
   private String pin;
   private String openId;
   private String xid;

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public String getRequestId() {
      return this.requestId;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("open_id")
   public void setOpenId(String openId) {
      this.openId = openId;
   }

   @JsonProperty("open_id")
   public String getOpenId() {
      return this.openId;
   }

   @JsonProperty("xid")
   public void setXid(String xid) {
      this.xid = xid;
   }

   @JsonProperty("xid")
   public String getXid() {
      return this.xid;
   }
}
