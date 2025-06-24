package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.searchShopStockFlow;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ShopStockFlowSub implements Serializable {
   private String sellerNo;
   private String deptNo;
   private String shopNo;
   private String warehouseNo;
   private String goodsNo;
   private String shopGoodsNo;
   private String bizNo;
   private String sellerGoodsSign;
   private String spGoodsNo;
   private String isvGoodsNo;
   private int stockNum;
   private int occupyNum;
   private int stockChangeNum;
   private int occupyStockChangeNum;
   private Date createTime;
   private int bizType;
   private String salesPlatformOrderNo;
   private String bipPoid;

   @JsonProperty("sellerNo")
   public void setSellerNo(String sellerNo) {
      this.sellerNo = sellerNo;
   }

   @JsonProperty("sellerNo")
   public String getSellerNo() {
      return this.sellerNo;
   }

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

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("shopGoodsNo")
   public void setShopGoodsNo(String shopGoodsNo) {
      this.shopGoodsNo = shopGoodsNo;
   }

   @JsonProperty("shopGoodsNo")
   public String getShopGoodsNo() {
      return this.shopGoodsNo;
   }

   @JsonProperty("bizNo")
   public void setBizNo(String bizNo) {
      this.bizNo = bizNo;
   }

   @JsonProperty("bizNo")
   public String getBizNo() {
      return this.bizNo;
   }

   @JsonProperty("sellerGoodsSign")
   public void setSellerGoodsSign(String sellerGoodsSign) {
      this.sellerGoodsSign = sellerGoodsSign;
   }

   @JsonProperty("sellerGoodsSign")
   public String getSellerGoodsSign() {
      return this.sellerGoodsSign;
   }

   @JsonProperty("spGoodsNo")
   public void setSpGoodsNo(String spGoodsNo) {
      this.spGoodsNo = spGoodsNo;
   }

   @JsonProperty("spGoodsNo")
   public String getSpGoodsNo() {
      return this.spGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   @JsonProperty("stockNum")
   public void setStockNum(int stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public int getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("occupyNum")
   public void setOccupyNum(int occupyNum) {
      this.occupyNum = occupyNum;
   }

   @JsonProperty("occupyNum")
   public int getOccupyNum() {
      return this.occupyNum;
   }

   @JsonProperty("stockChangeNum")
   public void setStockChangeNum(int stockChangeNum) {
      this.stockChangeNum = stockChangeNum;
   }

   @JsonProperty("stockChangeNum")
   public int getStockChangeNum() {
      return this.stockChangeNum;
   }

   @JsonProperty("occupyStockChangeNum")
   public void setOccupyStockChangeNum(int occupyStockChangeNum) {
      this.occupyStockChangeNum = occupyStockChangeNum;
   }

   @JsonProperty("occupyStockChangeNum")
   public int getOccupyStockChangeNum() {
      return this.occupyStockChangeNum;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("bizType")
   public void setBizType(int bizType) {
      this.bizType = bizType;
   }

   @JsonProperty("bizType")
   public int getBizType() {
      return this.bizType;
   }

   @JsonProperty("salesPlatformOrderNo")
   public void setSalesPlatformOrderNo(String salesPlatformOrderNo) {
      this.salesPlatformOrderNo = salesPlatformOrderNo;
   }

   @JsonProperty("salesPlatformOrderNo")
   public String getSalesPlatformOrderNo() {
      return this.salesPlatformOrderNo;
   }

   @JsonProperty("bipPoid")
   public void setBipPoid(String bipPoid) {
      this.bipPoid = bipPoid;
   }

   @JsonProperty("bipPoid")
   public String getBipPoid() {
      return this.bipPoid;
   }
}
