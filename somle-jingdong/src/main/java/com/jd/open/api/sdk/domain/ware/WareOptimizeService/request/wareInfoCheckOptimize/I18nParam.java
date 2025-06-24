package com.jd.open.api.sdk.domain.ware.WareOptimizeService.request.wareInfoCheckOptimize;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

public class I18nParam implements Serializable {
   private String country;
   private Integer businessUnit;
   private TimeZone timeZone;
   private Locale language;

   @JsonProperty("country")
   public void setCountry(String country) {
      this.country = country;
   }

   @JsonProperty("country")
   public String getCountry() {
      return this.country;
   }

   @JsonProperty("businessUnit")
   public void setBusinessUnit(Integer businessUnit) {
      this.businessUnit = businessUnit;
   }

   @JsonProperty("businessUnit")
   public Integer getBusinessUnit() {
      return this.businessUnit;
   }

   @JsonProperty("timeZone")
   public void setTimeZone(TimeZone timeZone) {
      this.timeZone = timeZone;
   }

   @JsonProperty("timeZone")
   public TimeZone getTimeZone() {
      return this.timeZone;
   }

   @JsonProperty("language")
   public void setLanguage(Locale language) {
      this.language = language;
   }

   @JsonProperty("language")
   public Locale getLanguage() {
      return this.language;
   }
}
