package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.PoQueryForJosWebService.response.getpurchaseorderlist.JOSOrderResultDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcGetpurchaseorderlistResponse extends AbstractResponse {
   private JOSOrderResultDto josOrderResultDto;

   @JsonProperty("jos_order_result_dto")
   public void setJosOrderResultDto(JOSOrderResultDto josOrderResultDto) {
      this.josOrderResultDto = josOrderResultDto;
   }

   @JsonProperty("jos_order_result_dto")
   public JOSOrderResultDto getJosOrderResultDto() {
      return this.josOrderResultDto;
   }
}
