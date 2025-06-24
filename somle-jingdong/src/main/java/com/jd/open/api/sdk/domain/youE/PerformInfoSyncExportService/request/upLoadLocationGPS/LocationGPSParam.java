package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.upLoadLocationGPS;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class LocationGPSParam implements Serializable {
   private String orderNo;
   private String lng;
   private Integer locationType;
   private Integer engineerId;
   private String lat;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("lng")
   public void setLng(String lng) {
      this.lng = lng;
   }

   @JsonProperty("lng")
   public String getLng() {
      return this.lng;
   }

   @JsonProperty("locationType")
   public void setLocationType(Integer locationType) {
      this.locationType = locationType;
   }

   @JsonProperty("locationType")
   public Integer getLocationType() {
      return this.locationType;
   }

   @JsonProperty("engineerId")
   public void setEngineerId(Integer engineerId) {
      this.engineerId = engineerId;
   }

   @JsonProperty("engineerId")
   public Integer getEngineerId() {
      return this.engineerId;
   }

   @JsonProperty("lat")
   public void setLat(String lat) {
      this.lat = lat;
   }

   @JsonProperty("lat")
   public String getLat() {
      return this.lat;
   }
}
