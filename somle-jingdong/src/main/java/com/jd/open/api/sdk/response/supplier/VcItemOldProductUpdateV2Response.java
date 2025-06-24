package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.updateV2.JosStringDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemOldProductUpdateV2Response extends AbstractResponse {
   private JosStringDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosStringDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosStringDto getJosResultDto() {
      return this.josResultDto;
   }
}
