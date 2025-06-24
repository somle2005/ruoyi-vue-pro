package com.jd.open.api.sdk.domain.xny.EquipmentService.request.queryEquipmentsPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class TWQueryEquipmentsRpcRequest implements Serializable {
   private Double latitude;
   private String searchName;
   private String source;
   private Double longitude;

   @JsonProperty("latitude")
   public void setLatitude(Double latitude) {
      this.latitude = latitude;
   }

   @JsonProperty("latitude")
   public Double getLatitude() {
      return this.latitude;
   }

   @JsonProperty("searchName")
   public void setSearchName(String searchName) {
      this.searchName = searchName;
   }

   @JsonProperty("searchName")
   public String getSearchName() {
      return this.searchName;
   }

   @JsonProperty("source")
   public void setSource(String source) {
      this.source = source;
   }

   @JsonProperty("source")
   public String getSource() {
      return this.source;
   }

   @JsonProperty("longitude")
   public void setLongitude(Double longitude) {
      this.longitude = longitude;
   }

   @JsonProperty("longitude")
   public Double getLongitude() {
      return this.longitude;
   }
}
