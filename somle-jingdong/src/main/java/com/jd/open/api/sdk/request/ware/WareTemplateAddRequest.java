package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareTemplateAddResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareTemplateAddRequest extends AbstractRequest implements JdRequest<WareTemplateAddResponse> {
   private String name;
   private String[] contents;

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String[] getContents() {
      return this.contents;
   }

   public void setContents(String[] contents) {
      this.contents = contents;
   }

   public String getApiMethod() {
      return "360buy.ware.template.add";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("name", this.name);
      pmap.put("contents", this.contents);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareTemplateAddResponse> getResponseClass() {
      return WareTemplateAddResponse.class;
   }
}
