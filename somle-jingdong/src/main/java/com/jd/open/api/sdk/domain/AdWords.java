package com.jd.open.api.sdk.domain;

public class AdWords {
   private String words;
   private String url;
   private String urlWords;

   public String getWords() {
      return this.words;
   }

   public void setWords(String words) {
      this.words = words;
   }

   public String getUrl() {
      return this.url;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public String getUrlWords() {
      return this.urlWords;
   }

   public void setUrlWords(String urlWords) {
      this.urlWords = urlWords;
   }

   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("AdWords [");
      if (this.words != null) {
         builder.append("words=").append(this.words).append(", ");
      }

      if (this.url != null) {
         builder.append("url=").append(this.url).append(", ");
      }

      if (this.urlWords != null) {
         builder.append("urlWords=").append(this.urlWords);
      }

      builder.append("]");
      return builder.toString();
   }
}
