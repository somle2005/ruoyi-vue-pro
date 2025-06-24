package com.jd.open.api.sdk.request.video;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.video.PopVideoSkusRelativeInsertResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopVideoSkusRelativeInsertRequest extends AbstractRequest implements JdRequest<PopVideoSkusRelativeInsertResponse> {
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
      return "jingdong.pop.video.skus.relative.insert";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("videoId", this.videoId);
      pmap.put("product_info_array", this.productInfoArray);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopVideoSkusRelativeInsertResponse> getResponseClass() {
      return PopVideoSkusRelativeInsertResponse.class;
   }
}
