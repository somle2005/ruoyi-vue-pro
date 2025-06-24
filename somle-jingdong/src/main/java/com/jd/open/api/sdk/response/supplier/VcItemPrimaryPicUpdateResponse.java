package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.update.JosBooleanDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemPrimaryPicUpdateResponse extends AbstractResponse {
   private JosBooleanDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosBooleanDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosBooleanDto getJosResultDto() {
      return this.josResultDto;
   }
}
