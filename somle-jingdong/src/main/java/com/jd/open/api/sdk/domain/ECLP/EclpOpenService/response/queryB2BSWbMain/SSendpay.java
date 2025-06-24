package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryB2BSWbMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SSendpay implements Serializable {
   private Byte signReceiptFlag;
   private Byte deliveryReceiptFlag;
   private Byte deliveryIntoWarehouse;
   private Byte loadFlag;
   private Byte unloadFlag;
   private Byte receiptFlag;
   private Byte fcFlag;
   private Byte temporaryStorage;
   private Byte peaceMindReceive;

   @JsonProperty("signReceiptFlag")
   public void setSignReceiptFlag(Byte signReceiptFlag) {
      this.signReceiptFlag = signReceiptFlag;
   }

   @JsonProperty("signReceiptFlag")
   public Byte getSignReceiptFlag() {
      return this.signReceiptFlag;
   }

   @JsonProperty("deliveryReceiptFlag")
   public void setDeliveryReceiptFlag(Byte deliveryReceiptFlag) {
      this.deliveryReceiptFlag = deliveryReceiptFlag;
   }

   @JsonProperty("deliveryReceiptFlag")
   public Byte getDeliveryReceiptFlag() {
      return this.deliveryReceiptFlag;
   }

   @JsonProperty("deliveryIntoWarehouse")
   public void setDeliveryIntoWarehouse(Byte deliveryIntoWarehouse) {
      this.deliveryIntoWarehouse = deliveryIntoWarehouse;
   }

   @JsonProperty("deliveryIntoWarehouse")
   public Byte getDeliveryIntoWarehouse() {
      return this.deliveryIntoWarehouse;
   }

   @JsonProperty("loadFlag")
   public void setLoadFlag(Byte loadFlag) {
      this.loadFlag = loadFlag;
   }

   @JsonProperty("loadFlag")
   public Byte getLoadFlag() {
      return this.loadFlag;
   }

   @JsonProperty("unloadFlag")
   public void setUnloadFlag(Byte unloadFlag) {
      this.unloadFlag = unloadFlag;
   }

   @JsonProperty("unloadFlag")
   public Byte getUnloadFlag() {
      return this.unloadFlag;
   }

   @JsonProperty("receiptFlag")
   public void setReceiptFlag(Byte receiptFlag) {
      this.receiptFlag = receiptFlag;
   }

   @JsonProperty("receiptFlag")
   public Byte getReceiptFlag() {
      return this.receiptFlag;
   }

   @JsonProperty("fcFlag")
   public void setFcFlag(Byte fcFlag) {
      this.fcFlag = fcFlag;
   }

   @JsonProperty("fcFlag")
   public Byte getFcFlag() {
      return this.fcFlag;
   }

   @JsonProperty("temporaryStorage")
   public void setTemporaryStorage(Byte temporaryStorage) {
      this.temporaryStorage = temporaryStorage;
   }

   @JsonProperty("temporaryStorage")
   public Byte getTemporaryStorage() {
      return this.temporaryStorage;
   }

   @JsonProperty("peaceMindReceive")
   public void setPeaceMindReceive(Byte peaceMindReceive) {
      this.peaceMindReceive = peaceMindReceive;
   }

   @JsonProperty("peaceMindReceive")
   public Byte getPeaceMindReceive() {
      return this.peaceMindReceive;
   }
}
