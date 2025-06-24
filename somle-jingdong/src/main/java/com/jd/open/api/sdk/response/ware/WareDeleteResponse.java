package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareDeleteResponse extends AbstractResponse {
   private long wareId;
   private String created;

   public long getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_id")
   public void setWareId(long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("ware_id")
   public String getCreated() {
      return this.created;
   }

   public void setCreated(String created) {
      this.created = created;
   }
}
