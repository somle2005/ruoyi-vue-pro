package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.JosDataOvasService.response.transportGoodOvasItems.JosGoodOvasResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpOvasTransportGoodOvasItemsResponse extends AbstractResponse {
   private JosGoodOvasResponse response;

   @JsonProperty("response")
   public void setResponse(JosGoodOvasResponse response) {
      this.response = response;
   }

   @JsonProperty("response")
   public JosGoodOvasResponse getResponse() {
      return this.response;
   }
}
