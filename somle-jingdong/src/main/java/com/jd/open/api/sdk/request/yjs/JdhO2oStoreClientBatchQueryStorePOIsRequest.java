package com.jd.open.api.sdk.request.yjs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.yjs.StoreClient.request.batchQueryStorePOIs.StorePOIRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.yjs.JdhO2oStoreClientBatchQueryStorePOIsResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JdhO2oStoreClientBatchQueryStorePOIsRequest extends AbstractRequest implements JdRequest<JdhO2oStoreClientBatchQueryStorePOIsResponse> {
   private StorePOIRequest storePOIRequest;

   public String getApiMethod() {
      return "jingdong.jdh.o2o.StoreClient.batchQueryStorePOIs";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("storePOIRequest", this.storePOIRequest);
      return JsonUtil.toJson(pmap);
   }

   public Class<JdhO2oStoreClientBatchQueryStorePOIsResponse> getResponseClass() {
      return JdhO2oStoreClientBatchQueryStorePOIsResponse.class;
   }

   @JsonProperty("storePOIRequest")
   public void setStorePOIRequest(StorePOIRequest storePOIRequest) {
      this.storePOIRequest = storePOIRequest;
   }

   @JsonProperty("storePOIRequest")
   public StorePOIRequest getStorePOIRequest() {
      return this.storePOIRequest;
   }
}
