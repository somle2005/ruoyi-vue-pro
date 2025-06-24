package com.jd.open.api.sdk.domain.iopdz.QueryAddressOpenProvider.response.queryJdAreaIdList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AreaInfoBaseResp implements Serializable {
   private long areaId;
   private String areaName;

   @JsonProperty("areaId")
   public void setAreaId(long areaId) {
      this.areaId = areaId;
   }

   @JsonProperty("areaId")
   public long getAreaId() {
      return this.areaId;
   }

   @JsonProperty("areaName")
   public void setAreaName(String areaName) {
      this.areaName = areaName;
   }

   @JsonProperty("areaName")
   public String getAreaName() {
      return this.areaName;
   }
}
