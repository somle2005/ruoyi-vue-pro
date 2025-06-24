package com.jd.open.api.sdk.request.wujiemiandan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.LogisticsEwaybillWaybillCancelResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsEwaybillWaybillCancelRequest extends AbstractRequest implements JdRequest<LogisticsEwaybillWaybillCancelResponse> {
   private String providerCode;
   private Integer providerId;
   private String waybillCode;
   private String cancelReason;
   private String vendorCode;

   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   public String getProviderCode() {
      return this.providerCode;
   }

   public void setProviderId(Integer providerId) {
      this.providerId = providerId;
   }

   public Integer getProviderId() {
      return this.providerId;
   }

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public void setCancelReason(String cancelReason) {
      this.cancelReason = cancelReason;
   }

   public String getCancelReason() {
      return this.cancelReason;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public String getApiMethod() {
      return "jingdong.logistics.ewaybill.waybill.cancel";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("providerCode", this.providerCode);
      pmap.put("providerId", this.providerId);
      pmap.put("waybillCode", this.waybillCode);
      pmap.put("cancelReason", this.cancelReason);
      pmap.put("vendorCode", this.vendorCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LogisticsEwaybillWaybillCancelResponse> getResponseClass() {
      return LogisticsEwaybillWaybillCancelResponse.class;
   }
}
