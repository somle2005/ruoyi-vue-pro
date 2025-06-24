package com.jd.open.api.sdk.domain.evaluation.PopCommentJsfService.response.getVenderCommentsForJos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VideoUgcVo implements Serializable {
   private String id;
   private String mainUrl;
   private int videoHeight;
   private int videoWidth;
   private int videoLength;
   private String videoTitle;
   private String videoUrl;
   private String videoId;

   @JsonProperty("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty("id")
   public String getId() {
      return this.id;
   }

   @JsonProperty("mainUrl")
   public void setMainUrl(String mainUrl) {
      this.mainUrl = mainUrl;
   }

   @JsonProperty("mainUrl")
   public String getMainUrl() {
      return this.mainUrl;
   }

   @JsonProperty("videoHeight")
   public void setVideoHeight(int videoHeight) {
      this.videoHeight = videoHeight;
   }

   @JsonProperty("videoHeight")
   public int getVideoHeight() {
      return this.videoHeight;
   }

   @JsonProperty("videoWidth")
   public void setVideoWidth(int videoWidth) {
      this.videoWidth = videoWidth;
   }

   @JsonProperty("videoWidth")
   public int getVideoWidth() {
      return this.videoWidth;
   }

   @JsonProperty("videoLength")
   public void setVideoLength(int videoLength) {
      this.videoLength = videoLength;
   }

   @JsonProperty("videoLength")
   public int getVideoLength() {
      return this.videoLength;
   }

   @JsonProperty("videoTitle")
   public void setVideoTitle(String videoTitle) {
      this.videoTitle = videoTitle;
   }

   @JsonProperty("videoTitle")
   public String getVideoTitle() {
      return this.videoTitle;
   }

   @JsonProperty("videoUrl")
   public void setVideoUrl(String videoUrl) {
      this.videoUrl = videoUrl;
   }

   @JsonProperty("videoUrl")
   public String getVideoUrl() {
      return this.videoUrl;
   }

   @JsonProperty("videoId")
   public void setVideoId(String videoId) {
      this.videoId = videoId;
   }

   @JsonProperty("videoId")
   public String getVideoId() {
      return this.videoId;
   }
}
