package com.jd.open.api.sdk.domain.neirong.ContentWriteService.response.getVideoUploadUrl;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VideoUploadResponse implements Serializable {
   private String uploadUrl;
   private Long videoId;

   @JsonProperty("uploadUrl")
   public void setUploadUrl(String uploadUrl) {
      this.uploadUrl = uploadUrl;
   }

   @JsonProperty("uploadUrl")
   public String getUploadUrl() {
      return this.uploadUrl;
   }

   @JsonProperty("videoId")
   public void setVideoId(Long videoId) {
      this.videoId = videoId;
   }

   @JsonProperty("videoId")
   public Long getVideoId() {
      return this.videoId;
   }
}
