package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.SmsModelConfigWriteService.response.sendSms.Response;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ApiSmsModelConfigWriteServiceSendSmsResponse extends AbstractResponse {
   private Response response;

   @JsonProperty("response")
   public void setResponse(Response response) {
      this.response = response;
   }

   @JsonProperty("response")
   public Response getResponse() {
      return this.response;
   }
}
