package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PopMarketRetrievePromotionGetPromotionListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopMarketRetrievePromotionGetPromotionListRequest extends AbstractRequest implements JdRequest<PopMarketRetrievePromotionGetPromotionListResponse> {
   private String ip;
   private String requestId;
   private String port;
   private Integer promoStatus;
   private Long skuId;
   private int page;
   private int pageSize;

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   public String getRequestId() {
      return this.requestId;
   }

   public void setPort(String port) {
      this.port = port;
   }

   public String getPort() {
      return this.port;
   }

   public void setPromoStatus(Integer promoStatus) {
      this.promoStatus = promoStatus;
   }

   public Integer getPromoStatus() {
      return this.promoStatus;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setPage(int page) {
      this.page = page;
   }

   public int getPage() {
      return this.page;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.pop.market.retrieve.promotion.getPromotionList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ip", this.ip);
      pmap.put("request_id", this.requestId);
      pmap.put("port", this.port);
      pmap.put("promoStatus", this.promoStatus);
      pmap.put("skuId", this.skuId);
      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopMarketRetrievePromotionGetPromotionListResponse> getResponseClass() {
      return PopMarketRetrievePromotionGetPromotionListResponse.class;
   }
}
