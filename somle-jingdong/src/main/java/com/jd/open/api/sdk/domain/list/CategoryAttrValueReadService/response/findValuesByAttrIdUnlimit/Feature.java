package com.jd.open.api.sdk.domain.list.CategoryAttrValueReadService.response.findValuesByAttrIdUnlimit;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Feature implements Serializable {
   private String key;
   private String fvalue;
   private String cn;

   @JsonProperty("key")
   public void setKey(String key) {
      this.key = key;
   }

   @JsonProperty("key")
   public String getKey() {
      return this.key;
   }

   @JsonProperty("fvalue")
   public void setFvalue(String fvalue) {
      this.fvalue = fvalue;
   }

   @JsonProperty("fvalue")
   public String getFvalue() {
      return this.fvalue;
   }

   @JsonProperty("cn")
   public void setCn(String cn) {
      this.cn = cn;
   }

   @JsonProperty("cn")
   public String getCn() {
      return this.cn;
   }
}
