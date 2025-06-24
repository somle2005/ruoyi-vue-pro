package com.jd.open.api.sdk.domain.platform.JosDraftReadService.response.getDraftInfoByVersion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosAdWords implements Serializable {
   private String urlWords;
   private String words;
   private String url;

   @JsonProperty("urlWords")
   public void setUrlWords(String urlWords) {
      this.urlWords = urlWords;
   }

   @JsonProperty("urlWords")
   public String getUrlWords() {
      return this.urlWords;
   }

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
}
