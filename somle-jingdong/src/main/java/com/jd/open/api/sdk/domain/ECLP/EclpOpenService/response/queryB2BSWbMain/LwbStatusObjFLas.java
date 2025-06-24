package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryB2BSWbMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class LwbStatusObjFLas implements Serializable {
   private String waybillNo;
   private String creationTime;
   private String status;
   private String content;
   private String source;
   private String operSystem;
   private String currentStatus;
   private String orderNo;
   private String packageBarcode;

   @JsonProperty("waybillNo")
   public void setWaybillNo(String waybillNo) {
      this.waybillNo = waybillNo;
   }

   @JsonProperty("waybillNo")
   public String getWaybillNo() {
      return this.waybillNo;
   }

   @JsonProperty("creationTime")
   public void setCreationTime(String creationTime) {
      this.creationTime = creationTime;
   }

   @JsonProperty("creationTime")
   public String getCreationTime() {
      return this.creationTime;
   }

   @JsonProperty("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String getStatus() {
      return this.status;
   }

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }

   @JsonProperty("source")
   public void setSource(String source) {
      this.source = source;
   }

   @JsonProperty("source")
   public String getSource() {
      return this.source;
   }

   @JsonProperty("operSystem")
   public void setOperSystem(String operSystem) {
      this.operSystem = operSystem;
   }

   @JsonProperty("operSystem")
   public String getOperSystem() {
      return this.operSystem;
   }

   @JsonProperty("currentStatus")
   public void setCurrentStatus(String currentStatus) {
      this.currentStatus = currentStatus;
   }

   @JsonProperty("currentStatus")
   public String getCurrentStatus() {
      return this.currentStatus;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("packageBarcode")
   public void setPackageBarcode(String packageBarcode) {
      this.packageBarcode = packageBarcode;
   }

   @JsonProperty("packageBarcode")
   public String getPackageBarcode() {
      return this.packageBarcode;
   }
}
