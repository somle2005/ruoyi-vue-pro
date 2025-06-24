package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareTemplateDeleteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareTemplateDeleteRequest extends AbstractRequest implements JdRequest<WareTemplateDeleteResponse> {
   private String id;

   public String getId() {
      return this.id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getApiMethod() {
      return "360buy.ware.template.delete";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> pmap = new TreeMap();
      pmap.put("id", this.id);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareTemplateDeleteResponse> getResponseClass() {
      return WareTemplateDeleteResponse.class;
   }
}
