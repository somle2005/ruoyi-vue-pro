package com.jd.open.api.sdk.domain.etms.WaybillTrackAndTimePositionApi.response.WaybillTrackAndTimePositionApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class WaybillGisDto implements Serializable {
   private Double lat;
   private Double lng;
   private Date gpsTime;

   @JsonProperty("lat")
   public void setLat(Double lat) {
      this.lat = lat;
   }

   @JsonProperty("lat")
   public Double getLat() {
      return this.lat;
   }

   @JsonProperty("lng")
   public void setLng(Double lng) {
      this.lng = lng;
   }

   @JsonProperty("lng")
   public Double getLng() {
      return this.lng;
   }

   @JsonProperty("gpsTime")
   public void setGpsTime(Date gpsTime) {
      this.gpsTime = gpsTime;
   }

   @JsonProperty("gpsTime")
   public Date getGpsTime() {
      return this.gpsTime;
   }
}
