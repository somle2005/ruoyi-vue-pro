package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryWarehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WarehouseOut implements Serializable {
   private String[] warehouseNo;
   private String[] warehouseName;
   private String[] status;
   private String[] contacts;
   private String[] phone;
   private String[] province;
   private String[] city;
   private String[] county;
   private String[] town;
   private String[] address;
   private String[] reserve1;
   private String[] reserve2;
   private String[] reserve3;
   private String[] reserve4;
   private String[] reserve5;
   private String[] isvWarehouseNo;

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String[] warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String[] getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("warehouseName")
   public void setWarehouseName(String[] warehouseName) {
      this.warehouseName = warehouseName;
   }

   @JsonProperty("warehouseName")
   public String[] getWarehouseName() {
      return this.warehouseName;
   }

   @JsonProperty("status")
   public void setStatus(String[] status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String[] getStatus() {
      return this.status;
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

   @JsonProperty("province")
   public void setProvince(String[] province) {
      this.province = province;
   }

   @JsonProperty("province")
   public String[] getProvince() {
      return this.province;
   }

   @JsonProperty("city")
   public void setCity(String[] city) {
      this.city = city;
   }

   @JsonProperty("city")
   public String[] getCity() {
      return this.city;
   }

   @JsonProperty("county")
   public void setCounty(String[] county) {
      this.county = county;
   }

   @JsonProperty("county")
   public String[] getCounty() {
      return this.county;
   }

   @JsonProperty("town")
   public void setTown(String[] town) {
      this.town = town;
   }

   @JsonProperty("town")
   public String[] getTown() {
      return this.town;
   }

   @JsonProperty("address")
   public void setAddress(String[] address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String[] getAddress() {
      return this.address;
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

   @JsonProperty("isvWarehouseNo")
   public void setIsvWarehouseNo(String[] isvWarehouseNo) {
      this.isvWarehouseNo = isvWarehouseNo;
   }

   @JsonProperty("isvWarehouseNo")
   public String[] getIsvWarehouseNo() {
      return this.isvWarehouseNo;
   }
}
