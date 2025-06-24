package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.ImageWriteDeleteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImageWriteDeleteRequest extends AbstractRequest implements JdRequest<ImageWriteDeleteResponse> {
   private Long wareId;
   private String colorIds;
   private String imgIndexes;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setColorIds(String colorIds) {
      this.colorIds = colorIds;
   }

   public String getColorIds() {
      return this.colorIds;
   }

   public void setImgIndexes(String imgIndexes) {
      this.imgIndexes = imgIndexes;
   }

   public String getImgIndexes() {
      return this.imgIndexes;
   }

   public String getApiMethod() {
      return "jingdong.image.write.delete";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("colorIds", this.colorIds);
      pmap.put("imgIndexes", this.imgIndexes);
      return JsonUtil.toJson(pmap);
   }

   public Class<ImageWriteDeleteResponse> getResponseClass() {
      return ImageWriteDeleteResponse.class;
   }
}
