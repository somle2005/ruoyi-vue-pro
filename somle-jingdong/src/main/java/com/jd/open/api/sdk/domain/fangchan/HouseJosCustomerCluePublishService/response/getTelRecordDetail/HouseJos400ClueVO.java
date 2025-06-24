package com.jd.open.api.sdk.domain.fangchan.HouseJosCustomerCluePublishService.response.getTelRecordDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class HouseJos400ClueVO implements Serializable {
   private Long clueId;
   private Long spuId;
   private String spuTitle;
   private String brokerName;
   private String brokerPhone;
   private String extensionNum;
   private Date callStartTime;
   private Date callEndTime;
   private Long callInLong;
   private String callingNumber;
   private String landingNumer;

   @JsonProperty("clueId")
   public void setClueId(Long clueId) {
      this.clueId = clueId;
   }

   @JsonProperty("clueId")
   public Long getClueId() {
      return this.clueId;
   }

   @JsonProperty("spuId")
   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public Long getSpuId() {
      return this.spuId;
   }

   @JsonProperty("spuTitle")
   public void setSpuTitle(String spuTitle) {
      this.spuTitle = spuTitle;
   }

   @JsonProperty("spuTitle")
   public String getSpuTitle() {
      return this.spuTitle;
   }

   @JsonProperty("brokerName")
   public void setBrokerName(String brokerName) {
      this.brokerName = brokerName;
   }

   @JsonProperty("brokerName")
   public String getBrokerName() {
      return this.brokerName;
   }

   @JsonProperty("brokerPhone")
   public void setBrokerPhone(String brokerPhone) {
      this.brokerPhone = brokerPhone;
   }

   @JsonProperty("brokerPhone")
   public String getBrokerPhone() {
      return this.brokerPhone;
   }

   @JsonProperty("extensionNum")
   public void setExtensionNum(String extensionNum) {
      this.extensionNum = extensionNum;
   }

   @JsonProperty("extensionNum")
   public String getExtensionNum() {
      return this.extensionNum;
   }

   @JsonProperty("callStartTime")
   public void setCallStartTime(Date callStartTime) {
      this.callStartTime = callStartTime;
   }

   @JsonProperty("callStartTime")
   public Date getCallStartTime() {
      return this.callStartTime;
   }

   @JsonProperty("callEndTime")
   public void setCallEndTime(Date callEndTime) {
      this.callEndTime = callEndTime;
   }

   @JsonProperty("callEndTime")
   public Date getCallEndTime() {
      return this.callEndTime;
   }

   @JsonProperty("callInLong")
   public void setCallInLong(Long callInLong) {
      this.callInLong = callInLong;
   }

   @JsonProperty("callInLong")
   public Long getCallInLong() {
      return this.callInLong;
   }

   @JsonProperty("callingNumber")
   public void setCallingNumber(String callingNumber) {
      this.callingNumber = callingNumber;
   }

   @JsonProperty("callingNumber")
   public String getCallingNumber() {
      return this.callingNumber;
   }

   @JsonProperty("landingNumer")
   public void setLandingNumer(String landingNumer) {
      this.landingNumer = landingNumer;
   }

   @JsonProperty("landingNumer")
   public String getLandingNumer() {
      return this.landingNumer;
   }
}
