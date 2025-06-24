package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find.JosMyProductInfoDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemProductsFindResponse extends AbstractResponse {
   private JosMyProductInfoDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosMyProductInfoDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosMyProductInfoDto getJosResultDto() {
      return this.josResultDto;
   }
}
