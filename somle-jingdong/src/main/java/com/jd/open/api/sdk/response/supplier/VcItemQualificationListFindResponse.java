package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find.JosQualificationRowDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemQualificationListFindResponse extends AbstractResponse {
   private JosQualificationRowDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosQualificationRowDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosQualificationRowDto getJosResultDto() {
      return this.josResultDto;
   }
}
