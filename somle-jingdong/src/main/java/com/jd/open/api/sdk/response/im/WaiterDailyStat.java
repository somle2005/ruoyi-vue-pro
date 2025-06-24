package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WaiterDailyStat implements Serializable {
   private String date;
   private String waiter;
   private String result;

   @JsonProperty("date")
   public void setDate(String date) {
      this.date = date;
   }

   @JsonProperty("date")
   public String getDate() {
      return this.date;
   }

   @JsonProperty("waiter")
   public void setWaiter(String waiter) {
      this.waiter = waiter;
   }

   @JsonProperty("waiter")
   public String getWaiter() {
      return this.waiter;
   }

   @JsonProperty("result")
   public void setResult(String result) {
      this.result = result;
   }

   @JsonProperty("result")
   public String getResult() {
      return this.result;
   }
}
