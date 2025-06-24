package com.jd.open.api.sdk.domain.fangchan.HouseResourceSoaService.response.synHouseResourceVideo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class HouseResourceVideoDTO implements Serializable {
   private String videoId;
   private String uploadUrl;
   private String playUrl;

   @JsonProperty("videoId")
   public void setVideoId(String videoId) {
      this.videoId = videoId;
   }

   @JsonProperty("videoId")
   public String getVideoId() {
      return this.videoId;
   }

   @JsonProperty("uploadUrl")
   public void setUploadUrl(String uploadUrl) {
      this.uploadUrl = uploadUrl;
   }

   @JsonProperty("uploadUrl")
   public String getUploadUrl() {
      return this.uploadUrl;
   }

   @JsonProperty("playUrl")
   public void setPlayUrl(String playUrl) {
      this.playUrl = playUrl;
   }

   @JsonProperty("playUrl")
   public String getPlayUrl() {
      return this.playUrl;
   }
}
