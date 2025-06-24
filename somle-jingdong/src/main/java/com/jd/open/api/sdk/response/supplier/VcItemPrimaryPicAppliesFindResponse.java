package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find.JosItemPicApplyDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemPrimaryPicAppliesFindResponse extends AbstractResponse {
   private JosItemPicApplyDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosItemPicApplyDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosItemPicApplyDto getJosResultDto() {
      return this.josResultDto;
   }
}
