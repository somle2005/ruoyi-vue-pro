package com.jd.open.api.sdk.response.wujiemiandan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.wujiemiandan.WaybillCancelOpenApi.response.cancel.Response;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LogisticsEwaybillWaybillCancelResponse extends AbstractResponse {
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
