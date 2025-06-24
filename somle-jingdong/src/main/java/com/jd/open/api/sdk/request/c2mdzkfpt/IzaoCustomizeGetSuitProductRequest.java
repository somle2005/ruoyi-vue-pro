package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.IzaoCustomizeGetSuitProductResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class IzaoCustomizeGetSuitProductRequest extends AbstractRequest implements JdRequest<IzaoCustomizeGetSuitProductResponse> {
   private Integer suitType;
   private Integer countyId;
   private Integer stateId;
   private Integer cityId;
   private Integer townId;
   private Integer provinceId;
   private Long skuId;
   private Integer skuCount;

   public void setSuitType(Integer suitType) {
      this.suitType = suitType;
   }

   public Integer getSuitType() {
      return this.suitType;
   }

   public void setCountyId(Integer countyId) {
      this.countyId = countyId;
   }

   public Integer getCountyId() {
      return this.countyId;
   }

   public void setStateId(Integer stateId) {
      this.stateId = stateId;
   }

   public Integer getStateId() {
      return this.stateId;
   }

   public void setCityId(Integer cityId) {
      this.cityId = cityId;
   }

   public Integer getCityId() {
      return this.cityId;
   }

   public void setTownId(Integer townId) {
      this.townId = townId;
   }

   public Integer getTownId() {
      return this.townId;
   }

   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   public Integer getProvinceId() {
      return this.provinceId;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setSkuCount(Integer skuCount) {
      this.skuCount = skuCount;
   }

   public Integer getSkuCount() {
      return this.skuCount;
   }

   public String getApiMethod() {
      return "jingdong.izao.customize.getSuitProduct";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("suitType", this.suitType);
      pmap.put("countyId", this.countyId);
      pmap.put("stateId", this.stateId);
      pmap.put("cityId", this.cityId);
      pmap.put("townId", this.townId);
      pmap.put("provinceId", this.provinceId);
      pmap.put("skuId", this.skuId);
      pmap.put("skuCount", this.skuCount);
      return JsonUtil.toJson(pmap);
   }

   public Class<IzaoCustomizeGetSuitProductResponse> getResponseClass() {
      return IzaoCustomizeGetSuitProductResponse.class;
   }
}
