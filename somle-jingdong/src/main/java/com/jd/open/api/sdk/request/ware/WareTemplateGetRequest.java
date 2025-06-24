package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareTemplateGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareTemplateGetRequest extends AbstractRequest implements JdRequest<WareTemplateGetResponse> {
   private String id;
   private String fields;

   public String getId() {
      return this.id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getFields() {
      return this.fields;
   }

   public void setFields(String fields) {
      this.fields = fields;
   }

   public String getApiMethod() {
      return "360buy.ware.template.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> pmap = new TreeMap();
      pmap.put("id", this.id);
      pmap.put("fields", this.fields);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareTemplateGetResponse> getResponseClass() {
      return WareTemplateGetResponse.class;
   }
}
