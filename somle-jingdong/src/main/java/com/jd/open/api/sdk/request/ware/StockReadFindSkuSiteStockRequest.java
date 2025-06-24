package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.StockReadFindSkuSiteStockResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class StockReadFindSkuSiteStockRequest extends AbstractRequest implements JdRequest<StockReadFindSkuSiteStockResponse> {
   private Long skuId;
   private Integer siteId;
   private String venderSource;
   private Integer stockNum;
   private Integer orderBookingNum;
   private Integer appBookingNum;
   private Integer canUsedNum;

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setSiteId(Integer siteId) {
      this.siteId = siteId;
   }

   public Integer getSiteId() {
      return this.siteId;
   }

   public void setVenderSource(String venderSource) {
      this.venderSource = venderSource;
   }

   public String getVenderSource() {
      return this.venderSource;
   }

   public void setStockNum(Integer stockNum) {
      this.stockNum = stockNum;
   }

   public Integer getStockNum() {
      return this.stockNum;
   }

   public void setOrderBookingNum(Integer orderBookingNum) {
      this.orderBookingNum = orderBookingNum;
   }

   public Integer getOrderBookingNum() {
      return this.orderBookingNum;
   }

   public void setAppBookingNum(Integer appBookingNum) {
      this.appBookingNum = appBookingNum;
   }

   public Integer getAppBookingNum() {
      return this.appBookingNum;
   }

   public void setCanUsedNum(Integer canUsedNum) {
      this.canUsedNum = canUsedNum;
   }

   public Integer getCanUsedNum() {
      return this.canUsedNum;
   }

   public String getApiMethod() {
      return "jingdong.stock.read.findSkuSiteStock";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuId", this.skuId);
      pmap.put("siteId", this.siteId);
      pmap.put("venderSource", this.venderSource);
      pmap.put("stockNum", this.stockNum);
      pmap.put("orderBookingNum", this.orderBookingNum);
      pmap.put("appBookingNum", this.appBookingNum);
      pmap.put("canUsedNum", this.canUsedNum);
      return JsonUtil.toJson(pmap);
   }

   public Class<StockReadFindSkuSiteStockResponse> getResponseClass() {
      return StockReadFindSkuSiteStockResponse.class;
   }
}
