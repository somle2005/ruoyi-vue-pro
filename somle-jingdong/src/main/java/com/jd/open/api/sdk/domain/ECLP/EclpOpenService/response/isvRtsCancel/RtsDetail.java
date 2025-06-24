package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.isvRtsCancel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RtsDetail implements Serializable {
   private String deptGoodsNo;
   private String goodsName;
   private String quantity;
   private String realQuantity;
   private String goodsStatus;

   @JsonProperty("deptGoodsNo")
   public void setDeptGoodsNo(String deptGoodsNo) {
      this.deptGoodsNo = deptGoodsNo;
   }

   @JsonProperty("deptGoodsNo")
   public String getDeptGoodsNo() {
      return this.deptGoodsNo;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String getGoodsName() {
      return this.goodsName;
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

   @JsonProperty("goodsStatus")
   public void setGoodsStatus(String goodsStatus) {
      this.goodsStatus = goodsStatus;
   }

   @JsonProperty("goodsStatus")
   public String getGoodsStatus() {
      return this.goodsStatus;
   }
}
