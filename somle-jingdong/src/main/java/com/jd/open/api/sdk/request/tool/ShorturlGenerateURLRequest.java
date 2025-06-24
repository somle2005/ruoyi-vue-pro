package com.jd.open.api.sdk.request.tool;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.tool.ShorturlGenerateURLResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ShorturlGenerateURLRequest extends AbstractRequest implements JdRequest<ShorturlGenerateURLResponse> {
   private String url;

   public void setUrl(String url) {
      this.url = url;
   }

   public String getUrl() {
      return this.url;
   }

   public String getApiMethod() {
      return "jingdong.shorturl.generateURL";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("url", this.url);
      return JsonUtil.toJson(pmap);
   }

   public Class<ShorturlGenerateURLResponse> getResponseClass() {
      return ShorturlGenerateURLResponse.class;
   }
}
