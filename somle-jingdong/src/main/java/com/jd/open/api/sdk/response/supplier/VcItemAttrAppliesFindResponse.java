package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find.JosItemAttrApplyDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemAttrAppliesFindResponse extends AbstractResponse {
   private JosItemAttrApplyDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosItemAttrApplyDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosItemAttrApplyDto getJosResultDto() {
      return this.josResultDto;
   }
}
