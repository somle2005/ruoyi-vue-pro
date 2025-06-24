package com.jd.open.api.sdk.request.category;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.category.CategoryAttributeValueSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CategoryAttributeValueSearchRequest extends AbstractRequest implements JdRequest<CategoryAttributeValueSearchResponse> {
   private String avs;
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
      return "360buy.ware.get.attvalue";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("avs", this.avs);
      map.put("fields", this.fields);
      return JsonUtil.toJson(map);
   }

   @JsonProperty("avs")
   public String getAvs() {
      return this.avs;
   }

   @JsonProperty("avs")
   public void setAvs(String avs) {
      this.avs = avs;
   }

   public Class<CategoryAttributeValueSearchResponse> getResponseClass() {
      return CategoryAttributeValueSearchResponse.class;
   }
}
