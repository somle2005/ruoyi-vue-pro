package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.ImageReadFindFirstImageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImageReadFindFirstImageRequest extends AbstractRequest implements JdRequest<ImageReadFindFirstImageResponse> {
   private Long wareId;
   private String colorId;

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

   public String getApiMethod() {
      return "jingdong.image.read.findFirstImage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("colorId", this.colorId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ImageReadFindFirstImageResponse> getResponseClass() {
      return ImageReadFindFirstImageResponse.class;
   }
}
