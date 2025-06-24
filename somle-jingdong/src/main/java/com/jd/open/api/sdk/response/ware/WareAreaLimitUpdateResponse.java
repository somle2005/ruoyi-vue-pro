package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareAreaLimitUpdateResponse extends AbstractResponse {
   private long wareId;

   @JsonProperty("ware_id")
   public long getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_id")
   public void setWareId(long wareId) {
      this.wareId = wareId;
   }
}
