package com.jd.open.api.sdk.request.list;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.list.CategoryReadFindAttrsByCategoryIdJosResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CategoryReadFindAttrsByCategoryIdJosRequest extends AbstractRequest implements JdRequest<CategoryReadFindAttrsByCategoryIdJosResponse> {
   private Long cid;
   private Integer attributeType;
   private String field;

   public void setCid(Long cid) {
      this.cid = cid;
   }

   public Long getCid() {
      return this.cid;
   }

   public void setAttributeType(Integer attributeType) {
      this.attributeType = attributeType;
   }

   public Integer getAttributeType() {
      return this.attributeType;
   }

   public void setField(String field) {
      this.field = field;
   }

   public String getField() {
      return this.field;
   }

   public String getApiMethod() {
      return "jingdong.category.read.findAttrsByCategoryIdJos";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cid", this.cid);
      pmap.put("attributeType", this.attributeType);
      pmap.put("field", this.field);
      return JsonUtil.toJson(pmap);
   }

   public Class<CategoryReadFindAttrsByCategoryIdJosResponse> getResponseClass() {
      return CategoryReadFindAttrsByCategoryIdJosResponse.class;
   }
}
