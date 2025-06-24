package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryGoodsSerial.GoodsSerial;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpGoodsQueryGoodsSerialResponse extends AbstractResponse {
   private List<GoodsSerial> goodsSerialList;

   @JsonProperty("goodsSerialList")
   public void setGoodsSerialList(List<GoodsSerial> goodsSerialList) {
      this.goodsSerialList = goodsSerialList;
   }

   @JsonProperty("goodsSerialList")
   public List<GoodsSerial> getGoodsSerialList() {
      return this.goodsSerialList;
   }
}
