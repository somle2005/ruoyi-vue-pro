package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class ImPopEvaluationstatGetResponse extends AbstractResponse {
   private List<WaiterDailyEvaStat> WaiterDailyEvaStat;

   @JsonProperty("WaiterDailyEvaStat")
   public void setWaiterDailyEvaStat(List<WaiterDailyEvaStat> WaiterDailyEvaStat) {
      this.WaiterDailyEvaStat = WaiterDailyEvaStat;
   }

   @JsonProperty("WaiterDailyEvaStat")
   public List<WaiterDailyEvaStat> getWaiterDailyEvaStat() {
      return this.WaiterDailyEvaStat;
   }
}
