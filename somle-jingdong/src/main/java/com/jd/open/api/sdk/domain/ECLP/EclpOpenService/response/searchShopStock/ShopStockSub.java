package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.searchShopStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ShopStockSub implements Serializable {
   private String deptNo;
   private String shopNo;
   private String warehouseNo;
   private int stockNum;
   private String goodsNo;

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("shopNo")
   public void setShopNo(String shopNo) {
      this.shopNo = shopNo;
   }

   @JsonProperty("shopNo")
   public String getShopNo() {
      return this.shopNo;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("stockNum")
   public void setStockNum(int stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public int getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }
}
