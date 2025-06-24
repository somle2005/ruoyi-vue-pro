package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderDetail implements Serializable {
   private String goodsNo;
   private Double price;
   private Integer quantity;
   private String shopGoodsNo;
   private String isvGoodsNo;
   private String packBatchNo;
   private String poNo;
   private String productionDate;
   private String expirationDate;

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

   @JsonProperty("shopGoodsNo")
   public void setShopGoodsNo(String shopGoodsNo) {
      this.shopGoodsNo = shopGoodsNo;
   }

   @JsonProperty("shopGoodsNo")
   public String getShopGoodsNo() {
      return this.shopGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
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
}
