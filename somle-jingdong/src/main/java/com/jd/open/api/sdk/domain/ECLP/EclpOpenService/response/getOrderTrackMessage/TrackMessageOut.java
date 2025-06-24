package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.getOrderTrackMessage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class TrackMessageOut implements Serializable {
   private String ts;
   private String message;

   @JsonProperty("ts")
   public void setTs(String ts) {
      this.ts = ts;
   }

   @JsonProperty("ts")
   public String getTs() {
      return this.ts;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }
}
