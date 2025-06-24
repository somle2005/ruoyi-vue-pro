package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderInfo.MachiningResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpCloudQueryOrderInfoResponse extends AbstractResponse {
   private MachiningResult queryorderinfoResult;

   @JsonProperty("queryorderinfo_result")
   public void setQueryorderinfoResult(MachiningResult queryorderinfoResult) {
      this.queryorderinfoResult = queryorderinfoResult;
   }

   @JsonProperty("queryorderinfo_result")
   public MachiningResult getQueryorderinfoResult() {
      return this.queryorderinfoResult;
   }
}
