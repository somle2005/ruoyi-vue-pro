package com.jd.open.api.sdk.domain.ware.KeeperDetectionService.response.imagesRedLineDetectBatch;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ImagesDetectResult implements Serializable {
   private Integer porn;
   private Double pornScore;
   private Double referPornThreshold;
   private Integer vulgar;
   private Double vulgarScore;
   private Double referVulgarThreshold;
   private Boolean sensitive;
   private String sensitiveWords;
   private String marks;
   private Boolean govFace;
   private String name;

   @JsonProperty("porn")
   public void setPorn(Integer porn) {
      this.porn = porn;
   }

   @JsonProperty("porn")
   public Integer getPorn() {
      return this.porn;
   }

   @JsonProperty("pornScore")
   public void setPornScore(Double pornScore) {
      this.pornScore = pornScore;
   }

   @JsonProperty("pornScore")
   public Double getPornScore() {
      return this.pornScore;
   }

   @JsonProperty("referPornThreshold")
   public void setReferPornThreshold(Double referPornThreshold) {
      this.referPornThreshold = referPornThreshold;
   }

   @JsonProperty("referPornThreshold")
   public Double getReferPornThreshold() {
      return this.referPornThreshold;
   }

   @JsonProperty("vulgar")
   public void setVulgar(Integer vulgar) {
      this.vulgar = vulgar;
   }

   @JsonProperty("vulgar")
   public Integer getVulgar() {
      return this.vulgar;
   }

   @JsonProperty("vulgarScore")
   public void setVulgarScore(Double vulgarScore) {
      this.vulgarScore = vulgarScore;
   }

   @JsonProperty("vulgarScore")
   public Double getVulgarScore() {
      return this.vulgarScore;
   }

   @JsonProperty("referVulgarThreshold")
   public void setReferVulgarThreshold(Double referVulgarThreshold) {
      this.referVulgarThreshold = referVulgarThreshold;
   }

   @JsonProperty("referVulgarThreshold")
   public Double getReferVulgarThreshold() {
      return this.referVulgarThreshold;
   }

   @JsonProperty("sensitive")
   public void setSensitive(Boolean sensitive) {
      this.sensitive = sensitive;
   }

   @JsonProperty("sensitive")
   public Boolean getSensitive() {
      return this.sensitive;
   }

   @JsonProperty("sensitiveWords")
   public void setSensitiveWords(String sensitiveWords) {
      this.sensitiveWords = sensitiveWords;
   }

   @JsonProperty("sensitiveWords")
   public String getSensitiveWords() {
      return this.sensitiveWords;
   }

   @JsonProperty("marks")
   public void setMarks(String marks) {
      this.marks = marks;
   }

   @JsonProperty("marks")
   public String getMarks() {
      return this.marks;
   }

   @JsonProperty("govFace")
   public void setGovFace(Boolean govFace) {
      this.govFace = govFace;
   }

   @JsonProperty("govFace")
   public Boolean getGovFace() {
      return this.govFace;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }
}
