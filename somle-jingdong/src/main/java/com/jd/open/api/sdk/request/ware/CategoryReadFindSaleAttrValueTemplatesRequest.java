package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.CategoryReadFindSaleAttrValueTemplatesResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CategoryReadFindSaleAttrValueTemplatesRequest extends AbstractRequest implements JdRequest<CategoryReadFindSaleAttrValueTemplatesResponse> {
   private String attrId;
   private String field;

   public void setAttrId(String attrId) {
      this.attrId = attrId;
   }

   public String getAttrId() {
      return this.attrId;
   }

   public void setField(String field) {
      this.field = field;
   }

   public String getField() {
      return this.field;
   }

   public String getApiMethod() {
      return "jingdong.category.read.findSaleAttrValueTemplates";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("attrId", this.attrId);
      pmap.put("field", this.field);
      return JsonUtil.toJson(pmap);
   }

   public Class<CategoryReadFindSaleAttrValueTemplatesResponse> getResponseClass() {
      return CategoryReadFindSaleAttrValueTemplatesResponse.class;
   }
}
