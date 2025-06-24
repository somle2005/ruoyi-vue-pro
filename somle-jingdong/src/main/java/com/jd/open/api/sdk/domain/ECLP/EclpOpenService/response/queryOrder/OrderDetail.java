package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderDetail implements Serializable {
   private String goodsNo;
   private Double price;
   private Integer quantity;
   private String[] batAttrs;
   private String isvLotattrs;
   private String packBatchNo;
   private String poNo;
   private String productionDate;
   private String expirationDate;
   private String lot;
   private List<OrderAddServParam> orderAddServParamList;
   private Integer[] realOutQty;
   private String[] isvGoodsNo;
   private String orderLine;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("price")
   public void setPrice(Double price) {
      this.price = price;
   }

   @JsonProperty("price")
   public Double getPrice() {
      return this.price;
   }

   @JsonProperty("quantity")
   public void setQuantity(Integer quantity) {
      this.quantity = quantity;
   }

   @JsonProperty("quantity")
   public Integer getQuantity() {
      return this.quantity;
   }

   @JsonProperty("batAttrs")
   public void setBatAttrs(String[] batAttrs) {
      this.batAttrs = batAttrs;
   }

   @JsonProperty("batAttrs")
   public String[] getBatAttrs() {
      return this.batAttrs;
   }

   @JsonProperty("isvLotattrs")
   public void setIsvLotattrs(String isvLotattrs) {
      this.isvLotattrs = isvLotattrs;
   }

   @JsonProperty("isvLotattrs")
   public String getIsvLotattrs() {
      return this.isvLotattrs;
   }

   @JsonProperty("packBatchNo")
   public void setPackBatchNo(String packBatchNo) {
      this.packBatchNo = packBatchNo;
   }

   @JsonProperty("packBatchNo")
   public String getPackBatchNo() {
      return this.packBatchNo;
   }

   @JsonProperty("poNo")
   public void setPoNo(String poNo) {
      this.poNo = poNo;
   }

   @JsonProperty("poNo")
   public String getPoNo() {
      return this.poNo;
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

   @JsonProperty("lot")
   public void setLot(String lot) {
      this.lot = lot;
   }

   @JsonProperty("lot")
   public String getLot() {
      return this.lot;
   }

   @JsonProperty("orderAddServParamList")
   public void setOrderAddServParamList(List<OrderAddServParam> orderAddServParamList) {
      this.orderAddServParamList = orderAddServParamList;
   }

   @JsonProperty("orderAddServParamList")
   public List<OrderAddServParam> getOrderAddServParamList() {
      return this.orderAddServParamList;
   }

   @JsonProperty("realOutQty")
   public void setRealOutQty(Integer[] realOutQty) {
      this.realOutQty = realOutQty;
   }

   @JsonProperty("realOutQty")
   public Integer[] getRealOutQty() {
      return this.realOutQty;
   }

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String[] isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String[] getIsvGoodsNo() {
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
}
