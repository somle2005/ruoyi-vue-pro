package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderRejectDetail implements Serializable {
   private String backingWayBill;
   private String goodsNo;
   private String goodsName;
   private Integer rejectQty;
   private String lot;

   @JsonProperty("backingWayBill")
   public void setBackingWayBill(String backingWayBill) {
      this.backingWayBill = backingWayBill;
   }

   @JsonProperty("backingWayBill")
   public String getBackingWayBill() {
      return this.backingWayBill;
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

   @JsonProperty("rejectQty")
   public void setRejectQty(Integer rejectQty) {
      this.rejectQty = rejectQty;
   }

   @JsonProperty("rejectQty")
   public Integer getRejectQty() {
      return this.rejectQty;
   }

   @JsonProperty("lot")
   public void setLot(String lot) {
      this.lot = lot;
   }

   @JsonProperty("lot")
   public String getLot() {
      return this.lot;
   }
}
