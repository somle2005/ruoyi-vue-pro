package com.jd.open.api.sdk.request.jwapi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jwapi.JwMarketingStoreQueryStoresResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JwMarketingStoreQueryStoresRequest extends AbstractRequest implements JdRequest<JwMarketingStoreQueryStoresResponse> {
   public String getApiMethod() {
      return "jingdong.jw.marketing.store.queryStores";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<JwMarketingStoreQueryStoresResponse> getResponseClass() {
      return JwMarketingStoreQueryStoresResponse.class;
   }
}
