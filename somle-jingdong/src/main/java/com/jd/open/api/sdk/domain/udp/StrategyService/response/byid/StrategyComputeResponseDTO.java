package com.jd.open.api.sdk.domain.udp.StrategyService.response.byid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StrategyComputeResponseDTO implements Serializable {
   private Long total;
   private Long member;

   @JsonProperty("total")
   public void setTotal(Long total) {
      this.total = total;
   }

   @JsonProperty("total")
   public Long getTotal() {
      return this.total;
   }

   @JsonProperty("member")
   public void setMember(Long member) {
      this.member = member;
   }

   @JsonProperty("member")
   public Long getMember() {
      return this.member;
   }
}
