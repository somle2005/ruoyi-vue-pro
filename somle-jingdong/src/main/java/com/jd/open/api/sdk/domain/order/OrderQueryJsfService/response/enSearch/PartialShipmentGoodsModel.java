package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.enSearch;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PartialShipmentGoodsModel implements Serializable {
   private String skuUuid;
   private Long skuId;
   private Long num;

   @JsonProperty("skuUuid")
   public void setSkuUuid(String skuUuid) {
      this.skuUuid = skuUuid;
   }

   @JsonProperty("skuUuid")
   public String getSkuUuid() {
      return this.skuUuid;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("num")
   public void setNum(Long num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Long getNum() {
      return this.num;
   }
}
