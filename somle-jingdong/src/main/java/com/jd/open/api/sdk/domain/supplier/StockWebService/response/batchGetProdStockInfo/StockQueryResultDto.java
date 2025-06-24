package com.jd.open.api.sdk.domain.supplier.StockWebService.response.batchGetProdStockInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StockQueryResultDto implements Serializable {
   private Integer stockNum;
   private Integer orderBookingNum;
   private String wname;
   private Long sku;

   @JsonProperty("stockNum")
   public void setStockNum(Integer stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Integer getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("orderBookingNum")
   public void setOrderBookingNum(Integer orderBookingNum) {
      this.orderBookingNum = orderBookingNum;
   }

   @JsonProperty("orderBookingNum")
   public Integer getOrderBookingNum() {
      return this.orderBookingNum;
   }

   @JsonProperty("wname")
   public void setWname(String wname) {
      this.wname = wname;
   }

   @JsonProperty("wname")
   public String getWname() {
      return this.wname;
   }

   @JsonProperty("sku")
   public void setSku(Long sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public Long getSku() {
      return this.sku;
   }
}
