package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.SalesInfoJosService.response.get.JosSalesInfoResultDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiSdvSalesinfoGetResponse extends AbstractResponse {
   private JosSalesInfoResultDto salesInfoResultDto;

   @JsonProperty("salesInfoResultDto")
   public void setSalesInfoResultDto(JosSalesInfoResultDto salesInfoResultDto) {
      this.salesInfoResultDto = salesInfoResultDto;
   }

   @JsonProperty("salesInfoResultDto")
   public JosSalesInfoResultDto getSalesInfoResultDto() {
      return this.salesInfoResultDto;
   }
}
