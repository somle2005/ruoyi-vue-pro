package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.LdopReceiveTraceGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopReceiveTraceGetRequest extends AbstractRequest implements JdRequest<LdopReceiveTraceGetResponse> {
   private String customerCode;
   private String waybillCode;

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public String getApiMethod() {
      return "jingdong.ldop.receive.trace.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customerCode", this.customerCode);
      pmap.put("waybillCode", this.waybillCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopReceiveTraceGetResponse> getResponseClass() {
      return LdopReceiveTraceGetResponse.class;
   }
}
