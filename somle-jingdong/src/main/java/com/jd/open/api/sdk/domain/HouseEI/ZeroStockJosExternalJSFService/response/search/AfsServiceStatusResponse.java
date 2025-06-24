package com.jd.open.api.sdk.domain.HouseEI.ZeroStockJosExternalJSFService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AfsServiceStatusResponse implements Serializable {
   private String serviceNo;
   private String afsServiceTaskNo;
   private Integer afsServiceStatus;
   private String message;
   private String latestUpdateTime;

   @JsonProperty("serviceNo")
   public void setServiceNo(String serviceNo) {
      this.serviceNo = serviceNo;
   }

   @JsonProperty("serviceNo")
   public String getServiceNo() {
      return this.serviceNo;
   }

   @JsonProperty("afsServiceTaskNo")
   public void setAfsServiceTaskNo(String afsServiceTaskNo) {
      this.afsServiceTaskNo = afsServiceTaskNo;
   }

   @JsonProperty("afsServiceTaskNo")
   public String getAfsServiceTaskNo() {
      return this.afsServiceTaskNo;
   }

   @JsonProperty("afsServiceStatus")
   public void setAfsServiceStatus(Integer afsServiceStatus) {
      this.afsServiceStatus = afsServiceStatus;
   }

   @JsonProperty("afsServiceStatus")
   public Integer getAfsServiceStatus() {
      return this.afsServiceStatus;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("latestUpdateTime")
   public void setLatestUpdateTime(String latestUpdateTime) {
      this.latestUpdateTime = latestUpdateTime;
   }

   @JsonProperty("latestUpdateTime")
   public String getLatestUpdateTime() {
      return this.latestUpdateTime;
   }
}
