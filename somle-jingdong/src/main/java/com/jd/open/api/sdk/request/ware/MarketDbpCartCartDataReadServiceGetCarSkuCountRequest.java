package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.MarketDbpCartCartDataReadServiceGetCarSkuCountResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketDbpCartCartDataReadServiceGetCarSkuCountRequest extends AbstractRequest implements JdRequest<MarketDbpCartCartDataReadServiceGetCarSkuCountResponse> {
   public String getApiMethod() {
      return "jingdong.market.dbp.cart.CartDataReadService.getCarSkuCount";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketDbpCartCartDataReadServiceGetCarSkuCountResponse> getResponseClass() {
      return MarketDbpCartCartDataReadServiceGetCarSkuCountResponse.class;
   }
}
