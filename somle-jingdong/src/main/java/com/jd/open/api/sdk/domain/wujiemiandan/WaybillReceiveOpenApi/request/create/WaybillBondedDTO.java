package com.jd.open.api.sdk.domain.wujiemiandan.WaybillReceiveOpenApi.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WaybillBondedDTO implements Serializable {
   private String customsCode;

   @JsonProperty("customsCode")
   public void setCustomsCode(String customsCode) {
      this.customsCode = customsCode;
   }

   @JsonProperty("customsCode")
   public String getCustomsCode() {
      return this.customsCode;
   }
}
