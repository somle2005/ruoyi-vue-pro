package com.jd.open.api.sdk.request.imgzone;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.imgzone.ImgzonePictureUploadResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImgzonePictureUploadRequest extends AbstractRequest implements JdRequest<ImgzonePictureUploadResponse> {
   private byte[] imageData;
   private Long pictureCateId;
   private String pictureName;

   public void setImageData(byte[] imageData) {
      this.imageData = imageData;
   }

   public byte[] getImageData() {
      return this.imageData;
   }

   public void setPictureCateId(Long pictureCateId) {
      this.pictureCateId = pictureCateId;
   }

   public Long getPictureCateId() {
      return this.pictureCateId;
   }

   public void setPictureName(String pictureName) {
      this.pictureName = pictureName;
   }

   public String getPictureName() {
      return this.pictureName;
   }

   public String getApiMethod() {
      return "jingdong.imgzone.picture.upload";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("image_data", this.imageData);
      pmap.put("picture_cate_id", this.pictureCateId);
      pmap.put("picture_name", this.pictureName);
      return JsonUtil.toJson(pmap);
   }

   public Class<ImgzonePictureUploadResponse> getResponseClass() {
      return ImgzonePictureUploadResponse.class;
   }
}
