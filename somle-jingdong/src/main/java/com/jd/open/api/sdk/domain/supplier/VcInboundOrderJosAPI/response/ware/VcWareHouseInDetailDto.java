package com.jd.open.api.sdk.domain.supplier.VcInboundOrderJosAPI.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VcWareHouseInDetailDto implements Serializable {
   private String goodsSku;
   private String goodsName;
   private Integer total;

   @JsonProperty("goodsSku")
   public void setGoodsSku(String goodsSku) {
      this.goodsSku = goodsSku;
   }

   @JsonProperty("goodsSku")
   public String getGoodsSku() {
      return this.goodsSku;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String getGoodsName() {
      return this.goodsName;
   }

   @JsonProperty("total")
   public void setTotal(Integer total) {
      this.total = total;
   }

   @JsonProperty("total")
   public Integer getTotal() {
      return this.total;
   }
}
