package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SkuProxyResult implements Serializable {
   private Long skuId;
   private Long itemId;
   private Long sellerId;
   private Integer skuStatus;
   private String attributes;
   private BigDecimal marketPrice;
   private BigDecimal sellPrice;
   private BigDecimal costPrice;
   private Integer stockNum;
   private Integer occupiedInventory;
   private Integer usableInventory;
   private Date created;
   private Date modified;

   @JsonProperty("sku_id")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("sku_id")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("item_id")
   public void setItemId(Long itemId) {
      this.itemId = itemId;
   }

   @JsonProperty("item_id")
   public Long getItemId() {
      return this.itemId;
   }

   @JsonProperty("seller_id")
   public void setSellerId(Long sellerId) {
      this.sellerId = sellerId;
   }

   @JsonProperty("seller_id")
   public Long getSellerId() {
      return this.sellerId;
   }

   @JsonProperty("sku_status")
   public void setSkuStatus(Integer skuStatus) {
      this.skuStatus = skuStatus;
   }

   @JsonProperty("sku_status")
   public Integer getSkuStatus() {
      return this.skuStatus;
   }

   @JsonProperty("attributes")
   public void setAttributes(String attributes) {
      this.attributes = attributes;
   }

   @JsonProperty("attributes")
   public String getAttributes() {
      return this.attributes;
   }

   @JsonProperty("market_price")
   public void setMarketPrice(BigDecimal marketPrice) {
      this.marketPrice = marketPrice;
   }

   @JsonProperty("market_price")
   public BigDecimal getMarketPrice() {
      return this.marketPrice;
   }

   @JsonProperty("sell_price")
   public void setSellPrice(BigDecimal sellPrice) {
      this.sellPrice = sellPrice;
   }

   @JsonProperty("sell_price")
   public BigDecimal getSellPrice() {
      return this.sellPrice;
   }

   @JsonProperty("cost_price")
   public void setCostPrice(BigDecimal costPrice) {
      this.costPrice = costPrice;
   }

   @JsonProperty("cost_price")
   public BigDecimal getCostPrice() {
      return this.costPrice;
   }

   @JsonProperty("stock_num")
   public void setStockNum(Integer stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stock_num")
   public Integer getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("occupied_inventory")
   public void setOccupiedInventory(Integer occupiedInventory) {
      this.occupiedInventory = occupiedInventory;
   }

   @JsonProperty("occupied_inventory")
   public Integer getOccupiedInventory() {
      return this.occupiedInventory;
   }

   @JsonProperty("usable_inventory")
   public void setUsableInventory(Integer usableInventory) {
      this.usableInventory = usableInventory;
   }

   @JsonProperty("usable_inventory")
   public Integer getUsableInventory() {
      return this.usableInventory;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }
}
