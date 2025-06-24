package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.syncInspectionReport;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SyncInspectionReportParam implements Serializable {
   private String recycleStoreName;
   private String orderNo;
   private Integer inspectionResult;
   private String reducedEmissions;
   private String disposalDate;
   private String failReason;
   private String recycleDate;
   private String deviceDisposalType;
   private String disposalEntryDate;

   @JsonProperty("recycleStoreName")
   public void setRecycleStoreName(String recycleStoreName) {
      this.recycleStoreName = recycleStoreName;
   }

   @JsonProperty("recycleStoreName")
   public String getRecycleStoreName() {
      return this.recycleStoreName;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("inspectionResult")
   public void setInspectionResult(Integer inspectionResult) {
      this.inspectionResult = inspectionResult;
   }

   @JsonProperty("inspectionResult")
   public Integer getInspectionResult() {
      return this.inspectionResult;
   }

   @JsonProperty("reducedEmissions")
   public void setReducedEmissions(String reducedEmissions) {
      this.reducedEmissions = reducedEmissions;
   }

   @JsonProperty("reducedEmissions")
   public String getReducedEmissions() {
      return this.reducedEmissions;
   }

   @JsonProperty("disposalDate")
   public void setDisposalDate(String disposalDate) {
      this.disposalDate = disposalDate;
   }

   @JsonProperty("disposalDate")
   public String getDisposalDate() {
      return this.disposalDate;
   }

   @JsonProperty("failReason")
   public void setFailReason(String failReason) {
      this.failReason = failReason;
   }

   @JsonProperty("failReason")
   public String getFailReason() {
      return this.failReason;
   }

   @JsonProperty("recycleDate")
   public void setRecycleDate(String recycleDate) {
      this.recycleDate = recycleDate;
   }

   @JsonProperty("recycleDate")
   public String getRecycleDate() {
      return this.recycleDate;
   }

   @JsonProperty("deviceDisposalType")
   public void setDeviceDisposalType(String deviceDisposalType) {
      this.deviceDisposalType = deviceDisposalType;
   }

   @JsonProperty("deviceDisposalType")
   public String getDeviceDisposalType() {
      return this.deviceDisposalType;
   }

   @JsonProperty("disposalEntryDate")
   public void setDisposalEntryDate(String disposalEntryDate) {
      this.disposalEntryDate = disposalEntryDate;
   }

   @JsonProperty("disposalEntryDate")
   public String getDisposalEntryDate() {
      return this.disposalEntryDate;
   }
}
