package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class QueryOrderExtResult implements Serializable {
   private String isvUUID;
   private String spSoNo;
   private String eclpSoNo;
   private String wayBill;
   private Integer mainStatus;
   private String resultMessage;
   private Integer resultCode;
   private String operTime;
   private String[] scanTime;

   @JsonProperty("isvUUID")
   public void setIsvUUID(String isvUUID) {
      this.isvUUID = isvUUID;
   }

   @JsonProperty("isvUUID")
   public String getIsvUUID() {
      return this.isvUUID;
   }

   @JsonProperty("spSoNo")
   public void setSpSoNo(String spSoNo) {
      this.spSoNo = spSoNo;
   }

   @JsonProperty("spSoNo")
   public String getSpSoNo() {
      return this.spSoNo;
   }

   @JsonProperty("eclpSoNo")
   public void setEclpSoNo(String eclpSoNo) {
      this.eclpSoNo = eclpSoNo;
   }

   @JsonProperty("eclpSoNo")
   public String getEclpSoNo() {
      return this.eclpSoNo;
   }

   @JsonProperty("wayBill")
   public void setWayBill(String wayBill) {
      this.wayBill = wayBill;
   }

   @JsonProperty("wayBill")
   public String getWayBill() {
      return this.wayBill;
   }

   @JsonProperty("mainStatus")
   public void setMainStatus(Integer mainStatus) {
      this.mainStatus = mainStatus;
   }

   @JsonProperty("mainStatus")
   public Integer getMainStatus() {
      return this.mainStatus;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
   }

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("operTime")
   public void setOperTime(String operTime) {
      this.operTime = operTime;
   }

   @JsonProperty("operTime")
   public String getOperTime() {
      return this.operTime;
   }

   @JsonProperty("scanTime")
   public void setScanTime(String[] scanTime) {
      this.scanTime = scanTime;
   }

   @JsonProperty("scanTime")
   public String[] getScanTime() {
      return this.scanTime;
   }
}
