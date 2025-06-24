package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryCheckStockProfit;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class IsvCheckStockDetail implements Serializable {
   private String[] goodsNo;
   private String[] goodsName;
   private String[] diffQty;
   private String[] oneLevelReason;
   private String[] twoLevelReason;
   private String[] threeLevelReason;
   private String[] productLevel;
   private String[] isvLotattrs;
   private BatchAttrProfit batchInfoMap;

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

   @JsonProperty("diffQty")
   public void setDiffQty(String[] diffQty) {
      this.diffQty = diffQty;
   }

   @JsonProperty("diffQty")
   public String[] getDiffQty() {
      return this.diffQty;
   }

   @JsonProperty("oneLevelReason")
   public void setOneLevelReason(String[] oneLevelReason) {
      this.oneLevelReason = oneLevelReason;
   }

   @JsonProperty("oneLevelReason")
   public String[] getOneLevelReason() {
      return this.oneLevelReason;
   }

   @JsonProperty("twoLevelReason")
   public void setTwoLevelReason(String[] twoLevelReason) {
      this.twoLevelReason = twoLevelReason;
   }

   @JsonProperty("twoLevelReason")
   public String[] getTwoLevelReason() {
      return this.twoLevelReason;
   }

   @JsonProperty("threeLevelReason")
   public void setThreeLevelReason(String[] threeLevelReason) {
      this.threeLevelReason = threeLevelReason;
   }

   @JsonProperty("threeLevelReason")
   public String[] getThreeLevelReason() {
      return this.threeLevelReason;
   }

   @JsonProperty("productLevel")
   public void setProductLevel(String[] productLevel) {
      this.productLevel = productLevel;
   }

   @JsonProperty("productLevel")
   public String[] getProductLevel() {
      return this.productLevel;
   }

   @JsonProperty("isvLotattrs")
   public void setIsvLotattrs(String[] isvLotattrs) {
      this.isvLotattrs = isvLotattrs;
   }

   @JsonProperty("isvLotattrs")
   public String[] getIsvLotattrs() {
      return this.isvLotattrs;
   }

   @JsonProperty("batchInfoMap")
   public void setBatchInfoMap(BatchAttrProfit batchInfoMap) {
      this.batchInfoMap = batchInfoMap;
   }

   @JsonProperty("batchInfoMap")
   public BatchAttrProfit getBatchInfoMap() {
      return this.batchInfoMap;
   }
}
