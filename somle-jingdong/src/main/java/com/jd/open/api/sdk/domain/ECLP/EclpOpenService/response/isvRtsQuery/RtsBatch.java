package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.isvRtsQuery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RtsBatch implements Serializable {
   private String deptGoodsNo;
   private String goodsLevel;
   private String quantity;
   private String realQuantity;
   private String batchNo;
   private List<BatAttr> batAttrList;
   private String orderLine;
   private String isvGoodsNo;

   @JsonProperty("deptGoodsNo")
   public void setDeptGoodsNo(String deptGoodsNo) {
      this.deptGoodsNo = deptGoodsNo;
   }

   @JsonProperty("deptGoodsNo")
   public String getDeptGoodsNo() {
      return this.deptGoodsNo;
   }

   @JsonProperty("goodsLevel")
   public void setGoodsLevel(String goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   @JsonProperty("goodsLevel")
   public String getGoodsLevel() {
      return this.goodsLevel;
   }

   @JsonProperty("quantity")
   public void setQuantity(String quantity) {
      this.quantity = quantity;
   }

   @JsonProperty("quantity")
   public String getQuantity() {
      return this.quantity;
   }

   @JsonProperty("realQuantity")
   public void setRealQuantity(String realQuantity) {
      this.realQuantity = realQuantity;
   }

   @JsonProperty("realQuantity")
   public String getRealQuantity() {
      return this.realQuantity;
   }

   @JsonProperty("batchNo")
   public void setBatchNo(String batchNo) {
      this.batchNo = batchNo;
   }

   @JsonProperty("batchNo")
   public String getBatchNo() {
      return this.batchNo;
   }

   @JsonProperty("batAttrList")
   public void setBatAttrList(List<BatAttr> batAttrList) {
      this.batAttrList = batAttrList;
   }

   @JsonProperty("batAttrList")
   public List<BatAttr> getBatAttrList() {
      return this.batAttrList;
   }

   @JsonProperty("orderLine")
   public void setOrderLine(String orderLine) {
      this.orderLine = orderLine;
   }

   @JsonProperty("orderLine")
   public String getOrderLine() {
      return this.orderLine;
   }

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }
}
