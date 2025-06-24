package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderTrack implements Serializable {
   private Long jdOrderId;
   private List<TrackShow> trackShows;

   @JsonProperty("jdOrderId")
   public void setJdOrderId(Long jdOrderId) {
      this.jdOrderId = jdOrderId;
   }

   @JsonProperty("jdOrderId")
   public Long getJdOrderId() {
      return this.jdOrderId;
   }

   @JsonProperty("trackShows")
   public void setTrackShows(List<TrackShow> trackShows) {
      this.trackShows = trackShows;
   }

   @JsonProperty("trackShows")
   public List<TrackShow> getTrackShows() {
      return this.trackShows;
   }
}
