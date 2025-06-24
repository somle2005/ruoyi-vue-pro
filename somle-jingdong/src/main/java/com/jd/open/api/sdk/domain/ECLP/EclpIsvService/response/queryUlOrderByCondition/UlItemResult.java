package com.jd.open.api.sdk.domain.ECLP.EclpIsvService.response.queryUlOrderByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class UlItemResult implements Serializable {
   private String orderLine;
   private String sellerGoodsNo;
   private String goodsNo;
   private String goodsName;
   private String goodsLevel;
   private Integer planQty;
   private List<UlItemBatchResult> ulItemBatchResultList;

   @JsonProperty("orderLine")
   public void setOrderLine(String orderLine) {
      this.orderLine = orderLine;
   }

   @JsonProperty("orderLine")
   public String getOrderLine() {
      return this.orderLine;
   }

   @JsonProperty("sellerGoodsNo")
   public void setSellerGoodsNo(String sellerGoodsNo) {
      this.sellerGoodsNo = sellerGoodsNo;
   }

   @JsonProperty("sellerGoodsNo")
   public String getSellerGoodsNo() {
      return this.sellerGoodsNo;
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

   @JsonProperty("goodsLevel")
   public void setGoodsLevel(String goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   @JsonProperty("goodsLevel")
   public String getGoodsLevel() {
      return this.goodsLevel;
   }

   @JsonProperty("planQty")
   public void setPlanQty(Integer planQty) {
      this.planQty = planQty;
   }

   @JsonProperty("planQty")
   public Integer getPlanQty() {
      return this.planQty;
   }

   @JsonProperty("ulItemBatchResultList")
   public void setUlItemBatchResultList(List<UlItemBatchResult> ulItemBatchResultList) {
      this.ulItemBatchResultList = ulItemBatchResultList;
   }

   @JsonProperty("ulItemBatchResultList")
   public List<UlItemBatchResult> getUlItemBatchResultList() {
      return this.ulItemBatchResultList;
   }
}
