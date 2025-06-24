package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find.JosCategoryDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemCategoriesFindResponse extends AbstractResponse {
   private JosCategoryDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosCategoryDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosCategoryDto getJosResultDto() {
      return this.josResultDto;
   }
}
