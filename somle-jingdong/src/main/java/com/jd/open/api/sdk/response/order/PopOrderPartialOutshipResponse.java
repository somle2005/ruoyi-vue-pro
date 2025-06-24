package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OutShipJosService.response.outship.JosResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderPartialOutshipResponse extends AbstractResponse {
   private JosResponse response;

   @JsonProperty("response")
   public void setResponse(JosResponse response) {
      this.response = response;
   }

   @JsonProperty("response")
   public JosResponse getResponse() {
      return this.response;
   }
}
