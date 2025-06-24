package com.jd.open.api.sdk.request.imgzone;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.imgzone.ImgzoneImageUploadResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImgzoneImageUploadRequest extends AbstractRequest implements JdRequest<ImgzoneImageUploadResponse> {
   private Integer belongType;
   private String accessToken;
   private Integer callEnd;
   private String imgName;
   private Long cateId;
   private byte[] imgFile;

   public void setBelongType(Integer belongType) {
      this.belongType = belongType;
   }

   public Integer getBelongType() {
      return this.belongType;
   }

   public void setAccessToken(String accessToken) {
      this.accessToken = accessToken;
   }

   public String getAccessToken() {
      return this.accessToken;
   }

   public void setCallEnd(Integer callEnd) {
      this.callEnd = callEnd;
   }

   public Integer getCallEnd() {
      return this.callEnd;
   }

   public void setImgName(String imgName) {
      this.imgName = imgName;
   }

   public String getImgName() {
      return this.imgName;
   }

   public void setCateId(Long cateId) {
      this.cateId = cateId;
   }

   public Long getCateId() {
      return this.cateId;
   }

   public void setImgFile(byte[] imgFile) {
      this.imgFile = imgFile;
   }

   public byte[] getImgFile() {
      return this.imgFile;
   }

   public String getApiMethod() {
      return "jingdong.imgzone.image.upload";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("belongType", this.belongType);
      pmap.put("accessToken", this.accessToken);
      pmap.put("callEnd", this.callEnd);
      pmap.put("imgName", this.imgName);
      pmap.put("cateId", this.cateId);
      pmap.put("imgFile", this.imgFile);
      return JsonUtil.toJson(pmap);
   }

   public Class<ImgzoneImageUploadResponse> getResponseClass() {
      return ImgzoneImageUploadResponse.class;
   }
}
