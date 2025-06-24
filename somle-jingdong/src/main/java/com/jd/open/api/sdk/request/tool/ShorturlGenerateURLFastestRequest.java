package com.jd.open.api.sdk.request.tool;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.tool.ShorturlGenerateURLFastestResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ShorturlGenerateURLFastestRequest extends AbstractRequest implements JdRequest<ShorturlGenerateURLFastestResponse> {
   private String domain;
   private int length;
   private String realUrl;
   private int expiredDays;

   public void setDomain(String domain) {
      this.domain = domain;
   }

   public String getDomain() {
      return this.domain;
   }

   public void setLength(int length) {
      this.length = length;
   }

   public int getLength() {
      return this.length;
   }

   public void setRealUrl(String realUrl) {
      this.realUrl = realUrl;
   }

   public String getRealUrl() {
      return this.realUrl;
   }

   public void setExpiredDays(int expiredDays) {
      this.expiredDays = expiredDays;
   }

   public int getExpiredDays() {
      return this.expiredDays;
   }

   public String getApiMethod() {
      return "jingdong.shorturl.generateURLFastest";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("domain", this.domain);
      pmap.put("length", this.length);
      pmap.put("realUrl", this.realUrl);
      pmap.put("expiredDays", this.expiredDays);
      return JsonUtil.toJson(pmap);
   }

   public Class<ShorturlGenerateURLFastestResponse> getResponseClass() {
      return ShorturlGenerateURLFastestResponse.class;
   }
}
