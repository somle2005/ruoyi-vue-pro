package com.jd.open.api.sdk.domain.mall.http.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ObjA_Price implements Serializable {
   private String max;
   private String min;

   @JsonProperty("max")
   public void setMax(String max) {
      this.max = max;
   }

   @JsonProperty("max")
   public String getMax() {
      return this.max;
   }

   @JsonProperty("min")
   public void setMin(String min) {
      this.min = min;
   }

   @JsonProperty("min")
   public String getMin() {
      return this.min;
   }
}
