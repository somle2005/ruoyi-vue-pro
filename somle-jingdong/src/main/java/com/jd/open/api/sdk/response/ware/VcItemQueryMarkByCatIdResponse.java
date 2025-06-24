package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.ProductManagementService.response.queryMarkByCatId.JosMapSoDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemQueryMarkByCatIdResponse extends AbstractResponse {
   private JosMapSoDto josMapSoDto;

   @JsonProperty("josMapSoDto")
   public void setJosMapSoDto(JosMapSoDto josMapSoDto) {
      this.josMapSoDto = josMapSoDto;
   }

   @JsonProperty("josMapSoDto")
   public JosMapSoDto getJosMapSoDto() {
      return this.josMapSoDto;
   }
}
