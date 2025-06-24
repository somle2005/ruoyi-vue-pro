package com.jd.open.api.sdk.domain.youE.OrderQueryJosService.response.queryCallHistory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VirtualNumberCallRecordInfo implements Serializable {
   private String callDuration;
   private String ringTime;
   private String phoneBindNumber;
   private String callFinishTime;
   private String callNo;
   private String extensionNo;
   private String callStartTime;
   private String callTime;
   private String callState;

   @JsonProperty("callDuration")
   public void setCallDuration(String callDuration) {
      this.callDuration = callDuration;
   }

   @JsonProperty("callDuration")
   public String getCallDuration() {
      return this.callDuration;
   }

   @JsonProperty("ringTime")
   public void setRingTime(String ringTime) {
      this.ringTime = ringTime;
   }

   @JsonProperty("ringTime")
   public String getRingTime() {
      return this.ringTime;
   }

   @JsonProperty("phoneBindNumber")
   public void setPhoneBindNumber(String phoneBindNumber) {
      this.phoneBindNumber = phoneBindNumber;
   }

   @JsonProperty("phoneBindNumber")
   public String getPhoneBindNumber() {
      return this.phoneBindNumber;
   }

   @JsonProperty("callFinishTime")
   public void setCallFinishTime(String callFinishTime) {
      this.callFinishTime = callFinishTime;
   }

   @JsonProperty("callFinishTime")
   public String getCallFinishTime() {
      return this.callFinishTime;
   }

   @JsonProperty("callNo")
   public void setCallNo(String callNo) {
      this.callNo = callNo;
   }

   @JsonProperty("callNo")
   public String getCallNo() {
      return this.callNo;
   }

   @JsonProperty("extensionNo")
   public void setExtensionNo(String extensionNo) {
      this.extensionNo = extensionNo;
   }

   @JsonProperty("extensionNo")
   public String getExtensionNo() {
      return this.extensionNo;
   }

   @JsonProperty("callStartTime")
   public void setCallStartTime(String callStartTime) {
      this.callStartTime = callStartTime;
   }

   @JsonProperty("callStartTime")
   public String getCallStartTime() {
      return this.callStartTime;
   }

   @JsonProperty("callTime")
   public void setCallTime(String callTime) {
      this.callTime = callTime;
   }

   @JsonProperty("callTime")
   public String getCallTime() {
      return this.callTime;
   }

   @JsonProperty("callState")
   public void setCallState(String callState) {
      this.callState = callState;
   }

   @JsonProperty("callState")
   public String getCallState() {
      return this.callState;
   }
}
