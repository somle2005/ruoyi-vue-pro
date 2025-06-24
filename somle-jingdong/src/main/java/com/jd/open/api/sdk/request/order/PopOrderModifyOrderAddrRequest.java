package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderModifyOrderAddrResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderModifyOrderAddrRequest extends AbstractRequest implements JdRequest<PopOrderModifyOrderAddrResponse> {
   private Long orderId;
   private String customerName;
   private String customerPhone;
   private Integer provinceId;
   private Integer cityId;
   private Integer countyId;
   private Integer townId;
   private String detailAddr;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   public String getCustomerName() {
      return this.customerName;
   }

   public void setCustomerPhone(String customerPhone) {
      this.customerPhone = customerPhone;
   }

   public String getCustomerPhone() {
      return this.customerPhone;
   }

   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   public Integer getProvinceId() {
      return this.provinceId;
   }

   public void setCityId(Integer cityId) {
      this.cityId = cityId;
   }

   public Integer getCityId() {
      return this.cityId;
   }

   public void setCountyId(Integer countyId) {
      this.countyId = countyId;
   }

   public Integer getCountyId() {
      return this.countyId;
   }

   public void setTownId(Integer townId) {
      this.townId = townId;
   }

   public Integer getTownId() {
      return this.townId;
   }

   public void setDetailAddr(String detailAddr) {
      this.detailAddr = detailAddr;
   }

   public String getDetailAddr() {
      return this.detailAddr;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.modifyOrderAddr";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("customerName", this.customerName);
      pmap.put("customerPhone", this.customerPhone);
      pmap.put("provinceId", this.provinceId);
      pmap.put("cityId", this.cityId);
      pmap.put("countyId", this.countyId);
      pmap.put("townId", this.townId);
      pmap.put("detailAddr", this.detailAddr);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderModifyOrderAddrResponse> getResponseClass() {
      return PopOrderModifyOrderAddrResponse.class;
   }
}
