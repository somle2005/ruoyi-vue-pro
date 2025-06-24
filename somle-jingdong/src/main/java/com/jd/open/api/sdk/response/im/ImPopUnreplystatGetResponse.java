package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class ImPopUnreplystatGetResponse extends AbstractResponse {
   private List<WaiterDailyStat> WaiterDailyStat;

   @JsonProperty("WaiterDailyStat")
   public void setWaiterDailyStat(List<WaiterDailyStat> WaiterDailyStat) {
      this.WaiterDailyStat = WaiterDailyStat;
   }

   @JsonProperty("WaiterDailyStat")
   public List<WaiterDailyStat> getWaiterDailyStat() {
      return this.WaiterDailyStat;
   }
}
