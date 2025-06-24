package com.jd.open.api.sdk.domain.etms.PickupTimeRangeApi.response.getPickupIntimeList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResponseDTO implements Serializable {
   private List<PickupDate> data;
   private Integer statusCode;
   private String statusMessage;

   @JsonProperty("data")
   public void setData(List<PickupDate> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<PickupDate> getData() {
      return this.data;
   }

   @JsonProperty("statusCode")
   public void setStatusCode(Integer statusCode) {
      this.statusCode = statusCode;
   }

   @JsonProperty("statusCode")
   public Integer getStatusCode() {
      return this.statusCode;
   }

   @JsonProperty("statusMessage")
   public void setStatusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
   }

   @JsonProperty("statusMessage")
   public String getStatusMessage() {
      return this.statusMessage;
   }
}
