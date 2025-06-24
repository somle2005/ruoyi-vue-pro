package com.jd.open.api.sdk.domain.afsservice.NegotiationOperateSoaService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ApplyReasonDTO implements Serializable {
   private Integer key;
   private String desc;

   @JsonProperty("key")
   public void setKey(Integer key) {
      this.key = key;
   }

   @JsonProperty("key")
   public Integer getKey() {
      return this.key;
   }

   @JsonProperty("desc")
   public void setDesc(String desc) {
      this.desc = desc;
   }

   @JsonProperty("desc")
   public String getDesc() {
      return this.desc;
   }
}
