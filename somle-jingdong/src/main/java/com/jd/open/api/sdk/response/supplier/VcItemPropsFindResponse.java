package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find.JosPropGroupDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemPropsFindResponse extends AbstractResponse {
   private JosPropGroupDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosPropGroupDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosPropGroupDto getJosResultDto() {
      return this.josResultDto;
   }
}
