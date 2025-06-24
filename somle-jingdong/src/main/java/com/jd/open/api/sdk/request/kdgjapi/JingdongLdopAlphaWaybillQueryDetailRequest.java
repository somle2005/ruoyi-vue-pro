package com.jd.open.api.sdk.request.kdgjapi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.kdgjapi.JingdongLdopAlphaWaybillQueryDetailResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JingdongLdopAlphaWaybillQueryDetailRequest extends AbstractRequest implements JdRequest<JingdongLdopAlphaWaybillQueryDetailResponse> {
   private String providerCode;
   private String waybillCode;

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
      return "jingdong.jingdong.ldop.alpha.waybill.queryDetail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("providerCode", this.providerCode);
      pmap.put("waybillCode", this.waybillCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<JingdongLdopAlphaWaybillQueryDetailResponse> getResponseClass() {
      return JingdongLdopAlphaWaybillQueryDetailResponse.class;
   }
}
