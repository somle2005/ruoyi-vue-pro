package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.VenderConfigFindPayTimeLimitRulsByVenderIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VenderConfigFindPayTimeLimitRulsByVenderIdRequest extends AbstractRequest implements JdRequest<VenderConfigFindPayTimeLimitRulsByVenderIdResponse> {
   public String getApiMethod() {
      return "jingdong.vender.config.findPayTimeLimitRulsByVenderId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<VenderConfigFindPayTimeLimitRulsByVenderIdResponse> getResponseClass() {
      return VenderConfigFindPayTimeLimitRulsByVenderIdResponse.class;
   }
}
