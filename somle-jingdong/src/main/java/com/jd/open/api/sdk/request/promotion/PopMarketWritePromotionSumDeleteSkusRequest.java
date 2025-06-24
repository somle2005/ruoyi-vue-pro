package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PopMarketWritePromotionSumDeleteSkusResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopMarketWritePromotionSumDeleteSkusRequest extends AbstractRequest implements JdRequest<PopMarketWritePromotionSumDeleteSkusResponse> {
   private String ip;
   private String port;
   private String requestId;
   private Long rfId;
   private Long promoId;
   private String skuId;
   private String operator1;

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

   public void setRfId(Long rfId) {
      this.rfId = rfId;
   }

   public Long getRfId() {
      return this.rfId;
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

   public void setOperator1(String operator1) {
      this.operator1 = operator1;
   }

   public String getOperator1() {
      return this.operator1;
   }

   public String getApiMethod() {
      return "jingdong.pop.market.write.promotion.sum.deleteSkus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ip", this.ip);
      pmap.put("port", this.port);
      pmap.put("request_id", this.requestId);
      pmap.put("rfId", this.rfId);
      pmap.put("promoId", this.promoId);
      pmap.put("skuId", this.skuId);
      pmap.put("operator1", this.operator1);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopMarketWritePromotionSumDeleteSkusResponse> getResponseClass() {
      return PopMarketWritePromotionSumDeleteSkusResponse.class;
   }
}
