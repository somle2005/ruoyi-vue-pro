package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ActivityShowDTO implements Serializable {
   private String adword;
   private String link;

   @JsonProperty("adword")
   public void setAdword(String adword) {
      this.adword = adword;
   }

   @JsonProperty("adword")
   public String getAdword() {
      return this.adword;
   }

   @JsonProperty("link")
   public void setLink(String link) {
      this.link = link;
   }

   @JsonProperty("link")
   public String getLink() {
      return this.link;
   }
}
