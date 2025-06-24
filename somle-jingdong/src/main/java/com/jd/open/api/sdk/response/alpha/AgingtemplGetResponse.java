package com.jd.open.api.sdk.response.alpha;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.alpha.PromiseService.response.get.AgingTemplateResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AgingtemplGetResponse extends AbstractResponse {
   private AgingTemplateResponse AgingTemplateResponse;

   @JsonProperty("AgingTemplateResponse")
   public void setAgingTemplateResponse(AgingTemplateResponse AgingTemplateResponse) {
      this.AgingTemplateResponse = AgingTemplateResponse;
   }

   @JsonProperty("AgingTemplateResponse")
   public AgingTemplateResponse getAgingTemplateResponse() {
      return this.AgingTemplateResponse;
   }
}
