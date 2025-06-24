package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareGetRequest extends AbstractRequest implements JdRequest<WareGetResponse> {
   private String wareId;
   private String fields;

   public String getApiMethod() {
      return "360buy.ware.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("fields", this.fields);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareGetResponse> getResponseClass() {
      return WareGetResponse.class;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getFields() {
      return this.fields;
   }

   public void setFields(String fields) {
      this.fields = fields;
   }
}
