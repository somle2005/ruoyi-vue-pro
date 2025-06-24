package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.ImageReadFindTerminalImagesResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImageReadFindTerminalImagesRequest extends AbstractRequest implements JdRequest<ImageReadFindTerminalImagesResponse> {
   private String site;
   private Long productId;
   private String imageGroupId;
   private String userAgent;
   private Integer imgType;
   private String ip;

   public void setSite(String site) {
      this.site = site;
   }

   public String getSite() {
      return this.site;
   }

   public void setProductId(Long productId) {
      this.productId = productId;
   }

   public Long getProductId() {
      return this.productId;
   }

   public void setImageGroupId(String imageGroupId) {
      this.imageGroupId = imageGroupId;
   }

   public String getImageGroupId() {
      return this.imageGroupId;
   }

   public void setUserAgent(String userAgent) {
      this.userAgent = userAgent;
   }

   public String getUserAgent() {
      return this.userAgent;
   }

   public void setImgType(Integer imgType) {
      this.imgType = imgType;
   }

   public Integer getImgType() {
      return this.imgType;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public String getApiMethod() {
      return "jingdong.image.read.findTerminalImages";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("site", this.site);
      pmap.put("productId", this.productId);
      pmap.put("imageGroupId", this.imageGroupId);
      pmap.put("userAgent", this.userAgent);
      pmap.put("imgType", this.imgType);
      pmap.put("ip", this.ip);
      return JsonUtil.toJson(pmap);
   }

   public Class<ImageReadFindTerminalImagesResponse> getResponseClass() {
      return ImageReadFindTerminalImagesResponse.class;
   }
}
