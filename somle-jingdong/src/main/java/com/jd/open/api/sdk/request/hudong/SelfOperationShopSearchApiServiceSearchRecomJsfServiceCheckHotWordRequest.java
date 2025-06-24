package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.SelfOperationShopSearchApiServiceSearchRecomJsfServiceCheckHotWordResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SelfOperationShopSearchApiServiceSearchRecomJsfServiceCheckHotWordRequest extends AbstractRequest implements JdRequest<SelfOperationShopSearchApiServiceSearchRecomJsfServiceCheckHotWordResponse> {
   private String hotWord;

   public void setHotWord(String hotWord) {
      this.hotWord = hotWord;
   }

   public String getHotWord() {
      return this.hotWord;
   }

   public String getApiMethod() {
      return "jingdong.self.operation.shop.search.api.service.SearchRecomJsfService.checkHotWord";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("hotWord", this.hotWord);
      return JsonUtil.toJson(pmap);
   }

   public Class<SelfOperationShopSearchApiServiceSearchRecomJsfServiceCheckHotWordResponse> getResponseClass() {
      return SelfOperationShopSearchApiServiceSearchRecomJsfServiceCheckHotWordResponse.class;
   }
}
