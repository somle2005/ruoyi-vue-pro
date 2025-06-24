package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.ProductManagementService.response.getCnEnBrandList.JosStringDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemBrandGetCnEnBrandListResponse extends AbstractResponse {
   private JosStringDto josStringDto;

   @JsonProperty("josStringDto")
   public void setJosStringDto(JosStringDto josStringDto) {
      this.josStringDto = josStringDto;
   }

   @JsonProperty("josStringDto")
   public JosStringDto getJosStringDto() {
      return this.josStringDto;
   }
}
