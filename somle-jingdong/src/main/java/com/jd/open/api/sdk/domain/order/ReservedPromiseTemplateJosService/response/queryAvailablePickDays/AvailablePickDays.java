package com.jd.open.api.sdk.domain.order.ReservedPromiseTemplateJosService.response.queryAvailablePickDays;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class AvailablePickDays implements Serializable {
   private Integer pickDaysMax;
   private Integer pickDaysMin;
   private Date pickDatesMin;
   private AvailablePickDaysQuery query;
   private Date pickDatesMax;

   @JsonProperty("pickDaysMax")
   public void setPickDaysMax(Integer pickDaysMax) {
      this.pickDaysMax = pickDaysMax;
   }

   @JsonProperty("pickDaysMax")
   public Integer getPickDaysMax() {
      return this.pickDaysMax;
   }

   @JsonProperty("pickDaysMin")
   public void setPickDaysMin(Integer pickDaysMin) {
      this.pickDaysMin = pickDaysMin;
   }

   @JsonProperty("pickDaysMin")
   public Integer getPickDaysMin() {
      return this.pickDaysMin;
   }

   @JsonProperty("pickDatesMin")
   public void setPickDatesMin(Date pickDatesMin) {
      this.pickDatesMin = pickDatesMin;
   }

   @JsonProperty("pickDatesMin")
   public Date getPickDatesMin() {
      return this.pickDatesMin;
   }

   @JsonProperty("query")
   public void setQuery(AvailablePickDaysQuery query) {
      this.query = query;
   }

   @JsonProperty("query")
   public AvailablePickDaysQuery getQuery() {
      return this.query;
   }

   @JsonProperty("pickDatesMax")
   public void setPickDatesMax(Date pickDatesMax) {
      this.pickDatesMax = pickDatesMax;
   }

   @JsonProperty("pickDatesMax")
   public Date getPickDatesMax() {
      return this.pickDatesMax;
   }
}
