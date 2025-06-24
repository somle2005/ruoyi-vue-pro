package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareSkusGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSkusGetRequest extends AbstractRequest implements JdRequest<WareSkusGetResponse> {
   private String wareIds;
   private String fields;

   public String getApiMethod() {
      return "360buy.ware.skus.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_ids", this.wareIds);
      pmap.put("fields", this.fields);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareSkusGetResponse> getResponseClass() {
      return WareSkusGetResponse.class;
   }

   public String getFields() {
      return this.fields;
   }

   public void setFields(String fields) {
      this.fields = fields;
   }

   public String getWareIds() {
      return this.wareIds;
   }

   public void setWareIds(String wareIds) {
      this.wareIds = wareIds;
   }
}
