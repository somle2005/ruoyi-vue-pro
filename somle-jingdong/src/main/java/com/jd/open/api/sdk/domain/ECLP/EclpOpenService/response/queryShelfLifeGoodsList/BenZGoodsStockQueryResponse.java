package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryShelfLifeGoodsList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BenZGoodsStockQueryResponse implements Serializable {
   private String deptNo;
   private String deptName;
   private String warehouseNo;
   private String warehouseName;
   private String goodsNo;
   private String isvGoodsNo;
   private String eclpGoodsName;
   private String goodsLevel;
   private Integer stockNum;
   private Integer usableNum;
   private String shelfLifeDays;
   private String productionDate;
   private String expirationDate;
   private String locDate;
   private String remainDays;
   private String remainDaysRate;
   private String status;
   private String createTime;

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("deptName")
   public void setDeptName(String deptName) {
      this.deptName = deptName;
   }

   @JsonProperty("deptName")
   public String getDeptName() {
      return this.deptName;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("warehouseName")
   public void setWarehouseName(String warehouseName) {
      this.warehouseName = warehouseName;
   }

   @JsonProperty("warehouseName")
   public String getWarehouseName() {
      return this.warehouseName;
   }

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   @JsonProperty("eclpGoodsName")
   public void setEclpGoodsName(String eclpGoodsName) {
      this.eclpGoodsName = eclpGoodsName;
   }

   @JsonProperty("eclpGoodsName")
   public String getEclpGoodsName() {
      return this.eclpGoodsName;
   }

   @JsonProperty("goodsLevel")
   public void setGoodsLevel(String goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   @JsonProperty("goodsLevel")
   public String getGoodsLevel() {
      return this.goodsLevel;
   }

   @JsonProperty("stockNum")
   public void setStockNum(Integer stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Integer getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("usableNum")
   public void setUsableNum(Integer usableNum) {
      this.usableNum = usableNum;
   }

   @JsonProperty("usableNum")
   public Integer getUsableNum() {
      return this.usableNum;
   }

   @JsonProperty("shelfLifeDays")
   public void setShelfLifeDays(String shelfLifeDays) {
      this.shelfLifeDays = shelfLifeDays;
   }

   @JsonProperty("shelfLifeDays")
   public String getShelfLifeDays() {
      return this.shelfLifeDays;
   }

   @JsonProperty("productionDate")
   public void setProductionDate(String productionDate) {
      this.productionDate = productionDate;
   }

   @JsonProperty("productionDate")
   public String getProductionDate() {
      return this.productionDate;
   }

   @JsonProperty("expirationDate")
   public void setExpirationDate(String expirationDate) {
      this.expirationDate = expirationDate;
   }

   @JsonProperty("expirationDate")
   public String getExpirationDate() {
      return this.expirationDate;
   }

   @JsonProperty("locDate")
   public void setLocDate(String locDate) {
      this.locDate = locDate;
   }

   @JsonProperty("locDate")
   public String getLocDate() {
      return this.locDate;
   }

   @JsonProperty("remainDays")
   public void setRemainDays(String remainDays) {
      this.remainDays = remainDays;
   }

   @JsonProperty("remainDays")
   public String getRemainDays() {
      return this.remainDays;
   }

   @JsonProperty("remainDaysRate")
   public void setRemainDaysRate(String remainDaysRate) {
      this.remainDaysRate = remainDaysRate;
   }

   @JsonProperty("remainDaysRate")
   public String getRemainDaysRate() {
      return this.remainDaysRate;
   }

   @JsonProperty("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String getStatus() {
      return this.status;
   }

   @JsonProperty("createTime")
   public void setCreateTime(String createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public String getCreateTime() {
      return this.createTime;
   }
}
