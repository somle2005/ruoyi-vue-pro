package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.VcOutboundOrderJosAPI.response.ware.VcWareHouseOutDetailResultJosDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WarehouseOutboundOrderQueryDetailWareResponse extends AbstractResponse {
   private VcWareHouseOutDetailResultJosDto vcWareHouseOutDetailResultJosDto;

   @JsonProperty("vcWareHouseOutDetailResultJosDto")
   public void setVcWareHouseOutDetailResultJosDto(VcWareHouseOutDetailResultJosDto vcWareHouseOutDetailResultJosDto) {
      this.vcWareHouseOutDetailResultJosDto = vcWareHouseOutDetailResultJosDto;
   }

   @JsonProperty("vcWareHouseOutDetailResultJosDto")
   public VcWareHouseOutDetailResultJosDto getVcWareHouseOutDetailResultJosDto() {
      return this.vcWareHouseOutDetailResultJosDto;
   }
}
