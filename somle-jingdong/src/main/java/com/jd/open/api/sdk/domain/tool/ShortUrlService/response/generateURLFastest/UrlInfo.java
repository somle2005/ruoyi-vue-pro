package com.jd.open.api.sdk.domain.tool.ShortUrlService.response.generateURLFastest;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class UrlInfo implements Serializable {
   private String code;
   private String shortUrl;
   private String realUrl;
   private String codeText;
   private String username;
   private long ts;
   private String timestamp;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("shortUrl")
   public void setShortUrl(String shortUrl) {
      this.shortUrl = shortUrl;
   }

   @JsonProperty("shortUrl")
   public String getShortUrl() {
      return this.shortUrl;
   }

   @JsonProperty("realUrl")
   public void setRealUrl(String realUrl) {
      this.realUrl = realUrl;
   }

   @JsonProperty("realUrl")
   public String getRealUrl() {
      return this.realUrl;
   }

   @JsonProperty("codeText")
   public void setCodeText(String codeText) {
      this.codeText = codeText;
   }

   @JsonProperty("codeText")
   public String getCodeText() {
      return this.codeText;
   }

   @JsonProperty("username")
   public void setUsername(String username) {
      this.username = username;
   }

   @JsonProperty("username")
   public String getUsername() {
      return this.username;
   }

   @JsonProperty("ts")
   public void setTs(long ts) {
      this.ts = ts;
   }

   @JsonProperty("ts")
   public long getTs() {
      return this.ts;
   }

   @JsonProperty("timestamp")
   public void setTimestamp(String timestamp) {
      this.timestamp = timestamp;
   }

   @JsonProperty("timestamp")
   public String getTimestamp() {
      return this.timestamp;
   }
}
