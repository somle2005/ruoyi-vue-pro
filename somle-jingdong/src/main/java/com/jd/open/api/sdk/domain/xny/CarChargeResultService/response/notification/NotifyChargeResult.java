package com.jd.open.api.sdk.domain.xny.CarChargeResultService.response.notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class NotifyChargeResult implements Serializable {
   private String StartChargeSeq;
   private Integer SuccStat;
   private Integer FailReason;

   @JsonProperty("StartChargeSeq")
   public void setStartChargeSeq(String StartChargeSeq) {
      this.StartChargeSeq = StartChargeSeq;
   }

   @JsonProperty("StartChargeSeq")
   public String getStartChargeSeq() {
      return this.StartChargeSeq;
   }

   @JsonProperty("SuccStat")
   public void setSuccStat(Integer SuccStat) {
      this.SuccStat = SuccStat;
   }

   @JsonProperty("SuccStat")
   public Integer getSuccStat() {
      return this.SuccStat;
   }

   @JsonProperty("FailReason")
   public void setFailReason(Integer FailReason) {
      this.FailReason = FailReason;
   }

   @JsonProperty("FailReason")
   public Integer getFailReason() {
      return this.FailReason;
   }
}
