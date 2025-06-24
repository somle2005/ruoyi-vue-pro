package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderCartonBySoNo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CartonItemDTO implements Serializable {
   private String goodsNo;
   private String goodsQty;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("goodsQty")
   public void setGoodsQty(String goodsQty) {
      this.goodsQty = goodsQty;
   }

   @JsonProperty("goodsQty")
   public String getGoodsQty() {
      return this.goodsQty;
   }
}
