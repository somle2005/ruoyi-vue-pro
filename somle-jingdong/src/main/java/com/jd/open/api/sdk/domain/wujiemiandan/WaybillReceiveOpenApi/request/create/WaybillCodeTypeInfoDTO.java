package com.jd.open.api.sdk.domain.wujiemiandan.WaybillReceiveOpenApi.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WaybillCodeTypeInfoDTO implements Serializable {
   private String waybillCode;
   private Integer associationType;

   @JsonProperty("waybillCode")
   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   @JsonProperty("waybillCode")
   public String getWaybillCode() {
      return this.waybillCode;
   }

   @JsonProperty("associationType")
   public void setAssociationType(Integer associationType) {
      this.associationType = associationType;
   }

   @JsonProperty("associationType")
   public Integer getAssociationType() {
      return this.associationType;
   }
}
