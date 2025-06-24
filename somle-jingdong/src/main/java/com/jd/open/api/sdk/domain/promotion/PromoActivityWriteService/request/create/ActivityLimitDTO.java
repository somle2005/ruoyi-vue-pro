package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ActivityLimitDTO implements Serializable {
   private Integer numLimited;
   private Integer maxNum;
   private Integer minNum;
   private Integer timeBound;
   private Integer saleNum;
   private Integer maxNumForDay;
   private Integer maxNumForUser;

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

   @JsonProperty("timeBound")
   public void setTimeBound(Integer timeBound) {
      this.timeBound = timeBound;
   }

   @JsonProperty("timeBound")
   public Integer getTimeBound() {
      return this.timeBound;
   }

   @JsonProperty("saleNum")
   public void setSaleNum(Integer saleNum) {
      this.saleNum = saleNum;
   }

   @JsonProperty("saleNum")
   public Integer getSaleNum() {
      return this.saleNum;
   }

   @JsonProperty("maxNumForDay")
   public void setMaxNumForDay(Integer maxNumForDay) {
      this.maxNumForDay = maxNumForDay;
   }

   @JsonProperty("maxNumForDay")
   public Integer getMaxNumForDay() {
      return this.maxNumForDay;
   }

   @JsonProperty("maxNumForUser")
   public void setMaxNumForUser(Integer maxNumForUser) {
      this.maxNumForUser = maxNumForUser;
   }

   @JsonProperty("maxNumForUser")
   public Integer getMaxNumForUser() {
      return this.maxNumForUser;
   }
}
