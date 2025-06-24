package com.jd.open.api.sdk.domain.spbq.BdsSymbolBindRpc.request.createSpuSymbolBind;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BdsSkuBindSymbol implements Serializable {
   private String skuId;
   private String spuId;
   private Integer isSku;
   private Integer itemFirstCateCd;
   private Integer itemSecondCateCd;
   private Integer itemThirdCateCd;
   private Integer itemFourthCateCd;
   private List<BdsSymbol> symbolList;

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
   public void setIsSku(Integer isSku) {
      this.isSku = isSku;
   }

   @JsonProperty("isSku")
   public Integer getIsSku() {
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

   @JsonProperty("itemFourthCateCd")
   public void setItemFourthCateCd(Integer itemFourthCateCd) {
      this.itemFourthCateCd = itemFourthCateCd;
   }

   @JsonProperty("itemFourthCateCd")
   public Integer getItemFourthCateCd() {
      return this.itemFourthCateCd;
   }

   @JsonProperty("symbolList")
   public void setSymbolList(List<BdsSymbol> symbolList) {
      this.symbolList = symbolList;
   }

   @JsonProperty("symbolList")
   public List<BdsSymbol> getSymbolList() {
      return this.symbolList;
   }
}
