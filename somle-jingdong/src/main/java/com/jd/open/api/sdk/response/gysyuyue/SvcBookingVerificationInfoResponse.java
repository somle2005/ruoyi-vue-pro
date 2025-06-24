package com.jd.open.api.sdk.response.gysyuyue;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.gysyuyue.SvcBookingApiService.response.info.SvcResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SvcBookingVerificationInfoResponse extends AbstractResponse {
   private SvcResult bookingverificationResult;

   @JsonProperty("bookingverification_result")
   public void setBookingverificationResult(SvcResult bookingverificationResult) {
      this.bookingverificationResult = bookingverificationResult;
   }

   @JsonProperty("bookingverification_result")
   public SvcResult getBookingverificationResult() {
      return this.bookingverificationResult;
   }
}
