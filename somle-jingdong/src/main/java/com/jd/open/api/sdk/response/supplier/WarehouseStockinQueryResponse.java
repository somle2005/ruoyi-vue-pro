package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.VcStockInJosAPI.response.query.VcInStockResultJosDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WarehouseStockinQueryResponse extends AbstractResponse {
   private VcInStockResultJosDto vcInStockResultJosDto;

   @JsonProperty("vcInStockResultJosDto")
   public void setVcInStockResultJosDto(VcInStockResultJosDto vcInStockResultJosDto) {
      this.vcInStockResultJosDto = vcInStockResultJosDto;
   }

   @JsonProperty("vcInStockResultJosDto")
   public VcInStockResultJosDto getVcInStockResultJosDto() {
      return this.vcInStockResultJosDto;
   }
}
