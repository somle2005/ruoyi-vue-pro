package com.jd.open.api.sdk.domain.youE.BizOrderDetailsJsfService.response.queryBizOrderDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CallRecordVo implements Serializable {
   private String callTime;
   private String callStartTime;
   private String callFinishTime;
   private String callDuration;
   private String ringTime;
   private String callState;

   @JsonProperty("callTime")
   public void setCallTime(String callTime) {
      this.callTime = callTime;
   }

   @JsonProperty("callTime")
   public String getCallTime() {
      return this.callTime;
   }

   @JsonProperty("callStartTime")
   public void setCallStartTime(String callStartTime) {
      this.callStartTime = callStartTime;
   }

   @JsonProperty("callStartTime")
   public String getCallStartTime() {
      return this.callStartTime;
   }

   @JsonProperty("callFinishTime")
   public void setCallFinishTime(String callFinishTime) {
      this.callFinishTime = callFinishTime;
   }

   @JsonProperty("callFinishTime")
   public String getCallFinishTime() {
      return this.callFinishTime;
   }

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

   @JsonProperty("callState")
   public void setCallState(String callState) {
      this.callState = callState;
   }

   @JsonProperty("callState")
   public String getCallState() {
      return this.callState;
   }
}
