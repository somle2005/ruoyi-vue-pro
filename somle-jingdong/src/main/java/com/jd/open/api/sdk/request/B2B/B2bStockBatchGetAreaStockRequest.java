package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bStockBatchGetAreaStockResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2bStockBatchGetAreaStockRequest extends AbstractRequest implements JdRequest<B2bStockBatchGetAreaStockResponse> {
   private String appName;
   private String skuId;
   private String num;
   private Integer provinceId;
   private Integer cityId;
   private Integer countyId;
   private Integer townId;

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setNum(String num) {
      this.num = num;
   }

   public String getNum() {
      return this.num;
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

   public String getApiMethod() {
      return "jingdong.b2b.stock.batchGetAreaStock";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appName", this.appName);
      pmap.put("skuId", this.skuId);
      pmap.put("num", this.num);
      pmap.put("provinceId", this.provinceId);
      pmap.put("cityId", this.cityId);
      pmap.put("countyId", this.countyId);
      pmap.put("townId", this.townId);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bStockBatchGetAreaStockResponse> getResponseClass() {
      return B2bStockBatchGetAreaStockResponse.class;
   }
}
