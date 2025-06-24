package com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.getStoreSkuStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StorePriceDTO implements Serializable {
   private String exStoreId;
   private String skuId;
   private Integer storeSkuStatus;
   private String storeId;
   private String outerId;

   @JsonProperty("exStoreId")
   public void setExStoreId(String exStoreId) {
      this.exStoreId = exStoreId;
   }

   @JsonProperty("exStoreId")
   public String getExStoreId() {
      return this.exStoreId;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("storeSkuStatus")
   public void setStoreSkuStatus(Integer storeSkuStatus) {
      this.storeSkuStatus = storeSkuStatus;
   }

   @JsonProperty("storeSkuStatus")
   public Integer getStoreSkuStatus() {
      return this.storeSkuStatus;
   }

   @JsonProperty("storeId")
   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public String getStoreId() {
      return this.storeId;
   }

   @JsonProperty("outerId")
   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   @JsonProperty("outerId")
   public String getOuterId() {
      return this.outerId;
   }
}
