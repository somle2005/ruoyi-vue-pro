package com.jd.open.api.sdk.domain.vopdz.QueryAddressOpenProvider.response.queryJdAreaIdList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AreaInfoBaseResp implements Serializable {
   private String areaName;
   private Long areaId;

   @JsonProperty("areaName")
   public void setAreaName(String areaName) {
      this.areaName = areaName;
   }

   @JsonProperty("areaName")
   public String getAreaName() {
      return this.areaName;
   }

   @JsonProperty("areaId")
   public void setAreaId(Long areaId) {
      this.areaId = areaId;
   }

   @JsonProperty("areaId")
   public Long getAreaId() {
      return this.areaId;
   }
}
