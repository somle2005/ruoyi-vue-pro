package com.jd.open.api.sdk.domain.address.JdAddressService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ShipCodResult implements Serializable {
   private Boolean supportJdShip;
   private Boolean supportFreshShip;
   private Boolean supportJdCod;
   private Boolean supportJdPos;
   private Boolean supportJd3Cod;
   private Boolean supportSpecialDelivery;
   private Boolean supportCold1;
   private Boolean supportCold2;
   private Boolean supportCold3;
   private Boolean supportCold4;
   private Boolean supportDirect;
   private Boolean supportPickup;
   private Boolean supportHKMOShip;
   private String unSupportGAShipProducts;
   private String unSupportFreshShipProducts;
   private Integer shipType;
   private String errorMsg;

   @JsonProperty("supportJdShip")
   public void setSupportJdShip(Boolean supportJdShip) {
      this.supportJdShip = supportJdShip;
   }

   @JsonProperty("supportJdShip")
   public Boolean getSupportJdShip() {
      return this.supportJdShip;
   }

   @JsonProperty("supportFreshShip")
   public void setSupportFreshShip(Boolean supportFreshShip) {
      this.supportFreshShip = supportFreshShip;
   }

   @JsonProperty("supportFreshShip")
   public Boolean getSupportFreshShip() {
      return this.supportFreshShip;
   }

   @JsonProperty("supportJdCod")
   public void setSupportJdCod(Boolean supportJdCod) {
      this.supportJdCod = supportJdCod;
   }

   @JsonProperty("supportJdCod")
   public Boolean getSupportJdCod() {
      return this.supportJdCod;
   }

   @JsonProperty("supportJdPos")
   public void setSupportJdPos(Boolean supportJdPos) {
      this.supportJdPos = supportJdPos;
   }

   @JsonProperty("supportJdPos")
   public Boolean getSupportJdPos() {
      return this.supportJdPos;
   }

   @JsonProperty("supportJd3Cod")
   public void setSupportJd3Cod(Boolean supportJd3Cod) {
      this.supportJd3Cod = supportJd3Cod;
   }

   @JsonProperty("supportJd3Cod")
   public Boolean getSupportJd3Cod() {
      return this.supportJd3Cod;
   }

   @JsonProperty("supportSpecialDelivery")
   public void setSupportSpecialDelivery(Boolean supportSpecialDelivery) {
      this.supportSpecialDelivery = supportSpecialDelivery;
   }

   @JsonProperty("supportSpecialDelivery")
   public Boolean getSupportSpecialDelivery() {
      return this.supportSpecialDelivery;
   }

   @JsonProperty("supportCold1")
   public void setSupportCold1(Boolean supportCold1) {
      this.supportCold1 = supportCold1;
   }

   @JsonProperty("supportCold1")
   public Boolean getSupportCold1() {
      return this.supportCold1;
   }

   @JsonProperty("supportCold2")
   public void setSupportCold2(Boolean supportCold2) {
      this.supportCold2 = supportCold2;
   }

   @JsonProperty("supportCold2")
   public Boolean getSupportCold2() {
      return this.supportCold2;
   }

   @JsonProperty("supportCold3")
   public void setSupportCold3(Boolean supportCold3) {
      this.supportCold3 = supportCold3;
   }

   @JsonProperty("supportCold3")
   public Boolean getSupportCold3() {
      return this.supportCold3;
   }

   @JsonProperty("supportCold4")
   public void setSupportCold4(Boolean supportCold4) {
      this.supportCold4 = supportCold4;
   }

   @JsonProperty("supportCold4")
   public Boolean getSupportCold4() {
      return this.supportCold4;
   }

   @JsonProperty("supportDirect")
   public void setSupportDirect(Boolean supportDirect) {
      this.supportDirect = supportDirect;
   }

   @JsonProperty("supportDirect")
   public Boolean getSupportDirect() {
      return this.supportDirect;
   }

   @JsonProperty("supportPickup")
   public void setSupportPickup(Boolean supportPickup) {
      this.supportPickup = supportPickup;
   }

   @JsonProperty("supportPickup")
   public Boolean getSupportPickup() {
      return this.supportPickup;
   }

   @JsonProperty("supportHKMOShip")
   public void setSupportHKMOShip(Boolean supportHKMOShip) {
      this.supportHKMOShip = supportHKMOShip;
   }

   @JsonProperty("supportHKMOShip")
   public Boolean getSupportHKMOShip() {
      return this.supportHKMOShip;
   }

   @JsonProperty("unSupportGAShipProducts")
   public void setUnSupportGAShipProducts(String unSupportGAShipProducts) {
      this.unSupportGAShipProducts = unSupportGAShipProducts;
   }

   @JsonProperty("unSupportGAShipProducts")
   public String getUnSupportGAShipProducts() {
      return this.unSupportGAShipProducts;
   }

   @JsonProperty("unSupportFreshShipProducts")
   public void setUnSupportFreshShipProducts(String unSupportFreshShipProducts) {
      this.unSupportFreshShipProducts = unSupportFreshShipProducts;
   }

   @JsonProperty("unSupportFreshShipProducts")
   public String getUnSupportFreshShipProducts() {
      return this.unSupportFreshShipProducts;
   }

   @JsonProperty("shipType")
   public void setShipType(Integer shipType) {
      this.shipType = shipType;
   }

   @JsonProperty("shipType")
   public Integer getShipType() {
      return this.shipType;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }
}
