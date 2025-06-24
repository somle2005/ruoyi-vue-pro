package com.jd.open.api.sdk.domain.ware.StockReadService.response.findSkuSiteStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuSiteStock implements Serializable {
   private Long skuId;
   private Integer siteId;
   private String venderSource;
   private Integer stockNum;
   private Integer orderBookingNum;
   private Integer appBookingNum;
   private Integer canUsedNum;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("siteId")
   public void setSiteId(Integer siteId) {
      this.siteId = siteId;
   }

   @JsonProperty("siteId")
   public Integer getSiteId() {
      return this.siteId;
   }

   @JsonProperty("venderSource")
   public void setVenderSource(String venderSource) {
      this.venderSource = venderSource;
   }

   @JsonProperty("venderSource")
   public String getVenderSource() {
      return this.venderSource;
   }

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

   @JsonProperty("appBookingNum")
   public void setAppBookingNum(Integer appBookingNum) {
      this.appBookingNum = appBookingNum;
   }

   @JsonProperty("appBookingNum")
   public Integer getAppBookingNum() {
      return this.appBookingNum;
   }

   @JsonProperty("canUsedNum")
   public void setCanUsedNum(Integer canUsedNum) {
      this.canUsedNum = canUsedNum;
   }

   @JsonProperty("canUsedNum")
   public Integer getCanUsedNum() {
      return this.canUsedNum;
   }
}
