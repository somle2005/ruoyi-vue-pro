package com.jd.open.api.sdk.domain.xny.CarOrderService.request.notifyChargeStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class NotifyChargeStatusRequest implements Serializable {
   private Double SeviceMoney;
   private String EndTime;
   private Integer SumPeriod;
   private Double Soc;
   private Integer ConnectorStatus;
   private String StartTime;
   private Double CurrentC;
   private List<NotifyChargeDetail> ChargeDetails;
   private Double CurrentA;
   private Double CurrentB;
   private Double VoltageB;
   private Double TotalPower;
   private String StartChargeSeq;
   private Double VoltageC;
   private Integer StartChargeSeqStat;
   private Double VoltageA;
   private Double TotalMoney;
   private Double ElecMoney;
   private String ConnectorID;

   @JsonProperty("SeviceMoney")
   public void setSeviceMoney(Double SeviceMoney) {
      this.SeviceMoney = SeviceMoney;
   }

   @JsonProperty("SeviceMoney")
   public Double getSeviceMoney() {
      return this.SeviceMoney;
   }

   @JsonProperty("EndTime")
   public void setEndTime(String EndTime) {
      this.EndTime = EndTime;
   }

   @JsonProperty("EndTime")
   public String getEndTime() {
      return this.EndTime;
   }

   @JsonProperty("SumPeriod")
   public void setSumPeriod(Integer SumPeriod) {
      this.SumPeriod = SumPeriod;
   }

   @JsonProperty("SumPeriod")
   public Integer getSumPeriod() {
      return this.SumPeriod;
   }

   @JsonProperty("Soc")
   public void setSoc(Double Soc) {
      this.Soc = Soc;
   }

   @JsonProperty("Soc")
   public Double getSoc() {
      return this.Soc;
   }

   @JsonProperty("ConnectorStatus")
   public void setConnectorStatus(Integer ConnectorStatus) {
      this.ConnectorStatus = ConnectorStatus;
   }

   @JsonProperty("ConnectorStatus")
   public Integer getConnectorStatus() {
      return this.ConnectorStatus;
   }

   @JsonProperty("StartTime")
   public void setStartTime(String StartTime) {
      this.StartTime = StartTime;
   }

   @JsonProperty("StartTime")
   public String getStartTime() {
      return this.StartTime;
   }

   @JsonProperty("CurrentC")
   public void setCurrentC(Double CurrentC) {
      this.CurrentC = CurrentC;
   }

   @JsonProperty("CurrentC")
   public Double getCurrentC() {
      return this.CurrentC;
   }

   @JsonProperty("ChargeDetails")
   public void setChargeDetails(List<NotifyChargeDetail> ChargeDetails) {
      this.ChargeDetails = ChargeDetails;
   }

   @JsonProperty("ChargeDetails")
   public List<NotifyChargeDetail> getChargeDetails() {
      return this.ChargeDetails;
   }

   @JsonProperty("CurrentA")
   public void setCurrentA(Double CurrentA) {
      this.CurrentA = CurrentA;
   }

   @JsonProperty("CurrentA")
   public Double getCurrentA() {
      return this.CurrentA;
   }

   @JsonProperty("CurrentB")
   public void setCurrentB(Double CurrentB) {
      this.CurrentB = CurrentB;
   }

   @JsonProperty("CurrentB")
   public Double getCurrentB() {
      return this.CurrentB;
   }

   @JsonProperty("VoltageB")
   public void setVoltageB(Double VoltageB) {
      this.VoltageB = VoltageB;
   }

   @JsonProperty("VoltageB")
   public Double getVoltageB() {
      return this.VoltageB;
   }

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

   @JsonProperty("VoltageC")
   public void setVoltageC(Double VoltageC) {
      this.VoltageC = VoltageC;
   }

   @JsonProperty("VoltageC")
   public Double getVoltageC() {
      return this.VoltageC;
   }

   @JsonProperty("StartChargeSeqStat")
   public void setStartChargeSeqStat(Integer StartChargeSeqStat) {
      this.StartChargeSeqStat = StartChargeSeqStat;
   }

   @JsonProperty("StartChargeSeqStat")
   public Integer getStartChargeSeqStat() {
      return this.StartChargeSeqStat;
   }

   @JsonProperty("VoltageA")
   public void setVoltageA(Double VoltageA) {
      this.VoltageA = VoltageA;
   }

   @JsonProperty("VoltageA")
   public Double getVoltageA() {
      return this.VoltageA;
   }

   @JsonProperty("TotalMoney")
   public void setTotalMoney(Double TotalMoney) {
      this.TotalMoney = TotalMoney;
   }

   @JsonProperty("TotalMoney")
   public Double getTotalMoney() {
      return this.TotalMoney;
   }

   @JsonProperty("ElecMoney")
   public void setElecMoney(Double ElecMoney) {
      this.ElecMoney = ElecMoney;
   }

   @JsonProperty("ElecMoney")
   public Double getElecMoney() {
      return this.ElecMoney;
   }

   @JsonProperty("ConnectorID")
   public void setConnectorID(String ConnectorID) {
      this.ConnectorID = ConnectorID;
   }

   @JsonProperty("ConnectorID")
   public String getConnectorID() {
      return this.ConnectorID;
   }
}
