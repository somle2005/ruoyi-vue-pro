package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.PopMarketingGatewaySignResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopMarketingGatewaySignRequest extends AbstractRequest implements JdRequest<PopMarketingGatewaySignResponse> {
   private String signType;
   private String protocolType;

   public void setSignType(String signType) {
      this.signType = signType;
   }

   public String getSignType() {
      return this.signType;
   }

   public void setProtocolType(String protocolType) {
      this.protocolType = protocolType;
   }

   public String getProtocolType() {
      return this.protocolType;
   }

   public String getApiMethod() {
      return "jingdong.pop.marketing.gateway.sign";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("signType", this.signType);
      pmap.put("protocolType", this.protocolType);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopMarketingGatewaySignResponse> getResponseClass() {
      return PopMarketingGatewaySignResponse.class;
   }
}
