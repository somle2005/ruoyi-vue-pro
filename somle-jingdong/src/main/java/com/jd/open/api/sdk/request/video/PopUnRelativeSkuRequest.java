package com.jd.open.api.sdk.request.video;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.video.PopUnRelativeSkuResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopUnRelativeSkuRequest extends AbstractRequest implements JdRequest<PopUnRelativeSkuResponse> {
   private String accessToken;
   private Long videoId;
   private Long productId;
   private String skuId;

   public void setAccessToken(String accessToken) {
      this.accessToken = accessToken;
   }

   public String getAccessToken() {
      return this.accessToken;
   }

   public void setVideoId(Long videoId) {
      this.videoId = videoId;
   }

   public Long getVideoId() {
      return this.videoId;
   }

   public void setProductId(Long productId) {
      this.productId = productId;
   }

   public Long getProductId() {
      return this.productId;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.pop.unRelativeSku";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("accessToken", this.accessToken);
      pmap.put("videoId", this.videoId);
      pmap.put("productId", this.productId);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopUnRelativeSkuResponse> getResponseClass() {
      return PopUnRelativeSkuResponse.class;
   }
}
