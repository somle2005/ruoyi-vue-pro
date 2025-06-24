package com.jd.open.api.sdk.request.neirong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.neirong.VideoCollectionWriteService.request.saveVideoCollection.VideoCollectionDto;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.neirong.ContentWriteVideoCollectionWriteServiceSaveVideoCollectionResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ContentWriteVideoCollectionWriteServiceSaveVideoCollectionRequest extends AbstractRequest implements JdRequest<ContentWriteVideoCollectionWriteServiceSaveVideoCollectionResponse> {
   private VideoCollectionDto videoCollectionDto;

   public String getApiMethod() {
      return "jingdong.content.write.VideoCollectionWriteService.saveVideoCollection";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("videoCollectionDto", this.videoCollectionDto);
      return JsonUtil.toJson(pmap);
   }

   public Class<ContentWriteVideoCollectionWriteServiceSaveVideoCollectionResponse> getResponseClass() {
      return ContentWriteVideoCollectionWriteServiceSaveVideoCollectionResponse.class;
   }

   @JsonProperty("videoCollectionDto")
   public void setVideoCollectionDto(VideoCollectionDto videoCollectionDto) {
      this.videoCollectionDto = videoCollectionDto;
   }

   @JsonProperty("videoCollectionDto")
   public VideoCollectionDto getVideoCollectionDto() {
      return this.videoCollectionDto;
   }
}
