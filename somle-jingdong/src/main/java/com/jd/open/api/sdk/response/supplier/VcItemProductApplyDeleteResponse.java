package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.delete.JosIntegerDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemProductApplyDeleteResponse extends AbstractResponse {
   private JosIntegerDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosIntegerDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosIntegerDto getJosResultDto() {
      return this.josResultDto;
   }
}
