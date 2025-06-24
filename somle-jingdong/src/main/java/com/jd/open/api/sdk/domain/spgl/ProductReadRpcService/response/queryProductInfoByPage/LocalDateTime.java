package com.jd.open.api.sdk.domain.spgl.ProductReadRpcService.response.queryProductInfoByPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.Instant;
import java.time.ZoneId;

public class LocalDateTime implements Serializable {
   private String dayOfWeek;
   private String month;
   private Integer hour;
   private Integer year;
   private Integer dayOfMonth;
   private Integer dayOfYear;
   private Integer monthValue;
   private Integer nano;
   private Integer minute;
   private Integer second;
   private IsoChronology chronology;

   public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
      return null;
   }

    @JsonProperty("dayOfWeek")
   public void setDayOfWeek(String dayOfWeek) {
      this.dayOfWeek = dayOfWeek;
   }

   @JsonProperty("dayOfWeek")
   public String getDayOfWeek() {
      return this.dayOfWeek;
   }

   @JsonProperty("month")
   public void setMonth(String month) {
      this.month = month;
   }

   @JsonProperty("month")
   public String getMonth() {
      return this.month;
   }

   @JsonProperty("hour")
   public void setHour(Integer hour) {
      this.hour = hour;
   }

   @JsonProperty("hour")
   public Integer getHour() {
      return this.hour;
   }

   @JsonProperty("year")
   public void setYear(Integer year) {
      this.year = year;
   }

   @JsonProperty("year")
   public Integer getYear() {
      return this.year;
   }

   @JsonProperty("dayOfMonth")
   public void setDayOfMonth(Integer dayOfMonth) {
      this.dayOfMonth = dayOfMonth;
   }

   @JsonProperty("dayOfMonth")
   public Integer getDayOfMonth() {
      return this.dayOfMonth;
   }

   @JsonProperty("dayOfYear")
   public void setDayOfYear(Integer dayOfYear) {
      this.dayOfYear = dayOfYear;
   }

   @JsonProperty("dayOfYear")
   public Integer getDayOfYear() {
      return this.dayOfYear;
   }

   @JsonProperty("monthValue")
   public void setMonthValue(Integer monthValue) {
      this.monthValue = monthValue;
   }

   @JsonProperty("monthValue")
   public Integer getMonthValue() {
      return this.monthValue;
   }

   @JsonProperty("nano")
   public void setNano(Integer nano) {
      this.nano = nano;
   }

   @JsonProperty("nano")
   public Integer getNano() {
      return this.nano;
   }

   @JsonProperty("minute")
   public void setMinute(Integer minute) {
      this.minute = minute;
   }

   @JsonProperty("minute")
   public Integer getMinute() {
      return this.minute;
   }

   @JsonProperty("second")
   public void setSecond(Integer second) {
      this.second = second;
   }

   @JsonProperty("second")
   public Integer getSecond() {
      return this.second;
   }

   @JsonProperty("chronology")
   public void setChronology(IsoChronology chronology) {
      this.chronology = chronology;
   }

   @JsonProperty("chronology")
   public IsoChronology getChronology() {
      return this.chronology;
   }
}
