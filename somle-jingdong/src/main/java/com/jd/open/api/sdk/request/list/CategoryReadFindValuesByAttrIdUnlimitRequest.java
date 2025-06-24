package com.jd.open.api.sdk.request.list;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.list.CategoryReadFindValuesByAttrIdUnlimitResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CategoryReadFindValuesByAttrIdUnlimitRequest extends AbstractRequest implements JdRequest<CategoryReadFindValuesByAttrIdUnlimitResponse> {
   private Long categoryAttrId;
   private String field;

   public void setCategoryAttrId(Long categoryAttrId) {
      this.categoryAttrId = categoryAttrId;
   }

   public Long getCategoryAttrId() {
      return this.categoryAttrId;
   }

   public void setField(String field) {
      this.field = field;
   }

   public String getField() {
      return this.field;
   }

   public String getApiMethod() {
      return "jingdong.category.read.findValuesByAttrIdUnlimit";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("categoryAttrId", this.categoryAttrId);
      pmap.put("field", this.field);
      return JsonUtil.toJson(pmap);
   }

   public Class<CategoryReadFindValuesByAttrIdUnlimitResponse> getResponseClass() {
      return CategoryReadFindValuesByAttrIdUnlimitResponse.class;
   }
}
