package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolPromoApiCommonServicePromoBaseReadOuterServiceCheckWareInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolPromoApiCommonServicePromoBaseReadOuterServiceCheckWareInfoRequest extends AbstractRequest implements JdRequest<MarketToolPromoApiCommonServicePromoBaseReadOuterServiceCheckWareInfoResponse> {
   private String skuId;
   private String appName;

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public String getApiMethod() {
      return "jingdong.market.tool.promo.api.common.service.PromoBaseReadOuterService.checkWareInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuId", this.skuId);
      pmap.put("appName", this.appName);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolPromoApiCommonServicePromoBaseReadOuterServiceCheckWareInfoResponse> getResponseClass() {
      return MarketToolPromoApiCommonServicePromoBaseReadOuterServiceCheckWareInfoResponse.class;
   }
}
