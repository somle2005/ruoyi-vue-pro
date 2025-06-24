package com.jd.open.api.sdk.request.video;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.video.MediaMaterialBindMaterialResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MediaMaterialBindMaterialRequest extends AbstractRequest implements JdRequest<MediaMaterialBindMaterialResponse> {
   private Long venderId;
   private Integer callEnd;
   private Long productId;
   private Long skuId;
   private Integer type;
   private String url;
   private String content;
   private Integer order;

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

   public void setProductId(Long productId) {
      this.productId = productId;
   }

   public Long getProductId() {
      return this.productId;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public String getUrl() {
      return this.url;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public String getContent() {
      return this.content;
   }

   public void setOrder(Integer order) {
      this.order = order;
   }

   public Integer getOrder() {
      return this.order;
   }

   public String getApiMethod() {
      return "jingdong.media.material.bindMaterial";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderId", this.venderId);
      pmap.put("callEnd", this.callEnd);
      pmap.put("productId", this.productId);
      pmap.put("skuId", this.skuId);
      pmap.put("type", this.type);
      pmap.put("url", this.url);
      pmap.put("content", this.content);
      pmap.put("order", this.order);
      return JsonUtil.toJson(pmap);
   }

   public Class<MediaMaterialBindMaterialResponse> getResponseClass() {
      return MediaMaterialBindMaterialResponse.class;
   }
}
