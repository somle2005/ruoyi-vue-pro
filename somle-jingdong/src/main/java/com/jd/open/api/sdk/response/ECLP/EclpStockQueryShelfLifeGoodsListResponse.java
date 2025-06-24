package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryShelfLifeGoodsList.PageableResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpStockQueryShelfLifeGoodsListResponse extends AbstractResponse {
   private PageableResult pageableResult;

   @JsonProperty("pageableResult")
   public void setPageableResult(PageableResult pageableResult) {
      this.pageableResult = pageableResult;
   }

   @JsonProperty("pageableResult")
   public PageableResult getPageableResult() {
      return this.pageableResult;
   }
}
