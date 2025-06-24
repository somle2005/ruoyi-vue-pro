package com.jd.open.api.sdk.domain.ware.UserBehaviorService.response.getUserClickSku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuBehavior implements Serializable {
   private Long count;
   private String sourcetype;
   private Long time;
   private Long sku;

   @JsonProperty("count")
   public void setCount(Long count) {
      this.count = count;
   }

   @JsonProperty("count")
   public Long getCount() {
      return this.count;
   }

   @JsonProperty("sourcetype")
   public void setSourcetype(String sourcetype) {
      this.sourcetype = sourcetype;
   }

   @JsonProperty("sourcetype")
   public String getSourcetype() {
      return this.sourcetype;
   }

   @JsonProperty("time")
   public void setTime(Long time) {
      this.time = time;
   }

   @JsonProperty("time")
   public Long getTime() {
      return this.time;
   }

   @JsonProperty("sku")
   public void setSku(Long sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public Long getSku() {
      return this.sku;
   }
}
