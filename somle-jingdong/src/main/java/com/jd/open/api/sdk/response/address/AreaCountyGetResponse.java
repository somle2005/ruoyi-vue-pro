package com.jd.open.api.sdk.response.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AreaCountyGetResponse extends AbstractResponse {
   private AreaListBeanVO[] countyAreas;
   private Boolean success;

   @JsonProperty("county_areas")
   public void setCountyAreas(AreaListBeanVO[] countyAreas) {
      this.countyAreas = countyAreas;
   }

   @JsonProperty("county_areas")
   public AreaListBeanVO[] getCountyAreas() {
      return this.countyAreas;
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
