package com.jd.open.api.sdk.request.video;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.video.PopVideoInfoGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopVideoInfoGetRequest extends AbstractRequest implements JdRequest<PopVideoInfoGetResponse> {
   private long videoId;

   public void setVideoId(long videoId) {
      this.videoId = videoId;
   }

   public long getVideoId() {
      return this.videoId;
   }

   public String getApiMethod() {
      return "jingdong.pop.video.info.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("video_id", this.videoId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopVideoInfoGetResponse> getResponseClass() {
      return PopVideoInfoGetResponse.class;
   }
}
