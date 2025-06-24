package com.jd.open.api.sdk.request.list;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.list.CategoryReadFindAttrByIdJosResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CategoryReadFindAttrByIdJosRequest extends AbstractRequest implements JdRequest<CategoryReadFindAttrByIdJosResponse> {
   private Long attrId;
   private String field;

   public void setAttrId(Long attrId) {
      this.attrId = attrId;
   }

   public Long getAttrId() {
      return this.attrId;
   }

   public void setField(String field) {
      this.field = field;
   }

   public String getField() {
      return this.field;
   }

   public String getApiMethod() {
      return "jingdong.category.read.findAttrByIdJos";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("attrId", this.attrId);
      pmap.put("field", this.field);
      return JsonUtil.toJson(pmap);
   }

   public Class<CategoryReadFindAttrByIdJosResponse> getResponseClass() {
      return CategoryReadFindAttrByIdJosResponse.class;
   }
}
