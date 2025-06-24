package com.jd.open.api.sdk.domain.xny.CarStationService.request.notifyStationInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ChargeConnectorInfoVO implements Serializable {
   private Integer VoltageLowerLimits;
   private Integer ConnectorType;
   private Integer VoltageUpperLimits;
   private String NationalStandard;
   private String ConnectorName;
   private String ParkNo;
   private Integer Current;
   private Double power;
   private String ConnectorID;

   @JsonProperty("VoltageLowerLimits")
   public void setVoltageLowerLimits(Integer VoltageLowerLimits) {
      this.VoltageLowerLimits = VoltageLowerLimits;
   }

   @JsonProperty("VoltageLowerLimits")
   public Integer getVoltageLowerLimits() {
      return this.VoltageLowerLimits;
   }

   @JsonProperty("ConnectorType")
   public void setConnectorType(Integer ConnectorType) {
      this.ConnectorType = ConnectorType;
   }

   @JsonProperty("ConnectorType")
   public Integer getConnectorType() {
      return this.ConnectorType;
   }

   @JsonProperty("VoltageUpperLimits")
   public void setVoltageUpperLimits(Integer VoltageUpperLimits) {
      this.VoltageUpperLimits = VoltageUpperLimits;
   }

   @JsonProperty("VoltageUpperLimits")
   public Integer getVoltageUpperLimits() {
      return this.VoltageUpperLimits;
   }

   @JsonProperty("NationalStandard")
   public void setNationalStandard(String NationalStandard) {
      this.NationalStandard = NationalStandard;
   }

   @JsonProperty("NationalStandard")
   public String getNationalStandard() {
      return this.NationalStandard;
   }

   @JsonProperty("ConnectorName")
   public void setConnectorName(String ConnectorName) {
      this.ConnectorName = ConnectorName;
   }

   @JsonProperty("ConnectorName")
   public String getConnectorName() {
      return this.ConnectorName;
   }

   @JsonProperty("ParkNo")
   public void setParkNo(String ParkNo) {
      this.ParkNo = ParkNo;
   }

   @JsonProperty("ParkNo")
   public String getParkNo() {
      return this.ParkNo;
   }

   @JsonProperty("Current")
   public void setCurrent(Integer Current) {
      this.Current = Current;
   }

   @JsonProperty("Current")
   public Integer getCurrent() {
      return this.Current;
   }

   @JsonProperty("power")
   public void setPower(Double power) {
      this.power = power;
   }

   @JsonProperty("power")
   public Double getPower() {
      return this.power;
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
