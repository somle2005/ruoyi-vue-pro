package com.jd.open.api.sdk.request.jiyunshang;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jiyunshang.ProductoutstorageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ProductoutstorageRequest extends AbstractRequest implements JdRequest<ProductoutstorageResponse> {
   private Long twoOrderId;
   private String waybillNumber;
   private String logisticsCompanies;
   private String bagCount;
   private String extStr;

   public void setTwoOrderId(Long twoOrderId) {
      this.twoOrderId = twoOrderId;
   }

   public Long getTwoOrderId() {
      return this.twoOrderId;
   }

   public void setWaybillNumber(String waybillNumber) {
      this.waybillNumber = waybillNumber;
   }

   public String getWaybillNumber() {
      return this.waybillNumber;
   }

   public void setLogisticsCompanies(String logisticsCompanies) {
      this.logisticsCompanies = logisticsCompanies;
   }

   public String getLogisticsCompanies() {
      return this.logisticsCompanies;
   }

   public void setBagCount(String bagCount) {
      this.bagCount = bagCount;
   }

   public String getBagCount() {
      return this.bagCount;
   }

   public void setExtStr(String extStr) {
      this.extStr = extStr;
   }

   public String getExtStr() {
      return this.extStr;
   }

   public String getApiMethod() {
      return "jingdong.productoutstorage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("twoOrderId", this.twoOrderId);
      pmap.put("waybillNumber", this.waybillNumber);
      pmap.put("logisticsCompanies", this.logisticsCompanies);
      pmap.put("bagCount", this.bagCount);
      pmap.put("extStr", this.extStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<ProductoutstorageResponse> getResponseClass() {
      return ProductoutstorageResponse.class;
   }
}
