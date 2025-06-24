package com.jd.open.api.sdk.domain.supplier.PoCommonForJosWebService.response.getcomponentlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Component implements Serializable {
   private String key;
   private String name;

   @JsonProperty("key")
   public void setKey(String key) {
      this.key = key;
   }

   @JsonProperty("key")
   public String getKey() {
      return this.key;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }
}
