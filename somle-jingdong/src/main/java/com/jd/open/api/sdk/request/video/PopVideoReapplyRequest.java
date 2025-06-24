package com.jd.open.api.sdk.request.video;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.video.PopVideoReapplyResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopVideoReapplyRequest extends AbstractRequest implements JdRequest<PopVideoReapplyResponse> {
   private Long videoId;
   private String applyReason;

   public void setVideoId(Long videoId) {
      this.videoId = videoId;
   }

   public Long getVideoId() {
      return this.videoId;
   }

   public void setApplyReason(String applyReason) {
      this.applyReason = applyReason;
   }

   public String getApplyReason() {
      return this.applyReason;
   }

   public String getApiMethod() {
      return "jingdong.pop.video.reapply";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("video_id", this.videoId);
      pmap.put("apply_reason", this.applyReason);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopVideoReapplyResponse> getResponseClass() {
      return PopVideoReapplyResponse.class;
   }
}
