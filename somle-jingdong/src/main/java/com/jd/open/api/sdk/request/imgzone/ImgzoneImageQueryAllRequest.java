package com.jd.open.api.sdk.request.imgzone;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.imgzone.ImgzoneImageQueryAllResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImgzoneImageQueryAllRequest extends AbstractRequest implements JdRequest<ImgzoneImageQueryAllResponse> {
   private Long categoryId;
   private String imageName;
   private String scrollId;

   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   public Long getCategoryId() {
      return this.categoryId;
   }

   public void setImageName(String imageName) {
      this.imageName = imageName;
   }

   public String getImageName() {
      return this.imageName;
   }

   public void setScrollId(String scrollId) {
      this.scrollId = scrollId;
   }

   public String getScrollId() {
      return this.scrollId;
   }

   public String getApiMethod() {
      return "jingdong.imgzone.image.queryAll";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("category_id", this.categoryId);
      pmap.put("image_name", this.imageName);
      pmap.put("scroll_id", this.scrollId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ImgzoneImageQueryAllResponse> getResponseClass() {
      return ImgzoneImageQueryAllResponse.class;
   }
}
