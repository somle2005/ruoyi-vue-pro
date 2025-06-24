package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.MarketBdpCartGetPinsBySkuIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketBdpCartGetPinsBySkuIdRequest extends AbstractRequest implements JdRequest<MarketBdpCartGetPinsBySkuIdResponse> {
   private Long skuId;
   private String days;

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setDays(String days) {
      this.days = days;
   }

   public String getDays() {
      return this.days;
   }

   public String getApiMethod() {
      return "jingdong.market.bdp.cart.getPinsBySkuId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuId", this.skuId);
      pmap.put("days", this.days);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketBdpCartGetPinsBySkuIdResponse> getResponseClass() {
      return MarketBdpCartGetPinsBySkuIdResponse.class;
   }
}
