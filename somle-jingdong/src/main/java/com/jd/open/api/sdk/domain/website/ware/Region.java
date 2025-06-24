package com.jd.open.api.sdk.domain.website.ware;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Region {
   private Long regionId;
   private String resionName;

   @JsonProperty("region_id")
   public Long getRegionId() {
      return this.regionId;
   }

   @JsonProperty("region_id")
   public void setRegionId(Long regionId) {
      this.regionId = regionId;
   }

   @JsonProperty("region_name")
   public String getResionName() {
      return this.resionName;
   }

   @JsonProperty("region_name")
   public void setResionName(String resionName) {
      this.resionName = resionName;
   }
}
