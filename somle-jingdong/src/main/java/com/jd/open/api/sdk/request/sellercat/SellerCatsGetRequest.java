package com.jd.open.api.sdk.request.sellercat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.sellercat.SellerCatsGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerCatsGetRequest extends AbstractRequest implements JdRequest<SellerCatsGetResponse> {
   private String fields;

   @JsonProperty("fields")
   public String getFields() {
      return this.fields;
   }

   @JsonProperty("fields")
   public void setFields(String fields) {
      this.fields = fields;
   }

   public String getApiMethod() {
      return "360buy.sellercats.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("fields", this.fields);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerCatsGetResponse> getResponseClass() {
      return SellerCatsGetResponse.class;
   }
}
