package com.jd.open.api.sdk.domain.xny.CarStationService.request.notifyStationInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ChargeStationsInfoVO implements Serializable {
   private List<String> Pictures;
   private Double StationLng;
   private String SiteGuide;
   private String Address;
   private String ServiceTel;
   private Integer SupportOrder;
   private String OperatorID;
   private String StationID;
   private String StationRemark;
   private String Remark;
   private String StationName;
   private String EquipmentRemark;
   private String StationTel;
   private Double StationLat;
   private Integer StationStatus;
   private String CountryCode;
   private Integer StationType;
   private String EquipmentOwnerID;
   private Integer Construction;
   private String MatchCars;
   private String ParkFee;
   private String ParkInfo;
   private String ServiceFee;
   private String Payment;
   private String ElectricityFee;
   private String ConnectorRemark;
   private String AreaCode;
   private List<ChargeEquipmentInfoVO> EquipmentInfos;
   private Integer ParkNums;
   private String BusineHours;

   @JsonProperty("Pictures")
   public void setPictures(List<String> Pictures) {
      this.Pictures = Pictures;
   }

   @JsonProperty("Pictures")
   public List<String> getPictures() {
      return this.Pictures;
   }

   @JsonProperty("StationLng")
   public void setStationLng(Double StationLng) {
      this.StationLng = StationLng;
   }

   @JsonProperty("StationLng")
   public Double getStationLng() {
      return this.StationLng;
   }

   @JsonProperty("SiteGuide")
   public void setSiteGuide(String SiteGuide) {
      this.SiteGuide = SiteGuide;
   }

   @JsonProperty("SiteGuide")
   public String getSiteGuide() {
      return this.SiteGuide;
   }

   @JsonProperty("Address")
   public void setAddress(String Address) {
      this.Address = Address;
   }

   @JsonProperty("Address")
   public String getAddress() {
      return this.Address;
   }

   @JsonProperty("ServiceTel")
   public void setServiceTel(String ServiceTel) {
      this.ServiceTel = ServiceTel;
   }

   @JsonProperty("ServiceTel")
   public String getServiceTel() {
      return this.ServiceTel;
   }

   @JsonProperty("SupportOrder")
   public void setSupportOrder(Integer SupportOrder) {
      this.SupportOrder = SupportOrder;
   }

   @JsonProperty("SupportOrder")
   public Integer getSupportOrder() {
      return this.SupportOrder;
   }

   @JsonProperty("OperatorID")
   public void setOperatorID(String OperatorID) {
      this.OperatorID = OperatorID;
   }

   @JsonProperty("OperatorID")
   public String getOperatorID() {
      return this.OperatorID;
   }

   @JsonProperty("StationID")
   public void setStationID(String StationID) {
      this.StationID = StationID;
   }

   @JsonProperty("StationID")
   public String getStationID() {
      return this.StationID;
   }

   @JsonProperty("StationRemark")
   public void setStationRemark(String StationRemark) {
      this.StationRemark = StationRemark;
   }

   @JsonProperty("StationRemark")
   public String getStationRemark() {
      return this.StationRemark;
   }

   @JsonProperty("Remark")
   public void setRemark(String Remark) {
      this.Remark = Remark;
   }

   @JsonProperty("Remark")
   public String getRemark() {
      return this.Remark;
   }

   @JsonProperty("StationName")
   public void setStationName(String StationName) {
      this.StationName = StationName;
   }

   @JsonProperty("StationName")
   public String getStationName() {
      return this.StationName;
   }

   @JsonProperty("EquipmentRemark")
   public void setEquipmentRemark(String EquipmentRemark) {
      this.EquipmentRemark = EquipmentRemark;
   }

   @JsonProperty("EquipmentRemark")
   public String getEquipmentRemark() {
      return this.EquipmentRemark;
   }

   @JsonProperty("StationTel")
   public void setStationTel(String StationTel) {
      this.StationTel = StationTel;
   }

   @JsonProperty("StationTel")
   public String getStationTel() {
      return this.StationTel;
   }

   @JsonProperty("StationLat")
   public void setStationLat(Double StationLat) {
      this.StationLat = StationLat;
   }

   @JsonProperty("StationLat")
   public Double getStationLat() {
      return this.StationLat;
   }

   @JsonProperty("StationStatus")
   public void setStationStatus(Integer StationStatus) {
      this.StationStatus = StationStatus;
   }

   @JsonProperty("StationStatus")
   public Integer getStationStatus() {
      return this.StationStatus;
   }

   @JsonProperty("CountryCode")
   public void setCountryCode(String CountryCode) {
      this.CountryCode = CountryCode;
   }

   @JsonProperty("CountryCode")
   public String getCountryCode() {
      return this.CountryCode;
   }

   @JsonProperty("StationType")
   public void setStationType(Integer StationType) {
      this.StationType = StationType;
   }

   @JsonProperty("StationType")
   public Integer getStationType() {
      return this.StationType;
   }

   @JsonProperty("EquipmentOwnerID")
   public void setEquipmentOwnerID(String EquipmentOwnerID) {
      this.EquipmentOwnerID = EquipmentOwnerID;
   }

   @JsonProperty("EquipmentOwnerID")
   public String getEquipmentOwnerID() {
      return this.EquipmentOwnerID;
   }

   @JsonProperty("Construction")
   public void setConstruction(Integer Construction) {
      this.Construction = Construction;
   }

   @JsonProperty("Construction")
   public Integer getConstruction() {
      return this.Construction;
   }

   @JsonProperty("MatchCars")
   public void setMatchCars(String MatchCars) {
      this.MatchCars = MatchCars;
   }

   @JsonProperty("MatchCars")
   public String getMatchCars() {
      return this.MatchCars;
   }

   @JsonProperty("ParkFee")
   public void setParkFee(String ParkFee) {
      this.ParkFee = ParkFee;
   }

   @JsonProperty("ParkFee")
   public String getParkFee() {
      return this.ParkFee;
   }

   @JsonProperty("ParkInfo")
   public void setParkInfo(String ParkInfo) {
      this.ParkInfo = ParkInfo;
   }

   @JsonProperty("ParkInfo")
   public String getParkInfo() {
      return this.ParkInfo;
   }

   @JsonProperty("ServiceFee")
   public void setServiceFee(String ServiceFee) {
      this.ServiceFee = ServiceFee;
   }

   @JsonProperty("ServiceFee")
   public String getServiceFee() {
      return this.ServiceFee;
   }

   @JsonProperty("Payment")
   public void setPayment(String Payment) {
      this.Payment = Payment;
   }

   @JsonProperty("Payment")
   public String getPayment() {
      return this.Payment;
   }

   @JsonProperty("ElectricityFee")
   public void setElectricityFee(String ElectricityFee) {
      this.ElectricityFee = ElectricityFee;
   }

   @JsonProperty("ElectricityFee")
   public String getElectricityFee() {
      return this.ElectricityFee;
   }

   @JsonProperty("ConnectorRemark")
   public void setConnectorRemark(String ConnectorRemark) {
      this.ConnectorRemark = ConnectorRemark;
   }

   @JsonProperty("ConnectorRemark")
   public String getConnectorRemark() {
      return this.ConnectorRemark;
   }

   @JsonProperty("AreaCode")
   public void setAreaCode(String AreaCode) {
      this.AreaCode = AreaCode;
   }

   @JsonProperty("AreaCode")
   public String getAreaCode() {
      return this.AreaCode;
   }

   @JsonProperty("EquipmentInfos")
   public void setEquipmentInfos(List<ChargeEquipmentInfoVO> EquipmentInfos) {
      this.EquipmentInfos = EquipmentInfos;
   }

   @JsonProperty("EquipmentInfos")
   public List<ChargeEquipmentInfoVO> getEquipmentInfos() {
      return this.EquipmentInfos;
   }

   @JsonProperty("ParkNums")
   public void setParkNums(Integer ParkNums) {
      this.ParkNums = ParkNums;
   }

   @JsonProperty("ParkNums")
   public Integer getParkNums() {
      return this.ParkNums;
   }

   @JsonProperty("BusineHours")
   public void setBusineHours(String BusineHours) {
      this.BusineHours = BusineHours;
   }

   @JsonProperty("BusineHours")
   public String getBusineHours() {
      return this.BusineHours;
   }
}
