package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Waiter implements Serializable {
   private String waiter;
   private Byte yn;
   private String leader;
   private String level;

   @JsonProperty("waiter")
   public void setWaiter(String waiter) {
      this.waiter = waiter;
   }

   @JsonProperty("waiter")
   public String getWaiter() {
      return this.waiter;
   }

   @JsonProperty("yn")
   public void setYn(Byte yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public Byte getYn() {
      return this.yn;
   }

   @JsonProperty("leader")
   public void setLeader(String leader) {
      this.leader = leader;
   }

   @JsonProperty("leader")
   public String getLeader() {
      return this.leader;
   }

   @JsonProperty("level")
   public void setLevel(String level) {
      this.level = level;
   }

   @JsonProperty("level")
   public String getLevel() {
      return this.level;
   }
}
