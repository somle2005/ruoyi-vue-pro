package com.jd.open.api.sdk.domain.hudong.AppointmentReadOuterService.response.queryAppointmentPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AppointmentListInfo implements Serializable {
   private String preSellId;
   private Long robStartTime;
   private Integer appointmentType;
   private String groupId;
   private Long appointmentEndTime;
   private Integer appointmentCount;
   private Long appointmentStartTime;
   private Boolean modifyEnable;
   private Long robEndTime;
   private Integer status;
   private SkuInfo skuInfo;
   private WareInfo wareInfo;

   @JsonProperty("preSellId")
   public void setPreSellId(String preSellId) {
      this.preSellId = preSellId;
   }

   @JsonProperty("preSellId")
   public String getPreSellId() {
      return this.preSellId;
   }

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

   @JsonProperty("groupId")
   public void setGroupId(String groupId) {
      this.groupId = groupId;
   }

   @JsonProperty("groupId")
   public String getGroupId() {
      return this.groupId;
   }

   @JsonProperty("appointmentEndTime")
   public void setAppointmentEndTime(Long appointmentEndTime) {
      this.appointmentEndTime = appointmentEndTime;
   }

   @JsonProperty("appointmentEndTime")
   public Long getAppointmentEndTime() {
      return this.appointmentEndTime;
   }

   @JsonProperty("appointmentCount")
   public void setAppointmentCount(Integer appointmentCount) {
      this.appointmentCount = appointmentCount;
   }

   @JsonProperty("appointmentCount")
   public Integer getAppointmentCount() {
      return this.appointmentCount;
   }

   @JsonProperty("appointmentStartTime")
   public void setAppointmentStartTime(Long appointmentStartTime) {
      this.appointmentStartTime = appointmentStartTime;
   }

   @JsonProperty("appointmentStartTime")
   public Long getAppointmentStartTime() {
      return this.appointmentStartTime;
   }

   @JsonProperty("modifyEnable")
   public void setModifyEnable(Boolean modifyEnable) {
      this.modifyEnable = modifyEnable;
   }

   @JsonProperty("modifyEnable")
   public Boolean getModifyEnable() {
      return this.modifyEnable;
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

   @JsonProperty("skuInfo")
   public void setSkuInfo(SkuInfo skuInfo) {
      this.skuInfo = skuInfo;
   }

   @JsonProperty("skuInfo")
   public SkuInfo getSkuInfo() {
      return this.skuInfo;
   }

   @JsonProperty("wareInfo")
   public void setWareInfo(WareInfo wareInfo) {
      this.wareInfo = wareInfo;
   }

   @JsonProperty("wareInfo")
   public WareInfo getWareInfo() {
      return this.wareInfo;
   }
}
