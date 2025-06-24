package com.jd.open.api.sdk.domain.xny.CarStationService.request.notifyStationInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ChargeEquipmentInfoVO implements Serializable {
   private String EquipmentID;
   private String ManufacturerID;
   private Double EquipmentLng;
   private List<ChargeConnectorInfoVO> ConnectorInfos;
   private String EquipmentName;
   private String EquipmentModel;
   private String ProductionDate;
   private Integer EquipmentType;
   private Double EquipmentLat;
   private Double Power;

   @JsonProperty("EquipmentID")
   public void setEquipmentID(String EquipmentID) {
      this.EquipmentID = EquipmentID;
   }

   @JsonProperty("EquipmentID")
   public String getEquipmentID() {
      return this.EquipmentID;
   }

   @JsonProperty("ManufacturerID")
   public void setManufacturerID(String ManufacturerID) {
      this.ManufacturerID = ManufacturerID;
   }

   @JsonProperty("ManufacturerID")
   public String getManufacturerID() {
      return this.ManufacturerID;
   }

   @JsonProperty("EquipmentLng")
   public void setEquipmentLng(Double EquipmentLng) {
      this.EquipmentLng = EquipmentLng;
   }

   @JsonProperty("EquipmentLng")
   public Double getEquipmentLng() {
      return this.EquipmentLng;
   }

   @JsonProperty("ConnectorInfos")
   public void setConnectorInfos(List<ChargeConnectorInfoVO> ConnectorInfos) {
      this.ConnectorInfos = ConnectorInfos;
   }

   @JsonProperty("ConnectorInfos")
   public List<ChargeConnectorInfoVO> getConnectorInfos() {
      return this.ConnectorInfos;
   }

   @JsonProperty("EquipmentName")
   public void setEquipmentName(String EquipmentName) {
      this.EquipmentName = EquipmentName;
   }

   @JsonProperty("EquipmentName")
   public String getEquipmentName() {
      return this.EquipmentName;
   }

   @JsonProperty("EquipmentModel")
   public void setEquipmentModel(String EquipmentModel) {
      this.EquipmentModel = EquipmentModel;
   }

   @JsonProperty("EquipmentModel")
   public String getEquipmentModel() {
      return this.EquipmentModel;
   }

   @JsonProperty("ProductionDate")
   public void setProductionDate(String ProductionDate) {
      this.ProductionDate = ProductionDate;
   }

   @JsonProperty("ProductionDate")
   public String getProductionDate() {
      return this.ProductionDate;
   }

   @JsonProperty("EquipmentType")
   public void setEquipmentType(Integer EquipmentType) {
      this.EquipmentType = EquipmentType;
   }

   @JsonProperty("EquipmentType")
   public Integer getEquipmentType() {
      return this.EquipmentType;
   }

   @JsonProperty("EquipmentLat")
   public void setEquipmentLat(Double EquipmentLat) {
      this.EquipmentLat = EquipmentLat;
   }

   @JsonProperty("EquipmentLat")
   public Double getEquipmentLat() {
      return this.EquipmentLat;
   }

   @JsonProperty("Power")
   public void setPower(Double Power) {
      this.Power = Power;
   }

   @JsonProperty("Power")
   public Double getPower() {
      return this.Power;
   }
}
