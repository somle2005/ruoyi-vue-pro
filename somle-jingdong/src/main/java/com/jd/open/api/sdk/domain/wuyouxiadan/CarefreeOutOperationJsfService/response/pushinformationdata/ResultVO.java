package com.jd.open.api.sdk.domain.wuyouxiadan.CarefreeOutOperationJsfService.response.pushinformationdata;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultVO implements Serializable {
   private String busCode;
   private String busMsg;
   private String busTime;
   private String busVersion;
   private String busData;

   @JsonProperty("busCode")
   public void setBusCode(String busCode) {
      this.busCode = busCode;
   }

   @JsonProperty("busCode")
   public String getBusCode() {
      return this.busCode;
   }

   @JsonProperty("busMsg")
   public void setBusMsg(String busMsg) {
      this.busMsg = busMsg;
   }

   @JsonProperty("busMsg")
   public String getBusMsg() {
      return this.busMsg;
   }

   @JsonProperty("busTime")
   public void setBusTime(String busTime) {
      this.busTime = busTime;
   }

   @JsonProperty("busTime")
   public String getBusTime() {
      return this.busTime;
   }

   @JsonProperty("busVersion")
   public void setBusVersion(String busVersion) {
      this.busVersion = busVersion;
   }

   @JsonProperty("busVersion")
   public String getBusVersion() {
      return this.busVersion;
   }

   @JsonProperty("busData")
   public void setBusData(String busData) {
      this.busData = busData;
   }

   @JsonProperty("busData")
   public String getBusData() {
      return this.busData;
   }
}
