package com.jd.open.api.sdk.request.yjs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.yjs.StoreClient.request.queryStorePageDetailData.StorePageDetailRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.yjs.JdhO2oStoreClientQueryStorePageDetailDataResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JdhO2oStoreClientQueryStorePageDetailDataRequest extends AbstractRequest implements JdRequest<JdhO2oStoreClientQueryStorePageDetailDataResponse> {
   private StorePageDetailRequest storeDetailPageRequest;

   public String getApiMethod() {
      return "jingdong.jdh.o2o.StoreClient.queryStorePageDetailData";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("storeDetailPageRequest", this.storeDetailPageRequest);
      return JsonUtil.toJson(pmap);
   }

   public Class<JdhO2oStoreClientQueryStorePageDetailDataResponse> getResponseClass() {
      return JdhO2oStoreClientQueryStorePageDetailDataResponse.class;
   }

   @JsonProperty("storeDetailPageRequest")
   public void setStoreDetailPageRequest(StorePageDetailRequest storeDetailPageRequest) {
      this.storeDetailPageRequest = storeDetailPageRequest;
   }

   @JsonProperty("storeDetailPageRequest")
   public StorePageDetailRequest getStoreDetailPageRequest() {
      return this.storeDetailPageRequest;
   }
}
