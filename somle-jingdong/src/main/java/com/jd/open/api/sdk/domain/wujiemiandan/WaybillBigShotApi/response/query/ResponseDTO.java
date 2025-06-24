package com.jd.open.api.sdk.domain.wujiemiandan.WaybillBigShotApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResponseDTO implements Serializable {
   private Integer statusCode;
   private String statusMessage;
   private List<BigShotDTO> data;

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

   @JsonProperty("data")
   public void setData(List<BigShotDTO> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<BigShotDTO> getData() {
      return this.data;
   }
}
