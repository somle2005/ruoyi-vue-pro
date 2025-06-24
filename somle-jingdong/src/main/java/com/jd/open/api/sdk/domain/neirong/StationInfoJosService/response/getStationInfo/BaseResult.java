package com.jd.open.api.sdk.domain.neirong.StationInfoJosService.response.getStationInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BaseResult implements Serializable {
   private Integer statusCode;
   private String message;
   private StationAreaInfoDTO data;

   @JsonProperty("statusCode")
   public void setStatusCode(Integer statusCode) {
      this.statusCode = statusCode;
   }

   @JsonProperty("statusCode")
   public Integer getStatusCode() {
      return this.statusCode;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("data")
   public void setData(StationAreaInfoDTO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public StationAreaInfoDTO getData() {
      return this.data;
   }
}
