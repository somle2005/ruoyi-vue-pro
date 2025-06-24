package com.jd.open.api.sdk.response.gysyuyue;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.gysyuyue.SvcBookingApiService.response.number.SvcResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SvcBindNumberResponse extends AbstractResponse {
   private SvcResult getbindnumberResult;

   @JsonProperty("getbindnumber_result")
   public void setGetbindnumberResult(SvcResult getbindnumberResult) {
      this.getbindnumberResult = getbindnumberResult;
   }

   @JsonProperty("getbindnumber_result")
   public SvcResult getGetbindnumberResult() {
      return this.getbindnumberResult;
   }
}
