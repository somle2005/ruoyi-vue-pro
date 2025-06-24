package com.jd.open.api.sdk.response.sellercat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerCatAddResponse extends AbstractResponse {
   private String createTime;
   private String cid;

   @JsonProperty("create_time")
   public String getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("create_time")
   public void setCreateTime(String createTime) {
      this.createTime = createTime;
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
