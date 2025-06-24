package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolPromoApiUnitServicePlusDiscountReadOuterServiceGetPromoInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolPromoApiUnitServicePlusDiscountReadOuterServiceGetPromoInfoRequest extends AbstractRequest implements JdRequest<MarketToolPromoApiUnitServicePlusDiscountReadOuterServiceGetPromoInfoResponse> {
   private String appName;
   private String promoId;

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setPromoId(String promoId) {
      this.promoId = promoId;
   }

   public String getPromoId() {
      return this.promoId;
   }

   public String getApiMethod() {
      return "jingdong.market.tool.promo.api.unit.service.PlusDiscountReadOuterService.getPromoInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appName", this.appName);
      pmap.put("promoId", this.promoId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolPromoApiUnitServicePlusDiscountReadOuterServiceGetPromoInfoResponse> getResponseClass() {
      return MarketToolPromoApiUnitServicePlusDiscountReadOuterServiceGetPromoInfoResponse.class;
   }
}
