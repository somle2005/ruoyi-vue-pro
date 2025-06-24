package com.jd.open.api.sdk.domain.ware.StockWriteService.response.increaseSkuStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuStockWriteResult implements Serializable {
   private Long skuId;
   private StockRf stockRf;
   private String detailCode;
   private String detailMsg;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("stockRf")
   public void setStockRf(StockRf stockRf) {
      this.stockRf = stockRf;
   }

   @JsonProperty("stockRf")
   public StockRf getStockRf() {
      return this.stockRf;
   }

   @JsonProperty("detailCode")
   public void setDetailCode(String detailCode) {
      this.detailCode = detailCode;
   }

   @JsonProperty("detailCode")
   public String getDetailCode() {
      return this.detailCode;
   }

   @JsonProperty("detailMsg")
   public void setDetailMsg(String detailMsg) {
      this.detailMsg = detailMsg;
   }

   @JsonProperty("detailMsg")
   public String getDetailMsg() {
      return this.detailMsg;
   }
}
