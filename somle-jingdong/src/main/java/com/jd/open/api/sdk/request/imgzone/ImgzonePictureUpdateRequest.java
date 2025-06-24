package com.jd.open.api.sdk.request.imgzone;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.imgzone.ImgzonePictureUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImgzonePictureUpdateRequest extends AbstractRequest implements JdRequest<ImgzonePictureUpdateResponse> {
   private String pictureId;
   private String pictureName;
   private Long pictureCateId;

   public void setPictureId(String pictureId) {
      this.pictureId = pictureId;
   }

   public String getPictureId() {
      return this.pictureId;
   }

   public void setPictureName(String pictureName) {
      this.pictureName = pictureName;
   }

   public String getPictureName() {
      return this.pictureName;
   }

   public void setPictureCateId(Long pictureCateId) {
      this.pictureCateId = pictureCateId;
   }

   public Long getPictureCateId() {
      return this.pictureCateId;
   }

   public String getApiMethod() {
      return "jingdong.imgzone.picture.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("picture_id", this.pictureId);
      pmap.put("picture_name", this.pictureName);
      pmap.put("picture_cate_id", this.pictureCateId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ImgzonePictureUpdateResponse> getResponseClass() {
      return ImgzonePictureUpdateResponse.class;
   }
}
