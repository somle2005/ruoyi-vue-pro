package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VenderBrandPubInfo implements Serializable {
   private Integer erpBrandId;
   private String brandName;

   @JsonProperty("erpBrandId")
   public void setErpBrandId(Integer erpBrandId) {
      this.erpBrandId = erpBrandId;
   }

   @JsonProperty("erpBrandId")
   public Integer getErpBrandId() {
      return this.erpBrandId;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }
}
