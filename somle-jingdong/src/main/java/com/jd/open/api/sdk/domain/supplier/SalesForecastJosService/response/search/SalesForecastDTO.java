package com.jd.open.api.sdk.domain.supplier.SalesForecastJosService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class SalesForecastDTO implements Serializable {
   private long[] id;
   private String[] vendorCode;
   private String[] vendorName;
   private String[] wareCodeJD;
   private String[] wareCodeVendor;
   private String[] brandCode;
   private String[] brandName;
   private String[] categoryCode;
   private String[] categoryName;
   private String[] wareName;
   private String[] deliverCenterID;
   private String[] deliverCenter;
   private String[] bandInfo;
   private String[] baseSales;
   private String[] promotionSales;
   private String[] salesAdjustment;
   private String[] totalSalesForecast;
   private String[] canPurchaseStock;
   private String[] endingDateStock;
   private String[] replenishmentQuantity;
   private String[] stockUpCycle;
   private String[] nrt;
   private String[] vlt;
   private String[] replenishmentPoint;
   private String[] targetStockDays;
   private String[] targetStockQuantity;
   private Date[] forecastTime;
   private String[] pin;

   @JsonProperty("id")
   public void setId(long[] id) {
      this.id = id;
   }

   @JsonProperty("id")
   public long[] getId() {
      return this.id;
   }

   @JsonProperty("vendorCode")
   public void setVendorCode(String[] vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendorCode")
   public String[] getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("vendorName")
   public void setVendorName(String[] vendorName) {
      this.vendorName = vendorName;
   }

   @JsonProperty("vendorName")
   public String[] getVendorName() {
      return this.vendorName;
   }

   @JsonProperty("wareCodeJD")
   public void setWareCodeJD(String[] wareCodeJD) {
      this.wareCodeJD = wareCodeJD;
   }

   @JsonProperty("wareCodeJD")
   public String[] getWareCodeJD() {
      return this.wareCodeJD;
   }

   @JsonProperty("wareCodeVendor")
   public void setWareCodeVendor(String[] wareCodeVendor) {
      this.wareCodeVendor = wareCodeVendor;
   }

   @JsonProperty("wareCodeVendor")
   public String[] getWareCodeVendor() {
      return this.wareCodeVendor;
   }

   @JsonProperty("brandCode")
   public void setBrandCode(String[] brandCode) {
      this.brandCode = brandCode;
   }

   @JsonProperty("brandCode")
   public String[] getBrandCode() {
      return this.brandCode;
   }

   @JsonProperty("brandName")
   public void setBrandName(String[] brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String[] getBrandName() {
      return this.brandName;
   }

   @JsonProperty("categoryCode")
   public void setCategoryCode(String[] categoryCode) {
      this.categoryCode = categoryCode;
   }

   @JsonProperty("categoryCode")
   public String[] getCategoryCode() {
      return this.categoryCode;
   }

   @JsonProperty("categoryName")
   public void setCategoryName(String[] categoryName) {
      this.categoryName = categoryName;
   }

   @JsonProperty("categoryName")
   public String[] getCategoryName() {
      return this.categoryName;
   }

   @JsonProperty("wareName")
   public void setWareName(String[] wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String[] getWareName() {
      return this.wareName;
   }

   @JsonProperty("deliverCenterID")
   public void setDeliverCenterID(String[] deliverCenterID) {
      this.deliverCenterID = deliverCenterID;
   }

   @JsonProperty("deliverCenterID")
   public String[] getDeliverCenterID() {
      return this.deliverCenterID;
   }

   @JsonProperty("deliverCenter")
   public void setDeliverCenter(String[] deliverCenter) {
      this.deliverCenter = deliverCenter;
   }

   @JsonProperty("deliverCenter")
   public String[] getDeliverCenter() {
      return this.deliverCenter;
   }

   @JsonProperty("bandInfo")
   public void setBandInfo(String[] bandInfo) {
      this.bandInfo = bandInfo;
   }

   @JsonProperty("bandInfo")
   public String[] getBandInfo() {
      return this.bandInfo;
   }

   @JsonProperty("baseSales")
   public void setBaseSales(String[] baseSales) {
      this.baseSales = baseSales;
   }

   @JsonProperty("baseSales")
   public String[] getBaseSales() {
      return this.baseSales;
   }

   @JsonProperty("promotionSales")
   public void setPromotionSales(String[] promotionSales) {
      this.promotionSales = promotionSales;
   }

   @JsonProperty("promotionSales")
   public String[] getPromotionSales() {
      return this.promotionSales;
   }

   @JsonProperty("salesAdjustment")
   public void setSalesAdjustment(String[] salesAdjustment) {
      this.salesAdjustment = salesAdjustment;
   }

   @JsonProperty("salesAdjustment")
   public String[] getSalesAdjustment() {
      return this.salesAdjustment;
   }

   @JsonProperty("totalSalesForecast")
   public void setTotalSalesForecast(String[] totalSalesForecast) {
      this.totalSalesForecast = totalSalesForecast;
   }

   @JsonProperty("totalSalesForecast")
   public String[] getTotalSalesForecast() {
      return this.totalSalesForecast;
   }

   @JsonProperty("canPurchaseStock")
   public void setCanPurchaseStock(String[] canPurchaseStock) {
      this.canPurchaseStock = canPurchaseStock;
   }

   @JsonProperty("canPurchaseStock")
   public String[] getCanPurchaseStock() {
      return this.canPurchaseStock;
   }

   @JsonProperty("endingDateStock")
   public void setEndingDateStock(String[] endingDateStock) {
      this.endingDateStock = endingDateStock;
   }

   @JsonProperty("endingDateStock")
   public String[] getEndingDateStock() {
      return this.endingDateStock;
   }

   @JsonProperty("replenishmentQuantity")
   public void setReplenishmentQuantity(String[] replenishmentQuantity) {
      this.replenishmentQuantity = replenishmentQuantity;
   }

   @JsonProperty("replenishmentQuantity")
   public String[] getReplenishmentQuantity() {
      return this.replenishmentQuantity;
   }

   @JsonProperty("stockUpCycle")
   public void setStockUpCycle(String[] stockUpCycle) {
      this.stockUpCycle = stockUpCycle;
   }

   @JsonProperty("stockUpCycle")
   public String[] getStockUpCycle() {
      return this.stockUpCycle;
   }

   @JsonProperty("nrt")
   public void setNrt(String[] nrt) {
      this.nrt = nrt;
   }

   @JsonProperty("nrt")
   public String[] getNrt() {
      return this.nrt;
   }

   @JsonProperty("vlt")
   public void setVlt(String[] vlt) {
      this.vlt = vlt;
   }

   @JsonProperty("vlt")
   public String[] getVlt() {
      return this.vlt;
   }

   @JsonProperty("replenishmentPoint")
   public void setReplenishmentPoint(String[] replenishmentPoint) {
      this.replenishmentPoint = replenishmentPoint;
   }

   @JsonProperty("replenishmentPoint")
   public String[] getReplenishmentPoint() {
      return this.replenishmentPoint;
   }

   @JsonProperty("targetStockDays")
   public void setTargetStockDays(String[] targetStockDays) {
      this.targetStockDays = targetStockDays;
   }

   @JsonProperty("targetStockDays")
   public String[] getTargetStockDays() {
      return this.targetStockDays;
   }

   @JsonProperty("targetStockQuantity")
   public void setTargetStockQuantity(String[] targetStockQuantity) {
      this.targetStockQuantity = targetStockQuantity;
   }

   @JsonProperty("targetStockQuantity")
   public String[] getTargetStockQuantity() {
      return this.targetStockQuantity;
   }

   @JsonProperty("forecastTime")
   public void setForecastTime(Date[] forecastTime) {
      this.forecastTime = forecastTime;
   }

   @JsonProperty("forecastTime")
   public Date[] getForecastTime() {
      return this.forecastTime;
   }

   @JsonProperty("pin")
   public void setPin(String[] pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String[] getPin() {
      return this.pin;
   }
}
