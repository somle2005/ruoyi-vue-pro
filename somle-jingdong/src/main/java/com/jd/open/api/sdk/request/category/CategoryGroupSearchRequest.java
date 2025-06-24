package com.jd.open.api.sdk.request.category;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.category.CategoryGroupSearchResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CategoryGroupSearchRequest extends AbstractRequest implements JdRequest<CategoryGroupSearchResponse> {
   private String fields;
   private String cid;

   @JsonProperty("fields")
   public String getFields() {
      return this.fields;
   }

   @JsonProperty("fields")
   public void setFields(String fields) {
      this.fields = fields;
   }

   @JsonProperty("cid")
   public String getCid() {
      return this.cid;
   }

   @JsonProperty("cid")
   public void setCid(String cid) {
      this.cid = cid;
   }

   public String getApiMethod() {
      return "360buy.ware.groups.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new HashMap();
      map.put("fields", this.fields);
      map.put("cid", this.cid);
      return JsonUtil.toJson(map);
   }

   public Class<CategoryGroupSearchResponse> getResponseClass() {
      return CategoryGroupSearchResponse.class;
   }
}
