package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BatchDetailResult implements Serializable {
   private Integer batchQty;
   private String goodsNo;
   private String isvGoodsNo;
   private String orderLine;
   private List<BatAttr> batAttrList;

   @JsonProperty("batchQty")
   public void setBatchQty(Integer batchQty) {
      this.batchQty = batchQty;
   }

   @JsonProperty("batchQty")
   public Integer getBatchQty() {
      return this.batchQty;
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

   @JsonProperty("orderLine")
   public void setOrderLine(String orderLine) {
      this.orderLine = orderLine;
   }

   @JsonProperty("orderLine")
   public String getOrderLine() {
      return this.orderLine;
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
