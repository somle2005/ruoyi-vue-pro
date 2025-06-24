package com.jd.open.api.sdk.request.alpha;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.alpha.AgingtemplGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AgingtemplGetRequest extends AbstractRequest implements JdRequest<AgingtemplGetResponse> {
   private String source;

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public String getApiMethod() {
      return "jingdong.agingtempl.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("source", this.source);
      return JsonUtil.toJson(pmap);
   }

   public Class<AgingtemplGetResponse> getResponseClass() {
      return AgingtemplGetResponse.class;
   }
}
