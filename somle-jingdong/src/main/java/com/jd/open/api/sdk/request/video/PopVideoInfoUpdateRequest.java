package com.jd.open.api.sdk.request.video;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.video.PopVideoInfoUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopVideoInfoUpdateRequest extends AbstractRequest implements JdRequest<PopVideoInfoUpdateResponse> {
   private Long videoId;
   private Integer videoType;
   private String videoName;
   private String videoDesc;

   public void setVideoId(Long videoId) {
      this.videoId = videoId;
   }

   public Long getVideoId() {
      return this.videoId;
   }

   public void setVideoType(Integer videoType) {
      this.videoType = videoType;
   }

   public Integer getVideoType() {
      return this.videoType;
   }

   public void setVideoName(String videoName) {
      this.videoName = videoName;
   }

   public String getVideoName() {
      return this.videoName;
   }

   public void setVideoDesc(String videoDesc) {
      this.videoDesc = videoDesc;
   }

   public String getVideoDesc() {
      return this.videoDesc;
   }

   public String getApiMethod() {
      return "jingdong.pop.video.info.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("video_id", this.videoId);
      pmap.put("video_type", this.videoType);
      pmap.put("video_name", this.videoName);
      pmap.put("video_desc", this.videoDesc);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopVideoInfoUpdateResponse> getResponseClass() {
      return PopVideoInfoUpdateResponse.class;
   }
}
