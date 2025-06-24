package com.jd.open.api.sdk.domain.wujiemiandan.WaybillReceiveOpenApi.response.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WaybillPackageNoDTO implements Serializable {
   private Integer serialNumber;
   private String packageNo;

   @JsonProperty("serialNumber")
   public void setSerialNumber(Integer serialNumber) {
      this.serialNumber = serialNumber;
   }

   @JsonProperty("serialNumber")
   public Integer getSerialNumber() {
      return this.serialNumber;
   }

   @JsonProperty("packageNo")
   public void setPackageNo(String packageNo) {
      this.packageNo = packageNo;
   }

   @JsonProperty("packageNo")
   public String getPackageNo() {
      return this.packageNo;
   }
}
