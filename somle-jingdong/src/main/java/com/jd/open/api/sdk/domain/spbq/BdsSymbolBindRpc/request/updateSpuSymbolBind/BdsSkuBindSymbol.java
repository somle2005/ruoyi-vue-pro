package com.jd.open.api.sdk.domain.spbq.BdsSymbolBindRpc.request.updateSpuSymbolBind;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BdsSkuBindSymbol implements Serializable {
   private String relationId;
   private String skuId;
   private String spuId;
   private Long isSku;
   private Integer itemFirstCateCd;
   private Integer itemSecondCateCd;
   private Integer itemThirdCateCd;
   private List<BdsSymbol> symbolList;
   private String itemFourthCateCd;

   @JsonProperty("relationId")
   public void setRelationId(String relationId) {
      this.relationId = relationId;
   }

   @JsonProperty("relationId")
   public String getRelationId() {
      return this.relationId;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("spuId")
   public void setSpuId(String spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public String getSpuId() {
      return this.spuId;
   }

   @JsonProperty("isSku")
   public void setIsSku(Long isSku) {
      this.isSku = isSku;
   }

   @JsonProperty("isSku")
   public Long getIsSku() {
      return this.isSku;
   }

   @JsonProperty("itemFirstCateCd")
   public void setItemFirstCateCd(Integer itemFirstCateCd) {
      this.itemFirstCateCd = itemFirstCateCd;
   }

   @JsonProperty("itemFirstCateCd")
   public Integer getItemFirstCateCd() {
      return this.itemFirstCateCd;
   }

   @JsonProperty("itemSecondCateCd")
   public void setItemSecondCateCd(Integer itemSecondCateCd) {
      this.itemSecondCateCd = itemSecondCateCd;
   }

   @JsonProperty("itemSecondCateCd")
   public Integer getItemSecondCateCd() {
      return this.itemSecondCateCd;
   }

   @JsonProperty("itemThirdCateCd")
   public void setItemThirdCateCd(Integer itemThirdCateCd) {
      this.itemThirdCateCd = itemThirdCateCd;
   }

   @JsonProperty("itemThirdCateCd")
   public Integer getItemThirdCateCd() {
      return this.itemThirdCateCd;
   }

   @JsonProperty("symbolList")
   public void setSymbolList(List<BdsSymbol> symbolList) {
      this.symbolList = symbolList;
   }

   @JsonProperty("symbolList")
   public List<BdsSymbol> getSymbolList() {
      return this.symbolList;
   }

   @JsonProperty("itemFourthCateCd")
   public void setItemFourthCateCd(String itemFourthCateCd) {
      this.itemFourthCateCd = itemFourthCateCd;
   }

   @JsonProperty("itemFourthCateCd")
   public String getItemFourthCateCd() {
      return this.itemFourthCateCd;
   }
}
