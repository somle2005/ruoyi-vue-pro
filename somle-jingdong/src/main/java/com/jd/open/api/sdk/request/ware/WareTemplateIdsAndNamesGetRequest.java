package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareTemplateIdsAndNamesGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareTemplateIdsAndNamesGetRequest extends AbstractRequest implements JdRequest<WareTemplateIdsAndNamesGetResponse> {
   private String fields;

   public String getFields() {
      return this.fields;
   }

   public void setFields(String fields) {
      this.fields = fields;
   }

   public String getApiMethod() {
      return "360buy.ware.template.ids.names.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> pmap = new TreeMap();
      pmap.put("fields", this.fields);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareTemplateIdsAndNamesGetResponse> getResponseClass() {
      return WareTemplateIdsAndNamesGetResponse.class;
   }
}
