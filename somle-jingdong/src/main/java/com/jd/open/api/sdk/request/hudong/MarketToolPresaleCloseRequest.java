package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolPresaleCloseResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolPresaleCloseRequest extends AbstractRequest implements JdRequest<MarketToolPresaleCloseResponse> {
   private String skuId;

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.market.tool.presale.close";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolPresaleCloseResponse> getResponseClass() {
      return MarketToolPresaleCloseResponse.class;
   }
}
