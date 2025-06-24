package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderPacks;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderDefaultResult implements Serializable {
   private String eclpSoNo;
   private String isvUUID;
   private String wayBill;
   private String shipperNo;
   private String shipperName;
   private int packCount;
   private List<OrderPackage> orderPackageList;
   private String tpWaybill;

   @JsonProperty("eclpSoNo")
   public void setEclpSoNo(String eclpSoNo) {
      this.eclpSoNo = eclpSoNo;
   }

   @JsonProperty("eclpSoNo")
   public String getEclpSoNo() {
      return this.eclpSoNo;
   }

   @JsonProperty("isvUUID")
   public void setIsvUUID(String isvUUID) {
      this.isvUUID = isvUUID;
   }

   @JsonProperty("isvUUID")
   public String getIsvUUID() {
      return this.isvUUID;
   }

   @JsonProperty("wayBill")
   public void setWayBill(String wayBill) {
      this.wayBill = wayBill;
   }

   @JsonProperty("wayBill")
   public String getWayBill() {
      return this.wayBill;
   }

   @JsonProperty("shipperNo")
   public void setShipperNo(String shipperNo) {
      this.shipperNo = shipperNo;
   }

   @JsonProperty("shipperNo")
   public String getShipperNo() {
      return this.shipperNo;
   }

   @JsonProperty("shipperName")
   public void setShipperName(String shipperName) {
      this.shipperName = shipperName;
   }

   @JsonProperty("shipperName")
   public String getShipperName() {
      return this.shipperName;
   }

   @JsonProperty("packCount")
   public void setPackCount(int packCount) {
      this.packCount = packCount;
   }

   @JsonProperty("packCount")
   public int getPackCount() {
      return this.packCount;
   }

   @JsonProperty("orderPackageList")
   public void setOrderPackageList(List<OrderPackage> orderPackageList) {
      this.orderPackageList = orderPackageList;
   }

   @JsonProperty("orderPackageList")
   public List<OrderPackage> getOrderPackageList() {
      return this.orderPackageList;
   }

   @JsonProperty("tpWaybill")
   public void setTpWaybill(String tpWaybill) {
      this.tpWaybill = tpWaybill;
   }

   @JsonProperty("tpWaybill")
   public String getTpWaybill() {
      return this.tpWaybill;
   }
}
