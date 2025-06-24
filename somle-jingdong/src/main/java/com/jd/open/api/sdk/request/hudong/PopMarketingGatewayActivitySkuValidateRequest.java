package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.PopMarketingGatewayActivitySkuValidateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopMarketingGatewayActivitySkuValidateRequest extends AbstractRequest implements JdRequest<PopMarketingGatewayActivitySkuValidateResponse> {
   private String skuIds;

   public void setSkuIds(String skuIds) {
      this.skuIds = skuIds;
   }

   public String getSkuIds() {
      return this.skuIds;
   }

   public String getApiMethod() {
      return "jingdong.pop.marketing.gateway.activity.sku.validate";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuIds", this.skuIds);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopMarketingGatewayActivitySkuValidateResponse> getResponseClass() {
      return PopMarketingGatewayActivitySkuValidateResponse.class;
   }
}
