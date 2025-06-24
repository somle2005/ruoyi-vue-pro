package com.jd.open.api.sdk.request.gxpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.gxpt.PurchaseOrderSelectInfosPageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PurchaseOrderSelectInfosPageRequest extends AbstractRequest implements JdRequest<PurchaseOrderSelectInfosPageResponse> {
   private String startDate;
   private String endDate;
   private String orderStates;
   private Integer pageNo;
   private Integer pageSize;
   private String updateBeginTime;
   private String updateEndTime;
   private String provinceId;
   private String cityId;
   private String countyId;
   private String townId;

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

   public void setOrderStates(String orderStates) {
      this.orderStates = orderStates;
   }

   public String getOrderStates() {
      return this.orderStates;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setUpdateBeginTime(String updateBeginTime) {
      this.updateBeginTime = updateBeginTime;
   }

   public String getUpdateBeginTime() {
      return this.updateBeginTime;
   }

   public void setUpdateEndTime(String updateEndTime) {
      this.updateEndTime = updateEndTime;
   }

   public String getUpdateEndTime() {
      return this.updateEndTime;
   }

   public void setProvinceId(String provinceId) {
      this.provinceId = provinceId;
   }

   public String getProvinceId() {
      return this.provinceId;
   }

   public void setCityId(String cityId) {
      this.cityId = cityId;
   }

   public String getCityId() {
      return this.cityId;
   }

   public void setCountyId(String countyId) {
      this.countyId = countyId;
   }

   public String getCountyId() {
      return this.countyId;
   }

   public void setTownId(String townId) {
      this.townId = townId;
   }

   public String getTownId() {
      return this.townId;
   }

   public String getApiMethod() {
      return "jingdong.purchase.order.select.infos.page";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("startDate", this.startDate);
      pmap.put("endDate", this.endDate);
      pmap.put("orderStates", this.orderStates);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      pmap.put("updateBeginTime", this.updateBeginTime);
      pmap.put("updateEndTime", this.updateEndTime);
      pmap.put("provinceId", this.provinceId);
      pmap.put("cityId", this.cityId);
      pmap.put("countyId", this.countyId);
      pmap.put("townId", this.townId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PurchaseOrderSelectInfosPageResponse> getResponseClass() {
      return PurchaseOrderSelectInfosPageResponse.class;
   }
}
