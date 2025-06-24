package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ReceivingTask implements Serializable {
   private String goodsNo;
   private String goodsStatus;
   private int qty;
   private int expectedQty;
   private String differenceRemark;

   @JsonProperty("goods_no")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goods_no")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("goods_status")
   public void setGoodsStatus(String goodsStatus) {
      this.goodsStatus = goodsStatus;
   }

   @JsonProperty("goods_status")
   public String getGoodsStatus() {
      return this.goodsStatus;
   }

   @JsonProperty("qty")
   public void setQty(int qty) {
      this.qty = qty;
   }

   @JsonProperty("qty")
   public int getQty() {
      return this.qty;
   }

   @JsonProperty("expected_qty")
   public void setExpectedQty(int expectedQty) {
      this.expectedQty = expectedQty;
   }

   @JsonProperty("expected_qty")
   public int getExpectedQty() {
      return this.expectedQty;
   }

   @JsonProperty("difference_remark")
   public void setDifferenceRemark(String differenceRemark) {
      this.differenceRemark = differenceRemark;
   }

   @JsonProperty("difference_remark")
   public String getDifferenceRemark() {
      return this.differenceRemark;
   }
}
