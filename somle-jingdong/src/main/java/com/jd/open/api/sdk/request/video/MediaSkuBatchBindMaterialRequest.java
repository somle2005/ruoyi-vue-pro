package com.jd.open.api.sdk.request.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.video.JOSMaterialService.request.skuBatchBindMaterial.JOSClient;
import com.jd.open.api.sdk.domain.video.JOSMaterialService.request.skuBatchBindMaterial.SkuMaterialInfo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.video.MediaSkuBatchBindMaterialResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MediaSkuBatchBindMaterialRequest extends AbstractRequest implements JdRequest<MediaSkuBatchBindMaterialResponse> {
   private JOSClient josClient;
   private List<SkuMaterialInfo> skuMaterialInfos;

   public String getApiMethod() {
      return "jingdong.media.skuBatchBindMaterial";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("josClient", this.josClient);
      pmap.put("skuMaterialInfos", this.skuMaterialInfos);
      return JsonUtil.toJson(pmap);
   }

   public Class<MediaSkuBatchBindMaterialResponse> getResponseClass() {
      return MediaSkuBatchBindMaterialResponse.class;
   }

   @JsonProperty("josClient")
   public void setJosClient(JOSClient josClient) {
      this.josClient = josClient;
   }

   @JsonProperty("josClient")
   public JOSClient getJosClient() {
      return this.josClient;
   }

   @JsonProperty("skuMaterialInfos")
   public void setSkuMaterialInfos(List<SkuMaterialInfo> skuMaterialInfos) {
      this.skuMaterialInfos = skuMaterialInfos;
   }

   @JsonProperty("skuMaterialInfos")
   public List<SkuMaterialInfo> getSkuMaterialInfos() {
      return this.skuMaterialInfos;
   }
}
