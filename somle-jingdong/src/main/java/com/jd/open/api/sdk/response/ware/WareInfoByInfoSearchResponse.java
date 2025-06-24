package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.Ware;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class WareInfoByInfoSearchResponse extends AbstractResponse {
   private List<Ware> wareInfos;
   private int total;

   public int getTotal() {
      return this.total;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   @JsonProperty("ware_infos")
   public List<Ware> getWareInfos() {
      return this.wareInfos;
   }

   @JsonProperty("ware_infos")
   public void setWareInfos(List<Ware> wareInfos) {
      this.wareInfos = wareInfos;
   }

   public static class WareInfo {
      private Long wareId;
      private Long spuId;
      private Long categoryId;
      private Long venderId;
      private Long shopId;
      private String wareStatus;
      private String title;
      private String itemNum;
      private String upcCode;
      private Long transportId;
      private String onlineTime;
      private String offlineTime;
      private String attributes;
      private String costPrice;
      private String marketPrice;
      private String jdPrice;
      private long stockNum;
      private String logo;
      private String creator;
      private Integer status;
      private String weight;
      private String created;
      private String modified;
      private String outerId;

      @JsonProperty("ware_id")
      public Long getWareId() {
         return this.wareId;
      }

      @JsonProperty("ware_id")
      public void setWareId(Long wareId) {
         this.wareId = wareId;
      }

      @JsonProperty("spu_id")
      public Long getSpuId() {
         return this.spuId;
      }

      @JsonProperty("spu_id")
      public void setSpuId(Long spuId) {
         this.spuId = spuId;
      }

      @JsonProperty("category_id")
      public Long getCategoryId() {
         return this.categoryId;
      }

      @JsonProperty("category_id")
      public void setCategoryId(Long categoryId) {
         this.categoryId = categoryId;
      }

      @JsonProperty("vender_id")
      public Long getVenderId() {
         return this.venderId;
      }

      @JsonProperty("vender_id")
      public void setVenderId(Long venderId) {
         this.venderId = venderId;
      }

      @JsonProperty("shop_id")
      public Long getShopId() {
         return this.shopId;
      }

      @JsonProperty("shop_id")
      public void setShopId(Long shopId) {
         this.shopId = shopId;
      }

      @JsonProperty("ware_status")
      public String getWareStatus() {
         return this.wareStatus;
      }

      @JsonProperty("ware_status")
      public void setWareStatus(String wareStatus) {
         this.wareStatus = wareStatus;
      }

      @JsonProperty("title")
      public String getTitle() {
         return this.title;
      }

      @JsonProperty("title")
      public void setTitle(String title) {
         this.title = title;
      }

      @JsonProperty("item_num")
      public String getItemNum() {
         return this.itemNum;
      }

      @JsonProperty("item_num")
      public void setItemNum(String itemNum) {
         this.itemNum = itemNum;
      }

      @JsonProperty("upc_code")
      public String getUpcCode() {
         return this.upcCode;
      }

      @JsonProperty("upc_code")
      public void setUpcCode(String upcCode) {
         this.upcCode = upcCode;
      }

      @JsonProperty("transport_id")
      public Long getTransportId() {
         return this.transportId;
      }

      @JsonProperty("transport_id")
      public void setTransportId(Long transportId) {
         this.transportId = transportId;
      }

      @JsonProperty("online_time")
      public String getOnlineTime() {
         return this.onlineTime;
      }

      @JsonProperty("online_time")
      public void setOnlineTime(String onlineTime) {
         this.onlineTime = onlineTime;
      }

      @JsonProperty("offline_time")
      public String getOfflineTime() {
         return this.offlineTime;
      }

      @JsonProperty("offline_time")
      public void setOfflineTime(String offlineTime) {
         this.offlineTime = offlineTime;
      }

      @JsonProperty("attributes")
      public String getAttributes() {
         return this.attributes;
      }

      @JsonProperty("attributes")
      public void setAttributes(String attributes) {
         this.attributes = attributes;
      }

      @JsonProperty("cost_price")
      public String getCostPrice() {
         return this.costPrice;
      }

      @JsonProperty("cost_price")
      public void setCostPrice(String costPrice) {
         this.costPrice = costPrice;
      }

      @JsonProperty("market_price")
      public String getMarketPrice() {
         return this.marketPrice;
      }

      @JsonProperty("market_price")
      public void setMarketPrice(String marketPrice) {
         this.marketPrice = marketPrice;
      }

      @JsonProperty("jd_price")
      public String getJdPrice() {
         return this.jdPrice;
      }

      @JsonProperty("jd_price")
      public void setJdPrice(String jdPrice) {
         this.jdPrice = jdPrice;
      }

      @JsonProperty("stock_num")
      public long getStockNum() {
         return this.stockNum;
      }

      @JsonProperty("stock_num")
      public void setStockNum(long stockNum) {
         this.stockNum = stockNum;
      }

      @JsonProperty("logo")
      public String getLogo() {
         return this.logo;
      }

      @JsonProperty("logo")
      public void setLogo(String logo) {
         this.logo = logo;
      }

      @JsonProperty("creator")
      public String getCreator() {
         return this.creator;
      }

      @JsonProperty("creator")
      public void setCreator(String creator) {
         this.creator = creator;
      }

      @JsonProperty("status")
      public Integer getStatus() {
         return this.status;
      }

      @JsonProperty("status")
      public void setStatus(Integer status) {
         this.status = status;
      }

      @JsonProperty("weight")
      public String getWeight() {
         return this.weight;
      }

      @JsonProperty("weight")
      public void setWeight(String weight) {
         this.weight = weight;
      }

      @JsonProperty("created")
      public String getCreated() {
         return this.created;
      }

      @JsonProperty("created")
      public void setCreated(String created) {
         this.created = created;
      }

      @JsonProperty("modified")
      public String getModified() {
         return this.modified;
      }

      @JsonProperty("modified")
      public void setModified(String modified) {
         this.modified = modified;
      }

      @JsonProperty("outer_id")
      public String getOuterId() {
         return this.outerId;
      }

      @JsonProperty("outer_id")
      public void setOuterId(String outerId) {
         this.outerId = outerId;
      }
   }
}
