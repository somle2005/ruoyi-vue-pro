package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoActivitySkuListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromoActivitySkuListRequest extends AbstractRequest implements JdRequest<PromoActivitySkuListResponse> {
   private Long activityId;
   private Long skuId;
   private Integer bindType;
   private Integer page;
   private Integer pageSize;
   private Long spuId;
   private String orderField;
   private String orderType;
   private Integer deleted;
   private Long startId;

   public void setActivityId(Long activityId) {
      this.activityId = activityId;
   }

   public Long getActivityId() {
      return this.activityId;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setBindType(Integer bindType) {
      this.bindType = bindType;
   }

   public Integer getBindType() {
      return this.bindType;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   public Long getSpuId() {
      return this.spuId;
   }

   public void setOrderField(String orderField) {
      this.orderField = orderField;
   }

   public String getOrderField() {
      return this.orderField;
   }

   public void setOrderType(String orderType) {
      this.orderType = orderType;
   }

   public String getOrderType() {
      return this.orderType;
   }

   public void setDeleted(Integer deleted) {
      this.deleted = deleted;
   }

   public Integer getDeleted() {
      return this.deleted;
   }

   public void setStartId(Long startId) {
      this.startId = startId;
   }

   public Long getStartId() {
      return this.startId;
   }

   public String getApiMethod() {
      return "jingdong.promo.activity.sku.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("activityId", this.activityId);
      pmap.put("skuId", this.skuId);
      pmap.put("bindType", this.bindType);
      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      pmap.put("spuId", this.spuId);
      pmap.put("orderField", this.orderField);
      pmap.put("orderType", this.orderType);
      pmap.put("deleted", this.deleted);
      pmap.put("startId", this.startId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoActivitySkuListResponse> getResponseClass() {
      return PromoActivitySkuListResponse.class;
   }
}
