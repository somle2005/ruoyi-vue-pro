package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryGoodsLevelChange;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class QueryLevelChangeItemResult implements Serializable {
   private String goodsNo;
   private String goodsName;
   private Integer qty;
   private String reason1;
   private String reason2;
   private String reason3;
   private String outLevel;
   private String intoLevel;
   private String outLevelName;
   private String intoLevelName;
   private BatchAttrLevel batchInfoMap;
   private String isvGoodsNo;

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

   @JsonProperty("qty")
   public void setQty(Integer qty) {
      this.qty = qty;
   }

   @JsonProperty("qty")
   public Integer getQty() {
      return this.qty;
   }

   @JsonProperty("reason1")
   public void setReason1(String reason1) {
      this.reason1 = reason1;
   }

   @JsonProperty("reason1")
   public String getReason1() {
      return this.reason1;
   }

   @JsonProperty("reason2")
   public void setReason2(String reason2) {
      this.reason2 = reason2;
   }

   @JsonProperty("reason2")
   public String getReason2() {
      return this.reason2;
   }

   @JsonProperty("reason3")
   public void setReason3(String reason3) {
      this.reason3 = reason3;
   }

   @JsonProperty("reason3")
   public String getReason3() {
      return this.reason3;
   }

   @JsonProperty("outLevel")
   public void setOutLevel(String outLevel) {
      this.outLevel = outLevel;
   }

   @JsonProperty("outLevel")
   public String getOutLevel() {
      return this.outLevel;
   }

   @JsonProperty("intoLevel")
   public void setIntoLevel(String intoLevel) {
      this.intoLevel = intoLevel;
   }

   @JsonProperty("intoLevel")
   public String getIntoLevel() {
      return this.intoLevel;
   }

   @JsonProperty("outLevelName")
   public void setOutLevelName(String outLevelName) {
      this.outLevelName = outLevelName;
   }

   @JsonProperty("outLevelName")
   public String getOutLevelName() {
      return this.outLevelName;
   }

   @JsonProperty("intoLevelName")
   public void setIntoLevelName(String intoLevelName) {
      this.intoLevelName = intoLevelName;
   }

   @JsonProperty("intoLevelName")
   public String getIntoLevelName() {
      return this.intoLevelName;
   }

   @JsonProperty("batchInfoMap")
   public void setBatchInfoMap(BatchAttrLevel batchInfoMap) {
      this.batchInfoMap = batchInfoMap;
   }

   @JsonProperty("batchInfoMap")
   public BatchAttrLevel getBatchInfoMap() {
      return this.batchInfoMap;
   }

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }
}
