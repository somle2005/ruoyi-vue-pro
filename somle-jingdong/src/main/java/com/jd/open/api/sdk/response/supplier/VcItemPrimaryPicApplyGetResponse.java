package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get.JosItemPicApplyInfoDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemPrimaryPicApplyGetResponse extends AbstractResponse {
   private JosItemPicApplyInfoDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosItemPicApplyInfoDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosItemPicApplyInfoDto getJosResultDto() {
      return this.josResultDto;
   }
}
