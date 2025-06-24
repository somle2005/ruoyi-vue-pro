package com.jd.open.api.sdk.response.sellercat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerCatUpdateResponse extends AbstractResponse {
   private String modified;
   private String cid;

   @JsonProperty("modified")
   public String getModified() {
      return this.modified;
   }

   @JsonProperty("modified")
   public void setModified(String modified) {
      this.modified = modified;
   }

   @JsonProperty("cid")
   public String getCid() {
      return this.cid;
   }

   @JsonProperty("cid")
   public void setCid(String cid) {
      this.cid = cid;
   }
}
