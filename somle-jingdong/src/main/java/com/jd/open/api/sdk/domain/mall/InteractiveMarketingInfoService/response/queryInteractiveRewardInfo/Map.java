package com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.response.queryInteractiveRewardInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Map implements Serializable {
   private String key1;
   private Object value1;

   @JsonProperty("key1")
   public void setKey1(String key1) {
      this.key1 = key1;
   }

   @JsonProperty("key1")
   public String getKey1() {
      return this.key1;
   }

   @JsonProperty("value1")
   public void setValue1(Object value1) {
      this.value1 = value1;
   }

   @JsonProperty("value1")
   public Object getValue1() {
      return this.value1;
   }
}
