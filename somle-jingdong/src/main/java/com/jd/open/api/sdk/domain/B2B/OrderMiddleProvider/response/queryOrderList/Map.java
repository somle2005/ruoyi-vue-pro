package com.jd.open.api.sdk.domain.B2B.OrderMiddleProvider.response.queryOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Map implements Serializable {
   private String key1;

   @JsonProperty("key1")
   public void setKey1(String key1) {
      this.key1 = key1;
   }

   @JsonProperty("key1")
   public String getKey1() {
      return this.key1;
   }
}
