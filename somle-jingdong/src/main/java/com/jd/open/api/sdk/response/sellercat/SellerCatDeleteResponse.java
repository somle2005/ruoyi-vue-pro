package com.jd.open.api.sdk.response.sellercat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerCatDeleteResponse extends AbstractResponse {
   private long cid;
   private String created;

   @JsonProperty("cid")
   public long getCid() {
      return this.cid;
   }

   @JsonProperty("cid")
   public void setCid(long cid) {
      this.cid = cid;
   }

   @JsonProperty("created")
   public String getCreated() {
      return this.created;
   }

   @JsonProperty("created")
   public void setCreated(String created) {
      this.created = created;
   }
}
