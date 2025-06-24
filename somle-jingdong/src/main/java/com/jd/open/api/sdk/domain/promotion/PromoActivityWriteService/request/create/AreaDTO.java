package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AreaDTO implements Serializable {
   private Integer areaBound;
   private String area;

   @JsonProperty("areaBound")
   public void setAreaBound(Integer areaBound) {
      this.areaBound = areaBound;
   }

   @JsonProperty("areaBound")
   public Integer getAreaBound() {
      return this.areaBound;
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
