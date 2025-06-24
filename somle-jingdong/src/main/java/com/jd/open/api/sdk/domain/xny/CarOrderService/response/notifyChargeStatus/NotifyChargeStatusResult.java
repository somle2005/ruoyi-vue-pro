package com.jd.open.api.sdk.domain.xny.CarOrderService.response.notifyChargeStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class NotifyChargeStatusResult implements Serializable {
   private String startChargeSeq;
   private Integer succStat;

   @JsonProperty("startChargeSeq")
   public void setStartChargeSeq(String startChargeSeq) {
      this.startChargeSeq = startChargeSeq;
   }

   @JsonProperty("startChargeSeq")
   public String getStartChargeSeq() {
      return this.startChargeSeq;
   }

   @JsonProperty("succStat")
   public void setSuccStat(Integer succStat) {
      this.succStat = succStat;
   }

   @JsonProperty("succStat")
   public Integer getSuccStat() {
      return this.succStat;
   }
}
