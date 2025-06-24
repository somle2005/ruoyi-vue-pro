package com.jd.open.api.sdk.response.SSCX;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class QyzhfwPaymentInfoQueryPaymentInvoiceDetailResponse extends AbstractResponse {
   private String response;

   @JsonProperty("response")
   public void setResponse(String response) {
      this.response = response;
   }

   @JsonProperty("response")
   public String getResponse() {
      return this.response;
   }
}
