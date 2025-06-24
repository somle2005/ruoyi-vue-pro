package com.jd.open.api.sdk.request.list;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.list.CategoryReadFindByPIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CategoryReadFindByPIdRequest extends AbstractRequest implements JdRequest<CategoryReadFindByPIdResponse> {
   private Long parentCid;
   private String field;

   public void setParentCid(Long parentCid) {
      this.parentCid = parentCid;
   }

   public Long getParentCid() {
      return this.parentCid;
   }

   public void setField(String field) {
      this.field = field;
   }

   public String getField() {
      return this.field;
   }

   public String getApiMethod() {
      return "jingdong.category.read.findByPId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("parentCid", this.parentCid);
      pmap.put("field", this.field);
      return JsonUtil.toJson(pmap);
   }

   public Class<CategoryReadFindByPIdResponse> getResponseClass() {
      return CategoryReadFindByPIdResponse.class;
   }
}
