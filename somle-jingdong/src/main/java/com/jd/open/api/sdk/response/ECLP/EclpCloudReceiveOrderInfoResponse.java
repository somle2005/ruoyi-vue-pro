package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.receiveOrderInfo.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpCloudReceiveOrderInfoResponse extends AbstractResponse {
   private Result receiveorderinfoResult;

   @JsonProperty("receiveorderinfo_result")
   public void setReceiveorderinfoResult(Result receiveorderinfoResult) {
      this.receiveorderinfoResult = receiveorderinfoResult;
   }

   @JsonProperty("receiveorderinfo_result")
   public Result getReceiveorderinfoResult() {
      return this.receiveorderinfoResult;
   }
}
