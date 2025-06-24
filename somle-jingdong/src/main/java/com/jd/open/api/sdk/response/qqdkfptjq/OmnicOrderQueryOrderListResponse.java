package com.jd.open.api.sdk.response.qqdkfptjq;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.qqdkfptjq.OmnicOmcJosService.response.orderList.OmcJosResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OmnicOrderQueryOrderListResponse extends AbstractResponse {
   private OmcJosResult result;

   @JsonProperty("result")
   public void setResult(OmcJosResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public OmcJosResult getResult() {
      return this.result;
   }
}
