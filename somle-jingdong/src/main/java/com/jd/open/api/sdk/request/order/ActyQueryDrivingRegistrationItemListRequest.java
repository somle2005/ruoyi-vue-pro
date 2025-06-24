package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.ActyQueryDrivingRegistrationItemListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ActyQueryDrivingRegistrationItemListRequest extends AbstractRequest implements JdRequest<ActyQueryDrivingRegistrationItemListResponse> {
   private Long skuId;
   private Long orderId;
   private String beginDate;
   private String endDate;
   private int pageIndex;
   private int pageSize;

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setBeginDate(String beginDate) {
      this.beginDate = beginDate;
   }

   public String getBeginDate() {
      return this.beginDate;
   }

   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   public String getEndDate() {
      return this.endDate;
   }

   public void setPageIndex(int pageIndex) {
      this.pageIndex = pageIndex;
   }

   public int getPageIndex() {
      return this.pageIndex;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.acty.queryDrivingRegistrationItemList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuId", this.skuId);
      pmap.put("orderId", this.orderId);
      pmap.put("beginDate", this.beginDate);
      pmap.put("endDate", this.endDate);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<ActyQueryDrivingRegistrationItemListResponse> getResponseClass() {
      return ActyQueryDrivingRegistrationItemListResponse.class;
   }
}
