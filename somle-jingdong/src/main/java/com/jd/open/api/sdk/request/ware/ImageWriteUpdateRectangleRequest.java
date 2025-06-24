package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.ImageWriteUpdateRectangleResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImageWriteUpdateRectangleRequest extends AbstractRequest implements JdRequest<ImageWriteUpdateRectangleResponse> {
   private Long wareId;
   private String colorId;
   private String imgId;
   private String imgRectangleUrl;
   private String imgIndex;
   private String isGgt;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setColorId(String colorId) {
      this.colorId = colorId;
   }

   public String getColorId() {
      return this.colorId;
   }

   public void setImgId(String imgId) {
      this.imgId = imgId;
   }

   public String getImgId() {
      return this.imgId;
   }

   public void setImgRectangleUrl(String imgRectangleUrl) {
      this.imgRectangleUrl = imgRectangleUrl;
   }

   public String getImgRectangleUrl() {
      return this.imgRectangleUrl;
   }

   public void setImgIndex(String imgIndex) {
      this.imgIndex = imgIndex;
   }

   public String getImgIndex() {
      return this.imgIndex;
   }

   public void setIsGgt(String isGgt) {
      this.isGgt = isGgt;
   }

   public String getIsGgt() {
      return this.isGgt;
   }

   public String getApiMethod() {
      return "jingdong.image.write.updateRectangle";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("colorId", this.colorId);
      pmap.put("imgId", this.imgId);
      pmap.put("imgRectangleUrl", this.imgRectangleUrl);
      pmap.put("imgIndex", this.imgIndex);
      pmap.put("isGgt", this.isGgt);
      return JsonUtil.toJson(pmap);
   }

   public Class<ImageWriteUpdateRectangleResponse> getResponseClass() {
      return ImageWriteUpdateRectangleResponse.class;
   }
}
