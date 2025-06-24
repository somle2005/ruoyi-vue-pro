package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.TraceDynamicQueryServiceQueryDynamicTraceInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class TraceDynamicQueryServiceQueryDynamicTraceInfoRequest extends AbstractRequest implements JdRequest<TraceDynamicQueryServiceQueryDynamicTraceInfoResponse> {
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
      return "jingdong.trace.dynamicQueryService.queryDynamicTraceInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customerCode", this.customerCode);
      pmap.put("waybillCode", this.waybillCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<TraceDynamicQueryServiceQueryDynamicTraceInfoResponse> getResponseClass() {
      return TraceDynamicQueryServiceQueryDynamicTraceInfoResponse.class;
   }
}
