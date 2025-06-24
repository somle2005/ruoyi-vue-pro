package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.querySumStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class IsvDayStockLog implements Serializable {
   private String goodsNo;
   private String goodsName;
   private String deptNo;
   private String warehouseNo;
   private int purchaseInstoreNum;
   private int orderOutstoreNum;
   private int returnInstoreNum;
   private int returnOutstoreNum;
   private int stockOverNum;
   private int stockShortNum;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String getGoodsName() {
      return this.goodsName;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("purchaseInstoreNum")
   public void setPurchaseInstoreNum(int purchaseInstoreNum) {
      this.purchaseInstoreNum = purchaseInstoreNum;
   }

   @JsonProperty("purchaseInstoreNum")
   public int getPurchaseInstoreNum() {
      return this.purchaseInstoreNum;
   }

   @JsonProperty("orderOutstoreNum")
   public void setOrderOutstoreNum(int orderOutstoreNum) {
      this.orderOutstoreNum = orderOutstoreNum;
   }

   @JsonProperty("orderOutstoreNum")
   public int getOrderOutstoreNum() {
      return this.orderOutstoreNum;
   }

   @JsonProperty("returnInstoreNum")
   public void setReturnInstoreNum(int returnInstoreNum) {
      this.returnInstoreNum = returnInstoreNum;
   }

   @JsonProperty("returnInstoreNum")
   public int getReturnInstoreNum() {
      return this.returnInstoreNum;
   }

   @JsonProperty("returnOutstoreNum")
   public void setReturnOutstoreNum(int returnOutstoreNum) {
      this.returnOutstoreNum = returnOutstoreNum;
   }

   @JsonProperty("returnOutstoreNum")
   public int getReturnOutstoreNum() {
      return this.returnOutstoreNum;
   }

   @JsonProperty("stockOverNum")
   public void setStockOverNum(int stockOverNum) {
      this.stockOverNum = stockOverNum;
   }

   @JsonProperty("stockOverNum")
   public int getStockOverNum() {
      return this.stockOverNum;
   }

   @JsonProperty("stockShortNum")
   public void setStockShortNum(int stockShortNum) {
      this.stockShortNum = stockShortNum;
   }

   @JsonProperty("stockShortNum")
   public int getStockShortNum() {
      return this.stockShortNum;
   }
}
