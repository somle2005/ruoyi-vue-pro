package com.jd.open.api.sdk.domain.gysyuyue.SvcBookingApiService.response.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SvcApiVerificationInfo implements Serializable {
   private Long bookingId;

   @JsonProperty("bookingId")
   public void setBookingId(Long bookingId) {
      this.bookingId = bookingId;
   }

   @JsonProperty("bookingId")
   public Long getBookingId() {
      return this.bookingId;
   }
}
