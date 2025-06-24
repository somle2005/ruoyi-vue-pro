package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolPromoApiPlusServicePromoDeleteProductServiceDelSkuInPromotionResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolPromoApiPlusServicePromoDeleteProductServiceDelSkuInPromotionRequest extends AbstractRequest implements JdRequest<MarketToolPromoApiPlusServicePromoDeleteProductServiceDelSkuInPromotionResponse> {
   private String appName;
   private Long promoId;
   private String skuId;

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   public Long getPromoId() {
      return this.promoId;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.market.tool.promo.api.plus.service.PromoDeleteProductService.delSkuInPromotion";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appName", this.appName);
      pmap.put("promoId", this.promoId);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolPromoApiPlusServicePromoDeleteProductServiceDelSkuInPromotionResponse> getResponseClass() {
      return MarketToolPromoApiPlusServicePromoDeleteProductServiceDelSkuInPromotionResponse.class;
   }
}
