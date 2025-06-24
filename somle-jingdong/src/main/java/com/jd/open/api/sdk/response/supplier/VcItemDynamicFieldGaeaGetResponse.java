package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get.JosBasicInfoDynamicFieldDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemDynamicFieldGaeaGetResponse extends AbstractResponse {
   private JosBasicInfoDynamicFieldDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosBasicInfoDynamicFieldDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosBasicInfoDynamicFieldDto getJosResultDto() {
      return this.josResultDto;
   }
}
