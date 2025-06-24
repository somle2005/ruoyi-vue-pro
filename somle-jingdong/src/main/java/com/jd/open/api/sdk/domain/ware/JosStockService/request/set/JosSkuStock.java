package com.jd.open.api.sdk.domain.ware.JosStockService.request.set;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosSkuStock implements Serializable {
   private String stockModel;
   private Integer incrStockNum;
   private Integer stockNum;
   private Integer storeId;
   private Long skuId;

   @JsonProperty("stockModel")
   public void setStockModel(String stockModel) {
      this.stockModel = stockModel;
   }

   @JsonProperty("stockModel")
   public String getStockModel() {
      return this.stockModel;
   }

   @JsonProperty("incrStockNum")
   public void setIncrStockNum(Integer incrStockNum) {
      this.incrStockNum = incrStockNum;
   }

   @JsonProperty("incrStockNum")
   public Integer getIncrStockNum() {
      return this.incrStockNum;
   }

   @JsonProperty("stockNum")
   public void setStockNum(Integer stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public Integer getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("storeId")
   public void setStoreId(Integer storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Integer getStoreId() {
      return this.storeId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }
}
