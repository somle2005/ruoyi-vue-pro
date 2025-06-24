package com.jd.open.api.sdk.response.jddzk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jddzk.BaseAreaService.response.get.BaseAreaServiceResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AreasTownGetResponse extends AbstractResponse {
   private BaseAreaServiceResponse baseAreaServiceResponse;

   @JsonProperty("baseAreaServiceResponse")
   public void setBaseAreaServiceResponse(BaseAreaServiceResponse baseAreaServiceResponse) {
      this.baseAreaServiceResponse = baseAreaServiceResponse;
   }

   @JsonProperty("baseAreaServiceResponse")
   public BaseAreaServiceResponse getBaseAreaServiceResponse() {
      return this.baseAreaServiceResponse;
   }
}
