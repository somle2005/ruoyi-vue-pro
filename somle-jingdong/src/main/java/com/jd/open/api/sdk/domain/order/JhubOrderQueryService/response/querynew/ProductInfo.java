package com.jd.open.api.sdk.domain.order.JhubOrderQueryService.response.querynew;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ProductInfo implements Serializable {
   private Long skuId;
   private String name;
   private Integer amount;
   private Long price;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("amount")
   public void setAmount(Integer amount) {
      this.amount = amount;
   }

   @JsonProperty("amount")
   public Integer getAmount() {
      return this.amount;
   }

   @JsonProperty("price")
   public void setPrice(Long price) {
      this.price = price;
   }

   @JsonProperty("price")
   public Long getPrice() {
      return this.price;
   }
}
