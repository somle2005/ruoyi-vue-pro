package com.jd.open.api.sdk.domain.risk.KeeperWareRectificationService.request.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Locale;

public class I18nParam implements Serializable {
   private Locale language;

   @JsonProperty("language")
   public void setLanguage(Locale language) {
      this.language = language;
   }

   @JsonProperty("language")
   public Locale getLanguage() {
      return this.language;
   }
}
