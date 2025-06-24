package com.jd.open.api.sdk.response.jialilue;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jialilue.OcssSettlementTradeJosFacade.response.synchSubmitSettlementTrade.ResponseTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SynchSubmitSettlementTradeResponse extends AbstractResponse {
   private ResponseTO BaseResponse;

   @JsonProperty("BaseResponse")
   public void setBaseResponse(ResponseTO BaseResponse) {
      this.BaseResponse = BaseResponse;
   }

   @JsonProperty("BaseResponse")
   public ResponseTO getBaseResponse() {
      return this.BaseResponse;
   }
}
