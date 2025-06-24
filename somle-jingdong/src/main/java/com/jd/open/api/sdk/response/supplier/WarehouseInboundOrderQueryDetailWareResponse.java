package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.VcInboundOrderJosAPI.response.ware.VcWareHouseInDetailResultJosDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WarehouseInboundOrderQueryDetailWareResponse extends AbstractResponse {
   private VcWareHouseInDetailResultJosDto vcWareHouseInDetailResultJosDto;

   @JsonProperty("vcWareHouseInDetailResultJosDto")
   public void setVcWareHouseInDetailResultJosDto(VcWareHouseInDetailResultJosDto vcWareHouseInDetailResultJosDto) {
      this.vcWareHouseInDetailResultJosDto = vcWareHouseInDetailResultJosDto;
   }

   @JsonProperty("vcWareHouseInDetailResultJosDto")
   public VcWareHouseInDetailResultJosDto getVcWareHouseInDetailResultJosDto() {
      return this.vcWareHouseInDetailResultJosDto;
   }
}
