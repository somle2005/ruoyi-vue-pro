package com.jd.open.api.sdk.domain.ThreePL.CarrierReceiveService.request.statusReport;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CarrierStatusReportReq implements Serializable {
   private String parentWaybillCode;
   private String site;
   private String opeUser;
   private String waybillCode;
   private String description;
   private String logisticID;
   private String operatorPhone;
   private String businessType;
   private Integer carryType;
   private String timestamp;
   private String status;

   @JsonProperty("parentWaybillCode")
   public void setParentWaybillCode(String parentWaybillCode) {
      this.parentWaybillCode = parentWaybillCode;
   }

   @JsonProperty("parentWaybillCode")
   public String getParentWaybillCode() {
      return this.parentWaybillCode;
   }

   @JsonProperty("site")
   public void setSite(String site) {
      this.site = site;
   }

   @JsonProperty("site")
   public String getSite() {
      return this.site;
   }

   @JsonProperty("opeUser")
   public void setOpeUser(String opeUser) {
      this.opeUser = opeUser;
   }

   @JsonProperty("opeUser")
   public String getOpeUser() {
      return this.opeUser;
   }

   @JsonProperty("waybillCode")
   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   @JsonProperty("waybillCode")
   public String getWaybillCode() {
      return this.waybillCode;
   }

   @JsonProperty("description")
   public void setDescription(String description) {
      this.description = description;
   }

   @JsonProperty("description")
   public String getDescription() {
      return this.description;
   }

   @JsonProperty("logisticID")
   public void setLogisticID(String logisticID) {
      this.logisticID = logisticID;
   }

   @JsonProperty("logisticID")
   public String getLogisticID() {
      return this.logisticID;
   }

   @JsonProperty("operatorPhone")
   public void setOperatorPhone(String operatorPhone) {
      this.operatorPhone = operatorPhone;
   }

   @JsonProperty("operatorPhone")
   public String getOperatorPhone() {
      return this.operatorPhone;
   }

   @JsonProperty("businessType")
   public void setBusinessType(String businessType) {
      this.businessType = businessType;
   }

   @JsonProperty("businessType")
   public String getBusinessType() {
      return this.businessType;
   }

   @JsonProperty("carryType")
   public void setCarryType(Integer carryType) {
      this.carryType = carryType;
   }

   @JsonProperty("carryType")
   public Integer getCarryType() {
      return this.carryType;
   }

   @JsonProperty("timestamp")
   public void setTimestamp(String timestamp) {
      this.timestamp = timestamp;
   }

   @JsonProperty("timestamp")
   public String getTimestamp() {
      return this.timestamp;
   }

   @JsonProperty("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String getStatus() {
      return this.status;
   }
}
