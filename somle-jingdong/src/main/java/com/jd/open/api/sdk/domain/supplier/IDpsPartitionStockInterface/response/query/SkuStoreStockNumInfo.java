package com.jd.open.api.sdk.domain.supplier.IDpsPartitionStockInterface.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuStoreStockNumInfo implements Serializable {
   private Long[] sku;
   private Integer[] storeId;
   private Integer[] stockNum;
   private Integer[] availableStockNum;

   @JsonProperty("sku")
   public void setSku(Long[] sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public Long[] getSku() {
      return this.sku;
   }

   @JsonProperty("storeId")
   public void setStoreId(Integer[] storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Integer[] getStoreId() {
      return this.storeId;
   }

   @JsonProperty("stockNum")
   public void setStockNum(Integer[] stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Integer[] getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("availableStockNum")
   public void setAvailableStockNum(Integer[] availableStockNum) {
      this.availableStockNum = availableStockNum;
   }

   @JsonProperty("availableStockNum")
   public Integer[] getAvailableStockNum() {
      return this.availableStockNum;
   }
}
