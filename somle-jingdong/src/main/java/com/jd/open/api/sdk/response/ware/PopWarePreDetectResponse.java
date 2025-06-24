package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.KeeperWarePreDetectService.response.preDetect.Response;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopWarePreDetectResponse extends AbstractResponse {
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
