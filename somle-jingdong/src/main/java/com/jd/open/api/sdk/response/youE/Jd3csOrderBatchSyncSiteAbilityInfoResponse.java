package com.jd.open.api.sdk.response.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.response.batchSyncSiteAbilityInfo.PerformResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class Jd3csOrderBatchSyncSiteAbilityInfoResponse extends AbstractResponse {
   private PerformResult resultInfo;

   @JsonProperty("resultInfo")
   public void setResultInfo(PerformResult resultInfo) {
      this.resultInfo = resultInfo;
   }

   @JsonProperty("resultInfo")
   public PerformResult getResultInfo() {
      return this.resultInfo;
   }
}
