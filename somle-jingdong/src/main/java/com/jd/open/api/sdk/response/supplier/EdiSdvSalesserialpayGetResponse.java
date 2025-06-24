package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.SalesOutWarehouseJosService.response.get.JosSalesOutWarehouseResultDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiSdvSalesserialpayGetResponse extends AbstractResponse {
   private JosSalesOutWarehouseResultDto salesOutWarehouseResultDto;

   @JsonProperty("salesOutWarehouseResultDto")
   public void setSalesOutWarehouseResultDto(JosSalesOutWarehouseResultDto salesOutWarehouseResultDto) {
      this.salesOutWarehouseResultDto = salesOutWarehouseResultDto;
   }

   @JsonProperty("salesOutWarehouseResultDto")
   public JosSalesOutWarehouseResultDto getSalesOutWarehouseResultDto() {
      return this.salesOutWarehouseResultDto;
   }
}
