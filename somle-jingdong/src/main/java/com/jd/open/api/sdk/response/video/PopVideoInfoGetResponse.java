package com.jd.open.api.sdk.response.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.video.JOSVideoInfoService.response.get.JOSVideoInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopVideoInfoGetResponse extends AbstractResponse {
   private JOSVideoInfo videoInfo;

   @JsonProperty("video_info")
   public void setVideoInfo(JOSVideoInfo videoInfo) {
      this.videoInfo = videoInfo;
   }

   @JsonProperty("video_info")
   public JOSVideoInfo getVideoInfo() {
      return this.videoInfo;
   }
}
