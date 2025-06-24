package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryTransOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class TransMainExtItem implements Serializable {
   private String goodsNo;
   private String goodsFunction;
   private String goodsLooking;
   private String attachment;
   private Integer totalNum;
   private String goodsLevel;
   private String goodsPackage;
   private String isvGoodsNo;
   private String goodsName;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("goodsFunction")
   public void setGoodsFunction(String goodsFunction) {
      this.goodsFunction = goodsFunction;
   }

   @JsonProperty("goodsFunction")
   public String getGoodsFunction() {
      return this.goodsFunction;
   }

   @JsonProperty("goodsLooking")
   public void setGoodsLooking(String goodsLooking) {
      this.goodsLooking = goodsLooking;
   }

   @JsonProperty("goodsLooking")
   public String getGoodsLooking() {
      return this.goodsLooking;
   }

   @JsonProperty("attachment")
   public void setAttachment(String attachment) {
      this.attachment = attachment;
   }

   @JsonProperty("attachment")
   public String getAttachment() {
      return this.attachment;
   }

   @JsonProperty("totalNum")
   public void setTotalNum(Integer totalNum) {
      this.totalNum = totalNum;
   }

   @JsonProperty("totalNum")
   public Integer getTotalNum() {
      return this.totalNum;
   }

   @JsonProperty("goodsLevel")
   public void setGoodsLevel(String goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   @JsonProperty("goodsLevel")
   public String getGoodsLevel() {
      return this.goodsLevel;
   }

   @JsonProperty("goodsPackage")
   public void setGoodsPackage(String goodsPackage) {
      this.goodsPackage = goodsPackage;
   }

   @JsonProperty("goodsPackage")
   public String getGoodsPackage() {
      return this.goodsPackage;
   }

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String getGoodsName() {
      return this.goodsName;
   }
}
