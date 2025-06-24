package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find.JosMapSb;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemFeatureFindResponse extends AbstractResponse {
   private JosMapSb josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosMapSb josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosMapSb getJosResultDto() {
      return this.josResultDto;
   }
}
