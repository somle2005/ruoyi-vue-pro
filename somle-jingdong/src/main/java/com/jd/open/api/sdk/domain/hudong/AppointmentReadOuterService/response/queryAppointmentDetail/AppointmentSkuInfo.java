package com.jd.open.api.sdk.domain.hudong.AppointmentReadOuterService.response.queryAppointmentDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class AppointmentSkuInfo implements Serializable {
   private String skuName;
   private Integer synchStatus;
   private Long stockNum;
   private Long skuId;
   private String imgRui;
   private Long robStartTime;
   private Long wareId;
   private BigDecimal jdPrice;
   private Long robEndTime;
   private Integer status;

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("synchStatus")
   public void setSynchStatus(Integer synchStatus) {
      this.synchStatus = synchStatus;
   }

   @JsonProperty("synchStatus")
   public Integer getSynchStatus() {
      return this.synchStatus;
   }

   @JsonProperty("stockNum")
   public void setStockNum(Long stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Long getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("imgRui")
   public void setImgRui(String imgRui) {
      this.imgRui = imgRui;
   }

   @JsonProperty("imgRui")
   public String getImgRui() {
      return this.imgRui;
   }

   @JsonProperty("robStartTime")
   public void setRobStartTime(Long robStartTime) {
      this.robStartTime = robStartTime;
   }

   @JsonProperty("robStartTime")
   public Long getRobStartTime() {
      return this.robStartTime;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("robEndTime")
   public void setRobEndTime(Long robEndTime) {
      this.robEndTime = robEndTime;
   }

   @JsonProperty("robEndTime")
   public Long getRobEndTime() {
      return this.robEndTime;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }
}
