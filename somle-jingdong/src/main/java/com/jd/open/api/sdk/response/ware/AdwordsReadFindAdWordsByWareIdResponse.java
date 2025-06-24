package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.AdWordsReadService.response.findAdWordsByWareId.AdWords;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AdwordsReadFindAdWordsByWareIdResponse extends AbstractResponse {
   private AdWords adWords;

   @JsonProperty("adWords")
   public void setAdWords(AdWords adWords) {
      this.adWords = adWords;
   }

   @JsonProperty("adWords")
   public AdWords getAdWords() {
      return this.adWords;
   }
}
