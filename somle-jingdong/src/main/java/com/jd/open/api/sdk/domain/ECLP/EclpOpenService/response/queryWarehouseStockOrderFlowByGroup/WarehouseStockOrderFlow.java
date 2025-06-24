package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryWarehouseStockOrderFlowByGroup;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WarehouseStockOrderFlow implements Serializable {
   private String goodsNo;
   private String goodsLevel;
   private int qty;
   private int orderType;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("goodsLevel")
   public void setGoodsLevel(String goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   @JsonProperty("goodsLevel")
   public String getGoodsLevel() {
      return this.goodsLevel;
   }

   @JsonProperty("qty")
   public void setQty(int qty) {
      this.qty = qty;
   }

   @JsonProperty("qty")
   public int getQty() {
      return this.qty;
   }

   @JsonProperty("orderType")
   public void setOrderType(int orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public int getOrderType() {
      return this.orderType;
   }
}
