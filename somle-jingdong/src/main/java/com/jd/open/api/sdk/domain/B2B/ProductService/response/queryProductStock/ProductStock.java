package com.jd.open.api.sdk.domain.B2B.ProductService.response.queryProductStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ProductStock implements Serializable {
   private Long stock;
   private Long skuId;

   @JsonProperty("stock")
   public void setStock(Long stock) {
      this.stock = stock;
   }

   @JsonProperty("stock")
   public Long getStock() {
      return this.stock;
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
