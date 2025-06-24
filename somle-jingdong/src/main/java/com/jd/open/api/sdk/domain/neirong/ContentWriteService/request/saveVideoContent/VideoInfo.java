package com.jd.open.api.sdk.domain.neirong.ContentWriteService.request.saveVideoContent;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VideoInfo implements Serializable {
   private String videoId;
   private String videoImg;
   private String appHomeImg;
   private Integer videoDuration;
   private Integer videoSize;

   @JsonProperty("videoId")
   public void setVideoId(String videoId) {
      this.videoId = videoId;
   }

   @JsonProperty("videoId")
   public String getVideoId() {
      return this.videoId;
   }

   @JsonProperty("videoImg")
   public void setVideoImg(String videoImg) {
      this.videoImg = videoImg;
   }

   @JsonProperty("videoImg")
   public String getVideoImg() {
      return this.videoImg;
   }

   @JsonProperty("appHomeImg")
   public void setAppHomeImg(String appHomeImg) {
      this.appHomeImg = appHomeImg;
   }

   @JsonProperty("appHomeImg")
   public String getAppHomeImg() {
      return this.appHomeImg;
   }

   @JsonProperty("videoDuration")
   public void setVideoDuration(Integer videoDuration) {
      this.videoDuration = videoDuration;
   }

   @JsonProperty("videoDuration")
   public Integer getVideoDuration() {
      return this.videoDuration;
   }

   @JsonProperty("videoSize")
   public void setVideoSize(Integer videoSize) {
      this.videoSize = videoSize;
   }

   @JsonProperty("videoSize")
   public Integer getVideoSize() {
      return this.videoSize;
   }
}
