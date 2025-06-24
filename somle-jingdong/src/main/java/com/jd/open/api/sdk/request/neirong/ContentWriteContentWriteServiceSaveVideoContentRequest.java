package com.jd.open.api.sdk.request.neirong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.neirong.ContentWriteService.request.saveVideoContent.VideoContentDto;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.neirong.ContentWriteContentWriteServiceSaveVideoContentResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ContentWriteContentWriteServiceSaveVideoContentRequest extends AbstractRequest implements JdRequest<ContentWriteContentWriteServiceSaveVideoContentResponse> {
   private VideoContentDto videoContentDto;

   public String getApiMethod() {
      return "jingdong.content.write.ContentWriteService.saveVideoContent";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("videoContentDto", this.videoContentDto);
      return JsonUtil.toJson(pmap);
   }

   public Class<ContentWriteContentWriteServiceSaveVideoContentResponse> getResponseClass() {
      return ContentWriteContentWriteServiceSaveVideoContentResponse.class;
   }

   @JsonProperty("videoContentDto")
   public void setVideoContentDto(VideoContentDto videoContentDto) {
      this.videoContentDto = videoContentDto;
   }

   @JsonProperty("videoContentDto")
   public VideoContentDto getVideoContentDto() {
      return this.videoContentDto;
   }
}
