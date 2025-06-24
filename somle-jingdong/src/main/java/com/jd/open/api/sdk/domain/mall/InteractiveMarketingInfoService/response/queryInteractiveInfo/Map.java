package com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.response.queryInteractiveInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Map implements Serializable {
   private String key;
   private Object value;

   @JsonProperty("key")
   public void setKey(String key) {
      this.key = key;
   }

   @JsonProperty("key")
   public String getKey() {
      return this.key;
   }

   @JsonProperty("value")
   public void setValue(Object value) {
      this.value = value;
   }

   @JsonProperty("value")
   public Object getValue() {
      return this.value;
   }
}
