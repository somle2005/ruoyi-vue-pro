package com.jd.open.api.sdk.response.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AreaTownGetResponse extends AbstractResponse {
   private AreaListBeanVO[] townAreas;
   private Boolean success;

   @JsonProperty("town_areas")
   public void setTownAreas(AreaListBeanVO[] townAreas) {
      this.townAreas = townAreas;
   }

   @JsonProperty("town_areas")
   public AreaListBeanVO[] getTownAreas() {
      return this.townAreas;
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
