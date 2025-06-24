package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryShipper;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ShipperOut implements Serializable {
   private String[] shipperNo;
   private String[] shipperName;
   private String[] contacts;
   private String[] phone;
   private String[] reserve1;
   private String[] reserve2;
   private String[] reserve3;
   private String[] reserve4;
   private String[] reserve5;
   private String[] status;
   private String[] type;
   private String[] isCod;
   private String[] isTemplate;

   @JsonProperty("shipperNo")
   public void setShipperNo(String[] shipperNo) {
      this.shipperNo = shipperNo;
   }

   @JsonProperty("shipperNo")
   public String[] getShipperNo() {
      return this.shipperNo;
   }

   @JsonProperty("shipperName")
   public void setShipperName(String[] shipperName) {
      this.shipperName = shipperName;
   }

   @JsonProperty("shipperName")
   public String[] getShipperName() {
      return this.shipperName;
   }

   @JsonProperty("contacts")
   public void setContacts(String[] contacts) {
      this.contacts = contacts;
   }

   @JsonProperty("contacts")
   public String[] getContacts() {
      return this.contacts;
   }

   @JsonProperty("phone")
   public void setPhone(String[] phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String[] getPhone() {
      return this.phone;
   }

   @JsonProperty("reserve1")
   public void setReserve1(String[] reserve1) {
      this.reserve1 = reserve1;
   }

   @JsonProperty("reserve1")
   public String[] getReserve1() {
      return this.reserve1;
   }

   @JsonProperty("reserve2")
   public void setReserve2(String[] reserve2) {
      this.reserve2 = reserve2;
   }

   @JsonProperty("reserve2")
   public String[] getReserve2() {
      return this.reserve2;
   }

   @JsonProperty("reserve3")
   public void setReserve3(String[] reserve3) {
      this.reserve3 = reserve3;
   }

   @JsonProperty("reserve3")
   public String[] getReserve3() {
      return this.reserve3;
   }

   @JsonProperty("reserve4")
   public void setReserve4(String[] reserve4) {
      this.reserve4 = reserve4;
   }

   @JsonProperty("reserve4")
   public String[] getReserve4() {
      return this.reserve4;
   }

   @JsonProperty("reserve5")
   public void setReserve5(String[] reserve5) {
      this.reserve5 = reserve5;
   }

   @JsonProperty("reserve5")
   public String[] getReserve5() {
      return this.reserve5;
   }

   @JsonProperty("status")
   public void setStatus(String[] status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String[] getStatus() {
      return this.status;
   }

   @JsonProperty("type")
   public void setType(String[] type) {
      this.type = type;
   }

   @JsonProperty("type")
   public String[] getType() {
      return this.type;
   }

   @JsonProperty("isCod")
   public void setIsCod(String[] isCod) {
      this.isCod = isCod;
   }

   @JsonProperty("isCod")
   public String[] getIsCod() {
      return this.isCod;
   }

   @JsonProperty("isTemplate")
   public void setIsTemplate(String[] isTemplate) {
      this.isTemplate = isTemplate;
   }

   @JsonProperty("isTemplate")
   public String[] getIsTemplate() {
      return this.isTemplate;
   }
}
