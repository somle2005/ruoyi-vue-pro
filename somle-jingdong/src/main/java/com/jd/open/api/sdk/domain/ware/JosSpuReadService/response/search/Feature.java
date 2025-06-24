package com.jd.open.api.sdk.domain.ware.JosSpuReadService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Feature implements Serializable {
   private String key;
   private String value;

   @JsonProperty("key")
   public void setKey(String key) {
      this.key = key;
   }

   @JsonProperty("key")
   public String getKey() {
      return this.key;
   }

   @JsonProperty("value")
   public void setValue(String value) {
      this.value = value;
   }

   @JsonProperty("value")
   public String getValue() {
      return this.value;
   }
}
