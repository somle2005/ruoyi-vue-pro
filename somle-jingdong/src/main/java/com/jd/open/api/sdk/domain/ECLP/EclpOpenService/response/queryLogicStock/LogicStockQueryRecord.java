package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryLogicStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class LogicStockQueryRecord implements Serializable {
   private String deptNo;
   private String warehouseNo;
   private String warehouseName;
   private String goodsNo;
   private String goodsName;
   private String isvGoodsNo;
   private String goodsLevel;
   private Integer realNum;
   private Integer usableNum;
   private String stockType;
   private String factor1Code;
   private String factor1Name;
   private String factor2Code;
   private String factor2Name;
   private String factor3Code;
   private String factor3Name;
   private String factor4Code;
   private String factor4Name;

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

   @JsonProperty("goodsName")
   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String getGoodsName() {
      return this.goodsName;
   }

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   @JsonProperty("goodsLevel")
   public void setGoodsLevel(String goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   @JsonProperty("goodsLevel")
   public String getGoodsLevel() {
      return this.goodsLevel;
   }

   @JsonProperty("realNum")
   public void setRealNum(Integer realNum) {
      this.realNum = realNum;
   }

   @JsonProperty("realNum")
   public Integer getRealNum() {
      return this.realNum;
   }

   @JsonProperty("usableNum")
   public void setUsableNum(Integer usableNum) {
      this.usableNum = usableNum;
   }

   @JsonProperty("usableNum")
   public Integer getUsableNum() {
      return this.usableNum;
   }

   @JsonProperty("stockType")
   public void setStockType(String stockType) {
      this.stockType = stockType;
   }

   @JsonProperty("stockType")
   public String getStockType() {
      return this.stockType;
   }

   @JsonProperty("factor1Code")
   public void setFactor1Code(String factor1Code) {
      this.factor1Code = factor1Code;
   }

   @JsonProperty("factor1Code")
   public String getFactor1Code() {
      return this.factor1Code;
   }

   @JsonProperty("factor1Name")
   public void setFactor1Name(String factor1Name) {
      this.factor1Name = factor1Name;
   }

   @JsonProperty("factor1Name")
   public String getFactor1Name() {
      return this.factor1Name;
   }

   @JsonProperty("factor2Code")
   public void setFactor2Code(String factor2Code) {
      this.factor2Code = factor2Code;
   }

   @JsonProperty("factor2Code")
   public String getFactor2Code() {
      return this.factor2Code;
   }

   @JsonProperty("factor2Name")
   public void setFactor2Name(String factor2Name) {
      this.factor2Name = factor2Name;
   }

   @JsonProperty("factor2Name")
   public String getFactor2Name() {
      return this.factor2Name;
   }

   @JsonProperty("factor3Code")
   public void setFactor3Code(String factor3Code) {
      this.factor3Code = factor3Code;
   }

   @JsonProperty("factor3Code")
   public String getFactor3Code() {
      return this.factor3Code;
   }

   @JsonProperty("factor3Name")
   public void setFactor3Name(String factor3Name) {
      this.factor3Name = factor3Name;
   }

   @JsonProperty("factor3Name")
   public String getFactor3Name() {
      return this.factor3Name;
   }

   @JsonProperty("factor4Code")
   public void setFactor4Code(String factor4Code) {
      this.factor4Code = factor4Code;
   }

   @JsonProperty("factor4Code")
   public String getFactor4Code() {
      return this.factor4Code;
   }

   @JsonProperty("factor4Name")
   public void setFactor4Name(String factor4Name) {
      this.factor4Name = factor4Name;
   }

   @JsonProperty("factor4Name")
   public String getFactor4Name() {
      return this.factor4Name;
   }
}
