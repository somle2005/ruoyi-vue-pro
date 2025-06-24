package com.jd.open.api.sdk.domain.alpha.OrderTrackSiteExport.response.getTrackShowResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderTrackShowResult implements Serializable {
   private boolean success;
   private String errorMessage;
   private TrackShowResult trackShowResult;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorMessage")
   public void setErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
   }

   @JsonProperty("errorMessage")
   public String getErrorMessage() {
      return this.errorMessage;
   }

   @JsonProperty("trackShowResult")
   public void setTrackShowResult(TrackShowResult trackShowResult) {
      this.trackShowResult = trackShowResult;
   }

   @JsonProperty("trackShowResult")
   public TrackShowResult getTrackShowResult() {
      return this.trackShowResult;
   }
}
