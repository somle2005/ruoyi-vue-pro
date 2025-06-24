package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get.JosProductApplyDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemProductApplyGetResponse extends AbstractResponse {
   private JosProductApplyDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosProductApplyDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosProductApplyDto getJosResultDto() {
      return this.josResultDto;
   }
}
