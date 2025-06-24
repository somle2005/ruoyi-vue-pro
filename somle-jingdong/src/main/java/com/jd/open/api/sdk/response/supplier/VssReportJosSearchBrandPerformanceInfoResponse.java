package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.JosBrandPerformanceInfoService.response.searchBrandPerformanceInfo.Message;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VssReportJosSearchBrandPerformanceInfoResponse extends AbstractResponse {
   private Message message;

   @JsonProperty("message")
   public void setMessage(Message message) {
      this.message = message;
   }

   @JsonProperty("message")
   public Message getMessage() {
      return this.message;
   }
}
