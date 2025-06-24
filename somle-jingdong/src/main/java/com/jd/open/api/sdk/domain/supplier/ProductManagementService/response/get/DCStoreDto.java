package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DCStoreDto implements Serializable {
   private Integer dcid;
   private Integer sid;
   private String clpsCode;

   @JsonProperty("dcid")
   public void setDcid(Integer dcid) {
      this.dcid = dcid;
   }

   @JsonProperty("dcid")
   public Integer getDcid() {
      return this.dcid;
   }

   @JsonProperty("sid")
   public void setSid(Integer sid) {
      this.sid = sid;
   }

   @JsonProperty("sid")
   public Integer getSid() {
      return this.sid;
   }

   @JsonProperty("clpsCode")
   public void setClpsCode(String clpsCode) {
      this.clpsCode = clpsCode;
   }

   @JsonProperty("clpsCode")
   public String getClpsCode() {
      return this.clpsCode;
   }
}
