package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get.JosProductInfoDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemProductGetResponse extends AbstractResponse {
   private JosProductInfoDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosProductInfoDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosProductInfoDto getJosResultDto() {
      return this.josResultDto;
   }
}
