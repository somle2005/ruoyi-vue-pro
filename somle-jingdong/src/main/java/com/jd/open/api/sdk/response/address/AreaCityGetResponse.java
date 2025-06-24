package com.jd.open.api.sdk.response.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AreaCityGetResponse extends AbstractResponse {
   private AreaListBeanVO[] cityAreas;
   private Boolean success;

   @JsonProperty("city_areas")
   public void setCityAreas(AreaListBeanVO[] cityAreas) {
      this.cityAreas = cityAreas;
   }

   @JsonProperty("city_areas")
   public AreaListBeanVO[] getCityAreas() {
      return this.cityAreas;
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
