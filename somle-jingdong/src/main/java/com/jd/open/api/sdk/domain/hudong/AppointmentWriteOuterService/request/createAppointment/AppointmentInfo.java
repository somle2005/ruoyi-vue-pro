package com.jd.open.api.sdk.domain.hudong.AppointmentWriteOuterService.request.createAppointment;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class AppointmentInfo implements Serializable {
   private Long robStartTime;
   private Integer appointmentType;
   private String groupType;
   private Integer autoAddCart;
   private Long venderId;
   private String strategyParam;
   private Integer needCheck;
   private Long appointmentEndTime;
   private List<Long> skuIds;
   private Integer preSale;
   private Long appointmentStartTime;
   private Integer hideMemberNumber;
   private List<Long> wareIds;
   private Long robEndTime;
   private Integer hideYuyuePrice;

   @JsonProperty("robStartTime")
   public void setRobStartTime(Long robStartTime) {
      this.robStartTime = robStartTime;
   }

   @JsonProperty("robStartTime")
   public Long getRobStartTime() {
      return this.robStartTime;
   }

   @JsonProperty("appointmentType")
   public void setAppointmentType(Integer appointmentType) {
      this.appointmentType = appointmentType;
   }

   @JsonProperty("appointmentType")
   public Integer getAppointmentType() {
      return this.appointmentType;
   }

   @JsonProperty("groupType")
   public void setGroupType(String groupType) {
      this.groupType = groupType;
   }

   @JsonProperty("groupType")
   public String getGroupType() {
      return this.groupType;
   }

   @JsonProperty("autoAddCart")
   public void setAutoAddCart(Integer autoAddCart) {
      this.autoAddCart = autoAddCart;
   }

   @JsonProperty("autoAddCart")
   public Integer getAutoAddCart() {
      return this.autoAddCart;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("strategyParam")
   public void setStrategyParam(String strategyParam) {
      this.strategyParam = strategyParam;
   }

   @JsonProperty("strategyParam")
   public String getStrategyParam() {
      return this.strategyParam;
   }

   @JsonProperty("needCheck")
   public void setNeedCheck(Integer needCheck) {
      this.needCheck = needCheck;
   }

   @JsonProperty("needCheck")
   public Integer getNeedCheck() {
      return this.needCheck;
   }

   @JsonProperty("appointmentEndTime")
   public void setAppointmentEndTime(Long appointmentEndTime) {
      this.appointmentEndTime = appointmentEndTime;
   }

   @JsonProperty("appointmentEndTime")
   public Long getAppointmentEndTime() {
      return this.appointmentEndTime;
   }

   @JsonProperty("skuIds")
   public void setSkuIds(List<Long> skuIds) {
      this.skuIds = skuIds;
   }

   @JsonProperty("skuIds")
   public List<Long> getSkuIds() {
      return this.skuIds;
   }

   @JsonProperty("preSale")
   public void setPreSale(Integer preSale) {
      this.preSale = preSale;
   }

   @JsonProperty("preSale")
   public Integer getPreSale() {
      return this.preSale;
   }

   @JsonProperty("appointmentStartTime")
   public void setAppointmentStartTime(Long appointmentStartTime) {
      this.appointmentStartTime = appointmentStartTime;
   }

   @JsonProperty("appointmentStartTime")
   public Long getAppointmentStartTime() {
      return this.appointmentStartTime;
   }

   @JsonProperty("hideMemberNumber")
   public void setHideMemberNumber(Integer hideMemberNumber) {
      this.hideMemberNumber = hideMemberNumber;
   }

   @JsonProperty("hideMemberNumber")
   public Integer getHideMemberNumber() {
      return this.hideMemberNumber;
   }

   @JsonProperty("wareIds")
   public void setWareIds(List<Long> wareIds) {
      this.wareIds = wareIds;
   }

   @JsonProperty("wareIds")
   public List<Long> getWareIds() {
      return this.wareIds;
   }

   @JsonProperty("robEndTime")
   public void setRobEndTime(Long robEndTime) {
      this.robEndTime = robEndTime;
   }

   @JsonProperty("robEndTime")
   public Long getRobEndTime() {
      return this.robEndTime;
   }

   @JsonProperty("hideYuyuePrice")
   public void setHideYuyuePrice(Integer hideYuyuePrice) {
      this.hideYuyuePrice = hideYuyuePrice;
   }

   @JsonProperty("hideYuyuePrice")
   public Integer getHideYuyuePrice() {
      return this.hideYuyuePrice;
   }
}
