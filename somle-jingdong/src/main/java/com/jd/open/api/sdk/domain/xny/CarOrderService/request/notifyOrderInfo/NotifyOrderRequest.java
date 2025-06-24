package com.jd.open.api.sdk.domain.xny.CarOrderService.request.notifyOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class NotifyOrderRequest implements Serializable {
   private Double TotalPower;
   private String StartChargeSeq;
   private String EndTime;
   private Double TotalSeviceMoney;
   private Integer SumPeriod;
   private String StartTime;
   private Double TotalElecMoney;
   private Double TotalMoney;
   private List<NotifyChargeDetail> ChargeDetails;
   private Integer StopReason;
   private String ConnectorID;
   private Double TotalOriginalElecMoney;
   private Double TotalOriginalSeviceMoney;
   private Double TotalOriginalMoney;

   @JsonProperty("TotalPower")
   public void setTotalPower(Double TotalPower) {
      this.TotalPower = TotalPower;
   }

   @JsonProperty("TotalPower")
   public Double getTotalPower() {
      return this.TotalPower;
   }

   @JsonProperty("StartChargeSeq")
   public void setStartChargeSeq(String StartChargeSeq) {
      this.StartChargeSeq = StartChargeSeq;
   }

   @JsonProperty("StartChargeSeq")
   public String getStartChargeSeq() {
      return this.StartChargeSeq;
   }

   @JsonProperty("EndTime")
   public void setEndTime(String EndTime) {
      this.EndTime = EndTime;
   }

   @JsonProperty("EndTime")
   public String getEndTime() {
      return this.EndTime;
   }

   @JsonProperty("TotalSeviceMoney")
   public void setTotalSeviceMoney(Double TotalSeviceMoney) {
      this.TotalSeviceMoney = TotalSeviceMoney;
   }

   @JsonProperty("TotalSeviceMoney")
   public Double getTotalSeviceMoney() {
      return this.TotalSeviceMoney;
   }

   @JsonProperty("SumPeriod")
   public void setSumPeriod(Integer SumPeriod) {
      this.SumPeriod = SumPeriod;
   }

   @JsonProperty("SumPeriod")
   public Integer getSumPeriod() {
      return this.SumPeriod;
   }

   @JsonProperty("StartTime")
   public void setStartTime(String StartTime) {
      this.StartTime = StartTime;
   }

   @JsonProperty("StartTime")
   public String getStartTime() {
      return this.StartTime;
   }

   @JsonProperty("TotalElecMoney")
   public void setTotalElecMoney(Double TotalElecMoney) {
      this.TotalElecMoney = TotalElecMoney;
   }

   @JsonProperty("TotalElecMoney")
   public Double getTotalElecMoney() {
      return this.TotalElecMoney;
   }

   @JsonProperty("TotalMoney")
   public void setTotalMoney(Double TotalMoney) {
      this.TotalMoney = TotalMoney;
   }

   @JsonProperty("TotalMoney")
   public Double getTotalMoney() {
      return this.TotalMoney;
   }

   @JsonProperty("ChargeDetails")
   public void setChargeDetails(List<NotifyChargeDetail> ChargeDetails) {
      this.ChargeDetails = ChargeDetails;
   }

   @JsonProperty("ChargeDetails")
   public List<NotifyChargeDetail> getChargeDetails() {
      return this.ChargeDetails;
   }

   @JsonProperty("StopReason")
   public void setStopReason(Integer StopReason) {
      this.StopReason = StopReason;
   }

   @JsonProperty("StopReason")
   public Integer getStopReason() {
      return this.StopReason;
   }

   @JsonProperty("ConnectorID")
   public void setConnectorID(String ConnectorID) {
      this.ConnectorID = ConnectorID;
   }

   @JsonProperty("ConnectorID")
   public String getConnectorID() {
      return this.ConnectorID;
   }

   @JsonProperty("TotalOriginalElecMoney")
   public void setTotalOriginalElecMoney(Double TotalOriginalElecMoney) {
      this.TotalOriginalElecMoney = TotalOriginalElecMoney;
   }

   @JsonProperty("TotalOriginalElecMoney")
   public Double getTotalOriginalElecMoney() {
      return this.TotalOriginalElecMoney;
   }

   @JsonProperty("TotalOriginalSeviceMoney")
   public void setTotalOriginalSeviceMoney(Double TotalOriginalSeviceMoney) {
      this.TotalOriginalSeviceMoney = TotalOriginalSeviceMoney;
   }

   @JsonProperty("TotalOriginalSeviceMoney")
   public Double getTotalOriginalSeviceMoney() {
      return this.TotalOriginalSeviceMoney;
   }

   @JsonProperty("TotalOriginalMoney")
   public void setTotalOriginalMoney(Double TotalOriginalMoney) {
      this.TotalOriginalMoney = TotalOriginalMoney;
   }

   @JsonProperty("TotalOriginalMoney")
   public Double getTotalOriginalMoney() {
      return this.TotalOriginalMoney;
   }
}
