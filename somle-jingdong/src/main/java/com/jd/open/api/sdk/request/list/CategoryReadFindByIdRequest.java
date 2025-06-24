package com.jd.open.api.sdk.request.list;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.list.CategoryReadFindByIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CategoryReadFindByIdRequest extends AbstractRequest implements JdRequest<CategoryReadFindByIdResponse> {
   private Long cid;
   private String field;

   public void setCid(Long cid) {
      this.cid = cid;
   }

   public Long getCid() {
      return this.cid;
   }

   public void setField(String field) {
      this.field = field;
   }

   public String getField() {
      return this.field;
   }

   public String getApiMethod() {
      return "jingdong.category.read.findById";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cid", this.cid);
      pmap.put("field", this.field);
      return JsonUtil.toJson(pmap);
   }

   public Class<CategoryReadFindByIdResponse> getResponseClass() {
      return CategoryReadFindByIdResponse.class;
   }
}
