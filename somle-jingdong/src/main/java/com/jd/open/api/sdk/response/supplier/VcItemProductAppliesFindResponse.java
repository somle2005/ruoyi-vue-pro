package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find.JosApplyProductDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemProductAppliesFindResponse extends AbstractResponse {
   private JosApplyProductDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosApplyProductDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosApplyProductDto getJosResultDto() {
      return this.josResultDto;
   }
}
