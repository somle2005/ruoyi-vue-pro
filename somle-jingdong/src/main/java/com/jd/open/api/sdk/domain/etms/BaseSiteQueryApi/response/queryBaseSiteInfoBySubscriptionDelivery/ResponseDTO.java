package com.jd.open.api.sdk.domain.etms.BaseSiteQueryApi.response.queryBaseSiteInfoBySubscriptionDelivery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResponseDTO implements Serializable {
   private String statusMessage;
   private Integer statusCode;
   private BaseSiteInfoDTO data;

   @JsonProperty("statusMessage")
   public void setStatusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
   }

   @JsonProperty("statusMessage")
   public String getStatusMessage() {
      return this.statusMessage;
   }

   @JsonProperty("statusCode")
   public void setStatusCode(Integer statusCode) {
      this.statusCode = statusCode;
   }

   @JsonProperty("statusCode")
   public Integer getStatusCode() {
      return this.statusCode;
   }

   @JsonProperty("data")
   public void setData(BaseSiteInfoDTO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public BaseSiteInfoDTO getData() {
      return this.data;
   }
}
