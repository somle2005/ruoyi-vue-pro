package com.jd.open.api.sdk.domain.youE.OrderBookedExportService.request.bookedOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BookedOrder implements Serializable {
   private String orderNo;
   private String engineerFirstOperate;
   private Integer changeReason;
   private Integer opType;
   private String remark;
   private String engineerFinalOperate;
   private String userFinalOnsite;
   private String userFirstOnsite;
   private String bookedOrderTime;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("engineerFirstOperate")
   public void setEngineerFirstOperate(String engineerFirstOperate) {
      this.engineerFirstOperate = engineerFirstOperate;
   }

   @JsonProperty("engineerFirstOperate")
   public String getEngineerFirstOperate() {
      return this.engineerFirstOperate;
   }

   @JsonProperty("changeReason")
   public void setChangeReason(Integer changeReason) {
      this.changeReason = changeReason;
   }

   @JsonProperty("changeReason")
   public Integer getChangeReason() {
      return this.changeReason;
   }

   @JsonProperty("opType")
   public void setOpType(Integer opType) {
      this.opType = opType;
   }

   @JsonProperty("opType")
   public Integer getOpType() {
      return this.opType;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("engineerFinalOperate")
   public void setEngineerFinalOperate(String engineerFinalOperate) {
      this.engineerFinalOperate = engineerFinalOperate;
   }

   @JsonProperty("engineerFinalOperate")
   public String getEngineerFinalOperate() {
      return this.engineerFinalOperate;
   }

   @JsonProperty("userFinalOnsite")
   public void setUserFinalOnsite(String userFinalOnsite) {
      this.userFinalOnsite = userFinalOnsite;
   }

   @JsonProperty("userFinalOnsite")
   public String getUserFinalOnsite() {
      return this.userFinalOnsite;
   }

   @JsonProperty("userFirstOnsite")
   public void setUserFirstOnsite(String userFirstOnsite) {
      this.userFirstOnsite = userFirstOnsite;
   }

   @JsonProperty("userFirstOnsite")
   public String getUserFirstOnsite() {
      return this.userFirstOnsite;
   }

   @JsonProperty("bookedOrderTime")
   public void setBookedOrderTime(String bookedOrderTime) {
      this.bookedOrderTime = bookedOrderTime;
   }

   @JsonProperty("bookedOrderTime")
   public String getBookedOrderTime() {
      return this.bookedOrderTime;
   }
}
