package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryRtw;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RtwBatAttrModel implements Serializable {
   private String[] deptGoodsNo;
   private String[] sellerGoodsNo;
   private String[] batchNo;
   private String[] goodsLevel;
   private Integer[] batchQty;
   private String[] isvSoNo;
   private String[] eclpSoNo;
   private String[] batchOrderLine;
   private List<BatAttr> batAttrList;

   @JsonProperty("deptGoodsNo")
   public void setDeptGoodsNo(String[] deptGoodsNo) {
      this.deptGoodsNo = deptGoodsNo;
   }

   @JsonProperty("deptGoodsNo")
   public String[] getDeptGoodsNo() {
      return this.deptGoodsNo;
   }

   @JsonProperty("sellerGoodsNo")
   public void setSellerGoodsNo(String[] sellerGoodsNo) {
      this.sellerGoodsNo = sellerGoodsNo;
   }

   @JsonProperty("sellerGoodsNo")
   public String[] getSellerGoodsNo() {
      return this.sellerGoodsNo;
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

   @JsonProperty("isvSoNo")
   public void setIsvSoNo(String[] isvSoNo) {
      this.isvSoNo = isvSoNo;
   }

   @JsonProperty("isvSoNo")
   public String[] getIsvSoNo() {
      return this.isvSoNo;
   }

   @JsonProperty("eclpSoNo")
   public void setEclpSoNo(String[] eclpSoNo) {
      this.eclpSoNo = eclpSoNo;
   }

   @JsonProperty("eclpSoNo")
   public String[] getEclpSoNo() {
      return this.eclpSoNo;
   }

   @JsonProperty("batchOrderLine")
   public void setBatchOrderLine(String[] batchOrderLine) {
      this.batchOrderLine = batchOrderLine;
   }

   @JsonProperty("batchOrderLine")
   public String[] getBatchOrderLine() {
      return this.batchOrderLine;
   }

   @JsonProperty("batAttrList")
   public void setBatAttrList(List<BatAttr> batAttrList) {
      this.batAttrList = batAttrList;
   }

   @JsonProperty("batAttrList")
   public List<BatAttr> getBatAttrList() {
      return this.batAttrList;
   }
}
