package com.jd.open.api.sdk.domain.HouseEI.ThirdLogisticsTraceService.response.getThirdTrace;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class TraceDetailDto implements Serializable {
   private Integer thirdId;
   private String shipId;
   private Date traceDate;
   private Date processDate;
   private Date createDate;
   private Date updateDate;
   private String batid;
   private String processInfo;
   private String scanType;
   private String courier;
   private String courierTel;

   @JsonProperty("thirdId")
   public void setThirdId(Integer thirdId) {
      this.thirdId = thirdId;
   }

   @JsonProperty("thirdId")
   public Integer getThirdId() {
      return this.thirdId;
   }

   @JsonProperty("shipId")
   public void setShipId(String shipId) {
      this.shipId = shipId;
   }

   @JsonProperty("shipId")
   public String getShipId() {
      return this.shipId;
   }

   @JsonProperty("traceDate")
   public void setTraceDate(Date traceDate) {
      this.traceDate = traceDate;
   }

   @JsonProperty("traceDate")
   public Date getTraceDate() {
      return this.traceDate;
   }

   @JsonProperty("processDate")
   public void setProcessDate(Date processDate) {
      this.processDate = processDate;
   }

   @JsonProperty("processDate")
   public Date getProcessDate() {
      return this.processDate;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("updateDate")
   public void setUpdateDate(Date updateDate) {
      this.updateDate = updateDate;
   }

   @JsonProperty("updateDate")
   public Date getUpdateDate() {
      return this.updateDate;
   }

   @JsonProperty("batid")
   public void setBatid(String batid) {
      this.batid = batid;
   }

   @JsonProperty("batid")
   public String getBatid() {
      return this.batid;
   }

   @JsonProperty("processInfo")
   public void setProcessInfo(String processInfo) {
      this.processInfo = processInfo;
   }

   @JsonProperty("processInfo")
   public String getProcessInfo() {
      return this.processInfo;
   }

   @JsonProperty("scanType")
   public void setScanType(String scanType) {
      this.scanType = scanType;
   }

   @JsonProperty("scanType")
   public String getScanType() {
      return this.scanType;
   }

   @JsonProperty("courier")
   public void setCourier(String courier) {
      this.courier = courier;
   }

   @JsonProperty("courier")
   public String getCourier() {
      return this.courier;
   }

   @JsonProperty("courierTel")
   public void setCourierTel(String courierTel) {
      this.courierTel = courierTel;
   }

   @JsonProperty("courierTel")
   public String getCourierTel() {
      return this.courierTel;
   }
}
