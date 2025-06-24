package com.jd.open.api.sdk.request.unboundedShop;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.FindStoreInfoByExtStoreIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FindStoreInfoByExtStoreIdRequest extends AbstractRequest implements JdRequest<FindStoreInfoByExtStoreIdResponse> {
   private String extStoreId;

   public void setExtStoreId(String extStoreId) {
      this.extStoreId = extStoreId;
   }

   public String getExtStoreId() {
      return this.extStoreId;
   }

   public String getApiMethod() {
      return "jingdong.findStoreInfoByExtStoreId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("extStoreId", this.extStoreId);
      return JsonUtil.toJson(pmap);
   }

   public Class<FindStoreInfoByExtStoreIdResponse> getResponseClass() {
      return FindStoreInfoByExtStoreIdResponse.class;
   }
}
