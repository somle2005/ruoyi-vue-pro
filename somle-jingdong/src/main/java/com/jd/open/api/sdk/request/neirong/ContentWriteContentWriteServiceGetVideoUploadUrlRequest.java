package com.jd.open.api.sdk.request.neirong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.neirong.ContentWriteContentWriteServiceGetVideoUploadUrlResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ContentWriteContentWriteServiceGetVideoUploadUrlRequest extends AbstractRequest implements JdRequest<ContentWriteContentWriteServiceGetVideoUploadUrlResponse> {
   private Integer contentSource;
   private Integer fileSize;
   private String videoName;
   private Long creatorId;

   public void setContentSource(Integer contentSource) {
      this.contentSource = contentSource;
   }

   public Integer getContentSource() {
      return this.contentSource;
   }

   public void setFileSize(Integer fileSize) {
      this.fileSize = fileSize;
   }

   public Integer getFileSize() {
      return this.fileSize;
   }

   public void setVideoName(String videoName) {
      this.videoName = videoName;
   }

   public String getVideoName() {
      return this.videoName;
   }

   public void setCreatorId(Long creatorId) {
      this.creatorId = creatorId;
   }

   public Long getCreatorId() {
      return this.creatorId;
   }

   public String getApiMethod() {
      return "jingdong.content.write.ContentWriteService.getVideoUploadUrl";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("contentSource", this.contentSource);
      pmap.put("fileSize", this.fileSize);
      pmap.put("videoName", this.videoName);
      pmap.put("creatorId", this.creatorId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ContentWriteContentWriteServiceGetVideoUploadUrlResponse> getResponseClass() {
      return ContentWriteContentWriteServiceGetVideoUploadUrlResponse.class;
   }
}
