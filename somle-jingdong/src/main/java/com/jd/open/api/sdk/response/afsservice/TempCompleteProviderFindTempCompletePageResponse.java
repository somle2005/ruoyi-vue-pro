package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findTempCompletePage.ResultExport;
import com.jd.open.api.sdk.response.AbstractResponse;

public class TempCompleteProviderFindTempCompletePageResponse extends AbstractResponse {
   private ResultExport resultExport;

   @JsonProperty("resultExport")
   public void setResultExport(ResultExport resultExport) {
      this.resultExport = resultExport;
   }

   @JsonProperty("resultExport")
   public ResultExport getResultExport() {
      return this.resultExport;
   }
}
