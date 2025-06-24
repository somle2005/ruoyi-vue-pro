package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.StockInfoJosService.response.get.JosStockInfoResultDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiSdvStockinfoGetResponse extends AbstractResponse {
   private JosStockInfoResultDto stockInfoResultDto;

   @JsonProperty("stockInfoResultDto")
   public void setStockInfoResultDto(JosStockInfoResultDto stockInfoResultDto) {
      this.stockInfoResultDto = stockInfoResultDto;
   }

   @JsonProperty("stockInfoResultDto")
   public JosStockInfoResultDto getStockInfoResultDto() {
      return this.stockInfoResultDto;
   }
}
