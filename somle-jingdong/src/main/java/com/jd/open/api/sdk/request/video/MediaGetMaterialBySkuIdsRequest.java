package com.jd.open.api.sdk.request.video;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.video.MediaGetMaterialBySkuIdsResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MediaGetMaterialBySkuIdsRequest extends AbstractRequest implements JdRequest<MediaGetMaterialBySkuIdsResponse> {
   private Long venderId;
   private Integer callEnd;
   private String skuId;
   private String videoType;

   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   public Long getVenderId() {
      return this.venderId;
   }

   public void setCallEnd(Integer callEnd) {
      this.callEnd = callEnd;
   }

   public Integer getCallEnd() {
      return this.callEnd;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setVideoType(String videoType) {
      this.videoType = videoType;
   }

   public String getVideoType() {
      return this.videoType;
   }

   public String getApiMethod() {
      return "jingdong.media.getMaterialBySkuIds";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderId", this.venderId);
      pmap.put("callEnd", this.callEnd);
      pmap.put("skuId", this.skuId);
      pmap.put("videoType", this.videoType);
      return JsonUtil.toJson(pmap);
   }

   public Class<MediaGetMaterialBySkuIdsResponse> getResponseClass() {
      return MediaGetMaterialBySkuIdsResponse.class;
   }
}
