package com.jd.open.api.sdk.domain.risk.KeeperWareRectificationService.request.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class KeeperWareRectificationDetailRequest implements Serializable {
   private Long wareId;

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }
}
