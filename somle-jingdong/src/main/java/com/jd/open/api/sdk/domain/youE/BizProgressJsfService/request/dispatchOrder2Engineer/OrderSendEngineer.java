package com.jd.open.api.sdk.domain.youE.BizProgressJsfService.request.dispatchOrder2Engineer;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderSendEngineer implements Serializable {
   private String orderNo;
   private String headImg;
   private String wishBookDate;
   private String idCard;
   private String nucleicResults;
   private String remark;
   private String sendEngineerDate;
   private String engineerName;
   private String tempTime;
   private int appointTimes;
   private String netWorkName;
   private String engineerCode;
   private String nucleicTime;
   private String temperature;
   private String vaccinationTime;
   private String netWorkCode;
   private String engineerMobile;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("headImg")
   public void setHeadImg(String headImg) {
      this.headImg = headImg;
   }

   @JsonProperty("headImg")
   public String getHeadImg() {
      return this.headImg;
   }

   @JsonProperty("wishBookDate")
   public void setWishBookDate(String wishBookDate) {
      this.wishBookDate = wishBookDate;
   }

   @JsonProperty("wishBookDate")
   public String getWishBookDate() {
      return this.wishBookDate;
   }

   @JsonProperty("idCard")
   public void setIdCard(String idCard) {
      this.idCard = idCard;
   }

   @JsonProperty("idCard")
   public String getIdCard() {
      return this.idCard;
   }

   @JsonProperty("nucleicResults")
   public void setNucleicResults(String nucleicResults) {
      this.nucleicResults = nucleicResults;
   }

   @JsonProperty("nucleicResults")
   public String getNucleicResults() {
      return this.nucleicResults;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("sendEngineerDate")
   public void setSendEngineerDate(String sendEngineerDate) {
      this.sendEngineerDate = sendEngineerDate;
   }

   @JsonProperty("sendEngineerDate")
   public String getSendEngineerDate() {
      return this.sendEngineerDate;
   }

   @JsonProperty("engineerName")
   public void setEngineerName(String engineerName) {
      this.engineerName = engineerName;
   }

   @JsonProperty("engineerName")
   public String getEngineerName() {
      return this.engineerName;
   }

   @JsonProperty("tempTime")
   public void setTempTime(String tempTime) {
      this.tempTime = tempTime;
   }

   @JsonProperty("tempTime")
   public String getTempTime() {
      return this.tempTime;
   }

   @JsonProperty("appointTimes")
   public void setAppointTimes(int appointTimes) {
      this.appointTimes = appointTimes;
   }

   @JsonProperty("appointTimes")
   public int getAppointTimes() {
      return this.appointTimes;
   }

   @JsonProperty("netWorkName")
   public void setNetWorkName(String netWorkName) {
      this.netWorkName = netWorkName;
   }

   @JsonProperty("netWorkName")
   public String getNetWorkName() {
      return this.netWorkName;
   }

   @JsonProperty("engineerCode")
   public void setEngineerCode(String engineerCode) {
      this.engineerCode = engineerCode;
   }

   @JsonProperty("engineerCode")
   public String getEngineerCode() {
      return this.engineerCode;
   }

   @JsonProperty("nucleicTime")
   public void setNucleicTime(String nucleicTime) {
      this.nucleicTime = nucleicTime;
   }

   @JsonProperty("nucleicTime")
   public String getNucleicTime() {
      return this.nucleicTime;
   }

   @JsonProperty("temperature")
   public void setTemperature(String temperature) {
      this.temperature = temperature;
   }

   @JsonProperty("temperature")
   public String getTemperature() {
      return this.temperature;
   }

   @JsonProperty("vaccinationTime")
   public void setVaccinationTime(String vaccinationTime) {
      this.vaccinationTime = vaccinationTime;
   }

   @JsonProperty("vaccinationTime")
   public String getVaccinationTime() {
      return this.vaccinationTime;
   }

   @JsonProperty("netWorkCode")
   public void setNetWorkCode(String netWorkCode) {
      this.netWorkCode = netWorkCode;
   }

   @JsonProperty("netWorkCode")
   public String getNetWorkCode() {
      return this.netWorkCode;
   }

   @JsonProperty("engineerMobile")
   public void setEngineerMobile(String engineerMobile) {
      this.engineerMobile = engineerMobile;
   }

   @JsonProperty("engineerMobile")
   public String getEngineerMobile() {
      return this.engineerMobile;
   }
}
