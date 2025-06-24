package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.PoCommonForJosWebService.response.getwaredeliverdistinctlist.JOSWarehouseResultDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcGetwaredeliverdistinctlistResponse extends AbstractResponse {
   private JOSWarehouseResultDto josWarehouseResultDto;

   @JsonProperty("jos_warehouse_result_dto")
   public void setJosWarehouseResultDto(JOSWarehouseResultDto josWarehouseResultDto) {
      this.josWarehouseResultDto = josWarehouseResultDto;
   }

   @JsonProperty("jos_warehouse_result_dto")
   public JOSWarehouseResultDto getJosWarehouseResultDto() {
      return this.josWarehouseResultDto;
   }
}
