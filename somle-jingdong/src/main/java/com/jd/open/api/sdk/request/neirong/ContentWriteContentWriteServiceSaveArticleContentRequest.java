package com.jd.open.api.sdk.request.neirong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.neirong.ContentWriteService.request.saveArticleContent.ArticleContentDto;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.neirong.ContentWriteContentWriteServiceSaveArticleContentResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ContentWriteContentWriteServiceSaveArticleContentRequest extends AbstractRequest implements JdRequest<ContentWriteContentWriteServiceSaveArticleContentResponse> {
   private ArticleContentDto articleContentDto;

   public String getApiMethod() {
      return "jingdong.content.write.ContentWriteService.saveArticleContent";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("articleContentDto", this.articleContentDto);
      return JsonUtil.toJson(pmap);
   }

   public Class<ContentWriteContentWriteServiceSaveArticleContentResponse> getResponseClass() {
      return ContentWriteContentWriteServiceSaveArticleContentResponse.class;
   }

   @JsonProperty("articleContentDto")
   public void setArticleContentDto(ArticleContentDto articleContentDto) {
      this.articleContentDto = articleContentDto;
   }

   @JsonProperty("articleContentDto")
   public ArticleContentDto getArticleContentDto() {
      return this.articleContentDto;
   }
}
