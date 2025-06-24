package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.JosWareImageService.request.airesizeimg.JosRequest;
import com.jd.open.api.sdk.domain.ware.JosWareImageService.request.airesizeimg.JosWareImageRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareSkuImagesAiresizeimgResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSkuImagesAiresizeimgRequest extends AbstractRequest implements JdRequest<WareSkuImagesAiresizeimgResponse> {
   private JosRequest josRequest;
   private JosWareImageRequest imageRequest;

   public String getApiMethod() {
      return "jingdong.ware.sku.images.airesizeimg";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("josRequest", this.josRequest);
      pmap.put("imageRequest", this.imageRequest);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareSkuImagesAiresizeimgResponse> getResponseClass() {
      return WareSkuImagesAiresizeimgResponse.class;
   }

   @JsonProperty("josRequest")
   public void setJosRequest(JosRequest josRequest) {
      this.josRequest = josRequest;
   }

   @JsonProperty("josRequest")
   public JosRequest getJosRequest() {
      return this.josRequest;
   }

   @JsonProperty("imageRequest")
   public void setImageRequest(JosWareImageRequest imageRequest) {
      this.imageRequest = imageRequest;
   }

   @JsonProperty("imageRequest")
   public JosWareImageRequest getImageRequest() {
      return this.imageRequest;
   }
}
