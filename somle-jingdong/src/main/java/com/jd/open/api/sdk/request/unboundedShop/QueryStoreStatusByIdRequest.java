package com.jd.open.api.sdk.request.unboundedShop;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.QueryStoreStatusByIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class QueryStoreStatusByIdRequest extends AbstractRequest implements JdRequest<QueryStoreStatusByIdResponse> {
   private Long storeId;

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public String getApiMethod() {
      return "jingdong.queryStoreStatusById";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("storeId", this.storeId);
      return JsonUtil.toJson(pmap);
   }

   public Class<QueryStoreStatusByIdResponse> getResponseClass() {
      return QueryStoreStatusByIdResponse.class;
   }
}
