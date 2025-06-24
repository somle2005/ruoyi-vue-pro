package com.jd.open.api.sdk.domain.B2B.B2bSkuToPoolReadService.response.querySkuToPool;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class B2bSkuToPoolDto implements Serializable {
   private String creator;
   private Long jdSkuId;
   private Date created;
   private Long b2bPoolId;

   @JsonProperty("creator")
   public void setCreator(String creator) {
      this.creator = creator;
   }

   @JsonProperty("creator")
   public String getCreator() {
      return this.creator;
   }

   @JsonProperty("jdSkuId")
   public void setJdSkuId(Long jdSkuId) {
      this.jdSkuId = jdSkuId;
   }

   @JsonProperty("jdSkuId")
   public Long getJdSkuId() {
      return this.jdSkuId;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("b2bPoolId")
   public void setB2bPoolId(Long b2bPoolId) {
      this.b2bPoolId = b2bPoolId;
   }

   @JsonProperty("b2bPoolId")
   public Long getB2bPoolId() {
      return this.b2bPoolId;
   }
}
