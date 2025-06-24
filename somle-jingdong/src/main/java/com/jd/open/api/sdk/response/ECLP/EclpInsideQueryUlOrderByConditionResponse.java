package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpIsvService.response.queryUlOrderByCondition.UlResultResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpInsideQueryUlOrderByConditionResponse extends AbstractResponse {
   private UlResultResponse ulResultResponse;

   @JsonProperty("ulResultResponse")
   public void setUlResultResponse(UlResultResponse ulResultResponse) {
      this.ulResultResponse = ulResultResponse;
   }

   @JsonProperty("ulResultResponse")
   public UlResultResponse getUlResultResponse() {
      return this.ulResultResponse;
   }
}
