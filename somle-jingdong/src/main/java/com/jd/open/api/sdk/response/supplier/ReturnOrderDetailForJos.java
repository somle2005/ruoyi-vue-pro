package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ReturnOrderDetailForJos implements Serializable {
   private String skuId;
   private String commodityName;
   private int commodityNum;

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("commodityName")
   public void setCommodityName(String commodityName) {
      this.commodityName = commodityName;
   }

   @JsonProperty("commodityName")
   public String getCommodityName() {
      return this.commodityName;
   }

   @JsonProperty("commodityNum")
   public void setCommodityNum(int commodityNum) {
      this.commodityNum = commodityNum;
   }

   @JsonProperty("commodityNum")
   public int getCommodityNum() {
      return this.commodityNum;
   }
}
