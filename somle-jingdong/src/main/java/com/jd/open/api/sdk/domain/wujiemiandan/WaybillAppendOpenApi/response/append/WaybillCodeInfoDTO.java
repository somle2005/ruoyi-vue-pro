package com.jd.open.api.sdk.domain.wujiemiandan.WaybillAppendOpenApi.response.append;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WaybillCodeInfoDTO implements Serializable {
   private String waybillCode;

   @JsonProperty("waybillCode")
   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   @JsonProperty("waybillCode")
   public String getWaybillCode() {
      return this.waybillCode;
   }
}
