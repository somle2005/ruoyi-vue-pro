package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareUpdateListingResponse extends AbstractResponse {
   private long wareId;
   private String modified;

   @JsonProperty("ware_id")
   public long getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_id")
   public void setWareId(long wareId) {
      this.wareId = wareId;
   }

   public String getModified() {
      return this.modified;
   }

   public void setModified(String modified) {
      this.modified = modified;
   }
}
