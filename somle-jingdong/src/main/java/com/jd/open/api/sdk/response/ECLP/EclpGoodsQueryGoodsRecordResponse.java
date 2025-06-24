package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryGoodsRecord.GoodsRecordQueryResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpGoodsQueryGoodsRecordResponse extends AbstractResponse {
   private GoodsRecordQueryResult goodsRecordQueryResult;

   @JsonProperty("goodsRecordQueryResult")
   public void setGoodsRecordQueryResult(GoodsRecordQueryResult goodsRecordQueryResult) {
      this.goodsRecordQueryResult = goodsRecordQueryResult;
   }

   @JsonProperty("goodsRecordQueryResult")
   public GoodsRecordQueryResult getGoodsRecordQueryResult() {
      return this.goodsRecordQueryResult;
   }
}
