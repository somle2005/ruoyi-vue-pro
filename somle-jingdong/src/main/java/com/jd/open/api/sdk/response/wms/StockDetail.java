package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StockDetail implements Serializable {
   private String goodsNo;
   private String warehouseNo;
   private int stockQty;
   private int availableQty;
   private int preemptionQty;
   private String goodsStatus;

   @JsonProperty("goods_no")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goods_no")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("warehouse_no")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouse_no")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("stock_qty")
   public void setStockQty(int stockQty) {
      this.stockQty = stockQty;
   }

   @JsonProperty("stock_qty")
   public int getStockQty() {
      return this.stockQty;
   }

   @JsonProperty("available_qty")
   public void setAvailableQty(int availableQty) {
      this.availableQty = availableQty;
   }

   @JsonProperty("available_qty")
   public int getAvailableQty() {
      return this.availableQty;
   }

   @JsonProperty("preemption_qty")
   public void setPreemptionQty(int preemptionQty) {
      this.preemptionQty = preemptionQty;
   }

   @JsonProperty("preemption_qty")
   public int getPreemptionQty() {
      return this.preemptionQty;
   }

   @JsonProperty("goods_status")
   public void setGoodsStatus(String goodsStatus) {
      this.goodsStatus = goodsStatus;
   }

   @JsonProperty("goods_status")
   public String getGoodsStatus() {
      return this.goodsStatus;
   }
}
