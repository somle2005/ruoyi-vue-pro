package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ReturnOrderForJosWebService.response.get.RoResultDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcReturnOrderListPageGetResponse extends AbstractResponse {
   private RoResultDto roResultDto;

   @JsonProperty("roResultDto")
   public void setRoResultDto(RoResultDto roResultDto) {
      this.roResultDto = roResultDto;
   }

   @JsonProperty("roResultDto")
   public RoResultDto getRoResultDto() {
      return this.roResultDto;
   }
}
