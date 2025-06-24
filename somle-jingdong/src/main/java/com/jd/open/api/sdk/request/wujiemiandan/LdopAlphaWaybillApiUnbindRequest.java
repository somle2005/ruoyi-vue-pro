package com.jd.open.api.sdk.request.wujiemiandan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.LdopAlphaWaybillApiUnbindResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopAlphaWaybillApiUnbindRequest extends AbstractRequest implements JdRequest<LdopAlphaWaybillApiUnbindResponse> {
   private Integer providerId;
   private String providerCode;
   private String waybillCode;

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

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public String getApiMethod() {
      return "jingdong.ldop.alpha.waybill.api.unbind";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("providerId", this.providerId);
      pmap.put("providerCode", this.providerCode);
      pmap.put("waybillCode", this.waybillCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAlphaWaybillApiUnbindResponse> getResponseClass() {
      return LdopAlphaWaybillApiUnbindResponse.class;
   }
}
