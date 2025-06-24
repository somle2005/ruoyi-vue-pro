package com.jd.open.api.sdk.domain.wujiemiandan.WaybillReceiveOpenApi.response.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class WaybillCodeInfoDTO implements Serializable {
   private String waybillCode;
   private List<WaybillPackageNoDTO> waybillPackageNoList;

   @JsonProperty("waybillCode")
   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   @JsonProperty("waybillCode")
   public String getWaybillCode() {
      return this.waybillCode;
   }

   @JsonProperty("waybillPackageNoList")
   public void setWaybillPackageNoList(List<WaybillPackageNoDTO> waybillPackageNoList) {
      this.waybillPackageNoList = waybillPackageNoList;
   }

   @JsonProperty("waybillPackageNoList")
   public List<WaybillPackageNoDTO> getWaybillPackageNoList() {
      return this.waybillPackageNoList;
   }
}
