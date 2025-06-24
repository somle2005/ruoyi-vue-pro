package com.jd.open.api.sdk.request.alpha;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.alpha.FceAlphaGetVenderCarrierResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FceAlphaGetVenderCarrierRequest extends AbstractRequest implements JdRequest<FceAlphaGetVenderCarrierResponse> {
   public String getApiMethod() {
      return "jingdong.fce.alpha.getVenderCarrier";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<FceAlphaGetVenderCarrierResponse> getResponseClass() {
      return FceAlphaGetVenderCarrierResponse.class;
   }
}
