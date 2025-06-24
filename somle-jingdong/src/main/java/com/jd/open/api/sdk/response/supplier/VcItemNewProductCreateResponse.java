package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.create.ProductJosStringDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemNewProductCreateResponse extends AbstractResponse {
   private ProductJosStringDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(ProductJosStringDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public ProductJosStringDto getJosResultDto() {
      return this.josResultDto;
   }
}
