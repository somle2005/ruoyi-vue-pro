package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerPromotionDeleteSkuInPromoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionDeleteSkuInPromoRequest extends AbstractRequest implements JdRequest<SellerPromotionDeleteSkuInPromoResponse> {
   private String ip;
   private String port;
   private String requestId;
   private Long promoId;
   private String skuId;

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setPort(String port) {
      this.port = port;
   }

   public String getPort() {
      return this.port;
   }

   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   public String getRequestId() {
      return this.requestId;
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
      return "jingdong.seller.promotion.deleteSkuInPromo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ip", this.ip);
      pmap.put("port", this.port);
      pmap.put("request_id", this.requestId);
      pmap.put("promoId", this.promoId);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerPromotionDeleteSkuInPromoResponse> getResponseClass() {
      return SellerPromotionDeleteSkuInPromoResponse.class;
   }
}
