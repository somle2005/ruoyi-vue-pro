package com.jd.open.api.sdk.domain.ECLP.SamReturnStockService.response.rejectorderinfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SamSkuInfo implements Serializable {
   private String skuId;
   private int num;

   @JsonProperty("sku_id")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("sku_id")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("num")
   public void setNum(int num) {
      this.num = num;
   }

   @JsonProperty("num")
   public int getNum() {
      return this.num;
   }
}
