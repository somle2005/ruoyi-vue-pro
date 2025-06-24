package com.jd.open.api.sdk.domain.etms.GeneralWaybillQueryApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResponseDTO implements Serializable {
   private Integer statusCode;
   private String statusMessage;
   private PackageAndWeightDTO data;

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
   public void setData(PackageAndWeightDTO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public PackageAndWeightDTO getData() {
      return this.data;
   }
}
