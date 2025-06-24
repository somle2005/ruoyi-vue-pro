package com.jd.open.api.sdk.request.wujiemiandan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.LdopAlphaProviderSignSuccessInfoGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopAlphaProviderSignSuccessInfoGetRequest extends AbstractRequest implements JdRequest<LdopAlphaProviderSignSuccessInfoGetResponse> {
   private String venderCode;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public String getApiMethod() {
      return "jingdong.ldop.alpha.provider.sign.success.info.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAlphaProviderSignSuccessInfoGetResponse> getResponseClass() {
      return LdopAlphaProviderSignSuccessInfoGetResponse.class;
   }
}
