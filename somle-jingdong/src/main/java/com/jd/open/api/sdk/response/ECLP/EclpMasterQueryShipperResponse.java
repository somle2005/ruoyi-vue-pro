package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryShipper.ShipperOut;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpMasterQueryShipperResponse extends AbstractResponse {
   private List<ShipperOut> queryshipperResult;

   @JsonProperty("queryshipper_result")
   public void setQueryshipperResult(List<ShipperOut> queryshipperResult) {
      this.queryshipperResult = queryshipperResult;
   }

   @JsonProperty("queryshipper_result")
   public List<ShipperOut> getQueryshipperResult() {
      return this.queryshipperResult;
   }
}
