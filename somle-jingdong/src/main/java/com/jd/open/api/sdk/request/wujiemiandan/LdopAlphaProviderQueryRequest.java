package com.jd.open.api.sdk.request.wujiemiandan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.LdopAlphaProviderQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopAlphaProviderQueryRequest extends AbstractRequest implements JdRequest<LdopAlphaProviderQueryResponse> {
   private Integer providerState;

   public void setProviderState(Integer providerState) {
      this.providerState = providerState;
   }

   public Integer getProviderState() {
      return this.providerState;
   }

   public String getApiMethod() {
      return "jingdong.ldop.alpha.provider.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("providerState", this.providerState);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAlphaProviderQueryResponse> getResponseClass() {
      return LdopAlphaProviderQueryResponse.class;
   }
}
