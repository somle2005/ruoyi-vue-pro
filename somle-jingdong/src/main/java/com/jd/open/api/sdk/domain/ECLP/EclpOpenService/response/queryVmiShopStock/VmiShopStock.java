package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryVmiShopStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VmiShopStock implements Serializable {
   private String shopNo;
   private String goodsNo;
   private String spGoodsNo;
   private int[] stockNum;
   private int[] occupyNum;
   private String warehouseNo;

   @JsonProperty("shopNo")
   public void setShopNo(String shopNo) {
      this.shopNo = shopNo;
   }

   @JsonProperty("shopNo")
   public String getShopNo() {
      return this.shopNo;
   }

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("spGoodsNo")
   public void setSpGoodsNo(String spGoodsNo) {
      this.spGoodsNo = spGoodsNo;
   }

   @JsonProperty("spGoodsNo")
   public String getSpGoodsNo() {
      return this.spGoodsNo;
   }

   @JsonProperty("stockNum")
   public void setStockNum(int[] stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public int[] getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("occupyNum")
   public void setOccupyNum(int[] occupyNum) {
      this.occupyNum = occupyNum;
   }

   @JsonProperty("occupyNum")
   public int[] getOccupyNum() {
      return this.occupyNum;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }
}
