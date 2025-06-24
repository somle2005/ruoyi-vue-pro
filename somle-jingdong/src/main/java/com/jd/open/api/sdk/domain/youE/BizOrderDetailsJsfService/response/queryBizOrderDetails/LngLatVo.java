package com.jd.open.api.sdk.domain.youE.BizOrderDetailsJsfService.response.queryBizOrderDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class LngLatVo implements Serializable {
   private String upDoorLng;
   private String upDoorLat;

   @JsonProperty("upDoorLng")
   public void setUpDoorLng(String upDoorLng) {
      this.upDoorLng = upDoorLng;
   }

   @JsonProperty("upDoorLng")
   public String getUpDoorLng() {
      return this.upDoorLng;
   }

   @JsonProperty("upDoorLat")
   public void setUpDoorLat(String upDoorLat) {
      this.upDoorLat = upDoorLat;
   }

   @JsonProperty("upDoorLat")
   public String getUpDoorLat() {
      return this.upDoorLat;
   }
}
