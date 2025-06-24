package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.ActyInfoService.response.queryRegistrationDataCount.ActyResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ActyQueryRegistrationDataCountResponse extends AbstractResponse {
   private ActyResult queryregistrationdatacountResult;

   @JsonProperty("queryregistrationdatacount_result")
   public void setQueryregistrationdatacountResult(ActyResult queryregistrationdatacountResult) {
      this.queryregistrationdatacountResult = queryregistrationdatacountResult;
   }

   @JsonProperty("queryregistrationdatacount_result")
   public ActyResult getQueryregistrationdatacountResult() {
      return this.queryregistrationdatacountResult;
   }
}
