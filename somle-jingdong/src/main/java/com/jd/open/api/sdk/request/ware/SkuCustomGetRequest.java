package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.SkuCustomGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SkuCustomGetRequest extends AbstractRequest implements JdRequest<SkuCustomGetResponse> {
   private String outerId;
   private String fields;

   public String getApiMethod() {
      return "360buy.sku.custom.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("outer_id", this.outerId);
      pmap.put("fields", this.fields);
      return JsonUtil.toJson(pmap);
   }

   public Class<SkuCustomGetResponse> getResponseClass() {
      return SkuCustomGetResponse.class;
   }

   public String getFields() {
      return this.fields;
   }

   public void setFields(String fields) {
      this.fields = fields;
   }

   public String getOuterId() {
      return this.outerId;
   }

   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }
}
