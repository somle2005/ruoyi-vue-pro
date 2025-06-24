package com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AreaDTO implements Serializable {
   private Integer bound;
   private String area;

   @JsonProperty("bound")
   public void setBound(Integer bound) {
      this.bound = bound;
   }

   @JsonProperty("bound")
   public Integer getBound() {
      return this.bound;
   }

   @JsonProperty("area")
   public void setArea(String area) {
      this.area = area;
   }

   @JsonProperty("area")
   public String getArea() {
      return this.area;
   }
}
