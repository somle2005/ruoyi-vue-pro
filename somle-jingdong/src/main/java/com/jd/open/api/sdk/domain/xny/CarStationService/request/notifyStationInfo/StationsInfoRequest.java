package com.jd.open.api.sdk.domain.xny.CarStationService.request.notifyStationInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class StationsInfoRequest implements Serializable {
   private List<ChargeStationsInfoVO> StationInfos;

   @JsonProperty("StationInfos")
   public void setStationInfos(List<ChargeStationsInfoVO> StationInfos) {
      this.StationInfos = StationInfos;
   }

   @JsonProperty("StationInfos")
   public List<ChargeStationsInfoVO> getStationInfos() {
      return this.StationInfos;
   }
}
