package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find.JosSimpleBrandDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemBrandsFindResponse extends AbstractResponse {
   private JosSimpleBrandDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosSimpleBrandDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosSimpleBrandDto getJosResultDto() {
      return this.josResultDto;
   }
}
