package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareTemplateToWaresUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareTemplateToWaresUpdateRequest extends AbstractRequest implements JdRequest<WareTemplateToWaresUpdateResponse> {
   private String id;
   private String wareIds;

   public String getApiMethod() {
      return "360buy.ware.template.to.wares.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> pmap = new TreeMap();
      pmap.put("id", this.id);
      pmap.put("ware_ids", this.wareIds);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareTemplateToWaresUpdateResponse> getResponseClass() {
      return WareTemplateToWaresUpdateResponse.class;
   }

   public String getId() {
      return this.id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getWareIds() {
      return this.wareIds;
   }

   public void setWareIds(String wareIds) {
      this.wareIds = wareIds;
   }
}
