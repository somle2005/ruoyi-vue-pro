package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryShelfLifeGoodsList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PageableResult implements Serializable {
   private List<BenZGoodsStockQueryResponse> shelfLifeGoodsResultList;
   private Long recordCount;

   @JsonProperty("shelfLifeGoodsResultList")
   public void setShelfLifeGoodsResultList(List<BenZGoodsStockQueryResponse> shelfLifeGoodsResultList) {
      this.shelfLifeGoodsResultList = shelfLifeGoodsResultList;
   }

   @JsonProperty("shelfLifeGoodsResultList")
   public List<BenZGoodsStockQueryResponse> getShelfLifeGoodsResultList() {
      return this.shelfLifeGoodsResultList;
   }

   @JsonProperty("recordCount")
   public void setRecordCount(Long recordCount) {
      this.recordCount = recordCount;
   }

   @JsonProperty("recordCount")
   public Long getRecordCount() {
      return this.recordCount;
   }
}
