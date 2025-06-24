package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get.JosDangerGoodsDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemDangergoodsGetResponse extends AbstractResponse {
   private JosDangerGoodsDto josResultDto;

   @JsonProperty("jos_result_dto")
   public void setJosResultDto(JosDangerGoodsDto josResultDto) {
      this.josResultDto = josResultDto;
   }

   @JsonProperty("jos_result_dto")
   public JosDangerGoodsDto getJosResultDto() {
      return this.josResultDto;
   }
}
