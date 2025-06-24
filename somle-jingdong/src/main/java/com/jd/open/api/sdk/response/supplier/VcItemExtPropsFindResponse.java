package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find.JosExtPropDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemExtPropsFindResponse extends AbstractResponse {
   private JosExtPropDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosExtPropDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosExtPropDto getJosResultDto() {
      return this.josResultDto;
   }
}
