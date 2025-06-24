package com.jd.open.api.sdk.domain.jialilue.OmnicBizStockJosService.response.searchBizStockInfoByPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class BizStockInfoResp implements Serializable {
   private String venderSkuId;
   private Long venderId;
   private Long storeId;
   private Integer reserveNum;
   private String skuName;
   private String venderSkuName;
   private Integer produceBookingNum;
   private String venderStoreId;
   private Integer sellableNum;
   private String storeName;
   private Integer goodsNum;
   private Date estimatedArrivalTime;
   private String skuId;

   @JsonProperty("venderSkuId")
   public void setVenderSkuId(String venderSkuId) {
      this.venderSkuId = venderSkuId;
   }

   @JsonProperty("venderSkuId")
   public String getVenderSkuId() {
      return this.venderSkuId;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("storeId")
   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Long getStoreId() {
      return this.storeId;
   }

   @JsonProperty("reserveNum")
   public void setReserveNum(Integer reserveNum) {
      this.reserveNum = reserveNum;
   }

   @JsonProperty("reserveNum")
   public Integer getReserveNum() {
      return this.reserveNum;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("venderSkuName")
   public void setVenderSkuName(String venderSkuName) {
      this.venderSkuName = venderSkuName;
   }

   @JsonProperty("venderSkuName")
   public String getVenderSkuName() {
      return this.venderSkuName;
   }

   @JsonProperty("produceBookingNum")
   public void setProduceBookingNum(Integer produceBookingNum) {
      this.produceBookingNum = produceBookingNum;
   }

   @JsonProperty("produceBookingNum")
   public Integer getProduceBookingNum() {
      return this.produceBookingNum;
   }

   @JsonProperty("venderStoreId")
   public void setVenderStoreId(String venderStoreId) {
      this.venderStoreId = venderStoreId;
   }

   @JsonProperty("venderStoreId")
   public String getVenderStoreId() {
      return this.venderStoreId;
   }

   @JsonProperty("sellableNum")
   public void setSellableNum(Integer sellableNum) {
      this.sellableNum = sellableNum;
   }

   @JsonProperty("sellableNum")
   public Integer getSellableNum() {
      return this.sellableNum;
   }

   @JsonProperty("storeName")
   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   @JsonProperty("storeName")
   public String getStoreName() {
      return this.storeName;
   }

   @JsonProperty("goodsNum")
   public void setGoodsNum(Integer goodsNum) {
      this.goodsNum = goodsNum;
   }

   @JsonProperty("goodsNum")
   public Integer getGoodsNum() {
      return this.goodsNum;
   }

   @JsonProperty("estimatedArrivalTime")
   public void setEstimatedArrivalTime(Date estimatedArrivalTime) {
      this.estimatedArrivalTime = estimatedArrivalTime;
   }

   @JsonProperty("estimatedArrivalTime")
   public Date getEstimatedArrivalTime() {
      return this.estimatedArrivalTime;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }
}
