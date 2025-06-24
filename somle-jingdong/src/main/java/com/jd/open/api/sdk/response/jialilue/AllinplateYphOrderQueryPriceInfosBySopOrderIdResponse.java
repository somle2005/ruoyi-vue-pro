package com.jd.open.api.sdk.response.jialilue;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AllinplateYphOrderQueryPriceInfosBySopOrderIdResponse extends AbstractResponse {
   private String Response;

   @JsonProperty("Response")
   public void setResponse(String Response) {
      this.Response = Response;
   }

   @JsonProperty("Response")
   public String getResponse() {
      return this.Response;
   }
}
