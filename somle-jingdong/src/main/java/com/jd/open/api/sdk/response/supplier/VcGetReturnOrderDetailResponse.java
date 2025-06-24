package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ReturnOrderForJosWebService.response.detail.DetailResultDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcGetReturnOrderDetailResponse extends AbstractResponse {
   private DetailResultDto detailResultDto;

   @JsonProperty("detailResultDto")
   public void setDetailResultDto(DetailResultDto detailResultDto) {
      this.detailResultDto = detailResultDto;
   }

   @JsonProperty("detailResultDto")
   public DetailResultDto getDetailResultDto() {
      return this.detailResultDto;
   }
}
