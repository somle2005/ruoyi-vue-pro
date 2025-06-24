package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.CategoryReadFindSaleAttrTemplatesResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CategoryReadFindSaleAttrTemplatesRequest extends AbstractRequest implements JdRequest<CategoryReadFindSaleAttrTemplatesResponse> {
   private Long cid;

   public void setCid(Long cid) {
      this.cid = cid;
   }

   public Long getCid() {
      return this.cid;
   }

   public String getApiMethod() {
      return "jingdong.category.read.findSaleAttrTemplates";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cid", this.cid);
      return JsonUtil.toJson(pmap);
   }

   public Class<CategoryReadFindSaleAttrTemplatesResponse> getResponseClass() {
      return CategoryReadFindSaleAttrTemplatesResponse.class;
   }
}
