package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get.JosSpuTemplateDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemSpuTemplateGetResponse extends AbstractResponse {
   private JosSpuTemplateDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosSpuTemplateDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosSpuTemplateDto getJosResultDto() {
      return this.josResultDto;
   }
}
