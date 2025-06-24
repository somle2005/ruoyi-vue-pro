package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.VcOutboundOrderJosAPI.response.list.VcWareHouseOutResultJosDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WarehouseOutboundOrderQueryListResponse extends AbstractResponse {
   private VcWareHouseOutResultJosDto vcWareHouseOutResultJosDto;

   @JsonProperty("vcWareHouseOutResultJosDto")
   public void setVcWareHouseOutResultJosDto(VcWareHouseOutResultJosDto vcWareHouseOutResultJosDto) {
      this.vcWareHouseOutResultJosDto = vcWareHouseOutResultJosDto;
   }

   @JsonProperty("vcWareHouseOutResultJosDto")
   public VcWareHouseOutResultJosDto getVcWareHouseOutResultJosDto() {
      return this.vcWareHouseOutResultJosDto;
   }
}
