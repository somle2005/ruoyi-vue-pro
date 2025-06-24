package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryGoodsLevelChange;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BatchAttrLevel implements Serializable {
   private String expirationDateLot;
   private String productionDateLot;
   private String isPo;
   private String isSupplier;
   private String isRcvDate;
   private String isPLU;
   private String isLogisticCompany;
   private String isOrigin;
   private String isLot;
   private String isManufacturer;
   private String isPackageBatch;
   private String isBoxNo;
   private String isNosale;
   private String gysgL;
   private String isStore;

   @JsonProperty("expiration_date_lot")
   public void setExpirationDateLot(String expirationDateLot) {
      this.expirationDateLot = expirationDateLot;
   }

   @JsonProperty("expiration_date_lot")
   public String getExpirationDateLot() {
      return this.expirationDateLot;
   }

   @JsonProperty("production_date_lot")
   public void setProductionDateLot(String productionDateLot) {
      this.productionDateLot = productionDateLot;
   }

   @JsonProperty("production_date_lot")
   public String getProductionDateLot() {
      return this.productionDateLot;
   }

   @JsonProperty("isPo")
   public void setIsPo(String isPo) {
      this.isPo = isPo;
   }

   @JsonProperty("isPo")
   public String getIsPo() {
      return this.isPo;
   }

   @JsonProperty("isSupplier")
   public void setIsSupplier(String isSupplier) {
      this.isSupplier = isSupplier;
   }

   @JsonProperty("isSupplier")
   public String getIsSupplier() {
      return this.isSupplier;
   }

   @JsonProperty("isRcvDate")
   public void setIsRcvDate(String isRcvDate) {
      this.isRcvDate = isRcvDate;
   }

   @JsonProperty("isRcvDate")
   public String getIsRcvDate() {
      return this.isRcvDate;
   }

   @JsonProperty("isPLU")
   public void setIsPLU(String isPLU) {
      this.isPLU = isPLU;
   }

   @JsonProperty("isPLU")
   public String getIsPLU() {
      return this.isPLU;
   }

   @JsonProperty("isLogisticCompany")
   public void setIsLogisticCompany(String isLogisticCompany) {
      this.isLogisticCompany = isLogisticCompany;
   }

   @JsonProperty("isLogisticCompany")
   public String getIsLogisticCompany() {
      return this.isLogisticCompany;
   }

   @JsonProperty("isOrigin")
   public void setIsOrigin(String isOrigin) {
      this.isOrigin = isOrigin;
   }

   @JsonProperty("isOrigin")
   public String getIsOrigin() {
      return this.isOrigin;
   }

   @JsonProperty("isLot")
   public void setIsLot(String isLot) {
      this.isLot = isLot;
   }

   @JsonProperty("isLot")
   public String getIsLot() {
      return this.isLot;
   }

   @JsonProperty("isManufacturer")
   public void setIsManufacturer(String isManufacturer) {
      this.isManufacturer = isManufacturer;
   }

   @JsonProperty("isManufacturer")
   public String getIsManufacturer() {
      return this.isManufacturer;
   }

   @JsonProperty("isPackageBatch")
   public void setIsPackageBatch(String isPackageBatch) {
      this.isPackageBatch = isPackageBatch;
   }

   @JsonProperty("isPackageBatch")
   public String getIsPackageBatch() {
      return this.isPackageBatch;
   }

   @JsonProperty("isBoxNo")
   public void setIsBoxNo(String isBoxNo) {
      this.isBoxNo = isBoxNo;
   }

   @JsonProperty("isBoxNo")
   public String getIsBoxNo() {
      return this.isBoxNo;
   }

   @JsonProperty("isNosale")
   public void setIsNosale(String isNosale) {
      this.isNosale = isNosale;
   }

   @JsonProperty("isNosale")
   public String getIsNosale() {
      return this.isNosale;
   }

   @JsonProperty("gysgL")
   public void setGysgL(String gysgL) {
      this.gysgL = gysgL;
   }

   @JsonProperty("gysgL")
   public String getGysgL() {
      return this.gysgL;
   }

   @JsonProperty("isStore")
   public void setIsStore(String isStore) {
      this.isStore = isStore;
   }

   @JsonProperty("isStore")
   public String getIsStore() {
      return this.isStore;
   }
}
