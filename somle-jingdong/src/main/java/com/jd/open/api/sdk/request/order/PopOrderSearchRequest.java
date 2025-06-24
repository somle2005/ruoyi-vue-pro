package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderSearchRequest extends AbstractRequest implements JdRequest<PopOrderSearchResponse> {
   private String startDate;
   private String endDate;
   private String orderState;
   private String optionalFields;
   private String page;
   private String pageSize;
   private int sortType;
   private int dateType;
   private String realPin;
   private String openIdBuyer;
   private String xidBuyer;

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

   public void setOptionalFields(String optionalFields) {
      this.optionalFields = optionalFields;
   }

   public String getOptionalFields() {
      return this.optionalFields;
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

   public void setRealPin(String realPin) {
      this.realPin = realPin;
   }

   public String getRealPin() {
      return this.realPin;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("start_date", this.startDate);
      pmap.put("end_date", this.endDate);
      pmap.put("order_state", this.orderState);
      pmap.put("optional_fields", this.optionalFields);
      pmap.put("page", this.page);
      pmap.put("page_size", this.pageSize);
      pmap.put("sortType", this.sortType);
      pmap.put("dateType", this.dateType);
      pmap.put("realPin", this.realPin);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderSearchResponse> getResponseClass() {
      return PopOrderSearchResponse.class;
   }
}
