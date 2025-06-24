package com.jd.open.api.sdk.response.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AreaProvinceGetResponse extends AbstractResponse {
   private AreaListBeanVO[] provinceAreas;
   private Boolean success;

   @JsonProperty("province_areas")
   public void setProvinceAreas(AreaListBeanVO[] provinceAreas) {
      this.provinceAreas = provinceAreas;
   }

   @JsonProperty("province_areas")
   public AreaListBeanVO[] getProvinceAreas() {
      return this.provinceAreas;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }
}
