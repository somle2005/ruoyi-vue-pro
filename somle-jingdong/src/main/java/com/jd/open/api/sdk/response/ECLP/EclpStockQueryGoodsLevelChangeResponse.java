package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryGoodsLevelChange.QueryLevelChangeResult;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpStockQueryGoodsLevelChangeResponse extends AbstractResponse {
   private List<QueryLevelChangeResult> levelChangeResultList;

   @JsonProperty("levelChangeResultList")
   public void setLevelChangeResultList(List<QueryLevelChangeResult> levelChangeResultList) {
      this.levelChangeResultList = levelChangeResultList;
   }

   @JsonProperty("levelChangeResultList")
   public List<QueryLevelChangeResult> getLevelChangeResultList() {
      return this.levelChangeResultList;
   }
}
