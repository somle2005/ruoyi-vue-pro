package com.jd.open.api.sdk.domain.ware.KeeperWarePreDetectService.request.preDetect;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class I18nParam implements Serializable {
   private String country;

   @JsonProperty("country")
   public void setCountry(String country) {
      this.country = country;
   }

   @JsonProperty("country")
   public String getCountry() {
      return this.country;
   }
}
