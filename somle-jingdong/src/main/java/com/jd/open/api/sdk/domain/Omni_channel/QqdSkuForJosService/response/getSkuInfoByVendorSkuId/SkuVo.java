package com.jd.open.api.sdk.domain.Omni_channel.QqdSkuForJosService.response.getSkuInfoByVendorSkuId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuVo implements Serializable {
   private String skuName;
   private String venderSkuName;
   private String venderSkuId;
   private Long venderId;
   private String upc;
   private Long storeId;
   private String skuId;

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("venderSkuName")
   public void setVenderSkuName(String venderSkuName) {
      this.venderSkuName = venderSkuName;
   }

   @JsonProperty("venderSkuName")
   public String getVenderSkuName() {
      return this.venderSkuName;
   }

   @JsonProperty("venderSkuId")
   public void setVenderSkuId(String venderSkuId) {
      this.venderSkuId = venderSkuId;
   }

   @JsonProperty("venderSkuId")
   public String getVenderSkuId() {
      return this.venderSkuId;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("upc")
   public void setUpc(String upc) {
      this.upc = upc;
   }

   @JsonProperty("upc")
   public String getUpc() {
      return this.upc;
   }

   @JsonProperty("storeId")
   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Long getStoreId() {
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
