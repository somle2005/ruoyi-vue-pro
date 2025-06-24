package com.jd.open.api.sdk.request.wujiemiandan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.LogisticsEwaybillWaybillAppendResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsEwaybillWaybillAppendRequest extends AbstractRequest implements JdRequest<LogisticsEwaybillWaybillAppendResponse> {
   private String parentWaybillCode;
   private String providerCode;
   private String vendorCode;
   private Integer providerId;

   public void setParentWaybillCode(String parentWaybillCode) {
      this.parentWaybillCode = parentWaybillCode;
   }

   public String getParentWaybillCode() {
      return this.parentWaybillCode;
   }

   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   public String getProviderCode() {
      return this.providerCode;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setProviderId(Integer providerId) {
      this.providerId = providerId;
   }

   public Integer getProviderId() {
      return this.providerId;
   }

   public String getApiMethod() {
      return "jingdong.logistics.ewaybill.waybill.append";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("parentWaybillCode", this.parentWaybillCode);
      pmap.put("providerCode", this.providerCode);
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("providerId", this.providerId);
      return JsonUtil.toJson(pmap);
   }

   public Class<LogisticsEwaybillWaybillAppendResponse> getResponseClass() {
      return LogisticsEwaybillWaybillAppendResponse.class;
   }
}
