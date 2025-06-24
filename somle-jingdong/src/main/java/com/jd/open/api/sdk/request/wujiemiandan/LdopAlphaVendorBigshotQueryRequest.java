package com.jd.open.api.sdk.request.wujiemiandan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.LdopAlphaVendorBigshotQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopAlphaVendorBigshotQueryRequest extends AbstractRequest implements JdRequest<LdopAlphaVendorBigshotQueryResponse> {
   private String waybillCode;
   private Integer providerId;
   private String providerCode;

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public void setProviderId(Integer providerId) {
      this.providerId = providerId;
   }

   public Integer getProviderId() {
      return this.providerId;
   }

   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   public String getProviderCode() {
      return this.providerCode;
   }

   public String getApiMethod() {
      return "jingdong.ldop.alpha.vendor.bigshot.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("waybillCode", this.waybillCode);
      pmap.put("providerId", this.providerId);
      pmap.put("providerCode", this.providerCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAlphaVendorBigshotQueryResponse> getResponseClass() {
      return LdopAlphaVendorBigshotQueryResponse.class;
   }
}
