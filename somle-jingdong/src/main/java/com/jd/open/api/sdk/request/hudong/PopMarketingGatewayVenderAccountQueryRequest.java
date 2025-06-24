package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.PopMarketingGatewayVenderAccountQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopMarketingGatewayVenderAccountQueryRequest extends AbstractRequest implements JdRequest<PopMarketingGatewayVenderAccountQueryResponse> {
   public String getApiMethod() {
      return "jingdong.pop.marketing.gateway.vender.account.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<PopMarketingGatewayVenderAccountQueryResponse> getResponseClass() {
      return PopMarketingGatewayVenderAccountQueryResponse.class;
   }
}
