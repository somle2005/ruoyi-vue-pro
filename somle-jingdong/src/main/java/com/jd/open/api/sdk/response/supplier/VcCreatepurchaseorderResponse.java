package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.PoCreateForJosWebService.response.createpurchaseorder.JOSCreateOrderResultDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcCreatepurchaseorderResponse extends AbstractResponse {
   private JOSCreateOrderResultDto josCreateOrderResultDto;

   @JsonProperty("jos_create_order_result_dto")
   public void setJosCreateOrderResultDto(JOSCreateOrderResultDto josCreateOrderResultDto) {
      this.josCreateOrderResultDto = josCreateOrderResultDto;
   }

   @JsonProperty("jos_create_order_result_dto")
   public JOSCreateOrderResultDto getJosCreateOrderResultDto() {
      return this.josCreateOrderResultDto;
   }
}
