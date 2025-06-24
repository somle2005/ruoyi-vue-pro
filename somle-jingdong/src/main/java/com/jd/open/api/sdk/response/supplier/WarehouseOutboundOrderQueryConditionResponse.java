package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.VcOutboundOrderJosAPI.response.condition.VcWareHouseOutInfoJosDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WarehouseOutboundOrderQueryConditionResponse extends AbstractResponse {
   private VcWareHouseOutInfoJosDto vcWareHouseOutInfoJosDto;

   @JsonProperty("vcWareHouseOutInfoJosDto")
   public void setVcWareHouseOutInfoJosDto(VcWareHouseOutInfoJosDto vcWareHouseOutInfoJosDto) {
      this.vcWareHouseOutInfoJosDto = vcWareHouseOutInfoJosDto;
   }

   @JsonProperty("vcWareHouseOutInfoJosDto")
   public VcWareHouseOutInfoJosDto getVcWareHouseOutInfoJosDto() {
      return this.vcWareHouseOutInfoJosDto;
   }
}
