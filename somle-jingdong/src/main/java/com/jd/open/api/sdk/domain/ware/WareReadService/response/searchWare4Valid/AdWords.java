package com.jd.open.api.sdk.domain.ware.WareReadService.response.searchWare4Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AdWords implements Serializable {
   private String words;
   private String url;
   private String urlWords;

   @JsonProperty("words")
   public void setWords(String words) {
      this.words = words;
   }

   @JsonProperty("words")
   public String getWords() {
      return this.words;
   }

   @JsonProperty("url")
   public void setUrl(String url) {
      this.url = url;
   }

   @JsonProperty("url")
   public String getUrl() {
      return this.url;
   }

   @JsonProperty("urlWords")
   public void setUrlWords(String urlWords) {
      this.urlWords = urlWords;
   }

   @JsonProperty("urlWords")
   public String getUrlWords() {
      return this.urlWords;
   }
}
