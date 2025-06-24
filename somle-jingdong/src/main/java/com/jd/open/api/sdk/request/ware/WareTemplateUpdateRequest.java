package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareTemplateUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareTemplateUpdateRequest extends AbstractRequest implements JdRequest<WareTemplateUpdateResponse> {
   private String id;
   private String name = null;
   private String[] contents;

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getId() {
      return this.id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String[] getContents() {
      return this.contents;
   }

   public void setContents(String[] contents) {
      this.contents = contents;
   }

   public String getApiMethod() {
      return "360buy.ware.template.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("id", this.id);
      pmap.put("name", this.name);
      pmap.put("contents", this.contents);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareTemplateUpdateResponse> getResponseClass() {
      return WareTemplateUpdateResponse.class;
   }
}
