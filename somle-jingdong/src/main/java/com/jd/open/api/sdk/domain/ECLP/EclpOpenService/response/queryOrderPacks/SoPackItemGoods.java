package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderPacks;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SoPackItemGoods implements Serializable {
   private String goodsNo;
   private Integer goodsNum;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("goodsNum")
   public void setGoodsNum(Integer goodsNum) {
      this.goodsNum = goodsNum;
   }

   @JsonProperty("goodsNum")
   public Integer getGoodsNum() {
      return this.goodsNum;
   }
}
