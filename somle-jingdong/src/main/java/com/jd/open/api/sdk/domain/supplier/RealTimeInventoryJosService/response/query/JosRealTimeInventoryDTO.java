package com.jd.open.api.sdk.domain.supplier.RealTimeInventoryJosService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosRealTimeInventoryDTO implements Serializable {
   private String[] productCode;
   private String[] orgCode;
   private String[] warehouseCode;
   private Integer[] spotQuantity;
   private Integer[] orderableQuantity;
   private Integer[] orderBookingNum;
   private Integer[] ztNum;
   private Integer[] transferInNum;
   private Integer[] transferOutNum;
   private Integer[] unarrivedPurchases;
   private Integer[] appBookingNum;

   @JsonProperty("productCode")
   public void setProductCode(String[] productCode) {
      this.productCode = productCode;
   }

   @JsonProperty("productCode")
   public String[] getProductCode() {
      return this.productCode;
   }

   @JsonProperty("orgCode")
   public void setOrgCode(String[] orgCode) {
      this.orgCode = orgCode;
   }

   @JsonProperty("orgCode")
   public String[] getOrgCode() {
      return this.orgCode;
   }

   @JsonProperty("warehouseCode")
   public void setWarehouseCode(String[] warehouseCode) {
      this.warehouseCode = warehouseCode;
   }

   @JsonProperty("warehouseCode")
   public String[] getWarehouseCode() {
      return this.warehouseCode;
   }

   @JsonProperty("spotQuantity")
   public void setSpotQuantity(Integer[] spotQuantity) {
      this.spotQuantity = spotQuantity;
   }

   @JsonProperty("spotQuantity")
   public Integer[] getSpotQuantity() {
      return this.spotQuantity;
   }

   @JsonProperty("orderableQuantity")
   public void setOrderableQuantity(Integer[] orderableQuantity) {
      this.orderableQuantity = orderableQuantity;
   }

   @JsonProperty("orderableQuantity")
   public Integer[] getOrderableQuantity() {
      return this.orderableQuantity;
   }

   @JsonProperty("orderBookingNum")
   public void setOrderBookingNum(Integer[] orderBookingNum) {
      this.orderBookingNum = orderBookingNum;
   }

   @JsonProperty("orderBookingNum")
   public Integer[] getOrderBookingNum() {
      return this.orderBookingNum;
   }

   @JsonProperty("ztNum")
   public void setZtNum(Integer[] ztNum) {
      this.ztNum = ztNum;
   }

   @JsonProperty("ztNum")
   public Integer[] getZtNum() {
      return this.ztNum;
   }

   @JsonProperty("transferInNum")
   public void setTransferInNum(Integer[] transferInNum) {
      this.transferInNum = transferInNum;
   }

   @JsonProperty("transferInNum")
   public Integer[] getTransferInNum() {
      return this.transferInNum;
   }

   @JsonProperty("transferOutNum")
   public void setTransferOutNum(Integer[] transferOutNum) {
      this.transferOutNum = transferOutNum;
   }

   @JsonProperty("transferOutNum")
   public Integer[] getTransferOutNum() {
      return this.transferOutNum;
   }

   @JsonProperty("unarrivedPurchases")
   public void setUnarrivedPurchases(Integer[] unarrivedPurchases) {
      this.unarrivedPurchases = unarrivedPurchases;
   }

   @JsonProperty("unarrivedPurchases")
   public Integer[] getUnarrivedPurchases() {
      return this.unarrivedPurchases;
   }

   @JsonProperty("appBookingNum")
   public void setAppBookingNum(Integer[] appBookingNum) {
      this.appBookingNum = appBookingNum;
   }

   @JsonProperty("appBookingNum")
   public Integer[] getAppBookingNum() {
      return this.appBookingNum;
   }
}
