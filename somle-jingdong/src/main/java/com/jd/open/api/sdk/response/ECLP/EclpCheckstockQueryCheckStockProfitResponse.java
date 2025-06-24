package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryCheckStockProfit.IsvCheckStock;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpCheckstockQueryCheckStockProfitResponse extends AbstractResponse {
   private List<IsvCheckStock> checkstockProfitList;

   @JsonProperty("checkstockProfitList")
   public void setCheckstockProfitList(List<IsvCheckStock> checkstockProfitList) {
      this.checkstockProfitList = checkstockProfitList;
   }

   @JsonProperty("checkstockProfitList")
   public List<IsvCheckStock> getCheckstockProfitList() {
      return this.checkstockProfitList;
   }
}
