package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.WaybillJosService.response.update.JosResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderWaybillUpdateResponse extends AbstractResponse {
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
