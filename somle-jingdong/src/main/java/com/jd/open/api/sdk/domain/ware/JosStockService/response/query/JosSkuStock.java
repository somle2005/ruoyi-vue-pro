package com.jd.open.api.sdk.domain.ware.JosStockService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosSkuStock implements Serializable {
   private Integer appBookingNum;
   private Integer stockNum;
   private Integer storeId;
   private Integer orderBookingNum;
   private Long skuId;
   private Integer orderTransferNum;

   @JsonProperty("appBookingNum")
   public void setAppBookingNum(Integer appBookingNum) {
      this.appBookingNum = appBookingNum;
   }

   @JsonProperty("appBookingNum")
   public Integer getAppBookingNum() {
      return this.appBookingNum;
   }

   @JsonProperty("stockNum")
   public void setStockNum(Integer stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Integer getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("storeId")
   public void setStoreId(Integer storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Integer getStoreId() {
      return this.storeId;
   }

   @JsonProperty("orderBookingNum")
   public void setOrderBookingNum(Integer orderBookingNum) {
      this.orderBookingNum = orderBookingNum;
   }

   @JsonProperty("orderBookingNum")
   public Integer getOrderBookingNum() {
      return this.orderBookingNum;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("orderTransferNum")
   public void setOrderTransferNum(Integer orderTransferNum) {
      this.orderTransferNum = orderTransferNum;
   }

   @JsonProperty("orderTransferNum")
   public Integer getOrderTransferNum() {
      return this.orderTransferNum;
   }
}
