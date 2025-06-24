package com.jd.open.api.sdk.request.list;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.list.CategoryReadFindValuesByIdUnlimitResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CategoryReadFindValuesByIdUnlimitRequest extends AbstractRequest implements JdRequest<CategoryReadFindValuesByIdUnlimitResponse> {
   private Long id;
   private String field;

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return this.id;
   }

   public void setField(String field) {
      this.field = field;
   }

   public String getField() {
      return this.field;
   }

   public String getApiMethod() {
      return "jingdong.category.read.findValuesByIdUnlimit";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("id", this.id);
      pmap.put("field", this.field);
      return JsonUtil.toJson(pmap);
   }

   public Class<CategoryReadFindValuesByIdUnlimitResponse> getResponseClass() {
      return CategoryReadFindValuesByIdUnlimitResponse.class;
   }
}
