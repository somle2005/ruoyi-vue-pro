package com.jd.open.api.sdk.domain.youE.BizProgressJsfService.request.dispatchOrder2Site;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderSendSite implements Serializable {
   private String netWorkName;
   private int appointTimes;
   private String orderNo;
   private String netWorkAddress;
   private String sendNetWorkDate;
   private String netWorkContactMan;
   private String netWorkJdId;
   private String netWorkTel;
   private String remark;
   private String netWorkCode;

   @JsonProperty("netWorkName")
   public void setNetWorkName(String netWorkName) {
      this.netWorkName = netWorkName;
   }

   @JsonProperty("netWorkName")
   public String getNetWorkName() {
      return this.netWorkName;
   }

   @JsonProperty("appointTimes")
   public void setAppointTimes(int appointTimes) {
      this.appointTimes = appointTimes;
   }

   @JsonProperty("appointTimes")
   public int getAppointTimes() {
      return this.appointTimes;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("netWorkAddress")
   public void setNetWorkAddress(String netWorkAddress) {
      this.netWorkAddress = netWorkAddress;
   }

   @JsonProperty("netWorkAddress")
   public String getNetWorkAddress() {
      return this.netWorkAddress;
   }

   @JsonProperty("sendNetWorkDate")
   public void setSendNetWorkDate(String sendNetWorkDate) {
      this.sendNetWorkDate = sendNetWorkDate;
   }

   @JsonProperty("sendNetWorkDate")
   public String getSendNetWorkDate() {
      return this.sendNetWorkDate;
   }

   @JsonProperty("netWorkContactMan")
   public void setNetWorkContactMan(String netWorkContactMan) {
      this.netWorkContactMan = netWorkContactMan;
   }

   @JsonProperty("netWorkContactMan")
   public String getNetWorkContactMan() {
      return this.netWorkContactMan;
   }

   @JsonProperty("netWorkJdId")
   public void setNetWorkJdId(String netWorkJdId) {
      this.netWorkJdId = netWorkJdId;
   }

   @JsonProperty("netWorkJdId")
   public String getNetWorkJdId() {
      return this.netWorkJdId;
   }

   @JsonProperty("netWorkTel")
   public void setNetWorkTel(String netWorkTel) {
      this.netWorkTel = netWorkTel;
   }

   @JsonProperty("netWorkTel")
   public String getNetWorkTel() {
      return this.netWorkTel;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("netWorkCode")
   public void setNetWorkCode(String netWorkCode) {
      this.netWorkCode = netWorkCode;
   }

   @JsonProperty("netWorkCode")
   public String getNetWorkCode() {
      return this.netWorkCode;
   }
}
