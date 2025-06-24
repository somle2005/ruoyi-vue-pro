package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find.JosResultModelDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemModelFindResponse extends AbstractResponse {
   private JosResultModelDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosResultModelDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosResultModelDto getJosResultDto() {
      return this.josResultDto;
   }
}
