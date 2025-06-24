package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryAdventGoodsStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AdventGoodsStockDetail implements Serializable {
   private String[] goodsNo;
   private String[] goodsName;
   private String[] stockStatus;
   private int[] num;
   private String[] ext1;
   private String[] ext2;
   private String[] ext3;
   private String[] ext4;
   private String[] ext5;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String[] goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String[] getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String[] goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String[] getGoodsName() {
      return this.goodsName;
   }

   @JsonProperty("stockStatus")
   public void setStockStatus(String[] stockStatus) {
      this.stockStatus = stockStatus;
   }

   @JsonProperty("stockStatus")
   public String[] getStockStatus() {
      return this.stockStatus;
   }

   @JsonProperty("num")
   public void setNum(int[] num) {
      this.num = num;
   }

   @JsonProperty("num")
   public int[] getNum() {
      return this.num;
   }

   @JsonProperty("ext1")
   public void setExt1(String[] ext1) {
      this.ext1 = ext1;
   }

   @JsonProperty("ext1")
   public String[] getExt1() {
      return this.ext1;
   }

   @JsonProperty("ext2")
   public void setExt2(String[] ext2) {
      this.ext2 = ext2;
   }

   @JsonProperty("ext2")
   public String[] getExt2() {
      return this.ext2;
   }

   @JsonProperty("ext3")
   public void setExt3(String[] ext3) {
      this.ext3 = ext3;
   }

   @JsonProperty("ext3")
   public String[] getExt3() {
      return this.ext3;
   }

   @JsonProperty("ext4")
   public void setExt4(String[] ext4) {
      this.ext4 = ext4;
   }

   @JsonProperty("ext4")
   public String[] getExt4() {
      return this.ext4;
   }

   @JsonProperty("ext5")
   public void setExt5(String[] ext5) {
      this.ext5 = ext5;
   }

   @JsonProperty("ext5")
   public String[] getExt5() {
      return this.ext5;
   }
}
