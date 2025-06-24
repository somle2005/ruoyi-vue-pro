package com.jd.open.api.sdk.request.unboundedShop;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.QueryEntityStoreResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class QueryEntityStoreRequest extends AbstractRequest implements JdRequest<QueryEntityStoreResponse> {
   private Long storeId;
   private String categoryName;

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public void setCategoryName(String categoryName) {
      this.categoryName = categoryName;
   }

   public String getCategoryName() {
      return this.categoryName;
   }

   public String getApiMethod() {
      return "jingdong.queryEntityStore";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("storeId", this.storeId);
      pmap.put("categoryName", this.categoryName);
      return JsonUtil.toJson(pmap);
   }

   public Class<QueryEntityStoreResponse> getResponseClass() {
      return QueryEntityStoreResponse.class;
   }
}
