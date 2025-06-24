package com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.getStorePrice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class StorePriceDTO implements Serializable {
   private BigDecimal storePrice;
   private String outerId;
   private String exStoreId;
   private String storeId;
   private String skuId;

   @JsonProperty("storePrice")
   public void setStorePrice(BigDecimal storePrice) {
      this.storePrice = storePrice;
   }

   @JsonProperty("storePrice")
   public BigDecimal getStorePrice() {
      return this.storePrice;
   }

   @JsonProperty("outerId")
   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   @JsonProperty("outerId")
   public String getOuterId() {
      return this.outerId;
   }

   @JsonProperty("exStoreId")
   public void setExStoreId(String exStoreId) {
      this.exStoreId = exStoreId;
   }

   @JsonProperty("exStoreId")
   public String getExStoreId() {
      return this.exStoreId;
   }

   @JsonProperty("storeId")
   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public String getStoreId() {
      return this.storeId;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }
}
