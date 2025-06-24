package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoShopActivityListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromoShopActivityListRequest extends AbstractRequest implements JdRequest<PromoShopActivityListResponse> {
   private Long wareId;
   private Integer evtStatus;
   private Integer evtType;
   private Integer pageSize;
   private Integer pageIndex;
   private String evtName;
   private String startTime;
   private String promoId;
   private String endTime;
   private Long skuId;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setEvtStatus(Integer evtStatus) {
      this.evtStatus = evtStatus;
   }

   public Integer getEvtStatus() {
      return this.evtStatus;
   }

   public void setEvtType(Integer evtType) {
      this.evtType = evtType;
   }

   public Integer getEvtType() {
      return this.evtType;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setEvtName(String evtName) {
      this.evtName = evtName;
   }

   public String getEvtName() {
      return this.evtName;
   }

   public void setStartTime(String startTime) {
      this.startTime = startTime;
   }

   public String getStartTime() {
      return this.startTime;
   }

   public void setPromoId(String promoId) {
      this.promoId = promoId;
   }

   public String getPromoId() {
      return this.promoId;
   }

   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   public String getEndTime() {
      return this.endTime;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.promo.shop.activity.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("evtStatus", this.evtStatus);
      pmap.put("evtType", this.evtType);
      pmap.put("pageSize", this.pageSize);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("evtName", this.evtName);
      pmap.put("startTime", this.startTime);
      pmap.put("promoId", this.promoId);
      pmap.put("endTime", this.endTime);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoShopActivityListResponse> getResponseClass() {
      return PromoShopActivityListResponse.class;
   }
}
