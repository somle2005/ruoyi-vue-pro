package com.jd.open.api.sdk.domain.wujiemiandan.WaybillReceiveOpenApi.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class WaybillGoodsDTO implements Serializable {
   private BigDecimal volume;
   private String code;
   private Integer quantity;
   private BigDecimal price;
   private String name;
   private BigDecimal weight;

   @JsonProperty("volume")
   public void setVolume(BigDecimal volume) {
      this.volume = volume;
   }

   @JsonProperty("volume")
   public BigDecimal getVolume() {
      return this.volume;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("quantity")
   public void setQuantity(Integer quantity) {
      this.quantity = quantity;
   }

   @JsonProperty("quantity")
   public Integer getQuantity() {
      return this.quantity;
   }

   @JsonProperty("price")
   public void setPrice(BigDecimal price) {
      this.price = price;
   }

   @JsonProperty("price")
   public BigDecimal getPrice() {
      return this.price;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("weight")
   public void setWeight(BigDecimal weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public BigDecimal getWeight() {
      return this.weight;
   }
}
