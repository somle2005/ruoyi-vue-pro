package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.JOSMaterialService.request.unbind.JOSClient;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.MediaMaterialImageUnbindResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MediaMaterialImageUnbindRequest extends AbstractRequest implements JdRequest<MediaMaterialImageUnbindResponse> {
   private JOSClient josClient;
   private Set materialIds;
   private Set skuIds;

   public String getApiMethod() {
      return "jingdong.media.material.image.unbind";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("josClient", this.josClient);
      pmap.put("materialIds", this.materialIds);
      pmap.put("skuIds", this.skuIds);
      return JsonUtil.toJson(pmap);
   }

   public Class<MediaMaterialImageUnbindResponse> getResponseClass() {
      return MediaMaterialImageUnbindResponse.class;
   }

   @JsonProperty("josClient")
   public void setJosClient(JOSClient josClient) {
      this.josClient = josClient;
   }

   @JsonProperty("josClient")
   public JOSClient getJosClient() {
      return this.josClient;
   }

   @JsonProperty("materialIds")
   public void setMaterialIds(Set materialIds) {
      this.materialIds = materialIds;
   }

   @JsonProperty("materialIds")
   public Set getMaterialIds() {
      return this.materialIds;
   }

   @JsonProperty("skuIds")
   public void setSkuIds(Set skuIds) {
      this.skuIds = skuIds;
   }

   @JsonProperty("skuIds")
   public Set getSkuIds() {
      return this.skuIds;
   }
}
