package com.jd.open.api.sdk.domain.ware.StockReadService.response.findSkuStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuStock implements Serializable {
   private String detailStock;
   private Long skuId;
   private Long stockNum;
   private Long storeId;

   @JsonProperty("detailStock")
   public void setDetailStock(String detailStock) {
      this.detailStock = detailStock;
   }

   @JsonProperty("detailStock")
   public String getDetailStock() {
      return this.detailStock;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("stockNum")
   public void setStockNum(Long stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Long getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("storeId")
   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Long getStoreId() {
      return this.storeId;
   }
}
