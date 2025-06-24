package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderFbpSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderFbpSearchRequest extends AbstractRequest implements JdRequest<PopOrderFbpSearchResponse> {
   private String startDate;
   private String endDate;
   private String orderState;
   private String page;
   private String pageSize;
   private int colType;
   private String optionalFields;
   private long orderId;
   private int sortType;
   private int dateType;
   private String storeId;
   private String cky2;

   public void setStartDate(String startDate) {
      this.startDate = startDate;
   }

   public String getStartDate() {
      return this.startDate;
   }

   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   public String getEndDate() {
      return this.endDate;
   }

   public void setOrderState(String orderState) {
      this.orderState = orderState;
   }

   public String getOrderState() {
      return this.orderState;
   }

   public void setPage(String page) {
      this.page = page;
   }

   public String getPage() {
      return this.page;
   }

   public void setPageSize(String pageSize) {
      this.pageSize = pageSize;
   }

   public String getPageSize() {
      return this.pageSize;
   }

   public void setColType(int colType) {
      this.colType = colType;
   }

   public int getColType() {
      return this.colType;
   }

   public void setOptionalFields(String optionalFields) {
      this.optionalFields = optionalFields;
   }

   public String getOptionalFields() {
      return this.optionalFields;
   }

   public void setOrderId(long orderId) {
      this.orderId = orderId;
   }

   public long getOrderId() {
      return this.orderId;
   }

   public void setSortType(int sortType) {
      this.sortType = sortType;
   }

   public int getSortType() {
      return this.sortType;
   }

   public void setDateType(int dateType) {
      this.dateType = dateType;
   }

   public int getDateType() {
      return this.dateType;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public void setCky2(String cky2) {
      this.cky2 = cky2;
   }

   public String getCky2() {
      return this.cky2;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.fbp.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("startDate", this.startDate);
      pmap.put("endDate", this.endDate);
      pmap.put("orderState", this.orderState);
      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      pmap.put("colType", this.colType);
      pmap.put("optionalFields", this.optionalFields);
      pmap.put("orderId", this.orderId);
      pmap.put("sortType", this.sortType);
      pmap.put("dateType", this.dateType);
      pmap.put("storeId", this.storeId);
      pmap.put("cky2", this.cky2);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderFbpSearchResponse> getResponseClass() {
      return PopOrderFbpSearchResponse.class;
   }
}
