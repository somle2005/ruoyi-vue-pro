package com.jd.open.api.sdk.domain.wujiemiandan.EclpOpenService.response.queryGoodsByPageAndTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GoodsInfo implements Serializable {
   private String[] goodsNo;
   private String[] sellerGoodsSign;
   private String[] deptNo;
   private String[] isvGoodsNo;
   private String[] spGoodsNo;
   private String[] barcodes;
   private String[] thirdCategoryNo;
   private String[] goodsName;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String[] goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String[] getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("sellerGoodsSign")
   public void setSellerGoodsSign(String[] sellerGoodsSign) {
      this.sellerGoodsSign = sellerGoodsSign;
   }

   @JsonProperty("sellerGoodsSign")
   public String[] getSellerGoodsSign() {
      return this.sellerGoodsSign;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String[] deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String[] getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String[] isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String[] getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   @JsonProperty("spGoodsNo")
   public void setSpGoodsNo(String[] spGoodsNo) {
      this.spGoodsNo = spGoodsNo;
   }

   @JsonProperty("spGoodsNo")
   public String[] getSpGoodsNo() {
      return this.spGoodsNo;
   }

   @JsonProperty("barcodes")
   public void setBarcodes(String[] barcodes) {
      this.barcodes = barcodes;
   }

   @JsonProperty("barcodes")
   public String[] getBarcodes() {
      return this.barcodes;
   }

   @JsonProperty("thirdCategoryNo")
   public void setThirdCategoryNo(String[] thirdCategoryNo) {
      this.thirdCategoryNo = thirdCategoryNo;
   }

   @JsonProperty("thirdCategoryNo")
   public String[] getThirdCategoryNo() {
      return this.thirdCategoryNo;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String[] goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String[] getGoodsName() {
      return this.goodsName;
   }
}
