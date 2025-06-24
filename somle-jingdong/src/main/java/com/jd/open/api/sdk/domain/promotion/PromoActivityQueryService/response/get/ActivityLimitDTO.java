package com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ActivityLimitDTO implements Serializable {
   private Integer numLimited;
   private Integer maxNum;
   private Integer minNum;

   @JsonProperty("numLimited")
   public void setNumLimited(Integer numLimited) {
      this.numLimited = numLimited;
   }

   @JsonProperty("numLimited")
   public Integer getNumLimited() {
      return this.numLimited;
   }

   @JsonProperty("maxNum")
   public void setMaxNum(Integer maxNum) {
      this.maxNum = maxNum;
   }

   @JsonProperty("maxNum")
   public Integer getMaxNum() {
      return this.maxNum;
   }

   @JsonProperty("minNum")
   public void setMinNum(Integer minNum) {
      this.minNum = minNum;
   }

   @JsonProperty("minNum")
   public Integer getMinNum() {
      return this.minNum;
   }
}
