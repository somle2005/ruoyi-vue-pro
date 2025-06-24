package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryGoodsInfo.GoodsInfo;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpGoodsQueryGoodsInfoResponse extends AbstractResponse {
   private List<GoodsInfo> goodsInfoList;

   @JsonProperty("goodsInfoList")
   public void setGoodsInfoList(List<GoodsInfo> goodsInfoList) {
      this.goodsInfoList = goodsInfoList;
   }

   @JsonProperty("goodsInfoList")
   public List<GoodsInfo> getGoodsInfoList() {
      return this.goodsInfoList;
   }
}
