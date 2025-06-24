package com.jd.open.api.sdk.request.video;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.video.PopVideoInfosDeleteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopVideoInfosDeleteRequest extends AbstractRequest implements JdRequest<PopVideoInfosDeleteResponse> {
   private String videoIds;

   public void setVideoIds(String videoIds) {
      this.videoIds = videoIds;
   }

   public String getVideoIds() {
      return this.videoIds;
   }

   public String getApiMethod() {
      return "jingdong.pop.video.infos.delete";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("video_ids", this.videoIds);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopVideoInfosDeleteResponse> getResponseClass() {
      return PopVideoInfosDeleteResponse.class;
   }
}
