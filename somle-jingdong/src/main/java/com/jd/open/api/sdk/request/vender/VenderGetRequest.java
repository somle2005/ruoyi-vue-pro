package com.jd.open.api.sdk.request.vender;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.vender.VenderGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VenderGetRequest extends AbstractRequest implements JdRequest<VenderGetResponse> {
   private String fields;

   public String getApiMethod() {
      return "360buy.vender.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("fields", this.fields);
      return JsonUtil.toJson(pmap);
   }

   public Class<VenderGetResponse> getResponseClass() {
      return VenderGetResponse.class;
   }

   @JsonProperty("fields")
   public String getFields() {
      return this.fields;
   }

   @JsonProperty("fields")
   public void setFields(String fields) {
      this.fields = fields;
   }
}
