package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WaiterDailyEvaStat implements Serializable {
   private String date;
   private String waiter;
   private int score;
   private int count;

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

   @JsonProperty("score")
   public void setScore(int score) {
      this.score = score;
   }

   @JsonProperty("score")
   public int getScore() {
      return this.score;
   }

   @JsonProperty("count")
   public void setCount(int count) {
      this.count = count;
   }

   @JsonProperty("count")
   public int getCount() {
      return this.count;
   }
}
