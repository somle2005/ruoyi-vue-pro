package com.jd.open.api.sdk.domain.supplier.DpsStockInterface.response.queryStockInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StockInfo implements Serializable {
   private Long sku;
   private String wareName;
   private int stockNum;
   private int orderBookingNum;

   @JsonProperty("sku")
   public void setSku(Long sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public Long getSku() {
      return this.sku;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("stockNum")
   public void setStockNum(int stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public int getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("orderBookingNum")
   public void setOrderBookingNum(int orderBookingNum) {
      this.orderBookingNum = orderBookingNum;
   }

   @JsonProperty("orderBookingNum")
   public int getOrderBookingNum() {
      return this.orderBookingNum;
   }
}
