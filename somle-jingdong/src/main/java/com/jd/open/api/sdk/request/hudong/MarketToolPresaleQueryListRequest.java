package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolPresaleQueryListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolPresaleQueryListRequest extends AbstractRequest implements JdRequest<MarketToolPresaleQueryListResponse> {
   private Integer canSpotPresale;
   private String wareId;
   private String shipTime;
   private Integer presaleStatus;
   private Integer pageSize;
   private String presaleStartTime;
   private Integer pageIndex;
   private Long presaleId;
   private String presaleEndTime;
   private String skuId;

   public void setCanSpotPresale(Integer canSpotPresale) {
      this.canSpotPresale = canSpotPresale;
   }

   public Integer getCanSpotPresale() {
      return this.canSpotPresale;
   }

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setShipTime(String shipTime) {
      this.shipTime = shipTime;
   }

   public String getShipTime() {
      return this.shipTime;
   }

   public void setPresaleStatus(Integer presaleStatus) {
      this.presaleStatus = presaleStatus;
   }

   public Integer getPresaleStatus() {
      return this.presaleStatus;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPresaleStartTime(String presaleStartTime) {
      this.presaleStartTime = presaleStartTime;
   }

   public String getPresaleStartTime() {
      return this.presaleStartTime;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setPresaleId(Long presaleId) {
      this.presaleId = presaleId;
   }

   public Long getPresaleId() {
      return this.presaleId;
   }

   public void setPresaleEndTime(String presaleEndTime) {
      this.presaleEndTime = presaleEndTime;
   }

   public String getPresaleEndTime() {
      return this.presaleEndTime;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.market.tool.presale.query.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("canSpotPresale", this.canSpotPresale);
      pmap.put("wareId", this.wareId);
      pmap.put("shipTime", this.shipTime);
      pmap.put("presaleStatus", this.presaleStatus);
      pmap.put("pageSize", this.pageSize);
      pmap.put("presaleStartTime", this.presaleStartTime);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("presaleId", this.presaleId);
      pmap.put("presaleEndTime", this.presaleEndTime);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolPresaleQueryListResponse> getResponseClass() {
      return MarketToolPresaleQueryListResponse.class;
   }
}
