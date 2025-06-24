package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.VcInboundOrderJosAPI.response.list.VcWareHouseInResultJosDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WarehouseInboundOrderQueryListResponse extends AbstractResponse {
   private VcWareHouseInResultJosDto vcWareHouseInResultJosDto;

   @JsonProperty("vcWareHouseInResultJosDto")
   public void setVcWareHouseInResultJosDto(VcWareHouseInResultJosDto vcWareHouseInResultJosDto) {
      this.vcWareHouseInResultJosDto = vcWareHouseInResultJosDto;
   }

   @JsonProperty("vcWareHouseInResultJosDto")
   public VcWareHouseInResultJosDto getVcWareHouseInResultJosDto() {
      return this.vcWareHouseInResultJosDto;
   }
}
