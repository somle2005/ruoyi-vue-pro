package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get.JosSaleAttrNameDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemSaleAttributeSettingsGetResponse extends AbstractResponse {
   private JosSaleAttrNameDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosSaleAttrNameDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosSaleAttrNameDto getJosResultDto() {
      return this.josResultDto;
   }
}
