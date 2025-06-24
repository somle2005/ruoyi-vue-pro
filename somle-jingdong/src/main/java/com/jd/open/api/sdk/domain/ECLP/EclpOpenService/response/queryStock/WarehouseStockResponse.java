package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WarehouseStockResponse implements Serializable {
   private String[] deptNo;
   private String[] deptName;
   private String[] warehouseNo;
   private String[] warehouseName;
   private String[] goodsNo;
   private String[] goodsName;
   private String[] sellerGoodsSign;
   private String[] stockStatus;
   private String[] stockType;
   private int[] totalNum;
   private int[] usableNum;
   private String[] isvLotattrs;
   private Long[] recordCount;
   private String goodsLevel;
   private String isvSku;

   @JsonProperty("deptNo")
   public void setDeptNo(String[] deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String[] getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("deptName")
   public void setDeptName(String[] deptName) {
      this.deptName = deptName;
   }

   @JsonProperty("deptName")
   public String[] getDeptName() {
      return this.deptName;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String[] warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String[] getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("warehouseName")
   public void setWarehouseName(String[] warehouseName) {
      this.warehouseName = warehouseName;
   }

   @JsonProperty("warehouseName")
   public String[] getWarehouseName() {
      return this.warehouseName;
   }

   @JsonProperty("goodsNo")
   public void setGoodsNo(String[] goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String[] getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String[] goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String[] getGoodsName() {
      return this.goodsName;
   }

   @JsonProperty("sellerGoodsSign")
   public void setSellerGoodsSign(String[] sellerGoodsSign) {
      this.sellerGoodsSign = sellerGoodsSign;
   }

   @JsonProperty("sellerGoodsSign")
   public String[] getSellerGoodsSign() {
      return this.sellerGoodsSign;
   }

   @JsonProperty("stockStatus")
   public void setStockStatus(String[] stockStatus) {
      this.stockStatus = stockStatus;
   }

   @JsonProperty("stockStatus")
   public String[] getStockStatus() {
      return this.stockStatus;
   }

   @JsonProperty("stockType")
   public void setStockType(String[] stockType) {
      this.stockType = stockType;
   }

   @JsonProperty("stockType")
   public String[] getStockType() {
      return this.stockType;
   }

   @JsonProperty("totalNum")
   public void setTotalNum(int[] totalNum) {
      this.totalNum = totalNum;
   }

   @JsonProperty("totalNum")
   public int[] getTotalNum() {
      return this.totalNum;
   }

   @JsonProperty("usableNum")
   public void setUsableNum(int[] usableNum) {
      this.usableNum = usableNum;
   }

   @JsonProperty("usableNum")
   public int[] getUsableNum() {
      return this.usableNum;
   }

   @JsonProperty("isvLotattrs")
   public void setIsvLotattrs(String[] isvLotattrs) {
      this.isvLotattrs = isvLotattrs;
   }

   @JsonProperty("isvLotattrs")
   public String[] getIsvLotattrs() {
      return this.isvLotattrs;
   }

   @JsonProperty("recordCount")
   public void setRecordCount(Long[] recordCount) {
      this.recordCount = recordCount;
   }

   @JsonProperty("recordCount")
   public Long[] getRecordCount() {
      return this.recordCount;
   }

   @JsonProperty("goodsLevel")
   public void setGoodsLevel(String goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   @JsonProperty("goodsLevel")
   public String getGoodsLevel() {
      return this.goodsLevel;
   }

   @JsonProperty("isvSku")
   public void setIsvSku(String isvSku) {
      this.isvSku = isvSku;
   }

   @JsonProperty("isvSku")
   public String getIsvSku() {
      return this.isvSku;
   }
}
