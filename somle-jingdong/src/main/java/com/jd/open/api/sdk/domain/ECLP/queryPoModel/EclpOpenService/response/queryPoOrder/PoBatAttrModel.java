package com.jd.open.api.sdk.domain.ECLP.queryPoModel.EclpOpenService.response.queryPoOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PoBatAttrModel implements Serializable {
   private String[] goodsNo;
   private String[] batchNo;
   private String[] goodsLevel;
   private Integer[] batchQty;
   private List<BatAttr> batAttrList;
   private String[] orderLineNo;
   private String[] batchCode;
   private String[] isvGoodsNo;
   private String[] diffTypeName;
   private String isvLotattrs;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String[] goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String[] getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("batchNo")
   public void setBatchNo(String[] batchNo) {
      this.batchNo = batchNo;
   }

   @JsonProperty("batchNo")
   public String[] getBatchNo() {
      return this.batchNo;
   }

   @JsonProperty("goodsLevel")
   public void setGoodsLevel(String[] goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   @JsonProperty("goodsLevel")
   public String[] getGoodsLevel() {
      return this.goodsLevel;
   }

   @JsonProperty("batchQty")
   public void setBatchQty(Integer[] batchQty) {
      this.batchQty = batchQty;
   }

   @JsonProperty("batchQty")
   public Integer[] getBatchQty() {
      return this.batchQty;
   }

   @JsonProperty("batAttrList")
   public void setBatAttrList(List<BatAttr> batAttrList) {
      this.batAttrList = batAttrList;
   }

   @JsonProperty("batAttrList")
   public List<BatAttr> getBatAttrList() {
      return this.batAttrList;
   }

   @JsonProperty("orderLineNo")
   public void setOrderLineNo(String[] orderLineNo) {
      this.orderLineNo = orderLineNo;
   }

   @JsonProperty("orderLineNo")
   public String[] getOrderLineNo() {
      return this.orderLineNo;
   }

   @JsonProperty("batchCode")
   public void setBatchCode(String[] batchCode) {
      this.batchCode = batchCode;
   }

   @JsonProperty("batchCode")
   public String[] getBatchCode() {
      return this.batchCode;
   }

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String[] isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String[] getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   @JsonProperty("diffTypeName")
   public void setDiffTypeName(String[] diffTypeName) {
      this.diffTypeName = diffTypeName;
   }

   @JsonProperty("diffTypeName")
   public String[] getDiffTypeName() {
      return this.diffTypeName;
   }

   @JsonProperty("isvLotattrs")
   public void setIsvLotattrs(String isvLotattrs) {
      this.isvLotattrs = isvLotattrs;
   }

   @JsonProperty("isvLotattrs")
   public String getIsvLotattrs() {
      return this.isvLotattrs;
   }
}
