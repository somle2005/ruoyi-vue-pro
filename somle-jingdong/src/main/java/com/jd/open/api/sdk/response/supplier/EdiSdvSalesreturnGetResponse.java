package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.SalesReturnJosService.response.get.JosSalesReturnResultDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiSdvSalesreturnGetResponse extends AbstractResponse {
   private JosSalesReturnResultDto salesReturnResultDto;

   @JsonProperty("salesReturnResultDto")
   public void setSalesReturnResultDto(JosSalesReturnResultDto salesReturnResultDto) {
      this.salesReturnResultDto = salesReturnResultDto;
   }

   @JsonProperty("salesReturnResultDto")
   public JosSalesReturnResultDto getSalesReturnResultDto() {
      return this.salesReturnResultDto;
   }
}
