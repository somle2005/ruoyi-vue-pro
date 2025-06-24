package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.PopMarketingGatewayActivityDetailQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopMarketingGatewayActivityDetailQueryRequest extends AbstractRequest implements JdRequest<PopMarketingGatewayActivityDetailQueryResponse> {
   private String mktActBaseNo;

   public void setMktActBaseNo(String mktActBaseNo) {
      this.mktActBaseNo = mktActBaseNo;
   }

   public String getMktActBaseNo() {
      return this.mktActBaseNo;
   }

   public String getApiMethod() {
      return "jingdong.pop.marketing.gateway.activity.detail.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("mktActBaseNo", this.mktActBaseNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopMarketingGatewayActivityDetailQueryResponse> getResponseClass() {
      return PopMarketingGatewayActivityDetailQueryResponse.class;
   }
}
