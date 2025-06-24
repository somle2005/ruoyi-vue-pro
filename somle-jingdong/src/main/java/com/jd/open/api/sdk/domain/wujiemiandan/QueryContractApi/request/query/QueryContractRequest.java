package com.jd.open.api.sdk.domain.wujiemiandan.QueryContractApi.request.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class QueryContractRequest implements Serializable {
   private String vendorCode;

   @JsonProperty("vendorCode")
   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendorCode")
   public String getVendorCode() {
      return this.vendorCode;
   }
}
