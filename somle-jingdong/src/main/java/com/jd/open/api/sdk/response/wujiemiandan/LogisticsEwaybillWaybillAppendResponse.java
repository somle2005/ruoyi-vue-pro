package com.jd.open.api.sdk.response.wujiemiandan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.wujiemiandan.WaybillAppendOpenApi.response.append.Response;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LogisticsEwaybillWaybillAppendResponse extends AbstractResponse {
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
