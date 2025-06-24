package com.jd.open.api.sdk.request.HouseEI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.HouseEI.LasSpareZerostockStatusSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LasSpareZerostockStatusSearchRequest extends AbstractRequest implements JdRequest<LasSpareZerostockStatusSearchResponse> {
   private String vendorCode;
   private String token;
   private String serviceNo;
   private String afsServiceTaskNo;
   private String orderNo;
   private String requestTime;

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setToken(String token) {
      this.token = token;
   }

   public String getToken() {
      return this.token;
   }

   public void setServiceNo(String serviceNo) {
      this.serviceNo = serviceNo;
   }

   public String getServiceNo() {
      return this.serviceNo;
   }

   public void setAfsServiceTaskNo(String afsServiceTaskNo) {
      this.afsServiceTaskNo = afsServiceTaskNo;
   }

   public String getAfsServiceTaskNo() {
      return this.afsServiceTaskNo;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setRequestTime(String requestTime) {
      this.requestTime = requestTime;
   }

   public String getRequestTime() {
      return this.requestTime;
   }

   public String getApiMethod() {
      return "jingdong.las.spare.zerostock.status.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("token", this.token);
      pmap.put("serviceNo", this.serviceNo);
      pmap.put("afsServiceTaskNo", this.afsServiceTaskNo);
      pmap.put("orderNo", this.orderNo);
      pmap.put("requestTime", this.requestTime);
      return JsonUtil.toJson(pmap);
   }

   public Class<LasSpareZerostockStatusSearchResponse> getResponseClass() {
      return LasSpareZerostockStatusSearchResponse.class;
   }
}
