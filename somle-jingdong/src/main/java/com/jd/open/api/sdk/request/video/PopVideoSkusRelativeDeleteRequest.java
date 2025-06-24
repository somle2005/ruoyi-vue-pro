package com.jd.open.api.sdk.request.video;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.video.PopVideoSkusRelativeDeleteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopVideoSkusRelativeDeleteRequest extends AbstractRequest implements JdRequest<PopVideoSkusRelativeDeleteResponse> {
   private long videoId;
   private String productInfoArray;

   public void setVideoId(long videoId) {
      this.videoId = videoId;
   }

   public long getVideoId() {
      return this.videoId;
   }

   public void setProductInfoArray(String productInfoArray) {
      this.productInfoArray = productInfoArray;
   }

   public String getProductInfoArray() {
      return this.productInfoArray;
   }

   public String getApiMethod() {
      return "jingdong.pop.video.skus.relative.delete";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("video_id", this.videoId);
      pmap.put("product_info_array", this.productInfoArray);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopVideoSkusRelativeDeleteResponse> getResponseClass() {
      return PopVideoSkusRelativeDeleteResponse.class;
   }
}
