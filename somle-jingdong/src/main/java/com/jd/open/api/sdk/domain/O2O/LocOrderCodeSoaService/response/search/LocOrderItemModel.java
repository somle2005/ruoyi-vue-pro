package com.jd.open.api.sdk.domain.O2O.LocOrderCodeSoaService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class LocOrderItemModel implements Serializable {
   private String skuName;
   private int num;
   private Long skuId;

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("num")
   public void setNum(int num) {
      this.num = num;
   }

   @JsonProperty("num")
   public int getNum() {
      return this.num;
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
