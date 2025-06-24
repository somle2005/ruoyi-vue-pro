package com.jd.open.api.sdk.response.gysyuyue;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.gysyuyue.SvcBookingApiService.response.list.SvcResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SvcBookingListResponse extends AbstractResponse {
   private SvcResult getsvcbookingverificationResult;

   @JsonProperty("getsvcbookingverification_result")
   public void setGetsvcbookingverificationResult(SvcResult getsvcbookingverificationResult) {
      this.getsvcbookingverificationResult = getsvcbookingverificationResult;
   }

   @JsonProperty("getsvcbookingverification_result")
   public SvcResult getGetsvcbookingverificationResult() {
      return this.getsvcbookingverificationResult;
   }
}
