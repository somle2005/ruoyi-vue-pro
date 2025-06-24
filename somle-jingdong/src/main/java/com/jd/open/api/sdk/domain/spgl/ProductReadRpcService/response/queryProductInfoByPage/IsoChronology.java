package com.jd.open.api.sdk.domain.spgl.ProductReadRpcService.response.queryProductInfoByPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class IsoChronology implements Serializable {
   private String chronologyId;
   private String calendarType;

   @JsonProperty("chronologyId")
   public void setChronologyId(String chronologyId) {
      this.chronologyId = chronologyId;
   }

   @JsonProperty("chronologyId")
   public String getChronologyId() {
      return this.chronologyId;
   }

   @JsonProperty("calendarType")
   public void setCalendarType(String calendarType) {
      this.calendarType = calendarType;
   }

   @JsonProperty("calendarType")
   public String getCalendarType() {
      return this.calendarType;
   }
}
