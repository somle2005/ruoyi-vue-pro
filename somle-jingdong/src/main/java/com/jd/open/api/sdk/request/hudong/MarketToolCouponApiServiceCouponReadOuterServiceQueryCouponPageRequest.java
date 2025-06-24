package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolCouponApiServiceCouponReadOuterServiceQueryCouponPageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolCouponApiServiceCouponReadOuterServiceQueryCouponPageRequest extends AbstractRequest implements JdRequest<MarketToolCouponApiServiceCouponReadOuterServiceQueryCouponPageResponse> {
   private Integer creator;
   private Integer newStatus;
   private String skuIdStr;
   private Integer bindType;
   private Integer pageSize;
   private Long couponId;
   private Integer wareChoseType;
   private Integer delete;
   private Long spuId;
   private Integer page;
   private String beginTime;
   private String endTime;
   private Long skuId;
   private String couponTitle;
   private String couponIdStr;
   private String appName;
   private String ip;
   private String appId;

   public void setCreator(Integer creator) {
      this.creator = creator;
   }

   public Integer getCreator() {
      return this.creator;
   }

   public void setNewStatus(Integer newStatus) {
      this.newStatus = newStatus;
   }

   public Integer getNewStatus() {
      return this.newStatus;
   }

   public void setSkuIdStr(String skuIdStr) {
      this.skuIdStr = skuIdStr;
   }

   public String getSkuIdStr() {
      return this.skuIdStr;
   }

   public void setBindType(Integer bindType) {
      this.bindType = bindType;
   }

   public Integer getBindType() {
      return this.bindType;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setCouponId(Long couponId) {
      this.couponId = couponId;
   }

   public Long getCouponId() {
      return this.couponId;
   }

   public void setWareChoseType(Integer wareChoseType) {
      this.wareChoseType = wareChoseType;
   }

   public Integer getWareChoseType() {
      return this.wareChoseType;
   }

   public void setDelete(Integer delete) {
      this.delete = delete;
   }

   public Integer getDelete() {
      return this.delete;
   }

   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   public Long getSpuId() {
      return this.spuId;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   public String getBeginTime() {
      return this.beginTime;
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

   public void setCouponTitle(String couponTitle) {
      this.couponTitle = couponTitle;
   }

   public String getCouponTitle() {
      return this.couponTitle;
   }

   public void setCouponIdStr(String couponIdStr) {
      this.couponIdStr = couponIdStr;
   }

   public String getCouponIdStr() {
      return this.couponIdStr;
   }

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public String getApiMethod() {
      return "jingdong.market.tool.coupon.api.service.CouponReadOuterService.queryCouponPage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("creator", this.creator);
      pmap.put("newStatus", this.newStatus);
      pmap.put("skuIdStr", this.skuIdStr);
      pmap.put("bindType", this.bindType);
      pmap.put("pageSize", this.pageSize);
      pmap.put("couponId", this.couponId);
      pmap.put("wareChoseType", this.wareChoseType);
      pmap.put("delete", this.delete);
      pmap.put("spuId", this.spuId);
      pmap.put("page", this.page);
      pmap.put("beginTime", this.beginTime);
      pmap.put("endTime", this.endTime);
      pmap.put("skuId", this.skuId);
      pmap.put("couponTitle", this.couponTitle);
      pmap.put("couponIdStr", this.couponIdStr);
      pmap.put("appName", this.appName);
      pmap.put("ip", this.ip);
      pmap.put("appId", this.appId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolCouponApiServiceCouponReadOuterServiceQueryCouponPageResponse> getResponseClass() {
      return MarketToolCouponApiServiceCouponReadOuterServiceQueryCouponPageResponse.class;
   }
}
