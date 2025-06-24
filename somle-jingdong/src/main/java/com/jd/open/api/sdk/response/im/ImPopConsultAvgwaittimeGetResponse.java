package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ImPopConsultAvgwaittimeGetResponse extends AbstractResponse {
   private Double avgTime;

   @JsonProperty("avgTime")
   public void setAvgTime(Double avgTime) {
      this.avgTime = avgTime;
   }

   @JsonProperty("avgTime")
   public Double getAvgTime() {
      return this.avgTime;
   }
}
