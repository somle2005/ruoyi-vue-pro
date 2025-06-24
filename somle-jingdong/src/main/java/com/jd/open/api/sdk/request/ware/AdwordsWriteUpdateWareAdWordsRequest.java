package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.AdwordsWriteUpdateWareAdWordsResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AdwordsWriteUpdateWareAdWordsRequest extends AbstractRequest implements JdRequest<AdwordsWriteUpdateWareAdWordsResponse> {
   private Long wareId;
   private String url;
   private String urlWords;
   private String words;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public String getUrl() {
      return this.url;
   }

   public void setUrlWords(String urlWords) {
      this.urlWords = urlWords;
   }

   public String getUrlWords() {
      return this.urlWords;
   }

   public void setWords(String words) {
      this.words = words;
   }

   public String getWords() {
      return this.words;
   }

   public String getApiMethod() {
      return "jingdong.adwords.write.updateWareAdWords";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("url", this.url);
      pmap.put("urlWords", this.urlWords);
      pmap.put("words", this.words);
      return JsonUtil.toJson(pmap);
   }

   public Class<AdwordsWriteUpdateWareAdWordsResponse> getResponseClass() {
      return AdwordsWriteUpdateWareAdWordsResponse.class;
   }
}
