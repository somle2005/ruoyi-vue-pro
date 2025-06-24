package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.PoQueryForJosWebService.response.getdetailbyorderid.JOSDetailResultDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcGetdetailbyorderidResponse extends AbstractResponse {
   private JOSDetailResultDto josDetailResultDto;

   @JsonProperty("jos_detail_result_dto")
   public void setJosDetailResultDto(JOSDetailResultDto josDetailResultDto) {
      this.josDetailResultDto = josDetailResultDto;
   }

   @JsonProperty("jos_detail_result_dto")
   public JOSDetailResultDto getJosDetailResultDto() {
      return this.josDetailResultDto;
   }
}
