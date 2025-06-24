package com.jd.open.api.sdk.response.wujiemiandan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.wujiemiandan.WaybillReceiveOpenApi.response.create.Response;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LogisticsEwaybillWaybillCreateResponse extends AbstractResponse {
   private Response Response;

   @JsonProperty("Response")
   public void setResponse(Response Response) {
      this.Response = Response;
   }

   @JsonProperty("Response")
   public Response getResponse() {
      return this.Response;
   }
}
